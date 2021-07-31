package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraStreamState extends StObject
/** Defines the state of a camera stream. */
@JSGlobal("Windows.Media.Devices.CameraStreamState")
@js.native
object CameraStreamState extends StObject {
  
  /** Frames in the stream are being dropped for privacy reasons. */
  @js.native
  sealed trait blockedForPrivacy
    extends StObject
       with CameraStreamState
  
  /** The camera stream is not currently streaming. */
  @js.native
  sealed trait notStreaming
    extends StObject
       with CameraStreamState
  
  /** The camera stream has been shut down. */
  @js.native
  sealed trait shutdown
    extends StObject
       with CameraStreamState
  
  /** The camera stream is currently streaming. */
  @js.native
  sealed trait streaming
    extends StObject
       with CameraStreamState
}
