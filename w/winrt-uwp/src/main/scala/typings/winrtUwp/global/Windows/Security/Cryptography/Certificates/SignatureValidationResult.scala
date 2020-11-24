package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the result of a signature verification operation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.SignatureValidationResult")
@js.native
object SignatureValidationResult extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult with Double
  ] = js.native
  
  /* 2 */ val badMessage: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.badMessage with Double = js.native
  
  /* 1 */ val invalidParameter: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidParameter with Double = js.native
  
  /* 3 */ val invalidSignature: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidSignature with Double = js.native
  
  /* 4 */ val otherErrors: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.otherErrors with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.success with Double = js.native
}
