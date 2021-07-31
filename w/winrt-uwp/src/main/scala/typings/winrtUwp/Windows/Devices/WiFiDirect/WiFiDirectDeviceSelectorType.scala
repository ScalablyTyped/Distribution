package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectDeviceSelectorType extends StObject
/** Specifies the device selector type for Wi-Fi Direct. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType")
@js.native
object WiFiDirectDeviceSelectorType extends StObject {
  
  /** An associated endpoint. This includes other PC, tablets, and phones. */
  @js.native
  sealed trait associationEndpoint
    extends StObject
       with WiFiDirectDeviceSelectorType
  
  /** A device interface. */
  @js.native
  sealed trait deviceInterface
    extends StObject
       with WiFiDirectDeviceSelectorType
}
