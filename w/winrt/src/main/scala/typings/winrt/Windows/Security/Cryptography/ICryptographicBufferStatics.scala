package typings.winrt.Windows.Security.Cryptography

import typings.std.Uint8Array
import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICryptographicBufferStatics extends js.Object {
  
  def compare(object1: IBuffer, object2: IBuffer): Boolean = js.native
  
  def convertBinaryToString(encoding: BinaryStringEncoding, buffer: IBuffer): String = js.native
  
  def convertStringToBinary(value: String, encoding: BinaryStringEncoding): IBuffer = js.native
  
  def copyToByteArray(buffer: IBuffer): Uint8Array = js.native
  
  def createFromByteArray(value: Uint8Array): IBuffer = js.native
  
  def decodeFromBase64String(value: String): IBuffer = js.native
  
  def decodeFromHexString(value: String): IBuffer = js.native
  
  def encodeToBase64String(buffer: IBuffer): String = js.native
  
  def encodeToHexString(buffer: IBuffer): String = js.native
  
  def generateRandom(length: Double): IBuffer = js.native
  
  def generateRandomNumber(): Double = js.native
}
object ICryptographicBufferStatics {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ICryptographicBufferStaticsOps[Self <: ICryptographicBufferStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompare(value: (IBuffer, IBuffer) => Boolean): Self = this.set("compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertBinaryToString(value: (BinaryStringEncoding, IBuffer) => String): Self = this.set("convertBinaryToString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertStringToBinary(value: (String, BinaryStringEncoding) => IBuffer): Self = this.set("convertStringToBinary", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyToByteArray(value: IBuffer => Uint8Array): Self = this.set("copyToByteArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromByteArray(value: Uint8Array => IBuffer): Self = this.set("createFromByteArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeFromBase64String(value: String => IBuffer): Self = this.set("decodeFromBase64String", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeFromHexString(value: String => IBuffer): Self = this.set("decodeFromHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeToBase64String(value: IBuffer => String): Self = this.set("encodeToBase64String", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeToHexString(value: IBuffer => String): Self = this.set("encodeToHexString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateRandom(value: Double => IBuffer): Self = this.set("generateRandom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateRandomNumber(value: () => Double): Self = this.set("generateRandomNumber", js.Any.fromFunction0(value))
  }
}
