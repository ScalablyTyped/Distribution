package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageOperatorKind extends js.Object

/** Specifies the message operator type. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageOperatorKind")
@js.native
object ChatMessageOperatorKind extends js.Object {
  /** MMS message */
  @js.native
  sealed trait mms extends ChatMessageOperatorKind
  
  /** RCS message */
  @js.native
  sealed trait rcs extends ChatMessageOperatorKind
  
  /** SMS message */
  @js.native
  sealed trait sms extends ChatMessageOperatorKind
  
  /** The value hasn't been set. */
  @js.native
  sealed trait unspecified extends ChatMessageOperatorKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageOperatorKind with Double] = js.native
  /* 2 */ @js.native
  object mms extends TopLevel[mms with Double]
  
  /* 3 */ @js.native
  object rcs extends TopLevel[rcs with Double]
  
  /* 1 */ @js.native
  object sms extends TopLevel[sms with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

