package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectServiceConfigurationMethod extends StObject
/** Values describing how service configuration is performed when a session is being established. Typically, either no input is required, or one device in the session displays a PIN and the other device requires that the PIN be entered. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod")
@js.native
object WiFiDirectServiceConfigurationMethod extends StObject {
  
  /** Do not require input at configuration. */
  @js.native
  sealed trait default
    extends StObject
       with WiFiDirectServiceConfigurationMethod
  
  /** Display a PIN at configuration. */
  @js.native
  sealed trait pinDisplay
    extends StObject
       with WiFiDirectServiceConfigurationMethod
  
  /** Request PIN entry at configuration. */
  @js.native
  sealed trait pinEntry
    extends StObject
       with WiFiDirectServiceConfigurationMethod
}
