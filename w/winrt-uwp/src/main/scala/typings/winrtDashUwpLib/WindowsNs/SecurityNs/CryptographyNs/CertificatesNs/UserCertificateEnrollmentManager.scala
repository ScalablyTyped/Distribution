package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to certificate creation, import, and enrollment methods. */
@JSGlobal("Windows.Security.Cryptography.Certificates.UserCertificateEnrollmentManager")
@js.native
abstract class UserCertificateEnrollmentManager () extends js.Object {
  /**
    * Asynchronously creates a PKCS #10 certificate request based on properties specified in a CertificateRequestProperties object.
    * @param request A CertificateRequestProperties object that contains the property values used to create the certificate request.
    * @return An asynchronous operation to retrieve the base64 encoded PKCS #10 certificate request.
    */
  def createRequestAsync(request: CertificateRequestProperties): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
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
    pfxData: java.lang.String,
    password: java.lang.String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
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
    pfxData: java.lang.String,
    password: java.lang.String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: java.lang.String,
    keyStorageProvider: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using the specified import parameters.
    * @param pfxData Base64-encoded PFX message.
    * @param password he password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
    * @param pfxImportParameters The import parameters.
    * @return This method does not return a value.
    */
  def importPfxDataAsync(pfxData: java.lang.String, password: java.lang.String, pfxImportParameters: PfxImportParameters): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously installs a certificate chain into the app container on the local computer.
    * @param certificate The encoded certificate. The certificate is encoded by using Distinguished Encoding Rules (DER) as defined by the Abstract Syntax Notation One (ASN.1) standard.
    * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
    * @return This method does not return a value.
    */
  def installCertificateAsync(certificate: java.lang.String, installOption: InstallOptions): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

