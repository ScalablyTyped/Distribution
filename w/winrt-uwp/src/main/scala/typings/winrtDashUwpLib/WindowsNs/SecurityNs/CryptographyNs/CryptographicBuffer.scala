package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains static methods that implement data management functionality common to cryptographic operations. */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
abstract class CryptographicBuffer () extends js.Object

/** Contains static methods that implement data management functionality common to cryptographic operations. */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
object CryptographicBuffer extends js.Object {
  /**
                   * Compares two IBuffer objects.
                   * @param object1 Buffer to be used for comparison.
                   * @param object2 Buffer to be used for comparison.
                   * @return True specifies that the buffers are equal. Two buffers are equal if each code point in one matches the corresponding code point in the other.
                   */
  def compare(
    object1: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    object2: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): scala.Boolean = js.native
  /**
                   * Converts a buffer to an encoded string.
                   * @param encoding Encoding format.
                   * @param buffer Data to be encoded.
                   * @return A string that contains the encoded data.
                   */
  def convertBinaryToString(
    encoding: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding,
    buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): java.lang.String = js.native
  /**
                   * Converts a string to an encoded buffer.
                   * @param value String to be encoded.
                   * @param encoding Encoding format.
                   * @return Encoded buffer.
                   */
  def convertStringToBinary(
    value: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.BinaryStringEncoding
  ): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * Copies a buffer to an array of bytes.
                   * @param buffer Input buffer.
                   * @return An array of bytes that contains the values copied from the input buffer. You must declare the array before calling this method and pass it by using the ref keyword. If the buffer for the input parameter is empty, then the value parameter will be returned as NULL.
                   */
  def copyToByteArray(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): js.Array[scala.Double] = js.native
  /**
                   * Creates a buffer from an input byte array.
                   * @param value An array of bytes used to create the buffer.
                   * @return Output buffer.
                   */
  def createFromByteArray(value: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * Decodes a string that has been base64 encoded.
                   * @param value Base64 encoded input string.
                   * @return Output buffer that contains the decoded string.
                   */
  def decodeFromBase64String(value: java.lang.String): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * Decodes a string that has been hexadecimal encoded.
                   * @param value Encoded input string.
                   * @return Output buffer that contains the decoded string.
                   */
  def decodeFromHexString(value: java.lang.String): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * Encodes a buffer to a base64 string.
                   * @param buffer Input buffer.
                   * @return Base64-encoded output string.
                   */
  def encodeToBase64String(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String = js.native
  /**
                   * Encodes a buffer to a hexadecimal string.
                   * @param buffer Input buffer.
                   * @return Hexadecimal encoded output string.
                   */
  def encodeToHexString(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): java.lang.String = js.native
  /**
                   * Creates a buffer that contains random data.
                   * @param length Length, in bytes, of the buffer to create.
                   * @return Output buffer that contains the random data.
                   */
  def generateRandom(length: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /**
                   * Creates a random number.
                   * @return Integer that contains the random data.
                   */
  def generateRandomNumber(): scala.Double = js.native
}

