package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMessageResponseKind extends js.Object

/** Defines the type of response to an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageResponseKind")
@js.native
object EmailMessageResponseKind extends js.Object {
  /** The email message is a forwarded copy of another email message. */
  @js.native
  sealed trait forward extends EmailMessageResponseKind
  
  /** The email message is not a response to another email message. */
  @js.native
  sealed trait none extends EmailMessageResponseKind
  
  /** The email message is a reply to the sender of another email message. */
  @js.native
  sealed trait reply extends EmailMessageResponseKind
  
  /** The email message is a reply to the sender and all addressees of another email message. */
  @js.native
  sealed trait replyAll extends EmailMessageResponseKind
  
  /* 3 */ val forward: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.forward with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.none with Double = js.native
  /* 1 */ val reply: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.reply with Double = js.native
  /* 2 */ val replyAll: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageResponseKind.replyAll with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageResponseKind with Double] = js.native
}

