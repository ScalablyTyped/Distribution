package typings.winrtUwp.Windows.ApplicationModel.Email

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
  
}

