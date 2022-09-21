package typings.webcryptoCore

import typings.webcryptoCore.mod.CryptoCertificateFormat
import typings.webcryptoCore.mod.CryptoCertificateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webcryptoCoreStrings {
  
  @js.native
  sealed trait jwk extends StObject
  inline def jwk: jwk = "jwk".asInstanceOf[jwk]
  
  @js.native
  sealed trait pem
    extends StObject
       with CryptoCertificateFormat
  inline def pem: pem = "pem".asInstanceOf[pem]
  
  @js.native
  sealed trait pkcs8 extends StObject
  inline def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  
  @js.native
  sealed trait raw
    extends StObject
       with CryptoCertificateFormat
  inline def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait request
    extends StObject
       with CryptoCertificateType
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait spki extends StObject
  inline def spki: spki = "spki".asInstanceOf[spki]
  
  @js.native
  sealed trait x509
    extends StObject
       with CryptoCertificateType
  inline def x509: x509 = "x509".asInstanceOf[x509]
}
