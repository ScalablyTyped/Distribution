package typings.webcryptoCore.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "EcUtils")
@js.native
open class EcUtils () extends StObject
object EcUtils {
  
  @JSImport("webcrypto-core", "EcUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decodes ANSI X9.62 encoded point
    * @note Used by SunPKCS11 and SunJSSE
    * @param data ANSI X9.62 encoded point
    * @param pointSize Size of the point in bits
    * @returns Decoded point with x and y coordinates
    */
  /* static member */
  inline def decodePoint(data: BufferSource, pointSize: Double): EcPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePoint")(data.asInstanceOf[js.Any], pointSize.asInstanceOf[js.Any])).asInstanceOf[EcPoint]
  
  /* static member */
  inline def decodeSignature(data: BufferSource, pointSize: Double): EcSignaturePoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSignature")(data.asInstanceOf[js.Any], pointSize.asInstanceOf[js.Any])).asInstanceOf[EcSignaturePoint]
  
  /**
    * Encodes EC point to ANSI X9.62 encoded point
    * @param point EC point
    * @param pointSize Size of the point in bits
    * @returns ANSI X9.62 encoded point
    */
  /* static member */
  inline def encodePoint(point: EcPoint, pointSize: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePoint")(point.asInstanceOf[js.Any], pointSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  /* static member */
  inline def encodeSignature(signature: EcSignaturePoint, pointSize: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSignature")(signature.asInstanceOf[js.Any], pointSize.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  /* static member */
  inline def getSize(pointSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(pointSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def padStart(data: js.typedarray.Uint8Array, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  /* static member */
  inline def trimStart(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
