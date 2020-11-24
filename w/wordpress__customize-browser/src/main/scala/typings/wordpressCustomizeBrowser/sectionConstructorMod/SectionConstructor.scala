package typings.wordpressCustomizeBrowser.sectionConstructorMod

import typings.wordpressCustomizeBrowser.outerSectionMod.OuterSection
import typings.wordpressCustomizeBrowser.themesSectionMod.ThemesSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionConstructor extends js.Object {
  
  var outer: OuterSection = js.native
  
  var themes: ThemesSection = js.native
}
object SectionConstructor {
  
  @scala.inline
  def apply(outer: OuterSection, themes: ThemesSection): SectionConstructor = {
    val __obj = js.Dynamic.literal(outer = outer.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionConstructor]
  }
  
  @scala.inline
  implicit class SectionConstructorOps[Self <: SectionConstructor] (val x: Self) extends AnyVal {
    
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
    def setOuter(value: OuterSection): Self = this.set("outer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemes(value: ThemesSection): Self = this.set("themes", value.asInstanceOf[js.Any])
  }
}
