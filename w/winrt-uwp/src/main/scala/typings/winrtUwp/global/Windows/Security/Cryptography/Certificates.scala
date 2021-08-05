package typings.winrtUwp.global.Windows.Security.Cryptography

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel
import typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains types that you can use to create certificate requests and install certificate responses. */
object Certificates {
  
  /** Represents a cryptography certificate. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.Certificate")
  @js.native
  class Certificate protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate {
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
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChain
  
  /** Describes the policy to use when performing a certificate chain validation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChainPolicy")
  @js.native
  object CertificateChainPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy & Double
      ] = js.native
    
    /* 0 */ val base: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.base & Double = js.native
    
    /* 3 */ val microsoftRoot: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.microsoftRoot & Double = js.native
    
    /* 2 */ val ntAuthentication: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.ntAuthentication & Double = js.native
    
    /* 1 */ val ssl: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateChainPolicy.ssl & Double = js.native
  }
  
  /** Represents a certificate enrollment manager. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
  @js.native
  abstract class CertificateEnrollmentManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager
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
    inline def createRequestAsync(request: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateRequestProperties): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestAsync")(request.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
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
    inline def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String
    ): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("importPfxDataAsync")(pfxData.asInstanceOf[js.Any], password.asInstanceOf[js.Any], exportable.asInstanceOf[js.Any], keyProtectionLevel.asInstanceOf[js.Any], installOption.asInstanceOf[js.Any], friendlyName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
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
    inline def importPfxDataAsync(
      pfxData: String,
      password: String,
      exportable: ExportOption,
      keyProtectionLevel: KeyProtectionLevel,
      installOption: InstallOptions,
      friendlyName: String,
      keyStorageProvider: String
    ): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("importPfxDataAsync")(pfxData.asInstanceOf[js.Any], password.asInstanceOf[js.Any], exportable.asInstanceOf[js.Any], keyProtectionLevel.asInstanceOf[js.Any], installOption.asInstanceOf[js.Any], friendlyName.asInstanceOf[js.Any], keyStorageProvider.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    /**
      * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using import parameters.
      * @param pfxData Base64-encoded PFX message.
      * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
      * @param pfxImportParameters The PFX import parameters.
      * @return This method does not return a value.
      */
    /* static member */
    inline def importPfxDataAsync(
      pfxData: String,
      password: String,
      pfxImportParameters: typings.winrtUwp.Windows.Security.Cryptography.Certificates.PfxImportParameters
    ): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("importPfxDataAsync")(pfxData.asInstanceOf[js.Any], password.asInstanceOf[js.Any], pfxImportParameters.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    
    /**
      * Asynchronously Installs a certificate chain into the app container on the local computer.
      * @param certificate The encoded certificate. The certificate is encoded by using Distinguished Encoding Rules (DER) as defined by the Abstract Syntax Notation One (ASN.1) standard.
      * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
      * @return This method does not return a value.
      */
    /* static member */
    inline def installCertificateAsync(certificate: String, installOption: InstallOptions): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("installCertificateAsync")(certificate.asInstanceOf[js.Any], installOption.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    
    /** Gets the associated UserCertificateEnrollmentManager . */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager.userCertificateEnrollmentManager")
    @js.native
    def userCertificateEnrollmentManager: typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager = js.native
    inline def userCertificateEnrollmentManager_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userCertificateEnrollmentManager")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the usages of a certificate key. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateKeyUsages")
  @js.native
  /** Creates a new instance of the CertificateKeyUsages class. */
  class CertificateKeyUsages ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateKeyUsages {
    
    /** Gets or sets if the key is for cRLSign. */
    /* CompleteClass */
    var crlSign: Boolean = js.native
    
    /** Gets or sets if the key is for data encipherment. */
    /* CompleteClass */
    var dataEncipherment: Boolean = js.native
    
    /** Gets or sets if the key is for digital signature. */
    /* CompleteClass */
    var digitalSignature: Boolean = js.native
    
    /** Gets or sets if the key is for encipher only. */
    /* CompleteClass */
    var encipherOnly: Boolean = js.native
    
    /** Gets or sets if the key is for key agreement. */
    /* CompleteClass */
    var keyAgreement: Boolean = js.native
    
    /** Gets or sets if the key is for key certificate sign. */
    /* CompleteClass */
    var keyCertificateSign: Boolean = js.native
    
    /** Gets or sets if the key is for key encipherment. */
    /* CompleteClass */
    var keyEncipherment: Boolean = js.native
    
    /** Gets or sets if the key is for non-repudiation. */
    /* CompleteClass */
    var nonRepudiation: Boolean = js.native
  }
  
  /** Represents parameters for a query for certificates from the certificate store for an app. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateQuery")
  @js.native
  /** Creates a new instance of a certificate query. */
  class CertificateQuery ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery {
    
    /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension to search for. */
    /* CompleteClass */
    var enhancedKeyUsages: IVector[String] = js.native
    
    /** Gets or sets the certificate friendly name to search for. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** Gets or sets a value that indicates whether only hardware certificates (SC or TPM) are to be returned from the query. */
    /* CompleteClass */
    var hardwareOnly: Boolean = js.native
    
    /** Gets or sets whether to include duplicates. */
    /* CompleteClass */
    var includeDuplicates: Boolean = js.native
    
    /** Gets or sets whether to include expired certificates. */
    /* CompleteClass */
    var includeExpiredCertificates: Boolean = js.native
    
    /** Gets or sets the name of the certificate issuer to search for. */
    /* CompleteClass */
    var issuerName: String = js.native
    
    /** Gets or sets the store name. */
    /* CompleteClass */
    var storeName: String = js.native
    
    /** Gets or sets a certificate thumbprint to search for. */
    /* CompleteClass */
    var thumbprint: Double = js.native
  }
  
  /** Represents the properties of a certificate request. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateRequestProperties")
  @js.native
  /** Creates and initializes a new instance of the CertificateRequestProperties . */
  class CertificateRequestProperties ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateRequestProperties {
    
    /** Gets or sets the CA exchange certificate that is used to encrypt a key attestation certificate request. */
    /* CompleteClass */
    var attestationCredentialCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
    
    /** Gets or sets the container name. */
    /* CompleteClass */
    var containerName: String = js.native
    
    /** Gets or sets the prefix of the container name. */
    /* CompleteClass */
    var containerNamePrefix: String = js.native
    
    /** Gets or sets the name of the elliptic curve. */
    /* CompleteClass */
    var curveName: String = js.native
    
    /** Gets or sets the parameters of the elliptic curve. */
    /* CompleteClass */
    var curveParameters: Double = js.native
    
    /** Gets or sets a value that specifies whether the private key created for the request can be exported. */
    /* CompleteClass */
    var exportable: ExportOption = js.native
    
    /** Gets or sets the display name of the enrolled certificate. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** Gets or sets the hash algorithm used when creating the certificate request signature. */
    /* CompleteClass */
    var hashAlgorithmName: String = js.native
    
    /** Gets or sets the public key algorithm. */
    /* CompleteClass */
    var keyAlgorithmName: String = js.native
    
    /** Gets or sets the level of strong key protection. */
    /* CompleteClass */
    var keyProtectionLevel: KeyProtectionLevel = js.native
    
    /** Gets or sets the size, in bits, of the private key to be generated. */
    /* CompleteClass */
    var keySize: Double = js.native
    
    /** Gets or sets the name of the key storage provider (KSP) that will be used to generate the private key. */
    /* CompleteClass */
    var keyStorageProviderName: String = js.native
    
    /** Gets or sets the operation that can be performed by the private key created for this certificate request. The default value is Signing. */
    /* CompleteClass */
    var keyUsages: EnrollKeyUsages = js.native
    
    /** Gets or sets the certificate used to sign the certificate request. */
    /* CompleteClass */
    var signingCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
    
    /** Gets or sets the name of the smart card reader used to create the certificate request. */
    /* CompleteClass */
    var smartcardReaderName: String = js.native
    
    /** Gets or sets the subject name. */
    /* CompleteClass */
    var subject: String = js.native
    
    /** Gets or sets whether to use the existing key. */
    /* CompleteClass */
    var useExistingKey: Boolean = js.native
  }
  
  /** Represents a certificate store for an app. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStore")
  @js.native
  abstract class CertificateStore ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore {
    
    /**
      * Adds a certificate to the certificate store.
      * @param certificate The certificate to add to the certificate store.
      */
    /* CompleteClass */
    override def add(certificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate): Unit = js.native
    
    /**
      * Deletes a certificate from the certificate store.
      * @param certificate The certificate to delete from the certificate store.
      */
    /* CompleteClass */
    override def delete(certificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate): Unit = js.native
    
    /** Gets the name of the certificate store. */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /** Represents a collection of certificate stores. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
  @js.native
  abstract class CertificateStores ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStores
  object CertificateStores {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get all certificates from the certificate stores.
      * @return An asynchronous operation to retrieve the list of certificates.
      */
    /* static member */
    inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    /**
      * Get all certificates from the certificate stores that match the specified query parameters.
      * @param query The certificate values to search for.
      * @return An asynchronous operation to retrieve the list of certificates.
      */
    /* static member */
    inline def findAllAsync(query: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(query.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Gets a certificate store from the collection of certificate stores by name.
      * @param storeName The name of the certificate store to return. The storeName parameter value cannot be "MY".
      * @return The requested certificate store.
      */
    /* static member */
    inline def getStoreByName(storeName: String): typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoreByName")(storeName.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore]
    
    /** Gets the certificate store of intermediate certification authorities for an app. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.intermediateCertificationAuthorities")
    @js.native
    def intermediateCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
    inline def intermediateCertificationAuthorities_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intermediateCertificationAuthorities")(x.asInstanceOf[js.Any])
    
    /** Gets the certificate store of trusted root certificates for an app. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores.trustedRootCertificationAuthorities")
    @js.native
    def trustedRootCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
    inline def trustedRootCertificationAuthorities_=(x: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trustedRootCertificationAuthorities")(x.asInstanceOf[js.Any])
  }
  
  /** Represents parameters to use when building a certificate chain. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainBuildingParameters")
  @js.native
  /** Creates a new instance of the ChainBuildingParameters class. */
  class ChainBuildingParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainBuildingParameters {
    
    /** Gets or sets a value that indicates whether Authority Information Access (AIA) is enabled. */
    /* CompleteClass */
    var authorityInformationAccessEnabled: Boolean = js.native
    
    /** Gets or sets a value indicating that the current time is to be used for the validation timestamp. */
    /* CompleteClass */
    var currentTimeValidationEnabled: Boolean = js.native
    
    /** Gets a collection of object identifiers (OIDs) for the enhanced key usage extension. */
    /* CompleteClass */
    var enhancedKeyUsages: IVector[String] = js.native
    
    /** Gets the list of root certificates that will be trusted. */
    /* CompleteClass */
    var exclusiveTrustRoots: IVector[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
    
    /** Gets or sets a value indicating whether to request new URLs to use for chain building and revocation checking or to use cached URLs. */
    /* CompleteClass */
    var networkRetrievalEnabled: Boolean = js.native
    
    /** Gets or sets a value indicating whether revocation checking is enabled. */
    /* CompleteClass */
    var revocationCheckEnabled: Boolean = js.native
    
    /** Gets or sets the time stamp used to determine whether the certificate chain was time valid. */
    /* CompleteClass */
    var validationTimestamp: Date = js.native
  }
  
  /** Represents values to use when verifying a certificate chain. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationParameters")
  @js.native
  /** Creates a new instance of the ChainValidationParameters class. */
  class ChainValidationParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationParameters {
    
    /** Gets or sets the certificate chain policy to use when verifying the certificate chain. */
    /* CompleteClass */
    var certificateChainPolicy: CertificateChainPolicy = js.native
    
    /** Gets or sets the server DNS name to use for SSL policy. */
    /* CompleteClass */
    var serverDnsName: HostName = js.native
  }
  
  /** Describes the result of a certificate chain verification operation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ChainValidationResult")
  @js.native
  object ChainValidationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult & Double
      ] = js.native
    
    /* 9 */ val basicConstraintsError: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.basicConstraintsError & Double = js.native
    
    /* 3 */ val expired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.expired & Double = js.native
    
    /* 4 */ val incompleteChain: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.incompleteChain & Double = js.native
    
    /* 8 */ val invalidCertificateAuthorityPolicy: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidCertificateAuthorityPolicy & Double = js.native
    
    /* 7 */ val invalidName: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidName & Double = js.native
    
    /* 5 */ val invalidSignature: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.invalidSignature & Double = js.native
    
    /* 13 */ val otherErrors: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.otherErrors & Double = js.native
    
    /* 12 */ val revocationFailure: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationFailure & Double = js.native
    
    /* 11 */ val revocationInformationMissing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revocationInformationMissing & Double = js.native
    
    /* 2 */ val revoked: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.revoked & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.success & Double = js.native
    
    /* 10 */ val unknownCriticalExtension: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.unknownCriticalExtension & Double = js.native
    
    /* 1 */ val untrusted: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.untrusted & Double = js.native
    
    /* 6 */ val wrongUsage: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ChainValidationResult.wrongUsage & Double = js.native
  }
  
  /** Represents a signature attached to a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
  @js.native
  class CmsAttachedSignature protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsAttachedSignature {
    /**
      * Creates a new instance of the CmsAttachedSignature class for the specified signed CMS message.
      * @param inputBlob A signed CMS message blob.
      */
    def this(inputBlob: IBuffer) = this()
    
    /** Gets the list of certificates that are used for chain building for the signer certificate. */
    /* CompleteClass */
    var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
    
    /** Gets the content of the signed CMS message. */
    /* CompleteClass */
    var content: Double = js.native
    
    /** Gets the list of signers that are used for creating or verifying the signature. */
    /* CompleteClass */
    var signers: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo] = js.native
    
    /**
      * Verifies the signature contained in the signed CMS message.
      * @return The result of the signature verification operation.
      */
    /* CompleteClass */
    override def verifySignature(): SignatureValidationResult = js.native
  }
  object CmsAttachedSignature {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CmsAttachedSignature")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Signs the specified input data using the specified signer information and creates an attached signed CMS message.
      * @param data The input data to be signed.
      * @param signers The signer information used to compute the signature.
      * @param certificates The list of certificates to build the chain for the signer certificates.
      * @return An asynchronous operation to retrieve the attached signed CMS message.
      */
    /* static member */
    inline def generateSignatureAsync(
      data: IBuffer,
      signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
      certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
    ): IPromiseWithIAsyncOperation[IBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSignatureAsync")(data.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], certificates.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
  }
  
  /** Represents a detached signature for a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature")
  @js.native
  class CmsDetachedSignature protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsDetachedSignature {
    /**
      * Creates a new instance of the CmsDetachedSignature class for the specified signed CMS message.
      * @param inputBlob A signed CMS message blob.
      */
    def this(inputBlob: IBuffer) = this()
    
    /** Gets the list of certificates that are used for chain building for the signer certificate. */
    /* CompleteClass */
    var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
    
    /** Gets the list of signers that are used for creating or verifying the signature. */
    /* CompleteClass */
    var signers: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo] = js.native
    
    /**
      * Verifies a signed CMS message against the original streaming input.
      * @param data The original input stream for the signed CMS message.
      * @return An asynchronous operation to retrieve the result of the signature validation operation.
      */
    /* CompleteClass */
    override def verifySignatureAsync(data: IInputStream): IPromiseWithIAsyncOperation[SignatureValidationResult] = js.native
  }
  object CmsDetachedSignature {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Signs the specified input data using the specified signer information and creates a detached signed CMS message.
      * @param data The input data to be signed.
      * @param signers The signer information used to compute the signature.
      * @param certificates The list of certificates to build the chain for the signer certificates.
      * @return An asynchronous operation to retrieve the detached signed CMS message.
      */
    /* static member */
    inline def generateSignatureAsync(
      data: IInputStream,
      signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
      certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
    ): IPromiseWithIAsyncOperation[IBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSignatureAsync")(data.asInstanceOf[js.Any], signers.asInstanceOf[js.Any], certificates.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
  }
  
  /** Represents signer information for a signed CMS message which contains a set of properties. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsSignerInfo")
  @js.native
  /** Creates a new instance of the CmsSignerInfo class. */
  class CmsSignerInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo {
    
    /** Gets or sets the signer certificate that is used to sign the message. */
    /* CompleteClass */
    var certificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
    
    /** Gets or sets the hash algorithm that is used to sign the CMS message. */
    /* CompleteClass */
    var hashAlgorithmName: String = js.native
    
    /** Gets the RFC3161 unauthenticated timestamp information. */
    /* CompleteClass */
    var timestampInfo: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsTimestampInfo = js.native
  }
  
  /** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.CmsTimestampInfo")
  @js.native
  abstract class CmsTimestampInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsTimestampInfo {
    
    /** Gets the list of certificates that is used for chain building for the signing certificate. */
    /* CompleteClass */
    var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
    
    /** Gets the certificate that is used to sign the timestamp. */
    /* CompleteClass */
    var signingCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
    
    /** Gets the date and time of the timestamp. */
    /* CompleteClass */
    var timestamp: Date = js.native
  }
  
  /** Specifies the cryptographic operations that can be performed by the private key. This enumeration type is used in the KeyUsages property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.EnrollKeyUsages")
  @js.native
  object EnrollKeyUsages extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages & Double
      ] = js.native
    
    /* 4 */ val all: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.all & Double = js.native
    
    /* 1 */ val decryption: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.decryption & Double = js.native
    
    /* 3 */ val keyAgreement: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.keyAgreement & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.none & Double = js.native
    
    /* 2 */ val signing: typings.winrtUwp.Windows.Security.Cryptography.Certificates.EnrollKeyUsages.signing & Double = js.native
  }
  
  /** Specifies whether a private key can be exported. This enumeration type is used in the Exportable property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
  @js.native
  object ExportOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption & Double
      ] = js.native
    
    /* 1 */ val exportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.exportable & Double = js.native
    
    /* 0 */ val notExportable: typings.winrtUwp.Windows.Security.Cryptography.Certificates.ExportOption.notExportable & Double = js.native
  }
  
  /** Specifies certificate installation options. This enumeration type is used by the InstallCertificateAsync and ImportPfxDataAsync methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.InstallOptions")
  @js.native
  object InstallOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions & Double
      ] = js.native
    
    /* 1 */ val deleteExpired: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.deleteExpired & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Cryptography.Certificates.InstallOptions.none & Double = js.native
  }
  
  /** Defines several commonly used public key algorithm names. You can use this class in the KeyAlgorithmName property on the CertificateRequestProperties class. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
  @js.native
  abstract class KeyAlgorithmNames ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyAlgorithmNames
  object KeyAlgorithmNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns "DSA" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.dsa")
    @js.native
    def dsa: String = js.native
    inline def dsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dsa")(x.asInstanceOf[js.Any])
    
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
    inline def ecdh256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh256")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDH384" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh384")
    @js.native
    def ecdh384: String = js.native
    inline def ecdh384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh384")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDH521" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdh521")
    @js.native
    def ecdh521: String = js.native
    inline def ecdh521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh521")(x.asInstanceOf[js.Any])
    
    inline def ecdh_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdh")(x.asInstanceOf[js.Any])
    
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
    inline def ecdsa256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa256")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDSA384" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa384")
    @js.native
    def ecdsa384: String = js.native
    inline def ecdsa384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa384")(x.asInstanceOf[js.Any])
    
    /** Returns "ECDSA521" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.ecdsa521")
    @js.native
    def ecdsa521: String = js.native
    inline def ecdsa521_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa521")(x.asInstanceOf[js.Any])
    
    inline def ecdsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ecdsa")(x.asInstanceOf[js.Any])
    
    /** Returns "RSA" as the key algorithm name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAlgorithmNames.rsa")
    @js.native
    def rsa: String = js.native
    inline def rsa_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa")(x.asInstanceOf[js.Any])
  }
  
  /** Provides access to key attestation methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
  @js.native
  abstract class KeyAttestationHelper ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyAttestationHelper
  object KeyAttestationHelper {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyAttestationHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decrypts a TPM key attestation credential.
      * @param credential The TPM key attestation credential to decrypt.
      * @return When this method completes, it returns the decrypted TPM key attestation credential.
      */
    /* static member */
    inline def decryptTpmAttestationCredentialAsync(credential: String): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decryptTpmAttestationCredentialAsync")(credential.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
    /**
      * Decrypts a TPM key attestation credential.
      * @param credential The TPM key attestation credential to decrypt.
      * @param containerName The container name of the credential.
      * @return When this method completes, it returns the decrypted TPM key attestation credential.
      */
    /* static member */
    inline def decryptTpmAttestationCredentialAsync(credential: String, containerName: String): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptTpmAttestationCredentialAsync")(credential.asInstanceOf[js.Any], containerName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Gets the credential ID from a TPM key attestation credential.
      * @param credential The TPM key attestation credential to get the credential ID from.
      * @return The credential ID from the TPM key attestation credential.
      */
    /* static member */
    inline def getTpmAttestationCredentialId(credential: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTpmAttestationCredentialId")(credential.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Specifies the key protection level. This enumeration type is used in the KeyProtectionLevel property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
  @js.native
  object KeyProtectionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel & Double
      ] = js.native
    
    /* 1 */ val consentOnly: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentOnly & Double = js.native
    
    /* 3 */ val consentWithFingerprint: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithFingerprint & Double = js.native
    
    /* 2 */ val consentWithPassword: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.consentWithPassword & Double = js.native
    
    /* 0 */ val noConsent: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyProtectionLevel.noConsent & Double = js.native
  }
  
  /** Specifies commonly used RSA algorithm key sizes. This enumeration type can be used in the KeySize property of a CertificateRequestProperties object. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeySize")
  @js.native
  object KeySize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize & Double] = js.native
    
    /* 0 */ val invalid: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.invalid & Double = js.native
    
    /* 1 */ val rsa2048: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa2048 & Double = js.native
    
    /* 2 */ val rsa4096: typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeySize.rsa4096 & Double = js.native
  }
  
  /** Defines several commonly used key storage provider names. You can use this class in the KeyStorageProviderName property on the CertificateRequestProperties class. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
  @js.native
  abstract class KeyStorageProviderNames ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
  object KeyStorageProviderNames {
    
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns "Microsoft Passport Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.passportKeyStorageProvider")
    @js.native
    def passportKeyStorageProvider: String = js.native
    inline def passportKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passportKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Platform Crypyto Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.platformKeyStorageProvider")
    @js.native
    def platformKeyStorageProvider: String = js.native
    inline def platformKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("platformKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Smart Card Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.smartcardKeyStorageProvider")
    @js.native
    def smartcardKeyStorageProvider: String = js.native
    inline def smartcardKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartcardKeyStorageProvider")(x.asInstanceOf[js.Any])
    
    /** Returns "Microsoft Software Key Storage Provider" as the provider name. */
    /* static member */
    @JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames.softwareKeyStorageProvider")
    @js.native
    def softwareKeyStorageProvider: String = js.native
    inline def softwareKeyStorageProvider_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("softwareKeyStorageProvider")(x.asInstanceOf[js.Any])
  }
  
  /** Represents PFX import parameters. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.PfxImportParameters")
  @js.native
  /** Creates a new instance of the PfxImportParameters class. */
  class PfxImportParameters ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.PfxImportParameters {
    
    /** Gets or sets the container name prefix. */
    /* CompleteClass */
    var containerNamePrefix: String = js.native
    
    /** Gets or sets the export option. */
    /* CompleteClass */
    var exportable: ExportOption = js.native
    
    /** Gets or sets the friendly name. */
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /** Gets or sets the install options. */
    /* CompleteClass */
    var installOptions: InstallOptions = js.native
    
    /** Gets or sets the key protection level. */
    /* CompleteClass */
    var keyProtectionLevel: KeyProtectionLevel = js.native
    
    /** Gets or sets the key storage provider name. */
    /* CompleteClass */
    var keyStorageProviderName: String = js.native
    
    /** Gets or sets the reader name. */
    /* CompleteClass */
    var readerName: String = js.native
  }
  
  /** Describes the result of a signature verification operation. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.SignatureValidationResult")
  @js.native
  object SignatureValidationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult & Double
      ] = js.native
    
    /* 2 */ val badMessage: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.badMessage & Double = js.native
    
    /* 1 */ val invalidParameter: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidParameter & Double = js.native
    
    /* 3 */ val invalidSignature: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.invalidSignature & Double = js.native
    
    /* 4 */ val otherErrors: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.otherErrors & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult.success & Double = js.native
  }
  
  /** Provides info about a subject alternative name. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo")
  @js.native
  /** Creates a new instance of the SubjectAlternativeNameInfo class. */
  class SubjectAlternativeNameInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo {
    
    /** Gets the distinguished name. */
    /* CompleteClass */
    var distinguishedName: IVectorView[String] = js.native
    
    /** Gets the DNS name. */
    /* CompleteClass */
    var dnsName: IVectorView[String] = js.native
    
    /** Gets the email name. */
    /* CompleteClass */
    var emailName: IVectorView[String] = js.native
    
    /** Gets the IP address. */
    /* CompleteClass */
    var ipAddress: IVectorView[String] = js.native
    
    /** Gets the principal name. */
    /* CompleteClass */
    var principalName: IVectorView[String] = js.native
    
    /** Gets the URL. */
    /* CompleteClass */
    var url: IVectorView[String] = js.native
  }
  
  /** Provides access to certificate creation, import, and enrollment methods. */
  @JSGlobal("Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager")
  @js.native
  abstract class UserCertificateEnrollmentManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager
}
