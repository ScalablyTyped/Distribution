package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageBodyKind with Double] = js.native
  /* 0 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 1 */ @js.native
  object plainText extends TopLevel[plainText with Double]
  
}

