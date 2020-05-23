package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureValidationResult extends js.Object

/** Describes the result of a signature verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.SignatureValidationResult")
@js.native
object SignatureValidationResult extends js.Object {
  /** A severe error occurred such as missing key provider information or an incorrect algorithm id. */
  @js.native
  sealed trait badMessage extends SignatureValidationResult
  
  /** An invalid argument was encountered while verifying the signature. */
  @js.native
  sealed trait invalidParameter extends SignatureValidationResult
  
  /** The signature was not verified. */
  @js.native
  sealed trait invalidSignature extends SignatureValidationResult
  
  /** Additional errors were encountered. */
  @js.native
  sealed trait otherErrors extends SignatureValidationResult
  
  /** The signature was verified. */
  @js.native
  sealed trait success extends SignatureValidationResult
  
}

