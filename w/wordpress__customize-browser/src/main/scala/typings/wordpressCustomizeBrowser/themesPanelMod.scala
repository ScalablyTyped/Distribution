package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.jquery.JQuery.Promise
import typings.wordpressCustomizeBrowser.panelMod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themesPanelMod {
  
  @JSImport("@wordpress/customize-browser/ThemesPanel", "ThemesPanel")
  @js.native
  class ThemesPanel protected () extends Panel {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def canSwitchTheme(): Boolean = js.native
    def canSwitchTheme(slug: String): Boolean = js.native
    
    def deleteTheme(event: Event): Unit = js.native
    
    def installTheme(event: Event): Promise[js.Any, js.Any, js.Any] = js.native
    
    var installingThemes: js.Array[String] = js.native
    
    def loadThemePreview(themeId: String): Promise[js.Any, js.Any, js.Any] = js.native
    
    def updateTheme(event: Event): Unit = js.native
  }
}
