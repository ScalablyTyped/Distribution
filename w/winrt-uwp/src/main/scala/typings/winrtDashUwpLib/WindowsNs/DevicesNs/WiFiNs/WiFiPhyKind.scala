package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiPhyKind extends js.Object

/** Describes PHY types supported by standard 802.11. */
@JSGlobal("Windows.Devices.WiFi.WiFiPhyKind")
@js.native
object WiFiPhyKind extends js.Object {
  /** Direct sequence, spread-spectrum (DSSS) PHY. */
  @js.native
  sealed trait dsss
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** Extended Rate (ERP) PHY. */
  @js.native
  sealed trait erp
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** Frequency-hopping, spread-spectrum (FHSS) PHY. */
  @js.native
  sealed trait fhss
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** High-rated DSSS (HRDSSS) PHY. */
  @js.native
  sealed trait hrdsss
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** 802.11n PHY. */
  @js.native
  sealed trait ht
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** Infrared (IR) baseband PHY. */
  @js.native
  sealed trait irBaseband
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** Orthogonal frequency division multiplex (OFDM) PHY. */
  @js.native
  sealed trait ofdm
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** Unspecified PHY type */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  /** 802.11ac PHY. */
  @js.native
  sealed trait vht
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind
  
  val dsss: dsss with java.lang.String = js.native
  val erp: erp with java.lang.String = js.native
  val fhss: fhss with java.lang.String = js.native
  val hrdsss: hrdsss with java.lang.String = js.native
  val ht: ht with java.lang.String = js.native
  val irBaseband: irBaseband with java.lang.String = js.native
  val ofdm: ofdm with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val vht: vht with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiPhyKind with java.lang.String] = js.native
}

