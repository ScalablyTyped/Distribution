package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a certificate enrollment manager. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
abstract class CertificateEnrollmentManager () extends js.Object

/** Represents a certificate enrollment manager. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateEnrollmentManager")
@js.native
object CertificateEnrollmentManager extends js.Object {
  /** Gets the associated UserCertificateEnrollmentManager . */
  var userCertificateEnrollmentManager: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.UserCertificateEnrollmentManager = js.native
  /**
                       * Asynchronously creates a PKCS #10 certificate request based on properties specified in a CertificateRequestProperties object.
                       * @param request A CertificateRequestProperties object that contains the property values used to create the certificate request.
                       * @return This method returns a string that contains the base64 encoded PKCS #10 certificate request.
                       */
  def createRequestAsync(
    request: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateRequestProperties
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
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
  def importPfxDataAsync(
    pfxData: java.lang.String,
    password: java.lang.String,
    exportable: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption,
    keyProtectionLevel: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel,
    installOption: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions,
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
    exportable: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption,
    keyProtectionLevel: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel,
    installOption: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions,
    friendlyName: java.lang.String,
    keyStorageProvider: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                       * Asynchronously imports a certificate from a Personal Information Exchange (PFX) message using import parameters.
                       * @param pfxData Base64-encoded PFX message.
                       * @param password The password used to decrypt and verify the PFX packet. The password must be exactly the same as the password that was used to encrypt the packet.
                       * @param pfxImportParameters The PFX import parameters.
                       * @return This method does not return a value.
                       */
  def importPfxDataAsync(
    pfxData: java.lang.String,
    password: java.lang.String,
    pfxImportParameters: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.PfxImportParameters
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                       * Asynchronously Installs a certificate chain into the app container on the local computer.
                       * @param certificate The encoded certificate. The certificate is encoded by using Distinguished Encoding Rules (DER) as defined by the Abstract Syntax Notation One (ASN.1) standard.
                       * @param installOption An InstallOptions enumeration value that specifies the certificate installation option.
                       * @return This method does not return a value.
                       */
  def installCertificateAsync(
    certificate: java.lang.String,
    installOption: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.InstallOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

