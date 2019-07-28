package typings.winrt.WindowsNs.MediaNs.DevicesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType
import typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceController extends js.Object {
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties]
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction
}

object IMediaDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync))
  
    __obj.asInstanceOf[IMediaDeviceController]
  }
}

