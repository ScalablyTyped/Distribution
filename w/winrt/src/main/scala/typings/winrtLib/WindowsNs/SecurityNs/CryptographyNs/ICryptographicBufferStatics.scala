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
    compare: js.Function2[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      scala.Boolean
    ],
    convertBinaryToString: js.Function2[
      BinaryStringEncoding, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      java.lang.String
    ],
    convertStringToBinary: js.Function2[
      java.lang.String, 
      BinaryStringEncoding, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    copyToByteArray: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, stdLib.Uint8Array],
    createFromByteArray: js.Function1[stdLib.Uint8Array, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    decodeFromBase64String: js.Function1[java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    decodeFromHexString: js.Function1[java.lang.String, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    encodeToBase64String: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, java.lang.String],
    encodeToHexString: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, java.lang.String],
    generateRandom: js.Function1[scala.Double, winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    generateRandomNumber: js.Function0[scala.Double]
  ): ICryptographicBufferStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(compare)
    __obj.updateDynamic("convertBinaryToString")(convertBinaryToString)
    __obj.updateDynamic("convertStringToBinary")(convertStringToBinary)
    __obj.updateDynamic("copyToByteArray")(copyToByteArray)
    __obj.updateDynamic("createFromByteArray")(createFromByteArray)
    __obj.updateDynamic("decodeFromBase64String")(decodeFromBase64String)
    __obj.updateDynamic("decodeFromHexString")(decodeFromHexString)
    __obj.updateDynamic("encodeToBase64String")(encodeToBase64String)
    __obj.updateDynamic("encodeToHexString")(encodeToHexString)
    __obj.updateDynamic("generateRandom")(generateRandom)
    __obj.updateDynamic("generateRandomNumber")(generateRandomNumber)
    __obj.asInstanceOf[ICryptographicBufferStatics]
  }
}

