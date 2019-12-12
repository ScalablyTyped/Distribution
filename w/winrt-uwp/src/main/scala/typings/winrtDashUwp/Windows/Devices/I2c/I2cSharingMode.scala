package typings.winrtDashUwp.Windows.Devices.I2c

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.I2c.I2cSharingMode.exclusive
import typings.winrtDashUwp.Windows.Devices.I2c.I2cSharingMode.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2cSharingMode extends js.Object

/** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
@JSGlobal("Windows.Devices.I2c.I2cSharingMode")
@js.native
object I2cSharingMode extends js.Object {
  /** Connects to the I²C bus address exclusively, so that no other connection to the I²C bus address can be made while you remain connected. This mode is the default mode. */
  @js.native
  sealed trait exclusive extends I2cSharingMode
  
  /** Connects to the I²C bus address in shared mode, so that other connections to the I²C bus address can be made while you remain connected. */
  @js.native
  sealed trait shared extends I2cSharingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[I2cSharingMode with Double] = js.native
  /* 0 */ @js.native
  object exclusive extends TopLevel[exclusive with Double]
  
  /* 1 */ @js.native
  object shared extends TopLevel[shared with Double]
  
}

