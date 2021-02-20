package typings.winrt.global.Windows.Security.Cryptography

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption
import typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions
import typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Certificates {
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
  @js.native
  class CertificateEnrollmentManager ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
  /* static members */
  object CertificateEnrollmentManager {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.createRequestAsync")
    @js.native
    def createRequestAsync(request: typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties): IAsyncOperation[String] = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.importPfxDataAsync")
    @js.native
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IAsyncAction = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.installCertificateAsync")
    @js.native
    def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
  @js.native
  class CertificateRequestProperties ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
  @js.native
  object EnrollKeyUsages extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages with Double
      ] = js.native
    
    /* 4 */ val all: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
    
    /* 1 */ val decryption: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
    
    /* 3 */ val keyAgreement: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
    
    /* 2 */ val signing: typings.winrt.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
  @js.native
  object ExportOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption with Double
      ] = js.native
    
    /* 1 */ val exportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
    
    /* 0 */ val notExportable: typings.winrt.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
  @js.native
  object InstallOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions with Double
      ] = js.native
    
    /* 1 */ val deleteExpired: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Security.Cryptography.Certificates.InstallOptions.none with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
  @js.native
  class KeyAlgorithmNames ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  /* static members */
  object KeyAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.dsa")
    @js.native
    def dsa: String = js.native
    @scala.inline
    def dsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsa")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh256")
    @js.native
    def ecdh256: String = js.native
    @scala.inline
    def ecdh256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh384")
    @js.native
    def ecdh384: String = js.native
    @scala.inline
    def ecdh384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh521")
    @js.native
    def ecdh521: String = js.native
    @scala.inline
    def ecdh521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh521")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa256")
    @js.native
    def ecdsa256: String = js.native
    @scala.inline
    def ecdsa256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa256")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa384")
    @js.native
    def ecdsa384: String = js.native
    @scala.inline
    def ecdsa384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa384")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa521")
    @js.native
    def ecdsa521: String = js.native
    @scala.inline
    def ecdsa521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa521")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.rsa")
    @js.native
    def rsa: String = js.native
    @scala.inline
    def rsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
  @js.native
  object KeyProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel with Double
      ] = js.native
    
    /* 1 */ val consentOnly: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly with Double = js.native
    
    /* 2 */ val consentWithPassword: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword with Double = js.native
    
    /* 0 */ val noConsent: typings.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
  @js.native
  object KeySize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Cryptography.Certificates.KeySize with Double] = js.native
    
    /* 0 */ val invalid: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.invalid with Double = js.native
    
    /* 1 */ val rsa2048: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 with Double = js.native
    
    /* 2 */ val rsa4096: typings.winrt.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 with Double = js.native
  }
  
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
  @js.native
  class KeyStorageProviderNames ()
    extends typings.winrt.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  /* static members */
  object KeyStorageProviderNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.platformKeyStorageProvider")
    @js.native
    def platformKeyStorageProvider: String = js.native
    @scala.inline
    def platformKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platformKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.smartcardKeyStorageProvider")
    @js.native
    def smartcardKeyStorageProvider: String = js.native
    @scala.inline
    def smartcardKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartcardKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.softwareKeyStorageProvider")
    @js.native
    def softwareKeyStorageProvider: String = js.native
    @scala.inline
    def softwareKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("softwareKeyStorageProvider")(x.asInstanceOf[js.Any])
  }
}
