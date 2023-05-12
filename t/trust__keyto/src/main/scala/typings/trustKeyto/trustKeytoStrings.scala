package typings.trustKeyto

import typings.trustKeyto.mod.KeySelector
import typings.trustKeyto.mod.PEMKeySelector
import typings.trustKeyto.mod.SerializableFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trustKeytoStrings {
  
  @js.native
  sealed trait blk
    extends StObject
       with SerializableFormat
  inline def blk: blk = "blk".asInstanceOf[blk]
  
  @js.native
  sealed trait jwk
    extends StObject
       with SerializableFormat
  inline def jwk: jwk = "jwk".asInstanceOf[jwk]
  
  @js.native
  sealed trait pem
    extends StObject
       with SerializableFormat
  inline def pem: pem = "pem".asInstanceOf[pem]
  
  @js.native
  sealed trait `private`
    extends StObject
       with KeySelector
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait private_pkcs1
    extends StObject
       with PEMKeySelector
  inline def private_pkcs1: private_pkcs1 = "private_pkcs1".asInstanceOf[private_pkcs1]
  
  @js.native
  sealed trait private_pkcs8
    extends StObject
       with PEMKeySelector
  inline def private_pkcs8: private_pkcs8 = "private_pkcs8".asInstanceOf[private_pkcs8]
  
  @js.native
  sealed trait public
    extends StObject
       with KeySelector
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait public_pkcs1
    extends StObject
       with PEMKeySelector
  inline def public_pkcs1: public_pkcs1 = "public_pkcs1".asInstanceOf[public_pkcs1]
  
  @js.native
  sealed trait public_pkcs8
    extends StObject
       with PEMKeySelector
  inline def public_pkcs8: public_pkcs8 = "public_pkcs8".asInstanceOf[public_pkcs8]
}
