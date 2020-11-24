package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a certificate store for an app. */
@js.native
trait CertificateStore extends js.Object {
  
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
  
  /** Gets the name of the certificate store. */
  var name: String = js.native
}
object CertificateStore {
  
  @scala.inline
  def apply(add: Certificate => Unit, delete: Certificate => Unit, name: String): CertificateStore = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), delete = js.Any.fromFunction1(delete), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStore]
  }
  
  @scala.inline
  implicit class CertificateStoreOps[Self <: CertificateStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Certificate => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: Certificate => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
