package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAppRecordKind with Double] = js.native
  /* 2 */ @js.native
  object recordOriented extends TopLevel[recordOriented with Double]
  
  /* 1 */ @js.native
  object transparent extends TopLevel[transparent with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

