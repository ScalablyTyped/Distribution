package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait forward
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind
  
  /** The email message is not a response to another email message. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind
  
  /** The email message is a reply to the sender of another email message. */
  @js.native
  sealed trait reply
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind
  
  /** The email message is a reply to the sender and all addressees of another email message. */
  @js.native
  sealed trait replyAll
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind
  
  /* 3 */ val forward: forward with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val reply: reply with scala.Double = js.native
  /* 2 */ val replyAll: replyAll with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind with scala.Double
  ] = js.native
}

