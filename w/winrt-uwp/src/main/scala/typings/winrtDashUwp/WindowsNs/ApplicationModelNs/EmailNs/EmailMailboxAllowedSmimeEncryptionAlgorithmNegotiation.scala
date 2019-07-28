package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait anyAlgorithm extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** No negotiation is allowed. */
  @js.native
  sealed trait none extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /** Strong encryption is required. */
  @js.native
  sealed trait strongAlgorithm extends EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation
  
  /* 2 */ val anyAlgorithm: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation.anyAlgorithm with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation.none with Double = js.native
  /* 1 */ val strongAlgorithm: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation.strongAlgorithm with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxAllowedSmimeEncryptionAlgorithmNegotiation with Double] = js.native
}

