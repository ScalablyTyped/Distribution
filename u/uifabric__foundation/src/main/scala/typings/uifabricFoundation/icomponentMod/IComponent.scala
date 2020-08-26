package typings.uifabricFoundation.icomponentMod

import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.Required
import typings.std.ReturnType
import typings.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typings.uifabricFoundation.libIcomponentMod.IStateComponentType
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIslotsMod.ISlotDefinition
import typings.uifabricFoundation.libIslotsMod.ISlots
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
@js.native
trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends js.Object {
  var displayName: String = js.native
  var factoryOptions: IFactoryOptions[TComponentProps] = js.native
  var fields: js.Array[String] = js.native
  var slots: ISlotComponent[TComponentProps, TComponentSlots] = js.native
  var state: IStateComponentType[TComponentProps, TViewProps] = js.native
  var statics: TStatics = js.native
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
  var view: IViewComponent[TViewProps, TComponentSlots] = js.native
}

object IComponent {
  @scala.inline
  def apply[/* <: typings.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */ TComponentProps, TTokens, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet, TViewProps, TComponentSlots, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    slots: ISlotComponent[TComponentProps, TComponentSlots],
    state: TComponentProps => TViewProps,
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction2(view))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent[_, _, _, _, _, _], /* <: typings.uifabricFoundation.libIslotsMod.ISlottableProps[TComponentSlots] */ TComponentProps, TTokens, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet, TViewProps, TComponentSlots, TStatics] (val x: Self with (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = this.set("factoryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self = this.set("slots", js.Any.fromFunction1(value))
    @scala.inline
    def setSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: TComponentProps => TViewProps): Self = this.set("state", js.Any.fromFunction1(value))
    @scala.inline
    def setStatics(value: TStatics): Self = this.set("statics", value.asInstanceOf[js.Any])
    @scala.inline
    def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = this.set("styles", js.Any.fromFunction3(value))
    @scala.inline
    def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(
      value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
    ): Self = this.set("view", js.Any.fromFunction2(value))
  }
  
}

