package typings.winrt.global.Windows.Security.Cryptography

import typings.std.Uint8Array
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.CryptographicBuffer")
@js.native
class CryptographicBuffer ()
  extends typings.winrt.Windows.Security.Cryptography.CryptographicBuffer
/* static members */
object CryptographicBuffer {
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.compare")
  @js.native
  def compare(object1: IBuffer, object2: IBuffer): Boolean = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.convertBinaryToString")
  @js.native
  def convertBinaryToString(encoding: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding, buffer: IBuffer): String = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.convertStringToBinary")
  @js.native
  def convertStringToBinary(value: String, encoding: typings.winrt.Windows.Security.Cryptography.BinaryStringEncoding): IBuffer = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.copyToByteArray")
  @js.native
  def copyToByteArray(buffer: IBuffer): Uint8Array = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.createFromByteArray")
  @js.native
  def createFromByteArray(value: Uint8Array): IBuffer = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.decodeFromBase64String")
  @js.native
  def decodeFromBase64String(value: String): IBuffer = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.decodeFromHexString")
  @js.native
  def decodeFromHexString(value: String): IBuffer = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.encodeToBase64String")
  @js.native
  def encodeToBase64String(buffer: IBuffer): String = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.encodeToHexString")
  @js.native
  def encodeToHexString(buffer: IBuffer): String = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.generateRandom")
  @js.native
  def generateRandom(length: Double): IBuffer = js.native
  
  @JSGlobal("Windows.Security.Cryptography.CryptographicBuffer.generateRandomNumber")
  @js.native
  def generateRandomNumber(): Double = js.native
}
