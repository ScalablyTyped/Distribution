package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiReconnectionKind extends StObject
/** Describes whether to automatically reconnect to this network. */
@JSGlobal("Windows.Devices.WiFi.WiFiReconnectionKind")
@js.native
object WiFiReconnectionKind extends StObject {
  
  /** Reconnect automatically. */
  @js.native
  sealed trait automatic
    extends StObject
       with WiFiReconnectionKind
  
  /** Allow user to reconnect manually. */
  @js.native
  sealed trait manual
    extends StObject
       with WiFiReconnectionKind
}
