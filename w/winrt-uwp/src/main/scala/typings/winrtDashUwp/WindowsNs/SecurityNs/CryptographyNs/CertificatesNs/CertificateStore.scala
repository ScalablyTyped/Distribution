package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a certificate store for an app. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateStore")
@js.native
abstract class CertificateStore () extends js.Object {
  /** Gets the name of the certificate store. */
  var name: String = js.native
  /**
    * Adds a certificate to the certificate store.
    * @param certificate The certificate to add to the certificate store.
    */
  def add(certificate: Certificate): Unit = js.native
  /**
    * Deletes a certificate from the certificate store.
    * @param certificate The certificate to delete from the certificate store.
    */
  def delete(certificate: Certificate): Unit = js.native
}

