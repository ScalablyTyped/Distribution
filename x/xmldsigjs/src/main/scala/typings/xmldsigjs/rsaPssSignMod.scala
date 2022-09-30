package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsaPssSignMod {
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RSA_PSS")
  @js.native
  val RSA_PSS: /* "RSA-PSS" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RSA_PSS_WITH_PARAMS_NAMESPACE")
  @js.native
  val RSA_PSS_WITH_PARAMS_NAMESPACE: /* "http://www.w3.org/2007/05/xmldsig-more#rsa-pss" */ String = js.native
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RsaPssBase")
  @js.native
  open class RsaPssBase () extends SignatureAlgorithm {
    def this(saltLength: Double) = this()
  }
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RsaPssSha1")
  @js.native
  open class RsaPssSha1 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RsaPssSha256")
  @js.native
  open class RsaPssSha256 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RsaPssSha384")
  @js.native
  open class RsaPssSha384 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", "RsaPssSha512")
  @js.native
  open class RsaPssSha512 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
}
