package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait administrative5 extends UiccAccessCondition
  
  /** Access requires Administrative 6. */
  @js.native
  sealed trait administrative6 extends UiccAccessCondition
  
  /** Access is always allowed. */
  @js.native
  sealed trait alwaysAllowed extends UiccAccessCondition
  
  /** Access is never allowed. */
  @js.native
  sealed trait neverAllowed extends UiccAccessCondition
  
  /** Access requires PIN 1. */
  @js.native
  sealed trait pin1 extends UiccAccessCondition
  
  /** Access requires PIN 2. */
  @js.native
  sealed trait pin2 extends UiccAccessCondition
  
  /** Access requires PIN 3. */
  @js.native
  sealed trait pin3 extends UiccAccessCondition
  
  /** Access requires PIN 4. */
  @js.native
  sealed trait pin4 extends UiccAccessCondition
  
  /* 5 */ val administrative5: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.administrative5 with Double = js.native
  /* 6 */ val administrative6: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.administrative6 with Double = js.native
  /* 0 */ val alwaysAllowed: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.alwaysAllowed with Double = js.native
  /* 7 */ val neverAllowed: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.neverAllowed with Double = js.native
  /* 1 */ val pin1: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.pin1 with Double = js.native
  /* 2 */ val pin2: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.pin2 with Double = js.native
  /* 3 */ val pin3: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.pin3 with Double = js.native
  /* 4 */ val pin4: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.UiccAccessCondition.pin4 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAccessCondition with Double] = js.native
}

