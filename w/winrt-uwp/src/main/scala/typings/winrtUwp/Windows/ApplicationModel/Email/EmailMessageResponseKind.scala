package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageResponseKind with Double] = js.native
  /* 3 */ @js.native
  object forward extends TopLevel[forward with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object reply extends TopLevel[reply with Double]
  
  /* 2 */ @js.native
  object replyAll extends TopLevel[replyAll with Double]
  
}

