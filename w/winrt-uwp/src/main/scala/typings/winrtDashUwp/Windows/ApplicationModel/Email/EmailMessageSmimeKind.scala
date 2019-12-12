package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.clearSigned
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.encrypted
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.none
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.opaqueSigned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMessageSmimeKind extends js.Object

/** Defines the S/MIME type of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageSmimeKind")
@js.native
object EmailMessageSmimeKind extends js.Object {
  /** Clear signed MIME (two MIME entities). */
  @js.native
  sealed trait clearSigned extends EmailMessageSmimeKind
  
  /** Encrypted MIME. */
  @js.native
  sealed trait encrypted extends EmailMessageSmimeKind
  
  /** No MIME encryption or signature. */
  @js.native
  sealed trait none extends EmailMessageSmimeKind
  
  /** Opaque signed MIME (a single MIME entity). */
  @js.native
  sealed trait opaqueSigned extends EmailMessageSmimeKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageSmimeKind with Double] = js.native
  /* 1 */ @js.native
  object clearSigned extends TopLevel[clearSigned with Double]
  
  /* 3 */ @js.native
  object encrypted extends TopLevel[encrypted with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object opaqueSigned extends TopLevel[opaqueSigned with Double]
  
}

