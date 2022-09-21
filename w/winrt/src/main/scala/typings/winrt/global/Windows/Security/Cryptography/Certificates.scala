package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages
import typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption
import typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Certificates {
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
  @js.native
  open class CertificateEnrollmentManager ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
  /* static members */
  object CertificateEnrollmentManager {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createRequestAsync(request: typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestAsync")(request.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
    
    inline def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("importPfxDataAsync")(pfxData.asInstanceOf[js.Any], password.asInstanceOf[js.Any], exportable.asInstanceOf[js.Any], keyProtectionLevel.asInstanceOf[js.Any], installOption.asInstanceOf[js.Any], friendlyName.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
    
    inline def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("installCertificateAsync")(certificate.asInstanceOf[js.Any], installOption.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
  @js.native
  open class CertificateRequestProperties ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties {
    
    /* CompleteClass */
    var exportable: ExportOption = js.native
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var hashAlgorithmName: String = js.native
    
    /* CompleteClass */
    var keyAlgorithmName: String = js.native
    
    /* CompleteClass */
    var keyProtectionLevel: KeyProtectionLevel = js.native
    
    /* CompleteClass */
    var keySize: Double = js.native
    
    /* CompleteClass */
    var keyStorageProviderName: String = js.native
    
    /* CompleteClass */
    var keyUsages: EnrollKeyUsages = js.native
    
    /* CompleteClass */
    var subject: String = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
  @js.native
  object EnrollKeyUsages extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages & Double
      ] = js.native
    
    /* 4 */ val all: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all & Double = js.native
    
    /* 1 */ val decryption: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption & Double = js.native
    
    /* 3 */ val keyAgreement: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none & Double = js.native
    
    /* 2 */ val signing: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
  @js.native
  object ExportOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption & Double] = js.native
    
    /* 1 */ val exportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable & Double = js.native
    
    /* 0 */ val notExportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
  @js.native
  object InstallOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions & Double] = js.native
    
    /* 1 */ val deleteExpired: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.none & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
  @js.native
  open class KeyAlgorithmNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  /* static members */
  object KeyAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.dsa")
    @js.native
    def dsa: String = js.native
    inline def dsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsa")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh256")
    @js.native
    def ecdh256: String = js.native
    inline def ecdh256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh384")
    @js.native
    def ecdh384: String = js.native
    inline def ecdh384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh521")
    @js.native
    def ecdh521: String = js.native
    inline def ecdh521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh521")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa256")
    @js.native
    def ecdsa256: String = js.native
    inline def ecdsa256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa384")
    @js.native
    def ecdsa384: String = js.native
    inline def ecdsa384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa521")
    @js.native
    def ecdsa521: String = js.native
    inline def ecdsa521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa521")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.rsa")
    @js.native
    def rsa: String = js.native
    inline def rsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
  @js.native
  object KeyProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel & Double
      ] = js.native
    
    /* 1 */ val consentOnly: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly & Double = js.native
    
    /* 2 */ val consentWithPassword: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword & Double = js.native
    
    /* 0 */ val noConsent: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
  @js.native
  object KeySize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Cryptography.Certificates.KeySize & Double] = js.native
    
    /* 0 */ val invalid: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.invalid & Double = js.native
    
    /* 1 */ val rsa2048: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 & Double = js.native
    
    /* 2 */ val rsa4096: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 & Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
  @js.native
  open class KeyStorageProviderNames ()
    extends StObject
       with typings.winrt.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  /* static members */
  object KeyStorageProviderNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.platformKeyStorageProvider")
    @js.native
    def platformKeyStorageProvider: String = js.native
    inline def platformKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platformKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.smartcardKeyStorageProvider")
    @js.native
    def smartcardKeyStorageProvider: String = js.native
    inline def smartcardKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartcardKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.softwareKeyStorageProvider")
    @js.native
    def softwareKeyStorageProvider: String = js.native
    inline def softwareKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("softwareKeyStorageProvider")(x.asInstanceOf[js.Any])
  }
}
