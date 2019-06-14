package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait html
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageBodyKind
  
  /** The email message is formatted as plain text. */
  @js.native
  sealed trait plainText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageBodyKind
  
  /* 0 */ val html: html with scala.Double = js.native
  /* 1 */ val plainText: plainText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageBodyKind with scala.Double
  ] = js.native
}

