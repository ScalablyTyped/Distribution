package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ECDSA: /* ECDSA */ java.lang.String = js.native
  val ECDSA_SHA1_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1 */ java.lang.String = js.native
  val ECDSA_SHA256_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256 */ java.lang.String = js.native
  val ECDSA_SHA384_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384 */ java.lang.String = js.native
  val ECDSA_SHA512_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512 */ java.lang.String = js.native
  val HMAC: /* HMAC */ java.lang.String = js.native
  val HMAC_SHA1_NAMESPACE: /* http://www.w3.org/2000/09/xmldsig#hmac-sha1 */ java.lang.String = js.native
  val HMAC_SHA256_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#hmac-sha256 */ java.lang.String = js.native
  val HMAC_SHA384_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#hmac-sha384 */ java.lang.String = js.native
  val HMAC_SHA512_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#hmac-sha512 */ java.lang.String = js.native
  val RSA_PKCS1: /* RSASSA-PKCS1-v1_5 */ java.lang.String = js.native
  val RSA_PKCS1_SHA1_NAMESPACE: /* http://www.w3.org/2000/09/xmldsig#rsa-sha1 */ java.lang.String = js.native
  val RSA_PKCS1_SHA256_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#rsa-sha256 */ java.lang.String = js.native
  val RSA_PKCS1_SHA384_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#rsa-sha384 */ java.lang.String = js.native
  val RSA_PKCS1_SHA512_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#rsa-sha512 */ java.lang.String = js.native
  val RSA_PSS: /* RSA-PSS */ java.lang.String = js.native
  val RSA_PSS_WITH_PARAMS_NAMESPACE: /* http://www.w3.org/2007/05/xmldsig-more#rsa-pss */ java.lang.String = js.native
  val SHA1: /* SHA-1 */ java.lang.String = js.native
  val SHA1_NAMESPACE: /* http://www.w3.org/2000/09/xmldsig#sha1 */ java.lang.String = js.native
  val SHA256: /* SHA-256 */ java.lang.String = js.native
  val SHA256_NAMESPACE: /* http://www.w3.org/2001/04/xmlenc#sha256 */ java.lang.String = js.native
  val SHA384: /* SHA-384 */ java.lang.String = js.native
  val SHA384_NAMESPACE: /* http://www.w3.org/2001/04/xmldsig-more#sha384 */ java.lang.String = js.native
  val SHA512: /* SHA-512 */ java.lang.String = js.native
  val SHA512_NAMESPACE: /* http://www.w3.org/2001/04/xmlenc#sha512 */ java.lang.String = js.native
  val Select: xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs.SelectNodes = js.native
  val XmlSignature: xmldsigjsLib.Anon_AlgorithmNamespaces = js.native
  def Parse(xmlString: java.lang.String): stdLib.Document = js.native
  def Stringify(target: stdLib.Node): java.lang.String = js.native
}

