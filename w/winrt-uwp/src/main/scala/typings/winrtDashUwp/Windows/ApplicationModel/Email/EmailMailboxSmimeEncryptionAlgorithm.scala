package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.any
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.des
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc2128Bit
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc240Bit
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.rc264Bit
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxSmimeEncryptionAlgorithm.tripleDes
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxSmimeEncryptionAlgorithm with Double] = js.native
  /* 0 */ @js.native
  object any extends TopLevel[any with Double]
  
  /* 2 */ @js.native
  object des extends TopLevel[des with Double]
  
  /* 3 */ @js.native
  object rc2128Bit extends TopLevel[rc2128Bit with Double]
  
  /* 5 */ @js.native
  object rc240Bit extends TopLevel[rc240Bit with Double]
  
  /* 4 */ @js.native
  object rc264Bit extends TopLevel[rc264Bit with Double]
  
  /* 1 */ @js.native
  object tripleDes extends TopLevel[tripleDes with Double]
  
}

