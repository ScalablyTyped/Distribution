package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.jquery.JQuery.Promise
import typings.wordpressCustomizeBrowser.panelMod.Panel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/ThemesPanel", JSImport.Namespace)
@js.native
object themesPanelMod extends js.Object {
  
  @js.native
  class ThemesPanel () extends Panel {
    
    def canSwitchTheme(): Boolean = js.native
    def canSwitchTheme(slug: String): Boolean = js.native
    
    def deleteTheme(event: Event): Unit = js.native
    
    def installTheme(event: Event): Promise[_, _, _] = js.native
    
    var installingThemes: js.Array[String] = js.native
    
    def loadThemePreview(themeId: String): Promise[_, _, _] = js.native
    
    def updateTheme(event: Event): Unit = js.native
  }
}
