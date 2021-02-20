package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.croppedImageControlMod.ImageSelectOptions
import typings.wordpressCustomizeBrowser.externalMod.Attachment
import typings.wordpressCustomizeBrowser.externalMod.Cropper
import typings.wordpressCustomizeBrowser.externalMod.ImageModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerControlMod {
  
  @JSImport("@wordpress/customize-browser/HeaderControl", "HeaderControl")
  @js.native
  class HeaderControl protected () extends Control {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def calculateImageSelectOptions(attachment: Attachment, controller: Cropper): ImageSelectOptions = js.native
    
    def getInitialHeaderImage(): ImageModel = js.native
    
    def onCropped(croppedImage: js.Any): Unit = js.native
    
    def onSelect(): Unit = js.native
    
    // TODO
    def onSkippedCrop(selection: js.Any): Unit = js.native
    
    def openMedia(event: Event): Unit = js.native
    
    def removeImage(): Unit = js.native
    
    // TODO
    def setImageFromURL(url: String, attachmentId: Double, width: Double, height: Double): Unit = js.native
  }
}
