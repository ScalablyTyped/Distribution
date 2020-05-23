package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/ecdsa_sign", JSImport.Namespace)
@js.native
object ecdsaSignMod extends js.Object {
  @js.native
  class EcdsaSha1 () extends SignatureAlgorithm
  
  @js.native
  class EcdsaSha256 () extends SignatureAlgorithm
  
  @js.native
  class EcdsaSha384 () extends SignatureAlgorithm
  
  @js.native
  class EcdsaSha512 () extends SignatureAlgorithm
  
  val ECDSA: /* "ECDSA" */ String = js.native
  val ECDSA_SHA1_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1" */ String = js.native
  val ECDSA_SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256" */ String = js.native
  val ECDSA_SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384" */ String = js.native
  val ECDSA_SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512" */ String = js.native
}

