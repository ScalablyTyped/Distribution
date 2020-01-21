package typings.uifabricFoundation.icomponentMod

import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.Required
import typings.std.ReturnType
import typings.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIslotsMod.ISlots
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRecompositionComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
  extends typings.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
  /**
    * Slot definition object defining the slot component for each slot.
    */
  var slots: js.UndefOr[IPartialSlotComponent[TComponentProps, TComponentSlots]] = js.undefined
  /**
    * Stateless pure function that receives props to render the output of the component.
    */
  var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.undefined
}

object IRecompositionComponentOptions {
  @scala.inline
  def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
    displayName: String = null,
    factoryOptions: IFactoryOptions[TComponentProps] = null,
    fields: js.Array[String] = null,
    slots: IPartialSlotComponent[TComponentProps, TComponentSlots] = null,
    state: TComponentProps => TViewProps = null,
    statics: TStatics = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null,
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]] = null
  ): IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (factoryOptions != null) __obj.updateDynamic("factoryOptions")(factoryOptions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(js.Any.fromFunction1(state))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction2(view))
    __obj.asInstanceOf[IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
}

