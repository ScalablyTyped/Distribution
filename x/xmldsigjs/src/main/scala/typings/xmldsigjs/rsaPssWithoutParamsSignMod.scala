package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", JSImport.Namespace)
@js.native
object rsaPssWithoutParamsSignMod extends js.Object {
  
  val RSA_PSS_SHA1_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1" */ String = js.native
  
  val RSA_PSS_SHA256_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1" */ String = js.native
  
  val RSA_PSS_SHA384_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1" */ String = js.native
  
  val RSA_PSS_SHA512_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1" */ String = js.native
  
  @js.native
  class RsaPssWithoutParamsBase () extends SignatureAlgorithm
  
  @js.native
  class RsaPssWithoutParamsSha1 () extends RsaPssWithoutParamsBase
  
  @js.native
  class RsaPssWithoutParamsSha256 () extends RsaPssWithoutParamsBase
  
  @js.native
  class RsaPssWithoutParamsSha384 () extends RsaPssWithoutParamsBase
  
  @js.native
  class RsaPssWithoutParamsSha512 () extends RsaPssWithoutParamsBase
}
