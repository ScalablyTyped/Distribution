package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.winrtUwpStrings.defaultaudiocapturedevicechanged
import typings.winrtUwp.winrtUwpStrings.defaultaudiorenderdevicechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods used to select devices for capturing and rendering audio, and for capturing video. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.MediaDevice")
@js.native
open class MediaDevice ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.MediaDevice
object MediaDevice {
  
  @JSGlobal("Windows.Media.Devices.MediaDevice")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns the identifier string of a device for capturing audio.
    * @return The identifier string of the audio capture device.
    */
  /* static member */
  inline def getAudioCaptureSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAudioCaptureSelector")().asInstanceOf[String]
  
  /**
    * Returns the identifier string of a device for rendering audio.
    * @return The identifier string of the audio rendering device.
    */
  /* static member */
  inline def getAudioRenderSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAudioRenderSelector")().asInstanceOf[String]
  
  /**
    * Returns the identifier string of the default device for capturing audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  /* static member */
  inline def getDefaultAudioCaptureId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAudioCaptureId")(role.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns the identifier string of the default device for rendering audio in the specified role.
    * @param role The specified audio device role (console, media, or communications).
    * @return The identifier string of the default device.
    */
  /* static member */
  inline def getDefaultAudioRenderId(role: typings.winrtUwp.Windows.Media.Devices.AudioDeviceRole): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAudioRenderId")(role.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns the identifier string of a device for capturing video.
    * @return The identifier string of the video capture device.
    */
  /* static member */
  inline def getVideoCaptureSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVideoCaptureSelector")().asInstanceOf[String]
  
  /** Raised when the default audio capture device is changed. */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiocapturedevicechanged")
  @js.native
  def ondefaultaudiocapturedevicechanged: TypedEventHandler[
    Any, 
    typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
  ] = js.native
  inline def ondefaultaudiocapturedevicechanged_=(
    x: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiocapturedevicechanged")(x.asInstanceOf[js.Any])
  
  /** Raised when the default audio render device is changed. */
  /* static member */
  @JSGlobal("Windows.Media.Devices.MediaDevice.ondefaultaudiorenderdevicechanged")
  @js.native
  def ondefaultaudiorenderdevicechanged: TypedEventHandler[
    Any, 
    typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
  ] = js.native
  inline def ondefaultaudiorenderdevicechanged_=(
    x: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ondefaultaudiorenderdevicechanged")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_defaultaudiocapturedevicechanged(
    `type`: defaultaudiocapturedevicechanged,
    listener: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioCaptureDeviceChangedEventArgs
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def removeEventListener_defaultaudiorenderdevicechanged(
    `type`: defaultaudiorenderdevicechanged,
    listener: TypedEventHandler[
      Any, 
      typings.winrtUwp.Windows.Media.Devices.DefaultAudioRenderDeviceChangedEventArgs
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
