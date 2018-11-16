package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait clearSigned
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind
  
  /** Encrypted MIME. */
  @js.native
  sealed trait encrypted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind
  
  /** No MIME encryption or signature. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind
  
  /** Opaque signed MIME (a single MIME entity). */
  @js.native
  sealed trait opaqueSigned
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind
  
  val clearSigned: clearSigned with java.lang.String = js.native
  val encrypted: encrypted with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val opaqueSigned: opaqueSigned with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMessageSmimeKind with java.lang.String
  ] = js.native
}

