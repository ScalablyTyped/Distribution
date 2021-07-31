package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewLinkControlMod {
  
  @JSImport("@wordpress/customize-browser/PreviewLinkControl", "PreviewLinkControl")
  @js.native
  class PreviewLinkControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def toggleSaveNotification(notify: Boolean): Unit = js.native
    
    def updatePreviewLink(): Unit = js.native
  }
}
