package typings.uifabricFoundation.libIcomponentMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
@js.native
trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  
  var displayName: String = js.native
  
  var factoryOptions: IFactoryOptions[TComponentProps] = js.native
  
  var fields: js.Array[String] = js.native
  
  var state: IStateComponentType[TComponentProps, TViewProps] = js.native
  
  var statics: TStatics = js.native
  
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
  
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
  
  /**
    * Component that generates view output.
    */
  var view: IViewComponent[TViewProps] = js.native
}
object IComponent {
  
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](
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
  
  @scala.inline
  implicit class IComponentOps[Self <: IComponent[_, _, _, _, _], TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] (val x: Self with (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) extends AnyVal {
    
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
    def setView(value: /* props */ PropsWithChildren[TViewProps] => ReturnType[FunctionComponent[js.Object]]): Self = this.set("view", js.Any.fromFunction1(value))
  }
}
