package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a certificate store for an app. */
trait CertificateStore extends js.Object {
  /** Gets the name of the certificate store. */
  var name: String
  /**
    * Adds a certificate to the certificate store.
    * @param certificate The certificate to add to the certificate store.
    */
  def add(certificate: Certificate): Unit
  /**
    * Deletes a certificate from the certificate store.
    * @param certificate The certificate to delete from the certificate store.
    */
  def delete(certificate: Certificate): Unit
}

object CertificateStore {
  @scala.inline
  def apply(add: Certificate => Unit, delete: Certificate => Unit, name: String): CertificateStore = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStore]
  }
}

