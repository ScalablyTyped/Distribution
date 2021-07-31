package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a certificate store for an app. */
trait CertificateStore extends StObject {
  
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
  
  /** Gets the name of the certificate store. */
  var name: String
}
object CertificateStore {
  
  @scala.inline
  def apply(add: Certificate => Unit, delete: Certificate => Unit, name: String): CertificateStore = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStore]
  }
  
  @scala.inline
  implicit class CertificateStoreMutableBuilder[Self <: CertificateStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Certificate => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: Certificate => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
