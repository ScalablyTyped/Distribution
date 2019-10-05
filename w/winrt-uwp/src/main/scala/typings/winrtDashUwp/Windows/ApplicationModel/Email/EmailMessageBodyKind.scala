package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMessageBodyKind extends js.Object

/** Defines the format of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageBodyKind")
@js.native
object EmailMessageBodyKind extends js.Object {
  /** The email message is formatted as HTML. */
  @js.native
  sealed trait html extends EmailMessageBodyKind
  
  /** The email message is formatted as plain text. */
  @js.native
  sealed trait plainText extends EmailMessageBodyKind
  
  /* 0 */ val html: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageBodyKind.html with Double = js.native
  /* 1 */ val plainText: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageBodyKind.plainText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageBodyKind with Double] = js.native
}

