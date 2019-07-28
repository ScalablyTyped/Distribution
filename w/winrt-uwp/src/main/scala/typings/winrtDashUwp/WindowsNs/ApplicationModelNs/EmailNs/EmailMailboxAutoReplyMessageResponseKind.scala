package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxAutoReplyMessageResponseKind extends js.Object

/** Defines the encoding schema used for automatic replies. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind")
@js.native
object EmailMailboxAutoReplyMessageResponseKind extends js.Object {
  /** The autoreply message is encoded as HTML. */
  @js.native
  sealed trait html extends EmailMailboxAutoReplyMessageResponseKind
  
  /** The autoreply message is encoded as plain text. */
  @js.native
  sealed trait plainText extends EmailMailboxAutoReplyMessageResponseKind
  
  /* 0 */ val html: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAutoReplyMessageResponseKind.html with Double = js.native
  /* 1 */ val plainText: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAutoReplyMessageResponseKind.plainText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxAutoReplyMessageResponseKind with Double] = js.native
}

