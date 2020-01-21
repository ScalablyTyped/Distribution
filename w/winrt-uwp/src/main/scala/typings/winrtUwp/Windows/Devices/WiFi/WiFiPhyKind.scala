package typings.winrtUwp.Windows.Devices.WiFi

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiPhyKind with Double] = js.native
  /* 2 */ @js.native
  object dsss extends TopLevel[dsss with Double]
  
  /* 6 */ @js.native
  object erp extends TopLevel[erp with Double]
  
  /* 1 */ @js.native
  object fhss extends TopLevel[fhss with Double]
  
  /* 5 */ @js.native
  object hrdsss extends TopLevel[hrdsss with Double]
  
  /* 7 */ @js.native
  object ht extends TopLevel[ht with Double]
  
  /* 3 */ @js.native
  object irBaseband extends TopLevel[irBaseband with Double]
  
  /* 4 */ @js.native
  object ofdm extends TopLevel[ofdm with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 8 */ @js.native
  object vht extends TopLevel[vht with Double]
  
}

