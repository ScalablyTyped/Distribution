package typings.winrtDashUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.facedown
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.faceup
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.notRotated
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.rotated180DegreesCounterclockwise
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.rotated270DegreesCounterclockwise
import typings.winrtDashUwp.Windows.Devices.Sensors.SimpleOrientation.rotated90DegreesCounterclockwise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

/** Indicates the orientation of the device. */
@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  /** The device is face-down and the display is hidden from the user. */
  @js.native
  sealed trait facedown extends SimpleOrientation
  
  /** The device is face-up and the display is visible to the user. */
  @js.native
  sealed trait faceup extends SimpleOrientation
  
  /** The device is not rotated. */
  @js.native
  sealed trait notRotated extends SimpleOrientation
  
  /** The device is rotated 180-degrees counter-clockwise. */
  @js.native
  sealed trait rotated180DegreesCounterclockwise extends SimpleOrientation
  
  /** The device is rotated 270-degrees counter-clockwise. */
  @js.native
  sealed trait rotated270DegreesCounterclockwise extends SimpleOrientation
  
  /** The device is rotated 90-degrees counter-clockwise. */
  @js.native
  sealed trait rotated90DegreesCounterclockwise extends SimpleOrientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleOrientation with Double] = js.native
  /* 5 */ @js.native
  object facedown extends TopLevel[facedown with Double]
  
  /* 4 */ @js.native
  object faceup extends TopLevel[faceup with Double]
  
  /* 0 */ @js.native
  object notRotated extends TopLevel[notRotated with Double]
  
  /* 2 */ @js.native
  object rotated180DegreesCounterclockwise extends TopLevel[rotated180DegreesCounterclockwise with Double]
  
  /* 3 */ @js.native
  object rotated270DegreesCounterclockwise extends TopLevel[rotated270DegreesCounterclockwise with Double]
  
  /* 1 */ @js.native
  object rotated90DegreesCounterclockwise extends TopLevel[rotated90DegreesCounterclockwise with Double]
  
}

