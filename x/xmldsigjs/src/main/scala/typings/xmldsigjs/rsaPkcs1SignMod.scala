package typings.xmldsigjs

import typings.xmldsigjs.algorithmMod.SignatureAlgorithm
import typings.xmldsigjs.xmldsigjsStrings.`RSASSA-PKCS1-v1_5`
import typings.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignrsa-sha1`
import typings.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha256`
import typings.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha384`
import typings.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha512`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/rsa_pkcs1_sign", JSImport.Namespace)
@js.native
object rsaPkcs1SignMod extends js.Object {
  @js.native
  class RsaPkcs1Sha1 () extends SignatureAlgorithm
  
  @js.native
  class RsaPkcs1Sha256 () extends SignatureAlgorithm
  
  @js.native
  class RsaPkcs1Sha384 () extends SignatureAlgorithm
  
  @js.native
  class RsaPkcs1Sha512 () extends SignatureAlgorithm
  
  val RSA_PKCS1: `RSASSA-PKCS1-v1_5` = js.native
  val RSA_PKCS1_SHA1_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignrsa-sha1` = js.native
  val RSA_PKCS1_SHA256_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha256` = js.native
  val RSA_PKCS1_SHA384_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha384` = js.native
  val RSA_PKCS1_SHA512_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignrsa-sha512` = js.native
}

