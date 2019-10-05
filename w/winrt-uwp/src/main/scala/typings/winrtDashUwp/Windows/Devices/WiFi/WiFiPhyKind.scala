package typings.winrtDashUwp.Windows.Devices.WiFi

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
  sealed trait dsss extends WiFiPhyKind
  
  /** Extended Rate (ERP) PHY. */
  @js.native
  sealed trait erp extends WiFiPhyKind
  
  /** Frequency-hopping, spread-spectrum (FHSS) PHY. */
  @js.native
  sealed trait fhss extends WiFiPhyKind
  
  /** High-rated DSSS (HRDSSS) PHY. */
  @js.native
  sealed trait hrdsss extends WiFiPhyKind
  
  /** 802.11n PHY. */
  @js.native
  sealed trait ht extends WiFiPhyKind
  
  /** Infrared (IR) baseband PHY. */
  @js.native
  sealed trait irBaseband extends WiFiPhyKind
  
  /** Orthogonal frequency division multiplex (OFDM) PHY. */
  @js.native
  sealed trait ofdm extends WiFiPhyKind
  
  /** Unspecified PHY type */
  @js.native
  sealed trait unknown extends WiFiPhyKind
  
  /** 802.11ac PHY. */
  @js.native
  sealed trait vht extends WiFiPhyKind
  
  /* 2 */ val dsss: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.dsss with Double = js.native
  /* 6 */ val erp: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.erp with Double = js.native
  /* 1 */ val fhss: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.fhss with Double = js.native
  /* 5 */ val hrdsss: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.hrdsss with Double = js.native
  /* 7 */ val ht: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.ht with Double = js.native
  /* 3 */ val irBaseband: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.irBaseband with Double = js.native
  /* 4 */ val ofdm: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.ofdm with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.unknown with Double = js.native
  /* 8 */ val vht: typings.winrtDashUwp.Windows.Devices.WiFi.WiFiPhyKind.vht with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiPhyKind with Double] = js.native
}

