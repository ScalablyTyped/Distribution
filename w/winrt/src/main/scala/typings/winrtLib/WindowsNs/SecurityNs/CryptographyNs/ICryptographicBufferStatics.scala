package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicBufferStatics extends js.Object {
  def compare(
    object1: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    object2: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean
  def convertBinaryToString(encoding: BinaryStringEncoding, buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String
  def convertStringToBinary(value: java.lang.String, encoding: BinaryStringEncoding): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def copyToByteArray(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): stdLib.Uint8Array
  def createFromByteArray(value: stdLib.Uint8Array): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def decodeFromBase64String(value: java.lang.String): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def decodeFromHexString(value: java.lang.String): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def encodeToBase64String(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String
  def encodeToHexString(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String
  def generateRandom(length: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  def generateRandomNumber(): scala.Double
}

object ICryptographicBufferStatics {
  @scala.inline
  def apply(
    compare: (winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => scala.Boolean,
    convertBinaryToString: (BinaryStringEncoding, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer) => java.lang.String,
    convertStringToBinary: (java.lang.String, BinaryStringEncoding) => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    copyToByteArray: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => stdLib.Uint8Array,
    createFromByteArray: stdLib.Uint8Array => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    decodeFromBase64String: java.lang.String => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    decodeFromHexString: java.lang.String => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    encodeToBase64String: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => java.lang.String,
    encodeToHexString: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => java.lang.String,
    generateRandom: scala.Double => winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    generateRandomNumber: () => scala.Double
  ): ICryptographicBufferStatics = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), convertBinaryToString = js.Any.fromFunction2(convertBinaryToString), convertStringToBinary = js.Any.fromFunction2(convertStringToBinary), copyToByteArray = js.Any.fromFunction1(copyToByteArray), createFromByteArray = js.Any.fromFunction1(createFromByteArray), decodeFromBase64String = js.Any.fromFunction1(decodeFromBase64String), decodeFromHexString = js.Any.fromFunction1(decodeFromHexString), encodeToBase64String = js.Any.fromFunction1(encodeToBase64String), encodeToHexString = js.Any.fromFunction1(encodeToHexString), generateRandom = js.Any.fromFunction1(generateRandom), generateRandomNumber = js.Any.fromFunction0(generateRandomNumber))
  
    __obj.asInstanceOf[ICryptographicBufferStatics]
  }
}

