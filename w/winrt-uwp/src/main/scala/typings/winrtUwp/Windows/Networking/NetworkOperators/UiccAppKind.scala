package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  sealed trait csim extends UiccAppKind
  
  /** IP multimedia services application. */
  @js.native
  sealed trait isim extends UiccAppKind
  
  /** Master File application. */
  @js.native
  sealed trait mf extends UiccAppKind
  
  /** Removable user identity card application. */
  @js.native
  sealed trait mfRuim extends UiccAppKind
  
  /** A GSM application. */
  @js.native
  sealed trait mfSim extends UiccAppKind
  
  /** An unknown kind. */
  @js.native
  sealed trait unknown extends UiccAppKind
  
  /** UMTS application. */
  @js.native
  sealed trait usim extends UiccAppKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAppKind with Double] = js.native
  /* 5 */ @js.native
  object csim extends TopLevel[csim with Double]
  
  /* 6 */ @js.native
  object isim extends TopLevel[isim with Double]
  
  /* 1 */ @js.native
  object mf extends TopLevel[mf with Double]
  
  /* 3 */ @js.native
  object mfRuim extends TopLevel[mfRuim with Double]
  
  /* 2 */ @js.native
  object mfSim extends TopLevel[mfSim with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 4 */ @js.native
  object usim extends TopLevel[usim with Double]
  
}

