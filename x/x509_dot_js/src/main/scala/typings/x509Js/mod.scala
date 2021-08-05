package typings.x509Js

import typings.x509Js.anon.CommonName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("x509.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def info(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[Double]
  
  inline def parseCert(certificate: String): Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCert")(certificate.asInstanceOf[js.Any]).asInstanceOf[Certificate]
  
  inline def parseKey(key: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(key.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  trait Certificate extends StObject {
    
    var altNames: js.Array[String]
    
    var issuer: CommonName
    
    var notAfter: String
    
    var notBefore: String
    
    var ocspList: js.Array[String]
    
    var publicExponent: String
    
    var publicModulus: String
    
    var serial: String
    
    var subject: CommonName
  }
  object Certificate {
    
    inline def apply(
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
    
    extension [Self <: Certificate](x: Self) {
      
      inline def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      inline def setIssuer(value: CommonName): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      inline def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setOcspList(value: js.Array[String]): Self = StObject.set(x, "ocspList", value.asInstanceOf[js.Any])
      
      inline def setOcspListVarargs(value: String*): Self = StObject.set(x, "ocspList", js.Array(value :_*))
      
      inline def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      inline def setPublicModulus(value: String): Self = StObject.set(x, "publicModulus", value.asInstanceOf[js.Any])
      
      inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: CommonName): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var publicExponent: String
    
    var publicModulus: String
  }
  object Key {
    
    inline def apply(publicExponent: String, publicModulus: String): Key = {
      val __obj = js.Dynamic.literal(publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      inline def setPublicModulus(value: String): Self = StObject.set(x, "publicModulus", value.asInstanceOf[js.Any])
    }
  }
}
