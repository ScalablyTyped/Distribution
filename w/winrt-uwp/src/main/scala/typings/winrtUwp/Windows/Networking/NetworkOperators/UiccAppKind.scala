package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UiccAppKind extends StObject
/** Describes the kinds of UICC applications. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAppKind")
@js.native
object UiccAppKind extends StObject {
  
  /** CDMA application. */
  @js.native
  sealed trait csim
    extends StObject
       with UiccAppKind
  
  /** IP multimedia services application. */
  @js.native
  sealed trait isim
    extends StObject
       with UiccAppKind
  
  /** Master File application. */
  @js.native
  sealed trait mf
    extends StObject
       with UiccAppKind
  
  /** Removable user identity card application. */
  @js.native
  sealed trait mfRuim
    extends StObject
       with UiccAppKind
  
  /** A GSM application. */
  @js.native
  sealed trait mfSim
    extends StObject
       with UiccAppKind
  
  /** An unknown kind. */
  @js.native
  sealed trait unknown
    extends StObject
       with UiccAppKind
  
  /** UMTS application. */
  @js.native
  sealed trait usim
    extends StObject
       with UiccAppKind
}
