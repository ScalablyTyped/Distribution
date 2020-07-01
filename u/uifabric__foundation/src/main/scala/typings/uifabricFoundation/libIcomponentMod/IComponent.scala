package typings.uifabricFoundation.libIcomponentMod

import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view  :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  var displayName: String
  var factoryOptions: IFactoryOptions[TComponentProps]
  var fields: js.Array[String]
  var state: IStateComponentType[TComponentProps, TViewProps]
  var statics: TStatics
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
  /**
    * Component that generates view output.
    */
  var view: IViewComponent[TViewProps]
}

object IComponent {
  @scala.inline
  def apply[TComponentProps, TTokens, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet, TViewProps, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    state: TComponentProps => TViewProps,
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: /* props */ PropsWithChildren[TViewProps] => ReturnType[FunctionComponent[js.Object]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
}

