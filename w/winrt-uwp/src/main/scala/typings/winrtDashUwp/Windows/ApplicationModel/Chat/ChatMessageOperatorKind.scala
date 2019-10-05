package typings.winrtDashUwp.Windows.ApplicationModel.Chat

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
  
  /* 2 */ val mms: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageOperatorKind.mms with Double = js.native
  /* 3 */ val rcs: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageOperatorKind.rcs with Double = js.native
  /* 1 */ val sms: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageOperatorKind.sms with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.ApplicationModel.Chat.ChatMessageOperatorKind.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageOperatorKind with Double] = js.native
}

