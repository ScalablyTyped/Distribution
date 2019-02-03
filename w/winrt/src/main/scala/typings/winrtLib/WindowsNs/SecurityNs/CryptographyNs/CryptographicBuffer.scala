package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
class CryptographicBuffer () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
object CryptographicBuffer extends js.Object {
  def compare(
    object1: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    object2: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean = js.native
  def convertBinaryToString(
    encoding: winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding,
    buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): java.lang.String = js.native
  def convertStringToBinary(
    value: java.lang.String,
    encoding: winrtLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  ): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def copyToByteArray(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): stdLib.Uint8Array = js.native
  def createFromByteArray(value: stdLib.Uint8Array): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def decodeFromBase64String(value: java.lang.String): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def decodeFromHexString(value: java.lang.String): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def encodeToBase64String(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String = js.native
  def encodeToHexString(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String = js.native
  def generateRandom(length: scala.Double): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  def generateRandomNumber(): scala.Double = js.native
}

