package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a certificate store for an app. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStore")
@js.native
abstract class CertificateStore ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CertificateStore {
  /** Gets the name of the certificate store. */
  /* CompleteClass */
  override var name: String = js.native
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
}

