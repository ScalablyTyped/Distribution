package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoRotation extends StObject
/** Specifies the rotation of the video stream. */
@JSGlobal("Windows.Media.Capture.VideoRotation")
@js.native
object VideoRotation extends StObject {
  
  /** The video stream is rotated 180 degrees clockwise. */
  @js.native
  sealed trait clockwise180Degrees
    extends StObject
       with VideoRotation
  
  /** The video stream is rotated 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees
    extends StObject
       with VideoRotation
  
  /** The video stream is rotated 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees
    extends StObject
       with VideoRotation
  
  /** The video stream is not rotated. */
  @js.native
  sealed trait none
    extends StObject
       with VideoRotation
}
