package typings.winrt.WindowsNs.MediaNs.CaptureNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.MediaNs.IMediaExtension
import typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaCaptureVideoPreview extends js.Object {
  def startPreviewAsync(): IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(encodingProfile: MediaEncodingProfile, customMediaSink: IMediaExtension): IAsyncAction = js.native
  def startPreviewToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile,
    customSinkActivationId: String,
    customSinkSettings: IPropertySet
  ): IAsyncAction = js.native
  def stopPreviewAsync(): IAsyncAction = js.native
}

