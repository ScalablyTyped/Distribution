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
    getAvailableMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties]
    ],
    getMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
    ],
    setMediaStreamPropertiesAsync: js.Function2[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ]
  ): IMediaDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = getAvailableMediaStreamProperties, getMediaStreamProperties = getMediaStreamProperties, setMediaStreamPropertiesAsync = setMediaStreamPropertiesAsync)
  
    __obj.asInstanceOf[IMediaDeviceController]
  }
}

