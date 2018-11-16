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
  
  val forward: forward with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val reply: reply with java.lang.String = js.native
  val replyAll: replyAll with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageResponseKind with java.lang.String
  ] = js.native
}

