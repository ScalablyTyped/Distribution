package typings.winrtUwp.global.Windows.Security.Cryptography

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types that you can use to create certificate requests and install certificate responses. */
object Certificates {
  
  /** Represents a cryptography certificate. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.Certificate")
  @js.native
  class Certificate protected ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate {
    /**
      * Create a new instance of the Certificate class using the specified certificate data.
      * @param certBlob The certificate data as an ASN.1 DER encoded certificate blob (.cer or .p7b).
      */
    def this(certBlob: IBuffer) = this()
  }
  
  /** Represents a certificate chain used for signature verification. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChain")
  @js.native
  abstract class CertificateChain ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChain
  
  /** Describes the policy to use when performing a certificate chain validation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChainPolicy")
  @js.native
  object CertificateChainPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy with Double
      ] = js.native
    
    /* 0 */ val base: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.base with Double = js.native
    
    /* 3 */ val microsoftRoot: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.microsoftRoot with Double = js.native
    
    /* 2 */ val ntAuthentication: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.ntAuthentication with Double = js.native
    
    /* 1 */ val ssl: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.ssl with Double = js.native
  }
  
  /** Represents a certificate enrollment manager. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
  @js.native
  abstract class CertificateEnrollmentManager ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
  object CertificateEnrollmentManager {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Asynchronously creates a PKCS #10 certificate request based on properties specified in a CertificateRequestProperties object.
      * @param request A CertificateRequestProperties object that contains the property values used to create the certificate request.
      * @return This method returns a string that contains the base64 encoded PKCS #10 certificate request.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.createRequestAsync")
    @js.native
    def createRequestAsync(request: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateRequestProperties): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message.
      * @param pfxData Base64-encoded PFX message.
      * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
      * @param exportable A value of the ExportOption enumeration that specifies whether the key can be exported.
      * @param keyProtectionLevel A value of the KeyProtectionLevel enumeration that specifies the strength of the key protection. The default is NoConsent.
      * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
      * @param friendlyName The display name of the enrolled certificate. This value overwrites the FriendlyName property inside the PFX message.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.importPfxDataAsync")
    @js.native
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IPromiseWithIAsyncAction = js.native
    /**
      * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using the specified key storage provider.
      * @param pfxData Base64-encoded PFX message.
      * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
      * @param exportable A value of the ExportOption enumeration that specifies whether the key can be exported.
      * @param keyProtectionLevel A value of the KeyProtectionLevel enumeration that specifies the strength of the key protection. The default is NoConsent.
      * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
      * @param friendlyName The display name of the enrolled certificate. This value overwrites the FriendlyName property inside the PFX message.
      * @param keyStorageProvider The name of the key storage provider to use when importing the certificate.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.importPfxDataAsync")
    @js.native
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String,
      keyStorageProvider: String
    ): IPromiseWithIAsyncAction = js.native
    /**
      * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using import parameters.
      * @param pfxData Base64-encoded PFX message.
      * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
      * @param pfxImportParameters The PFX import parameters.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.importPfxDataAsync")
    @js.native
    def importPfxDataAsync(
      pfxData: String,
      password: String,
      pfxImportParameters: typings.winrtUwp.Windows.Security.Cryptography.Certificates.PfxImportParameters
    ): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously Installs a certificate chain into the app container on the local computer.
      * @param certificate The encoded certificate. The certificate is encoded by using Distinguished Encoding Rules (DER) as defined by the Abstract Syntax Notation One (ASN.1) standard.
      * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
      * @return This method does not return a value.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.installCertificateAsync")
    @js.native
    def installCertificateAsync(certificate: String, installOption: InstallOptions): IPromiseWithIAsyncAction = js.native
    
    /** Gets the associated UserCertificateEnrollmentManager . */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.userCertificateEnrollmentManager")
    @js.native
    def userCertificateEnrollmentManager: typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager = js.native
    @scala.inline
    def userCertificateEnrollmentManager_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userCertificateEnrollmentManager")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the usages of a certificate key. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateKeyUsages")
  @js.native
  /** Creates a new instance of the CertificateKeyUsages class. */
  class CertificateKeyUsages ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateKeyUsages
  
  /** Represents parameters for a query for certificates from the certificate store for an app. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateQuery")
  @js.native
  /** Creates a new instance of a certificate query. */
  class CertificateQuery ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery
  
  /** Represents the properties of a certificate request. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
  @js.native
  /** Creates and initializes a new instance of the CertificateRequestProperties . */
  class CertificateRequestProperties ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateRequestProperties
  
  /** Represents a certificate store for an app. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStore")
  @js.native
  abstract class CertificateStore ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore
  
  /** Represents a collection of certificate stores. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
  @js.native
  abstract class CertificateStores ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStores
  object CertificateStores {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get all certificates from the certificate stores.
      * @return An asynchronous operation to retrieve the list of certificates.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.findAllAsync")
    @js.native
    def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Get all certificates from the certificate stores that match the specified query parameters.
      * @param query The certificate values to search for.
      * @return An asynchronous operation to retrieve the list of certificates.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.findAllAsync")
    @js.native
    def findAllAsync(query: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets a certificate store from the collection of certificate stores by name.
      * @param storeName The name of the certificate store to return. The storeName parameter value cannot be "MY".
      * @return The requested certificate store.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.getStoreByName")
    @js.native
    def getStoreByName(storeName: String): typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
    
    /** Gets the certificate store of intermediate certification authorities for an app. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.intermediateCertificationAuthorities")
    @js.native
    def intermediateCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
    @scala.inline
    def intermediateCertificationAuthorities_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intermediateCertificationAuthorities")(x.asInstanceOf[js.Any])
    
    /** Gets the certificate store of trusted root certificates for an app. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.trustedRootCertificationAuthorities")
    @js.native
    def trustedRootCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
    @scala.inline
    def trustedRootCertificationAuthorities_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trustedRootCertificationAuthorities")(x.asInstanceOf[js.Any])
  }
  
  /** Represents parameters to use when building a certificate chain. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainBuildingParameters")
  @js.native
  /** Creates a new instance of the ChainBuildingParameters class. */
  class ChainBuildingParameters ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainBuildingParameters
  
  /** Represents values to use when verifying a certificate chain. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationParameters")
  @js.native
  /** Creates a new instance of the ChainValidationParameters class. */
  class ChainValidationParameters ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationParameters
  
  /** Describes the result of a certificate chain verification operation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationResult")
  @js.native
  object ChainValidationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult with Double
      ] = js.native
    
    /* 9 */ val basicConstraintsError: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.basicConstraintsError with Double = js.native
    
    /* 3 */ val expired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.expired with Double = js.native
    
    /* 4 */ val incompleteChain: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.incompleteChain with Double = js.native
    
    /* 8 */ val invalidCertificateAuthorityPolicy: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidCertificateAuthorityPolicy with Double = js.native
    
    /* 7 */ val invalidName: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidName with Double = js.native
    
    /* 5 */ val invalidSignature: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidSignature with Double = js.native
    
    /* 13 */ val otherErrors: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.otherErrors with Double = js.native
    
    /* 12 */ val revocationFailure: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationFailure with Double = js.native
    
    /* 11 */ val revocationInformationMissing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationInformationMissing with Double = js.native
    
    /* 2 */ val revoked: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revoked with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.success with Double = js.native
    
    /* 10 */ val unknownCriticalExtension: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.unknownCriticalExtension with Double = js.native
    
    /* 1 */ val untrusted: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.untrusted with Double = js.native
    
    /* 6 */ val wrongUsage: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.wrongUsage with Double = js.native
  }
  
  /** Represents a signature attached to a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
  @js.native
  class CmsAttachedSignature protected ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsAttachedSignature {
    /**
      * Creates a new instance of the CmsAttachedSignature class for the specified signed CMS message.
      * @param inputBlob A signed CMS message blob.
      */
    def this(inputBlob: IBuffer) = this()
  }
  object CmsAttachedSignature {
    
    /**
      * Signs the specified input data using the specified signer information and creates an attached signed CMS message.
      * @param data The input data to be signed.
      * @param signers The signer information used to compute the signature.
      * @param certificates The list of certificates to build the chain for the signer certificates.
      * @return An asynchronous operation to retrieve the attached signed CMS message.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature.generateSignatureAsync")
    @js.native
    def generateSignatureAsync(
      data: IBuffer,
      signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
      certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
    ): IPromiseWithIAsyncOperation[IBuffer] = js.native
  }
  
  /** Represents a detached signature for a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature")
  @js.native
  class CmsDetachedSignature protected ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsDetachedSignature {
    /**
      * Creates a new instance of the CmsDetachedSignature class for the specified signed CMS message.
      * @param inputBlob A signed CMS message blob.
      */
    def this(inputBlob: IBuffer) = this()
  }
  object CmsDetachedSignature {
    
    /**
      * Signs the specified input data using the specified signer information and creates a detached signed CMS message.
      * @param data The input data to be signed.
      * @param signers The signer information used to compute the signature.
      * @param certificates The list of certificates to build the chain for the signer certificates.
      * @return An asynchronous operation to retrieve the detached signed CMS message.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature.generateSignatureAsync")
    @js.native
    def generateSignatureAsync(
      data: IInputStream,
      signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
      certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
    ): IPromiseWithIAsyncOperation[IBuffer] = js.native
  }
  
  /** Represents signer information for a signed CMS message which contains a set of properties. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsSignerInfo")
  @js.native
  /** Creates a new instance of the CmsSignerInfo class. */
  class CmsSignerInfo ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo
  
  /** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsTimestampInfo")
  @js.native
  abstract class CmsTimestampInfo ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsTimestampInfo
  
  /** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
  @js.native
  object EnrollKeyUsages extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages with Double
      ] = js.native
    
    /* 4 */ val all: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all with Double = js.native
    
    /* 1 */ val decryption: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption with Double = js.native
    
    /* 3 */ val keyAgreement: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none with Double = js.native
    
    /* 2 */ val signing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing with Double = js.native
  }
  
  /** Specifies whether a private key can be exported. This enumeration type is used in the Exportable property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
  @js.native
  object ExportOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption with Double
      ] = js.native
    
    /* 1 */ val exportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.exportable with Double = js.native
    
    /* 0 */ val notExportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.notExportable with Double = js.native
  }
  
  /** Specifies certificate installation options. This enumeration type is used by the InstallCertificateAsync and ImportPfxDataAsync methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
  @js.native
  object InstallOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions with Double
      ] = js.native
    
    /* 1 */ val deleteExpired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.none with Double = js.native
  }
  
  /** Defines several commonly used public key algorithm names. You can use this class in the KeyAlgorithmName property on the CertificateRequestProperties class. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
  @js.native
  abstract class KeyAlgorithmNames ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  object KeyAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns "DSA" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.dsa")
    @js.native
    def dsa: String = js.native
    @scala.inline
    def dsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsa")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDH" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh")
    @js.native
    def ecdh: String = js.native
    
    /** Returns "ECDH256" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh256")
    @js.native
    def ecdh256: String = js.native
    @scala.inline
    def ecdh256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh256")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDH384" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh384")
    @js.native
    def ecdh384: String = js.native
    @scala.inline
    def ecdh384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh384")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDH521" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh521")
    @js.native
    def ecdh521: String = js.native
    @scala.inline
    def ecdh521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh521")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ecdh_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDSA" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa")
    @js.native
    def ecdsa: String = js.native
    
    /** Returns "ECDSA256" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa256")
    @js.native
    def ecdsa256: String = js.native
    @scala.inline
    def ecdsa256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa256")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDSA384" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa384")
    @js.native
    def ecdsa384: String = js.native
    @scala.inline
    def ecdsa384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa384")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDSA521" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa521")
    @js.native
    def ecdsa521: String = js.native
    @scala.inline
    def ecdsa521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa521")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ecdsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa")(x.asInstanceOf[js.Any])
    
    /** Returns "RSA" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.rsa")
    @js.native
    def rsa: String = js.native
    @scala.inline
    def rsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa")(x.asInstanceOf[js.Any])
  }
  
  /** Provides access to key attestation methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
  @js.native
  abstract class KeyAttestationHelper ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyAttestationHelper
  object KeyAttestationHelper {
    
    /**
      * Decrypts a TPM key attestation credential.
      * @param credential The TPM key attestation credential to decrypt.
      * @return When this method completes, it returns the decrypted TPM key attestation credential.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper.decryptTpmAttestationCredentialAsync")
    @js.native
    def decryptTpmAttestationCredentialAsync(credential: String): IPromiseWithIAsyncOperation[String] = js.native
    /**
      * Decrypts a TPM key attestation credential.
      * @param credential The TPM key attestation credential to decrypt.
      * @param containerName The container name of the credential.
      * @return When this method completes, it returns the decrypted TPM key attestation credential.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper.decryptTpmAttestationCredentialAsync")
    @js.native
    def decryptTpmAttestationCredentialAsync(credential: String, containerName: String): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Gets the credential ID from a TPM key attestation credential.
      * @param credential The TPM key attestation credential to get the credential ID from.
      * @return The credential ID from the TPM key attestation credential.
      */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper.getTpmAttestationCredentialId")
    @js.native
    def getTpmAttestationCredentialId(credential: String): String = js.native
  }
  
  /** Specifies the key protection level. This enumeration type is used in the KeyProtectionLevel property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
  @js.native
  object KeyProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel with Double
      ] = js.native
    
    /* 1 */ val consentOnly: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly with Double = js.native
    
    /* 3 */ val consentWithFingerprint: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithFingerprint with Double = js.native
    
    /* 2 */ val consentWithPassword: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword with Double = js.native
    
    /* 0 */ val noConsent: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent with Double = js.native
  }
  
  /** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
  @js.native
  object KeySize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize with Double] = js.native
    
    /* 0 */ val invalid: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.invalid with Double = js.native
    
    /* 1 */ val rsa2048: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 with Double = js.native
    
    /* 2 */ val rsa4096: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 with Double = js.native
  }
  
  /** Defines several commonly used key storage provider names. You can use this class in the KeyStorageProviderName property on the CertificateRequestProperties class. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
  @js.native
  abstract class KeyStorageProviderNames ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  object KeyStorageProviderNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns "Microsoft Passport Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.passportKeyStorageProvider")
    @js.native
    def passportKeyStorageProvider: String = js.native
    @scala.inline
    def passportKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passportKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Platform Crypyto Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.platformKeyStorageProvider")
    @js.native
    def platformKeyStorageProvider: String = js.native
    @scala.inline
    def platformKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platformKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Smart Card Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.smartcardKeyStorageProvider")
    @js.native
    def smartcardKeyStorageProvider: String = js.native
    @scala.inline
    def smartcardKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartcardKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Software Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.softwareKeyStorageProvider")
    @js.native
    def softwareKeyStorageProvider: String = js.native
    @scala.inline
    def softwareKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("softwareKeyStorageProvider")(x.asInstanceOf[js.Any])
  }
  
  /** Represents PFX import parameters. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.PfxImportParameters")
  @js.native
  /** Creates a new instance of the PfxImportParameters class. */
  class PfxImportParameters ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.PfxImportParameters
  
  /** Describes the result of a signature verification operation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.SignatureValidationResult")
  @js.native
  object SignatureValidationResult extends StObject {
    
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
  
  /** Provides info about a subject alternative name. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo")
  @js.native
  /** Creates a new instance of the SubjectAlternativeNameInfo class. */
  class SubjectAlternativeNameInfo ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo
  
  /** Provides access to certificate creation, import, and enrollment methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager")
  @js.native
  abstract class UserCertificateEnrollmentManager ()
    extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager
}
