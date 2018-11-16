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
  
  val csim: csim with java.lang.String = js.native
  val isim: isim with java.lang.String = js.native
  val mf: mf with java.lang.String = js.native
  val mfRuim: mfRuim with java.lang.String = js.native
  val mfSim: mfSim with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val usim: usim with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppKind with java.lang.String
  ] = js.native
}

