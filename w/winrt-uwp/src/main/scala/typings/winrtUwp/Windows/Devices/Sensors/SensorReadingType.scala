package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SensorReadingType extends js.Object

/** Specifies the sensor reading type. */
@JSGlobal("Windows.Devices.Sensors.SensorReadingType")
@js.native
object SensorReadingType extends js.Object {
  /** The sensor reading type is absolute. */
  @js.native
  sealed trait absolute extends SensorReadingType
  
  /** The sensor reading type is relative. */
  @js.native
  sealed trait relative extends SensorReadingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SensorReadingType with Double] = js.native
  /* 0 */ @js.native
  object absolute extends TopLevel[absolute with Double]
  
  /* 1 */ @js.native
  object relative extends TopLevel[relative with Double]
  
}

