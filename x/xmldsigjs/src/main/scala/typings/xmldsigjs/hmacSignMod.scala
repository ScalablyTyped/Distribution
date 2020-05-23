package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/hmac_sign", JSImport.Namespace)
@js.native
object hmacSignMod extends js.Object {
  @js.native
  class HmacSha1 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha256 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha384 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha512 () extends SignatureAlgorithm
  
  val HMAC: /* "HMAC" */ String = js.native
  val HMAC_SHA1_NAMESPACE: /* "http://www.w3.org/2000/09/xmldsig#hmac-sha1" */ String = js.native
  val HMAC_SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256" */ String = js.native
  val HMAC_SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384" */ String = js.native
  val HMAC_SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512" */ String = js.native
}

