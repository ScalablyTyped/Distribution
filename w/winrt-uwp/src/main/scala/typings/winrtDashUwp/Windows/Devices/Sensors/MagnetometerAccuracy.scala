package typings.winrtDashUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagnetometerAccuracy extends js.Object

/** The sensor's accuracy. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerAccuracy")
@js.native
object MagnetometerAccuracy extends js.Object {
  /** The actual and reported values differ but may be accurate enough for some application. */
  @js.native
  sealed trait approximate extends MagnetometerAccuracy
  
  /** The actual and reported values are accurate. */
  @js.native
  sealed trait high extends MagnetometerAccuracy
  
  /** The accuracy is currently not available, typically because the driver can't report it. */
  @js.native
  sealed trait unknown extends MagnetometerAccuracy
  
  /** The actual and reported values have a high degree of inaccuracy. */
  @js.native
  sealed trait unreliable extends MagnetometerAccuracy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagnetometerAccuracy with Double] = js.native
  /* 2 */ @js.native
  object approximate extends TopLevel[approximate with Double]
  
  /* 3 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 1 */ @js.native
  object unreliable extends TopLevel[unreliable with Double]
  
}

