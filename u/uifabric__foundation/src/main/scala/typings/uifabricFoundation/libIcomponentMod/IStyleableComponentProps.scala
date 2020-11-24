package typings.uifabricFoundation.libIcomponentMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleableComponentProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
}
object IStyleableComponentProps {
  
  @scala.inline
  def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
  }
  
  @scala.inline
  implicit class IStyleableComponentPropsOps[Self <: IStyleableComponentProps[_, _, _], TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] (val x: Self with (IStyleableComponentProps[TViewProps, TTokens, TStyleSet])) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = this.set("styles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
}
