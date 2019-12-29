package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UiccAccessCondition with Double] = js.native
  /* 5 */ @js.native
  object administrative5 extends TopLevel[administrative5 with Double]
  
  /* 6 */ @js.native
  object administrative6 extends TopLevel[administrative6 with Double]
  
  /* 0 */ @js.native
  object alwaysAllowed extends TopLevel[alwaysAllowed with Double]
  
  /* 7 */ @js.native
  object neverAllowed extends TopLevel[neverAllowed with Double]
  
  /* 1 */ @js.native
  object pin1 extends TopLevel[pin1 with Double]
  
  /* 2 */ @js.native
  object pin2 extends TopLevel[pin2 with Double]
  
  /* 3 */ @js.native
  object pin3 extends TopLevel[pin3 with Double]
  
  /* 4 */ @js.native
  object pin4 extends TopLevel[pin4 with Double]
  
}

