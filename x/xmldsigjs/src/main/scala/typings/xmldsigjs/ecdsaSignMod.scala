package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecdsaSignMod {
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "ECDSA")
  @js.native
  val ECDSA: /* "ECDSA" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "ECDSA_SHA1_NAMESPACE")
  @js.native
  val ECDSA_SHA1_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "ECDSA_SHA256_NAMESPACE")
  @js.native
  val ECDSA_SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "ECDSA_SHA384_NAMESPACE")
  @js.native
  val ECDSA_SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "ECDSA_SHA512_NAMESPACE")
  @js.native
  val ECDSA_SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "EcdsaSha1")
  @js.native
  class EcdsaSha1 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "EcdsaSha256")
  @js.native
  class EcdsaSha256 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "EcdsaSha384")
  @js.native
  class EcdsaSha384 () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", "EcdsaSha512")
  @js.native
  class EcdsaSha512 () extends SignatureAlgorithm
}
