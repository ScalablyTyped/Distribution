package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceConfigurationMethod extends js.Object

/** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod")
@js.native
object WiFiDirectServiceConfigurationMethod extends js.Object {
  /** Do not require input at configuration. */
  @js.native
  sealed trait default extends WiFiDirectServiceConfigurationMethod
  
  /** Display a PIN at configuration. */
  @js.native
  sealed trait pinDisplay extends WiFiDirectServiceConfigurationMethod
  
  /** Request PIN entry at configuration. */
  @js.native
  sealed trait pinEntry extends WiFiDirectServiceConfigurationMethod
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.default with Double = js.native
  /* 1 */ val pinDisplay: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinDisplay with Double = js.native
  /* 2 */ val pinEntry: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod.pinEntry with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceConfigurationMethod with Double] = js.native
}

