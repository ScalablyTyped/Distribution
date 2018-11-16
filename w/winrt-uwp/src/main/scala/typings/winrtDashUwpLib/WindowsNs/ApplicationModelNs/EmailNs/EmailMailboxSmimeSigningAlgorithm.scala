package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxSmimeSigningAlgorithm extends js.Object

/** Defines the algorithm used to sign an email. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSmimeSigningAlgorithm")
@js.native
object EmailMailboxSmimeSigningAlgorithm extends js.Object {
  /** No specific algorithm is required. */
  @js.native
  sealed trait any
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeSigningAlgorithm
  
  /** Use Message Digest algorithm 5 (128-bit). */
  @js.native
  sealed trait md5
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeSigningAlgorithm
  
  /** Use Secure Hash Algorithm 1 (160-bit). */
  @js.native
  sealed trait sha1
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeSigningAlgorithm
  
  val any: any with java.lang.String = js.native
  val md5: md5 with java.lang.String = js.native
  val sha1: sha1 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeSigningAlgorithm with java.lang.String
  ] = js.native
}

