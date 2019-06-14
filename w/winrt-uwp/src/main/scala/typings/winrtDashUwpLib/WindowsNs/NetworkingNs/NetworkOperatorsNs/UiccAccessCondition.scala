package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UiccAccessCondition extends js.Object

/** Describes the conditions placed on operations using a UICC application. */
@JSGlobal("Windows.Networking.NetworkOperators.UiccAccessCondition")
@js.native
object UiccAccessCondition extends js.Object {
  /** Access requires Administrative 5. */
  @js.native
  sealed trait administrative5
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access requires Administrative 6. */
  @js.native
  sealed trait administrative6
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access is always allowed. */
  @js.native
  sealed trait alwaysAllowed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access is never allowed. */
  @js.native
  sealed trait neverAllowed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access requires PIN 1. */
  @js.native
  sealed trait pin1
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access requires PIN 2. */
  @js.native
  sealed trait pin2
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access requires PIN 3. */
  @js.native
  sealed trait pin3
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /** Access requires PIN 4. */
  @js.native
  sealed trait pin4
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition
  
  /* 5 */ val administrative5: administrative5 with scala.Double = js.native
  /* 6 */ val administrative6: administrative6 with scala.Double = js.native
  /* 0 */ val alwaysAllowed: alwaysAllowed with scala.Double = js.native
  /* 7 */ val neverAllowed: neverAllowed with scala.Double = js.native
  /* 1 */ val pin1: pin1 with scala.Double = js.native
  /* 2 */ val pin2: pin2 with scala.Double = js.native
  /* 3 */ val pin3: pin3 with scala.Double = js.native
  /* 4 */ val pin4: pin4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition with scala.Double
  ] = js.native
}

