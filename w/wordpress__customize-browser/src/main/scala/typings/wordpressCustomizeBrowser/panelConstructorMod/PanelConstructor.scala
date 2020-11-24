package typings.wordpressCustomizeBrowser.panelConstructorMod

import typings.wordpressCustomizeBrowser.themesPanelMod.ThemesPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanelConstructor extends js.Object {
  
  var themes: ThemesPanel = js.native
}
object PanelConstructor {
  
  @scala.inline
  def apply(themes: ThemesPanel): PanelConstructor = {
    val __obj = js.Dynamic.literal(themes = themes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelConstructor]
  }
  
  @scala.inline
  implicit class PanelConstructorOps[Self <: PanelConstructor] (val x: Self) extends AnyVal {
    
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
    def setThemes(value: ThemesPanel): Self = this.set("themes", value.asInstanceOf[js.Any])
  }
}
