package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.HashAlgorithm
import typings.xmldsigjs.xmldsigjsStrings.`SHA-1`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-256`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-384`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-512`
import typings.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignsha384`
import typings.xmldsigjs.xmldsigjsStrings.httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignsha1
import typings.xmldsigjs.xmldsigjsStrings.httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha256
import typings.xmldsigjs.xmldsigjsStrings.httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/rsa_hash", JSImport.Namespace)
@js.native
object rsaHashMod extends js.Object {
  @js.native
  class Sha1 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha1: AnonName = js.native
  }
  
  @js.native
  class Sha256 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha256: AnonName = js.native
  }
  
  @js.native
  class Sha384 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha384: AnonName = js.native
  }
  
  @js.native
  class Sha512 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha512: AnonName = js.native
  }
  
  @JSName("SHA1")
  val SHA1_ : `SHA-1` = js.native
  val SHA1_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignsha1 = js.native
  @JSName("SHA256")
  val SHA256_ : `SHA-256` = js.native
  val SHA256_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha256 = js.native
  @JSName("SHA384")
  val SHA384_ : `SHA-384` = js.native
  val SHA384_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignsha384` = js.native
  @JSName("SHA512")
  val SHA512_ : `SHA-512` = js.native
  val SHA512_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha512 = js.native
}

