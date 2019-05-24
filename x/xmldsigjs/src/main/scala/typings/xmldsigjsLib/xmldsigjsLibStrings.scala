package typings
package xmldsigjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xmldsigjsLibStrings {
  @js.native
  sealed trait ECDSA extends js.Object
  
  @js.native
  sealed trait HMAC extends js.Object
  
  @js.native
  sealed trait `P-256`
    extends xmldsigjsLib.xmldsigjsMod._NamedCurveType
  
  @js.native
  sealed trait `P-384`
    extends xmldsigjsLib.xmldsigjsMod._NamedCurveType
  
  @js.native
  sealed trait `P-521`
    extends xmldsigjsLib.xmldsigjsMod._NamedCurveType
  
  @js.native
  sealed trait `RSA-PSS` extends js.Object
  
  @js.native
  sealed trait `RSASSA-PKCS1-v1_5` extends js.Object
  
  @js.native
  sealed trait `SHA-1`
    extends xmldsigjsLib.xmldsigjsMod.DigestAlgorithm
  
  @js.native
  sealed trait `SHA-256`
    extends xmldsigjsLib.xmldsigjsMod.DigestAlgorithm
  
  @js.native
  sealed trait `SHA-384`
    extends xmldsigjsLib.xmldsigjsMod.DigestAlgorithm
  
  @js.native
  sealed trait `SHA-512`
    extends xmldsigjsLib.xmldsigjsMod.DigestAlgorithm
  
  @js.native
  sealed trait base64
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait c14n
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait `c14n-com`
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait enveloped
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait `exc-c14n`
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait `exc-c14n-com`
    extends xmldsigjsLib.xmldsigjsMod.OptionsSignTransform
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1` extends js.Object
  
  @js.native
  sealed trait `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1` extends js.Object
  
  @scala.inline
  def ECDSA: ECDSA = "ECDSA".asInstanceOf[ECDSA]
  @scala.inline
  def HMAC: HMAC = "HMAC".asInstanceOf[HMAC]
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  @scala.inline
  def `RSA-PSS`: `RSA-PSS` = "RSA-PSS".asInstanceOf[`RSA-PSS`]
  @scala.inline
  def `RSASSA-PKCS1-v1_5`: `RSASSA-PKCS1-v1_5` = "RSASSA-PKCS1-v1_5".asInstanceOf[`RSASSA-PKCS1-v1_5`]
  @scala.inline
  def `SHA-1`: `SHA-1` = "SHA-1".asInstanceOf[`SHA-1`]
  @scala.inline
  def `SHA-256`: `SHA-256` = "SHA-256".asInstanceOf[`SHA-256`]
  @scala.inline
  def `SHA-384`: `SHA-384` = "SHA-384".asInstanceOf[`SHA-384`]
  @scala.inline
  def `SHA-512`: `SHA-512` = "SHA-512".asInstanceOf[`SHA-512`]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def c14n: c14n = "c14n".asInstanceOf[c14n]
  @scala.inline
  def `c14n-com`: `c14n-com` = "c14n-com".asInstanceOf[`c14n-com`]
  @scala.inline
  def enveloped: enveloped = "enveloped".asInstanceOf[enveloped]
  @scala.inline
  def `exc-c14n`: `exc-c14n` = "exc-c14n".asInstanceOf[`exc-c14n`]
  @scala.inline
  def `exc-c14n-com`: `exc-c14n-com` = "exc-c14n-com".asInstanceOf[`exc-c14n-com`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1`: `http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1` = "http://www.w3.org/2000/09/xmldsig#hmac-sha1".asInstanceOf[`http://wwwDOTw3DOTorg/2000/09/xmldsig#hmac-sha1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1`: `http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1` = "http://www.w3.org/2000/09/xmldsig#rsa-sha1".asInstanceOf[`http://wwwDOTw3DOTorg/2000/09/xmldsig#rsa-sha1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1`: `http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1` = "http://www.w3.org/2000/09/xmldsig#sha1".asInstanceOf[`http://wwwDOTw3DOTorg/2000/09/xmldsig#sha1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1` = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256` = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha256`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384` = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha384`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512` = "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#ecdsa-sha512`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256` = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha256`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384` = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha384`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512` = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#hmac-sha512`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256` = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha256`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384` = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha384`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512` = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#rsa-sha512`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384`: `http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384` = "http://www.w3.org/2001/04/xmldsig-more#sha384".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmldsig-more#sha384`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256`: `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256` = "http://www.w3.org/2001/04/xmlenc#sha256".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmlenc#sha256`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512`: `http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512` = "http://www.w3.org/2001/04/xmlenc#sha512".asInstanceOf[`http://wwwDOTw3DOTorg/2001/04/xmlenc#sha512`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss`: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss` = "http://www.w3.org/2007/05/xmldsig-more#rsa-pss".asInstanceOf[`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#rsa-pss`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1`: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1` = "http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1".asInstanceOf[`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha1-rsa-MGF1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1`: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1` = "http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1".asInstanceOf[`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha256-rsa-MGF1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1`: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1` = "http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1".asInstanceOf[`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha384-rsa-MGF1`]
  @scala.inline
  def `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1`: `http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1` = "http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1".asInstanceOf[`http://wwwDOTw3DOTorg/2007/05/xmldsig-more#sha512-rsa-MGF1`]
}

