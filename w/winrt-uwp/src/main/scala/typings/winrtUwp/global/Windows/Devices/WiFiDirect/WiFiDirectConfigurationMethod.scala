package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
@js.native
object WiFiDirectConfigurationMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod with Double
  ] = js.native
  
  /* 1 */ val displayPin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.displayPin with Double = js.native
  
  /* 0 */ val providePin: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.providePin with Double = js.native
  
  /* 2 */ val pushButton: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod.pushButton with Double = js.native
}
