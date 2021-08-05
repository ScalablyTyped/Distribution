package typings.winrt.Windows.Security.Cryptography

import typings.std.Uint8Array
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICryptographicBufferStatics extends StObject {
  
  def compare(object1: IBuffer, object2: IBuffer): Boolean
  
  def convertBinaryToString(encoding: BinaryStringEncoding, buffer: IBuffer): String
  
  def convertStringToBinary(value: String, encoding: BinaryStringEncoding): IBuffer
  
  def copyToByteArray(buffer: IBuffer): Uint8Array
  
  def createFromByteArray(value: Uint8Array): IBuffer
  
  def decodeFromBase64String(value: String): IBuffer
  
  def decodeFromHexString(value: String): IBuffer
  
  def encodeToBase64String(buffer: IBuffer): String
  
  def encodeToHexString(buffer: IBuffer): String
  
  def generateRandom(length: Double): IBuffer
  
  def generateRandomNumber(): Double
}
object ICryptographicBufferStatics {
  
  inline def apply(
    compare: (IBuffer, IBuffer) => Boolean,
    convertBinaryToString: (BinaryStringEncoding, IBuffer) => String,
    convertStringToBinary: (String, BinaryStringEncoding) => IBuffer,
    copyToByteArray: IBuffer => Uint8Array,
    createFromByteArray: Uint8Array => IBuffer,
    decodeFromBase64String: String => IBuffer,
    decodeFromHexString: String => IBuffer,
    encodeToBase64String: IBuffer => String,
    encodeToHexString: IBuffer => String,
    generateRandom: Double => IBuffer,
    generateRandomNumber: () => Double
  ): ICryptographicBufferStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), convertBinaryToString = js.Any.fromFunction2(convertBinaryToString), convertStringToBinary = js.Any.fromFunction2(convertStringToBinary), copyToByteArray = js.Any.fromFunction1(copyToByteArray), createFromByteArray = js.Any.fromFunction1(createFromByteArray), decodeFromBase64String = js.Any.fromFunction1(decodeFromBase64String), decodeFromHexString = js.Any.fromFunction1(decodeFromHexString), encodeToBase64String = js.Any.fromFunction1(encodeToBase64String), encodeToHexString = js.Any.fromFunction1(encodeToHexString), generateRandom = js.Any.fromFunction1(generateRandom), generateRandomNumber = js.Any.fromFunction0(generateRandomNumber))
    __obj.asInstanceOf[ICryptographicBufferStatics]
  }
  
  extension [Self <: ICryptographicBufferStatics](x: Self) {
    
    inline def setCompare(value: (IBuffer, IBuffer) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setConvertBinaryToString(value: (BinaryStringEncoding, IBuffer) => String): Self = StObject.set(x, "convertBinaryToString", js.Any.fromFunction2(value))
    
    inline def setConvertStringToBinary(value: (String, BinaryStringEncoding) => IBuffer): Self = StObject.set(x, "convertStringToBinary", js.Any.fromFunction2(value))
    
    inline def setCopyToByteArray(value: IBuffer => Uint8Array): Self = StObject.set(x, "copyToByteArray", js.Any.fromFunction1(value))
    
    inline def setCreateFromByteArray(value: Uint8Array => IBuffer): Self = StObject.set(x, "createFromByteArray", js.Any.fromFunction1(value))
    
    inline def setDecodeFromBase64String(value: String => IBuffer): Self = StObject.set(x, "decodeFromBase64String", js.Any.fromFunction1(value))
    
    inline def setDecodeFromHexString(value: String => IBuffer): Self = StObject.set(x, "decodeFromHexString", js.Any.fromFunction1(value))
    
    inline def setEncodeToBase64String(value: IBuffer => String): Self = StObject.set(x, "encodeToBase64String", js.Any.fromFunction1(value))
    
    inline def setEncodeToHexString(value: IBuffer => String): Self = StObject.set(x, "encodeToHexString", js.Any.fromFunction1(value))
    
    inline def setGenerateRandom(value: Double => IBuffer): Self = StObject.set(x, "generateRandom", js.Any.fromFunction1(value))
    
    inline def setGenerateRandomNumber(value: () => Double): Self = StObject.set(x, "generateRandomNumber", js.Any.fromFunction0(value))
  }
}
