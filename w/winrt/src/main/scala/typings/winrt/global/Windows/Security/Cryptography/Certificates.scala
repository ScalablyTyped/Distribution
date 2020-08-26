package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption
import typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Certificates")
@js.native
object Certificates extends js.Object {
  @js.native
  class CertificateEnrollmentManager ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
  
  @js.native
  class CertificateRequestProperties ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties
  
  @js.native
  class KeyAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  
  @js.native
  class KeyStorageProviderNames ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  
  /* static members */
  @js.native
  object CertificateEnrollmentManager extends js.Object {
    def createRequestAsync(request: typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties): IAsyncOperation[String] = js.native
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IAsyncAction = js.native
    def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
  }
  
  @js.native
  object EnrollKeyUsages extends js.Object {
    /* 4 */ val all: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
    /* 1 */ val decryption: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
    /* 3 */ val keyAgreement: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
    /* 2 */ val signing: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages with Double
      ] = js.native
  }
  
  @js.native
  object ExportOption extends js.Object {
    /* 1 */ val exportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
    /* 0 */ val notExportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption with Double
      ] = js.native
  }
  
  @js.native
  object InstallOptions extends js.Object {
    /* 1 */ val deleteExpired: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object KeyAlgorithmNames extends js.Object {
    var dsa: String = js.native
    var ecdh256: String = js.native
    var ecdh384: String = js.native
    var ecdh521: String = js.native
    var ecdsa256: String = js.native
    var ecdsa384: String = js.native
    var ecdsa521: String = js.native
    var rsa: String = js.native
  }
  
  @js.native
  object KeyProtectionLevel extends js.Object {
    /* 1 */ val consentOnly: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly with Double = js.native
    /* 2 */ val consentWithPassword: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword with Double = js.native
    /* 0 */ val noConsent: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel with Double
      ] = js.native
  }
  
  @js.native
  object KeySize extends js.Object {
    /* 0 */ val invalid: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.invalid with Double = js.native
    /* 1 */ val rsa2048: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 with Double = js.native
    /* 2 */ val rsa4096: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Cryptography.Certificates.KeySize with Double] = js.native
  }
  
  /* static members */
  @js.native
  object KeyStorageProviderNames extends js.Object {
    var platformKeyStorageProvider: String = js.native
    var smartcardKeyStorageProvider: String = js.native
    var softwareKeyStorageProvider: String = js.native
  }
  
}

