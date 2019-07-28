package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  
  /* 1 */ val clearSigned: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind.clearSigned with Double = js.native
  /* 3 */ val encrypted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind.encrypted with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind.none with Double = js.native
  /* 2 */ val opaqueSigned: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind.opaqueSigned with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMessageSmimeKind with Double] = js.native
}

