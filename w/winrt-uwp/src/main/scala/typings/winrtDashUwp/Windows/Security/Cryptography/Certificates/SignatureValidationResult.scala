package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.badMessage
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidParameter
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidSignature
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.otherErrors
import typings.winrtDashUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.success
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureValidationResult with Double] = js.native
  /* 2 */ @js.native
  object badMessage extends TopLevel[badMessage with Double]
  
  /* 1 */ @js.native
  object invalidParameter extends TopLevel[invalidParameter with Double]
  
  /* 3 */ @js.native
  object invalidSignature extends TopLevel[invalidSignature with Double]
  
  /* 4 */ @js.native
  object otherErrors extends TopLevel[otherErrors with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
}

