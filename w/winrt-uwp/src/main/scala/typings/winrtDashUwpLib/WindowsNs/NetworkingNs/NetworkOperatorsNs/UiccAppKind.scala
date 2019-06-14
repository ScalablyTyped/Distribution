package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UiccAppKind extends js.Object

/** Describes the kinds of UICC applications. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAppKind")
@js.native
object UiccAppKind extends js.Object {
  /** CDMA application. */
  @js.native
  sealed trait csim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** IP multimedia services application. */
  @js.native
  sealed trait isim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** Master File application. */
  @js.native
  sealed trait mf
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** Removable user identity card application. */
  @js.native
  sealed trait mfRuim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** A GSM application. */
  @js.native
  sealed trait mfSim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** An unknown kind. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /** UMTS application. */
  @js.native
  sealed trait usim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind
  
  /* 5 */ val csim: csim with scala.Double = js.native
  /* 6 */ val isim: isim with scala.Double = js.native
  /* 1 */ val mf: mf with scala.Double = js.native
  /* 3 */ val mfRuim: mfRuim with scala.Double = js.native
  /* 2 */ val mfSim: mfSim with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 4 */ val usim: usim with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind with scala.Double
  ] = js.native
}

