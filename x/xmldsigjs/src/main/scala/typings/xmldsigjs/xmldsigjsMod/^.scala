package typings.xmldsigjs.xmldsigjsMod

import typings.std.Document
import typings.std.Node
import typings.xmlDashCore.xmlDashCoreMod.SelectNodes
import typings.xmldsigjs.xmldsigjsStrings.`RSA-PSS`
import typings.xmldsigjs.xmldsigjsStrings.`RSASSA-PKCS1-v1_5`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-1`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-256`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-384`
import typings.xmldsigjs.xmldsigjsStrings.`SHA-512`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1`
import typings.xmldsigjs.xmldsigjsStrings.`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ECDSA: typings.xmldsigjs.xmldsigjsStrings.ECDSA = js.native
  val ECDSA_SHA1_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1` = js.native
  val ECDSA_SHA256_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256` = js.native
  val ECDSA_SHA384_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384` = js.native
  val ECDSA_SHA512_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512` = js.native
  val HMAC: typings.xmldsigjs.xmldsigjsStrings.HMAC = js.native
  val HMAC_SHA1_NAMESPACE: `http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1` = js.native
  val HMAC_SHA256_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256` = js.native
  val HMAC_SHA384_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384` = js.native
  val HMAC_SHA512_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512` = js.native
  val RSA_PKCS1: `RSASSA-PKCS1-v1_5` = js.native
  val RSA_PKCS1_SHA1_NAMESPACE: `http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1` = js.native
  val RSA_PKCS1_SHA256_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256` = js.native
  val RSA_PKCS1_SHA384_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384` = js.native
  val RSA_PKCS1_SHA512_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512` = js.native
  val RSA_PSS: `RSA-PSS` = js.native
  val RSA_PSS_SHA1_NAMESPACE: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1` = js.native
  val RSA_PSS_SHA256_NAMESPACE: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1` = js.native
  val RSA_PSS_SHA384_NAMESPACE: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1` = js.native
  val RSA_PSS_SHA512_NAMESPACE: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1` = js.native
  val RSA_PSS_WITH_PARAMS_NAMESPACE: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss` = js.native
  val SHA1: `SHA-1` = js.native
  val SHA1_NAMESPACE: `http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1` = js.native
  val SHA256: `SHA-256` = js.native
  val SHA256_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256` = js.native
  val SHA384: `SHA-384` = js.native
  val SHA384_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384` = js.native
  val SHA512: `SHA-512` = js.native
  val SHA512_NAMESPACE: `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512` = js.native
  val Select: SelectNodes = js.native
  def Parse(xmlString: String): Document = js.native
  def Stringify(target: Node): String = js.native
}

