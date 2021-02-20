package typings.winrtUwp.global.Windows.Security.Cryptography

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains static methods that implement data management functionality common to cryptographic operations. */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
abstract class CryptographicBuffer ()
  extends typings.winrtUwp.Windows.Security.Cryptography.CryptographicBuffer
object CryptographicBuffer {
  
  /**
    * Compares two IBuffer objects.
    * @param object1 Buffer to be used for comparison.
    * @param object2 Buffer to be used for comparison.
    * @return True specifies that the buffers are equal. Two buffers are equal if each code point in one matches the corresponding code point in the other.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.compare")
  @js.native
  def compare(object1: IBuffer, object2: IBuffer): Boolean = js.native
  
  /**
    * Converts a buffer to an encoded string.
    * @param encoding Encoding format.
    * @param buffer Data to be encoded.
    * @return A string that contains the encoded data.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.convertBinaryToString")
  @js.native
  def convertBinaryToString(encoding: typings.winrtUwp.Windows.Security.Cryptography.BinaryStringEncoding, buffer: IBuffer): String = js.native
  
  /**
    * Converts a string to an encoded buffer.
    * @param value String to be encoded.
    * @param encoding Encoding format.
    * @return Encoded buffer.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.convertStringToBinary")
  @js.native
  def convertStringToBinary(value: String, encoding: typings.winrtUwp.Windows.Security.Cryptography.BinaryStringEncoding): IBuffer = js.native
  
  /**
    * Copies a buffer to an array of bytes.
    * @param buffer Input buffer.
    * @return An array of bytes that contains the values copied from the input buffer. You must declare the array before calling this method and pass it by using the ref keyword. If the buffer for the input parameter is empty, then the value parameter will be returned as NULL.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.copyToByteArray")
  @js.native
  def copyToByteArray(buffer: IBuffer): js.Array[Double] = js.native
  
  /**
    * Creates a buffer from an input byte array.
    * @param value An array of bytes used to create the buffer.
    * @return Output buffer.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.createFromByteArray")
  @js.native
  def createFromByteArray(value: js.Array[Double]): IBuffer = js.native
  
  /**
    * Decodes a string that has been base64 encoded.
    * @param value Base64 encoded input string.
    * @return Output buffer that contains the decoded string.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.decodeFromBase64String")
  @js.native
  def decodeFromBase64String(value: String): IBuffer = js.native
  
  /**
    * Decodes a string that has been hexadecimal encoded.
    * @param value Encoded input string.
    * @return Output buffer that contains the decoded string.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.decodeFromHexString")
  @js.native
  def decodeFromHexString(value: String): IBuffer = js.native
  
  /**
    * Encodes a buffer to a base64 string.
    * @param buffer Input buffer.
    * @return Base64-encoded output string.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.encodeToBase64String")
  @js.native
  def encodeToBase64String(buffer: IBuffer): String = js.native
  
  /**
    * Encodes a buffer to a hexadecimal string.
    * @param buffer Input buffer.
    * @return Hexadecimal encoded output string.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.encodeToHexString")
  @js.native
  def encodeToHexString(buffer: IBuffer): String = js.native
  
  /**
    * Creates a buffer that contains random data.
    * @param length Length, in bytes, of the buffer to create.
    * @return Output buffer that contains the random data.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.generateRandom")
  @js.native
  def generateRandom(length: Double): IBuffer = js.native
  
  /**
    * Creates a random number.
    * @return Integer that contains the random data.
    */
  /* static member */
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.generateRandomNumber")
  @js.native
  def generateRandomNumber(): Double = js.native
}
