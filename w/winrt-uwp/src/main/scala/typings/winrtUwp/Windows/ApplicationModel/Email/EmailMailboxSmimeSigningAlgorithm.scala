package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
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
  sealed trait any extends EmailMailboxSmimeSigningAlgorithm
  
  /** Use Message Digest algorithm 5 (128-bit). */
  @js.native
  sealed trait md5 extends EmailMailboxSmimeSigningAlgorithm
  
  /** Use Secure Hash Algorithm 1 (160-bit). */
  @js.native
  sealed trait sha1 extends EmailMailboxSmimeSigningAlgorithm
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxSmimeSigningAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 2 */ @js.native
  object md5 extends TopLevel[md5 with Double]
  
  /* 1 */ @js.native
  object sha1 extends TopLevel[sha1 with Double]
  
}

