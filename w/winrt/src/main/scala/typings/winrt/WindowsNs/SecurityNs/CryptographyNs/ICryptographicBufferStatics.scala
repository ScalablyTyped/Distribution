package typings.winrt.WindowsNs.SecurityNs.CryptographyNs

import typings.std.Uint8Array
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicBufferStatics extends js.Object {
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
}

