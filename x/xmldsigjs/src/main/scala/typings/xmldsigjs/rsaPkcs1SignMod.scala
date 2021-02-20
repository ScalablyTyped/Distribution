package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaPkcs1SignMod {
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RSA_PKCS1")
  @js.native
  val RSA_PKCS1: /* "RSASSA-PKCS1-v1_5" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RSA_PKCS1_SHA1_NAMESPACE")
  @js.native
  val RSA_PKCS1_SHA1_NAMESPACE: /* "http://www.w3.org/2000/09/xmldsig#rsa-sha1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RSA_PKCS1_SHA256_NAMESPACE")
  @js.native
  val RSA_PKCS1_SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RSA_PKCS1_SHA384_NAMESPACE")
  @js.native
  val RSA_PKCS1_SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RSA_PKCS1_SHA512_NAMESPACE")
  @js.native
  val RSA_PKCS1_SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RsaPkcs1Sha1")
  @js.native
  class RsaPkcs1Sha1 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RsaPkcs1Sha256")
  @js.native
  class RsaPkcs1Sha256 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RsaPkcs1Sha384")
  @js.native
  class RsaPkcs1Sha384 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", "RsaPkcs1Sha512")
  @js.native
  class RsaPkcs1Sha512 () extends SignatureAlgorithm
}
