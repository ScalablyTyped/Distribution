package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait any
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the Data Encryption Standard symmetric key block cipher algorithm. */
  @js.native
  sealed trait des
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 128-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc2128Bit
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 40-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc240Bit
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the RC2 64-bit block cipher encryption algorithm. */
  @js.native
  sealed trait rc264Bit
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  /** Use the Triple Data Encryption Algorithm symmetric-key block cipher algorithm. */
  @js.native
  sealed trait tripleDes
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm
  
  val any: any with java.lang.String = js.native
  val des: des with java.lang.String = js.native
  val rc2128Bit: rc2128Bit with java.lang.String = js.native
  val rc240Bit: rc240Bit with java.lang.String = js.native
  val rc264Bit: rc264Bit with java.lang.String = js.native
  val tripleDes: tripleDes with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxSmimeEncryptionAlgorithm with java.lang.String
  ] = js.native
}

