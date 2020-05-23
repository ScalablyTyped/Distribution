package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/rsa_hash", JSImport.Namespace)
@js.native
object rsaHashMod extends js.Object {
  @js.native
  class Sha1 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha1: Name = js.native
  }
  
  @js.native
  class Sha256 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha256: Name = js.native
  }
  
  @js.native
  class Sha384 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha384: Name = js.native
  }
  
  @js.native
  class Sha512 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha512: Name = js.native
  }
  
  @JSName("SHA1")
  val SHA1_ : /* "SHA-1" */ String = js.native
  val SHA1_NAMESPACE: /* "http://www.w3.org/2000/09/xmldsig#sha1" */ String = js.native
  @JSName("SHA256")
  val SHA256_ : /* "SHA-256" */ String = js.native
  val SHA256_NAMESPACE: /* "http://www.w3.org/2001/04/xmlenc#sha256" */ String = js.native
  @JSName("SHA384")
  val SHA384_ : /* "SHA-384" */ String = js.native
  val SHA384_NAMESPACE: /* "http://www.w3.org/2001/04/xmldsig-more#sha384" */ String = js.native
  @JSName("SHA512")
  val SHA512_ : /* "SHA-512" */ String = js.native
  val SHA512_NAMESPACE: /* "http://www.w3.org/2001/04/xmlenc#sha512" */ String = js.native
}

