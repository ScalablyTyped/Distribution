package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.controlMod.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/PreviewLinkControl", JSImport.Namespace)
@js.native
object previewLinkControlMod extends js.Object {
  
  @js.native
  class PreviewLinkControl () extends Control {
    
    def toggleSaveNotification(notify: Boolean): Unit = js.native
    
    def updatePreviewLink(): Unit = js.native
  }
}
