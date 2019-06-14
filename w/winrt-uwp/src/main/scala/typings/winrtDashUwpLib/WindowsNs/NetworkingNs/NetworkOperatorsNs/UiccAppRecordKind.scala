package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UiccAppRecordKind extends js.Object

/** Describes the kinds of UICC application record. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAppRecordKind")
@js.native
object UiccAppRecordKind extends js.Object {
  /** A file that consists of a sequence of records. */
  @js.native
  sealed trait recordOriented
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppRecordKind
  
  /** A transparent file - a sequence of bytes without further structure . */
  @js.native
  sealed trait transparent
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppRecordKind
  
  /** An unknown app record kind. For example, a UICC app that is enumerable by the modem, but is not an app used for cellular registration, would be reported as Unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppRecordKind
  
  /* 2 */ val recordOriented: recordOriented with scala.Double = js.native
  /* 1 */ val transparent: transparent with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAppRecordKind with scala.Double
  ] = js.native
}

