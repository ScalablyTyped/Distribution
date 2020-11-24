package typings.x509Js.mod

import typings.x509Js.anon.CommonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  
  var altNames: js.Array[String] = js.native
  
  var issuer: CommonName = js.native
  
  var notAfter: String = js.native
  
  var notBefore: String = js.native
  
  var ocspList: js.Array[String] = js.native
  
  var publicExponent: String = js.native
  
  var publicModulus: String = js.native
  
  var serial: String = js.native
  
  var subject: CommonName = js.native
}
object Certificate {
  
  @scala.inline
  def apply(
    altNames: js.Array[String],
    issuer: CommonName,
    notAfter: String,
    notBefore: String,
    ocspList: js.Array[String],
    publicExponent: String,
    publicModulus: String,
    serial: String,
    subject: CommonName
  ): Certificate = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], ocspList = ocspList.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    
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
    def setAltNamesVarargs(value: String*): Self = this.set("altNames", js.Array(value :_*))
    
    @scala.inline
    def setAltNames(value: js.Array[String]): Self = this.set("altNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: CommonName): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfter(value: String): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBefore(value: String): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcspListVarargs(value: String*): Self = this.set("ocspList", js.Array(value :_*))
    
    @scala.inline
    def setOcspList(value: js.Array[String]): Self = this.set("ocspList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: String): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicModulus(value: String): Self = this.set("publicModulus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: String): Self = this.set("serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: CommonName): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
}
