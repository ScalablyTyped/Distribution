package typings.wordpressCustomizeBrowser.croppedImageControlMod

import typings.wordpressCustomizeBrowser.externalMod.Attachment
import typings.wordpressCustomizeBrowser.externalMod.Cropper
import typings.wordpressCustomizeBrowser.mediaControlMod.MediaControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/CroppedImageControl", "CroppedImageControl")
@js.native
class CroppedImageControl () extends MediaControl {
  
   // TODO
  def calculateImageSelectOptions(attachment: Attachment, controller: Cropper): ImageSelectOptions = js.native
  
  def mustBeCropped(flexW: Boolean, flexH: Boolean, dstW: Double, dstH: Double, imgW: Double, imgH: Double): Boolean = js.native
  
  def onCropped(croppedImage: js.Any): Unit = js.native
  
  def onSelect(): Unit = js.native
  
  def onSkippedCrop(): Unit = js.native
  
  def setImageFromAttachment(attachment: js.Any): Unit = js.native
}
