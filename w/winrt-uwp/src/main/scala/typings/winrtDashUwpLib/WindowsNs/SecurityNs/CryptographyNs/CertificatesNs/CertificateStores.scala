package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of certificate stores. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
abstract class CertificateStores () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
object CertificateStores extends js.Object {
  /** Gets the certificate store of intermediate certification authorities for an app. */
  var intermediateCertificationAuthorities: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateStore = js.native
  /** Gets the certificate store of trusted root certificates for an app. */
  var trustedRootCertificationAuthorities: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateStore = js.native
  /**
    * Get all certificates from the certificate stores.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Get all certificates from the certificate stores that match the specified query parameters.
    * @param query The certificate values to search for.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(query: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateQuery): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets a certificate store from the collection of certificate stores by name.
    * @param storeName The name of the certificate store to return. The storeName parameter value cannot be "MY".
    * @return The requested certificate store.
    */
  def getStoreByName(storeName: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateStore = js.native
}

