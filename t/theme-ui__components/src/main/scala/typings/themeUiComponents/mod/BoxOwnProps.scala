package typings.themeUiComponents.mod

import typings.emotionCore.mod.InterpolationWithTheme
import typings.emotionSerialize.mod.Interpolation
import typings.react.mod.ElementType
import typings.styledSystem.mod.BackgroundColorProps
import typings.styledSystem.mod.OpacityProps
import typings.styledSystem.mod.RequiredTheme
import typings.styledSystem.mod.SpaceProps
import typings.styledSystem.mod.TextColorProps
import typings.styledSystem.mod.ThemeValue
import typings.themeUiComponents.themeUiComponentsStrings.colors
import typings.themeUiComponents.themeUiComponentsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxOwnProps
  extends SpaceProps[RequiredTheme, ThemeValue[space, RequiredTheme, js.Any]]
     with TextColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with BackgroundColorProps[RequiredTheme, ThemeValue[colors, RequiredTheme, js.Any]]
     with OpacityProps[RequiredTheme] {
  
  var as: js.UndefOr[ElementType[_]] = js.native
  
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
  
  var sx: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
  ] = js.native
  
  var variant: js.UndefOr[String] = js.native
}
object BoxOwnProps {
  
  @scala.inline
  def apply(): BoxOwnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOwnProps]
  }
  
  @scala.inline
  implicit class BoxOwnPropsOps[Self <: BoxOwnProps] (val x: Self) extends AnyVal {
    
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
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = this.set("css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCss(value: InterpolationWithTheme[_]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCssNull: Self = this.set("css", null)
    
    @scala.inline
    def setSx(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SxStyleProp */ js.Any
    ): Self = this.set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSx: Self = this.set("sx", js.undefined)
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
