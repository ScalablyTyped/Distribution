package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of certificate stores. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
abstract class CertificateStores ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStores
/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStores")
@js.native
object CertificateStores extends js.Object {
  
  /**
    * Get all certificates from the certificate stores.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Get all certificates from the certificate stores that match the specified query parameters.
    * @param query The certificate values to search for.
    * @return An asynchronous operation to retrieve the list of certificates.
    */
  def findAllAsync(query: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateQuery): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Gets a certificate store from the collection of certificate stores by name.
    * @param storeName The name of the certificate store to return. The storeName parameter value cannot be "MY".
    * @return The requested certificate store.
    */
  def getStoreByName(storeName: String): typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
  
  /** Gets the certificate store of intermediate certification authorities for an app. */
  var intermediateCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
  
  /** Gets the certificate store of trusted root certificates for an app. */
  var trustedRootCertificationAuthorities: typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore = js.native
}
