package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaPssWithoutParamsSignMod {
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RSA_PSS_SHA1_NAMESPACE")
  @js.native
  val RSA_PSS_SHA1_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RSA_PSS_SHA256_NAMESPACE")
  @js.native
  val RSA_PSS_SHA256_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RSA_PSS_SHA384_NAMESPACE")
  @js.native
  val RSA_PSS_SHA384_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RSA_PSS_SHA512_NAMESPACE")
  @js.native
  val RSA_PSS_SHA512_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RsaPssWithoutParamsBase")
  @js.native
  class RsaPssWithoutParamsBase () extends SignatureAlgorithm
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RsaPssWithoutParamsSha1")
  @js.native
  class RsaPssWithoutParamsSha1 () extends RsaPssWithoutParamsBase
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RsaPssWithoutParamsSha256")
  @js.native
  class RsaPssWithoutParamsSha256 () extends RsaPssWithoutParamsBase
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RsaPssWithoutParamsSha384")
  @js.native
  class RsaPssWithoutParamsSha384 () extends RsaPssWithoutParamsBase
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_without_params_sign", "RsaPssWithoutParamsSha512")
  @js.native
  class RsaPssWithoutParamsSha512 () extends RsaPssWithoutParamsBase
}
