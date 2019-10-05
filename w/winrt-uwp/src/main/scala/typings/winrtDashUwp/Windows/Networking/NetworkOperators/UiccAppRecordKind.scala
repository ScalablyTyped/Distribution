package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  sealed trait recordOriented extends UiccAppRecordKind
  
  /** A transparent file - a sequence of bytes without further structure . */
  @js.native
  sealed trait transparent extends UiccAppRecordKind
  
  /** An unknown app record kind. For example, a UICC app that is enumerable by the modem, but is not an app used for cellular registration, would be reported as Unknown. */
  @js.native
  sealed trait unknown extends UiccAppRecordKind
  
  /* 2 */ val recordOriented: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind.recordOriented with Double = js.native
  /* 1 */ val transparent: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind.transparent with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAppRecordKind with Double] = js.native
}

