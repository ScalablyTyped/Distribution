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

