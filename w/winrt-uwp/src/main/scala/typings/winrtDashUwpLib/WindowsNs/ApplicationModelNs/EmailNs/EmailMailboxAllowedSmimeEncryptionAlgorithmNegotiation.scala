package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation extends js.Object

/** Defines the type of negotiation on encryption algorithms permitted by the server. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation")
@js.native
object EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation extends js.Object {
  /** Minimal encryption is required. */
  @js.native
  sealed trait anyAlgorithm
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** No negotiation is allowed. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** Strong encryption is required. */
  @js.native
  sealed trait strongAlgorithm
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /* 2 */ val anyAlgorithm: anyAlgorithm with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val strongAlgorithm: strongAlgorithm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation with scala.Double
  ] = js.native
}

