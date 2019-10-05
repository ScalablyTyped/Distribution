package typings.winrtDashUwp.Windows.Networking.NetworkOperators

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
  
  /* 5 */ val csim: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.csim with Double = js.native
  /* 6 */ val isim: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.isim with Double = js.native
  /* 1 */ val mf: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.mf with Double = js.native
  /* 3 */ val mfRuim: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.mfRuim with Double = js.native
  /* 2 */ val mfSim: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.mfSim with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.unknown with Double = js.native
  /* 4 */ val usim: typings.winrtDashUwp.Windows.Networking.NetworkOperators.UiccAppKind.usim with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAppKind with Double] = js.native
}

