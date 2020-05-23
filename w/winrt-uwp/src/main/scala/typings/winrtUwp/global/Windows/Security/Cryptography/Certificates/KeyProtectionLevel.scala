package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the key protection level. This enumeration type is used in the KeyProtectionLevel property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends js.Object {
  /* 1 */ val consentOnly: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly with Double = js.native
  /* 3 */ val consentWithFingerprint: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithFingerprint with Double = js.native
  /* 2 */ val consentWithPassword: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword with Double = js.native
  /* 0 */ val noConsent: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel with Double
  ] = js.native
}

