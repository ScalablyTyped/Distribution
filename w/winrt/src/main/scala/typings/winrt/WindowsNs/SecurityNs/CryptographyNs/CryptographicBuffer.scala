package typings.winrt.WindowsNs.SecurityNs.CryptographyNs

import typings.std.Uint8Array
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
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

