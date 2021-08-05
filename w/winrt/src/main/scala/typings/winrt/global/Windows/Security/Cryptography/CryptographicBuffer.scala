package typings.winrt.global.Windows.Security.Cryptography

import typings.std.Uint8Array
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
class CryptographicBuffer ()
  extends StObject
     with typings.winrt.Windows.Security.Cryptography.CryptographicBuffer
/* static members */
object CryptographicBuffer {
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(object1: IBuffer, object2: IBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def convertBinaryToString(encoding: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding, buffer: IBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertBinaryToString")(encoding.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def convertStringToBinary(value: String, encoding: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStringToBinary")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
  
  inline def copyToByteArray(buffer: IBuffer): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToByteArray")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def createFromByteArray(value: Uint8Array): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromByteArray")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  inline def decodeFromBase64String(value: String): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  inline def decodeFromHexString(value: String): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromHexString")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  inline def encodeToBase64String(buffer: IBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeToBase64String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeToHexString(buffer: IBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeToHexString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateRandom(length: Double): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandom")(length.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  inline def generateRandomNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomNumber")().asInstanceOf[Double]
}
