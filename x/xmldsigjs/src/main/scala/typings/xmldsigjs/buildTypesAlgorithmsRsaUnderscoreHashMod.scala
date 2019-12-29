package typings.xmldsigjs

import typings.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
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
object buildTypesAlgorithmsRsaUnderscoreHashMod extends js.Object {
  @js.native
  class Sha1 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha1: Anon_Name = js.native
  }
  
  @js.native
  class Sha256 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha256: Anon_Name = js.native
  }
  
  @js.native
  class Sha384 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha384: Anon_Name = js.native
  }
  
  @js.native
  class Sha512 () extends HashAlgorithm {
    @JSName("algorithm")
    var algorithm_Sha512: Anon_Name = js.native
  }
  
  val SHA1: `SHA-1` = js.native
  val SHA1_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignsha1 = js.native
  val SHA256: `SHA-256` = js.native
  val SHA256_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha256 = js.native
  val SHA384: `SHA-384` = js.native
  val SHA384_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignsha384` = js.native
  val SHA512: `SHA-512` = js.native
  val SHA512_NAMESPACE: httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04SlashxmlencNumbersignsha512 = js.native
}

