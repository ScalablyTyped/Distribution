package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/ThemeControl", JSImport.Namespace)
@js.native
object themeControlMod extends js.Object {
  
  @js.native
  class ThemeControl () extends Control {
    
    def filter(terms: String): Boolean = js.native
    def filter(terms: js.Array[String]): Boolean = js.native
    
    def rerenderAsInstalled(installed: Boolean): Unit = js.native
    
    var screenshotRendered: Boolean = js.native
    
    var touchDrag: Boolean = js.native
  }
}
