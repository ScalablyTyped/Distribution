package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeControlMod {
  
  @JSImport("@wordpress/customize-browser/ThemeControl", "ThemeControl")
  @js.native
  class ThemeControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def filter(terms: String): Boolean = js.native
    def filter(terms: js.Array[String]): Boolean = js.native
    
    def rerenderAsInstalled(installed: Boolean): Unit = js.native
    
    var screenshotRendered: Boolean = js.native
    
    var touchDrag: Boolean = js.native
  }
}
