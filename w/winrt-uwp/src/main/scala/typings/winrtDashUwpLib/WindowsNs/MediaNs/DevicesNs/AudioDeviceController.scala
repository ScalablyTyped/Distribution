package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls device settings on the microphone. */
@JSGlobal("Windows.Media.Devices.AudioDeviceController")
@js.native
abstract class AudioDeviceController () extends js.Object {
  /** Mutes or unmutes the microphone. */
  var muted: scala.Boolean = js.native
  /** Gets or sets the volume of the microphone. */
  var volumePercent: scala.Double = js.native
  /**
    * Gets a list of the supported encoding properties for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  def getAvailableMediaStreamProperties(mediaStreamType: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties] = js.native
  /**
    * Gets the encoding properties for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties = js.native
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(
    mediaStreamType: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType,
    mediaEncodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

