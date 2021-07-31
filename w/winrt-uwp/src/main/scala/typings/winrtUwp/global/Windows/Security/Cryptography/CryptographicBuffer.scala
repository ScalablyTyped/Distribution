package typings.winrtUwp.global.Windows.Security.Cryptography

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains static methods that implement data management functionality common to cryptographic operations. */
@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
abstract class CryptographicBuffer ()
  extends StObject
     with typings.winrtUwp.Windows.Security.Cryptography.CryptographicBuffer
object CryptographicBuffer {
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares two IBuffer objects.
    * @param object1 Buffer to be used for comparison.
    * @param object2 Buffer to be used for comparison.
    * @return True specifies that the buffers are equal. Two buffers are equal if each code point in one matches the corresponding code point in the other.
    */
  /* static member */
  @scala.inline
  def compare(object1: IBuffer, object2: IBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts a buffer to an encoded string.
    * @param encoding Encoding format.
    * @param buffer Data to be encoded.
    * @return A string that contains the encoded data.
    */
  /* static member */
  @scala.inline
  def convertBinaryToString(encoding: typings.winrtUwp.Windows.Security.Cryptography.BinaryStringEncoding, buffer: IBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertBinaryToString")(encoding.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Converts a string to an encoded buffer.
    * @param value String to be encoded.
    * @param encoding Encoding format.
    * @return Encoded buffer.
    */
  /* static member */
  @scala.inline
  def convertStringToBinary(value: String, encoding: typings.winrtUwp.Windows.Security.Cryptography.BinaryStringEncoding): IBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convertStringToBinary")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IBuffer]
  
  /**
    * Copies a buffer to an array of bytes.
    * @param buffer Input buffer.
    * @return An array of bytes that contains the values copied from the input buffer. You must declare the array before calling this method and pass it by using the ref keyword. If the buffer for the input parameter is empty, then the value parameter will be returned as NULL.
    */
  /* static member */
  @scala.inline
  def copyToByteArray(buffer: IBuffer): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToByteArray")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * Creates a buffer from an input byte array.
    * @param value An array of bytes used to create the buffer.
    * @return Output buffer.
    */
  /* static member */
  @scala.inline
  def createFromByteArray(value: js.Array[Double]): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromByteArray")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  /**
    * Decodes a string that has been base64 encoded.
    * @param value Base64 encoded input string.
    * @return Output buffer that contains the decoded string.
    */
  /* static member */
  @scala.inline
  def decodeFromBase64String(value: String): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  /**
    * Decodes a string that has been hexadecimal encoded.
    * @param value Encoded input string.
    * @return Output buffer that contains the decoded string.
    */
  /* static member */
  @scala.inline
  def decodeFromHexString(value: String): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFromHexString")(value.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  /**
    * Encodes a buffer to a base64 string.
    * @param buffer Input buffer.
    * @return Base64-encoded output string.
    */
  /* static member */
  @scala.inline
  def encodeToBase64String(buffer: IBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeToBase64String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes a buffer to a hexadecimal string.
    * @param buffer Input buffer.
    * @return Hexadecimal encoded output string.
    */
  /* static member */
  @scala.inline
  def encodeToHexString(buffer: IBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeToHexString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a buffer that contains random data.
    * @param length Length, in bytes, of the buffer to create.
    * @return Output buffer that contains the random data.
    */
  /* static member */
  @scala.inline
  def generateRandom(length: Double): IBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandom")(length.asInstanceOf[js.Any]).asInstanceOf[IBuffer]
  
  /**
    * Creates a random number.
    * @return Integer that contains the random data.
    */
  /* static member */
  @scala.inline
  def generateRandomNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomNumber")().asInstanceOf[Double]
}
