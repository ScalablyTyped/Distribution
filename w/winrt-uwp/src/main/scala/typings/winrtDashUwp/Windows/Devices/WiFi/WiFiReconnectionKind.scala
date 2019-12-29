package typings.winrtDashUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiReconnectionKind extends js.Object

/** Describes whether to automatically reconnect to this network. */
@JSGlobal("Windows.Devices.WiFi.WiFiReconnectionKind")
@js.native
object WiFiReconnectionKind extends js.Object {
  /** Reconnect automatically. */
  @js.native
  sealed trait automatic extends WiFiReconnectionKind
  
  /** Allow user to reconnect manually. */
  @js.native
  sealed trait manual extends WiFiReconnectionKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiReconnectionKind with Double] = js.native
  /* 0 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 1 */ @js.native
  object manual extends TopLevel[manual with Double]
  
}

