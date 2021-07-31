package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UiccAppRecordKind extends StObject
/** Describes the kinds of UICC application record. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAppRecordKind")
@js.native
object UiccAppRecordKind extends StObject {
  
  /** A file that consists of a sequence of records. */
  @js.native
  sealed trait recordOriented
    extends StObject
       with UiccAppRecordKind
  
  /** A transparent file - a sequence of bytes without further structure . */
  @js.native
  sealed trait transparent
    extends StObject
       with UiccAppRecordKind
  
  /** An unknown app record kind. For example, a UICC app that is enumerable by the modem, but is not an app used for cellular registration, would be reported as Unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with UiccAppRecordKind
}
