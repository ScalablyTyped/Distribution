package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Capture.MediaStreamType
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls device settings on the microphone. */
@JSGlobal("Windows.Media.Devices.AudioDeviceController")
@js.native
abstract class AudioDeviceController ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.AudioDeviceController {
  
  /**
    * Gets a list of the supported encoding properties for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  
  /**
    * Gets the encoding properties for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  
  /** Mutes or unmutes the microphone. */
  /* CompleteClass */
  var muted: Boolean = js.native
  
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
  
  /** Gets or sets the volume of the microphone. */
  /* CompleteClass */
  var volumePercent: Double = js.native
}
