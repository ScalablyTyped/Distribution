package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCaptureVideoPreview extends js.Object {
  def startPreviewAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customMediaSink: winrtLib.WindowsNs.MediaNs.IMediaExtension
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(
    encodingProfile: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile,
    customSinkActivationId: java.lang.String,
    customSinkSettings: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def stopPreviewAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

