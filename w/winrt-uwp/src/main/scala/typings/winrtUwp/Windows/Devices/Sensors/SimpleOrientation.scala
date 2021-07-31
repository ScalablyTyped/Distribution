package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SimpleOrientation extends StObject
/** Indicates the orientation of the device. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends StObject {
  
  /** The device is face-down and the display is hidden from the user. */
  @js.native
  sealed trait facedown
    extends StObject
       with SimpleOrientation
  
  /** The device is face-up and the display is visible to the user. */
  @js.native
  sealed trait faceup
    extends StObject
       with SimpleOrientation
  
  /** The device is not rotated. */
  @js.native
  sealed trait notRotated
    extends StObject
       with SimpleOrientation
  
  /** The device is rotated 180-degrees counter-clockwise. */
  @js.native
  sealed trait rotated180DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
  
  /** The device is rotated 270-degrees counter-clockwise. */
  @js.native
  sealed trait rotated270DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
  
  /** The device is rotated 90-degrees counter-clockwise. */
  @js.native
  sealed trait rotated90DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
}
