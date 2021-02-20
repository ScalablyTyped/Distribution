package typings.x509Js

import typings.x509Js.anon.CommonName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("x509.js", "info")
  @js.native
  def info(): Double = js.native
  
  @JSImport("x509.js", "parseCert")
  @js.native
  def parseCert(certificate: String): Certificate = js.native
  
  @JSImport("x509.js", "parseKey")
  @js.native
  def parseKey(key: String): Key = js.native
  
  @js.native
  trait Certificate extends StObject {
    
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
    implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      @scala.inline
      def setIssuer(value: CommonName): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOcspList(value: js.Array[String]): Self = StObject.set(x, "ocspList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOcspListVarargs(value: String*): Self = StObject.set(x, "ocspList", js.Array(value :_*))
      
      @scala.inline
      def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicModulus(value: String): Self = StObject.set(x, "publicModulus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: CommonName): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var publicExponent: String = js.native
    
    var publicModulus: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(publicExponent: String, publicModulus: String): Key = {
      val __obj = js.Dynamic.literal(publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicModulus(value: String): Self = StObject.set(x, "publicModulus", value.asInstanceOf[js.Any])
    }
  }
}
