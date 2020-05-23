package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to certificate creation, import, and enrollment methods. */
@js.native
trait UserCertificateEnrollmentManager extends js.Object {
  /**
    * Asynchronously creates a PKCS #10 certificate request based on properties specified in a CertificateRequestProperties object.
    * @param request A CertificateRequestProperties object that contains the property values used to create the certificate request.
    * @return An asynchronous operation to retrieve the base64 encoded PKCS #10 certificate request.
    */
  def createRequestAsync(request: CertificateRequestProperties): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Asynchronously imports a user certificate from a Personal Information Exchange (PFX) message.
    * @param pfxData Base64-encoded PFX message.
    * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
    * @param exportable A value of the ExportOption enumeration that specifies whether the key can be exported.
    * @param keyProtectionLevel A value of the KeyProtectionLevel enumeration that specifies the strength of the key protection. The default is NoConsent.
    * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
    * @param friendlyName The display name of the enrolled certificate. This value overwrites the FriendlyName property inside the PFX message.
    * @return This method does not return a value.
    */
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
    * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using the specified import parameters.
    * @param pfxData Base64-encoded PFX message.
    * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
    * @param pfxImportParameters The import parameters.
    * @return This method does not return a value.
    */
  def importPfxDataAsync(pfxData: String, password: String, pfxImportParameters: PfxImportParameters): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously installs a certificate chain into the app container on the local computer.
    * @param certificate The encoded certificate. The certificate is encoded by using Distinguished Encoding Rules (DER) as defined by the Abstract Syntax Notation One (ASN.1) standard.
    * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
    * @return This method does not return a value.
    */
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IPromiseWithIAsyncAction = js.native
}

