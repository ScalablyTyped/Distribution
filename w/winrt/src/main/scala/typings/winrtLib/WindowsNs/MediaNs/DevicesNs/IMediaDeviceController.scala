package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceController extends js.Object {
  def getAvailableMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties]
  def getMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
  def setMediaStreamPropertiesAsync(
    mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType,
    mediaEncodingProperties: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IMediaDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties],
    getMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties,
    setMediaStreamPropertiesAsync: (winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties) => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync))
  
    __obj.asInstanceOf[IMediaDeviceController]
  }
}

