package typings.winrtDashUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxSmimeEncryptionAlgorithm extends js.Object

/** Defines the encryption algorithm used for an email. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm")
@js.native
object EmailMailboxSmimeEncryptionAlgorithm extends js.Object {
  /** The encryption algorithm requirements are not specified. */
  @js.native
  sealed trait any extends EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the Data Encryption Standard symmetric key block cipher algorithm. */
  @js.native
  sealed trait des extends EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 128-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc2128Bit extends EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 40-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc240Bit extends EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 64-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc264Bit extends EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the Triple Data Encryption Algorithm symmetric-key block cipher algorithm. */
  @js.native
  sealed trait tripleDes extends EmailMailboxSmimeEncryptionAlgorithm
  
  /* 0 */ val any: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.any with Double = js.native
  /* 2 */ val des: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.des with Double = js.native
  /* 3 */ val rc2128Bit: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc2128Bit with Double = js.native
  /* 5 */ val rc240Bit: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc240Bit with Double = js.native
  /* 4 */ val rc264Bit: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc264Bit with Double = js.native
  /* 1 */ val tripleDes: typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.tripleDes with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxSmimeEncryptionAlgorithm with Double] = js.native
}

