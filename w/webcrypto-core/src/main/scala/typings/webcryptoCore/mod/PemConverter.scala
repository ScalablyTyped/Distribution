package typings.webcryptoCore.mod

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PEM converter
  */
@JSImport("webcrypto-core", "PemConverter")
@js.native
open class PemConverter () extends StObject
object PemConverter {
  
  @JSImport("webcrypto-core", "PemConverter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts buffer source to PEM
    * @param buffer Buffer source
    * @param tag PEM tag name
    */
  /* static member */
  inline def fromBufferSource(buffer: BufferSource, tag: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBufferSource")(buffer.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Returns tag name from PEM string
    * @param pem PEM string
    */
  /* static member */
  inline def getTagName(pem: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagName")(pem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Returns `true` if tag name from PEM matches to tagName parameter
    * @param pem PEM string
    * @param tagName Tag name for comparison
    */
  /* static member */
  inline def hasTagName(pem: String, tagName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTagName")(pem.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def isCRL(pem: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCRL")(pem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isCertificate(pem: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCertificate")(pem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isCertificateRequest(pem: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCertificateRequest")(pem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns `true` if incoming data is PEM string, otherwise `false`
    * @param data Data
    */
  /* static member */
  inline def isPEM(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPEM")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isPublicKey(pem: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublicKey")(pem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Converts PEM to Array buffer
    * @param pem PEM string
    */
  /* static member */
  inline def toArrayBuffer(pem: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(pem.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Converts PEM to Uint8Array
    * @param pem PEM string
    */
  /* static member */
  inline def toUint8Array(pem: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(pem.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
