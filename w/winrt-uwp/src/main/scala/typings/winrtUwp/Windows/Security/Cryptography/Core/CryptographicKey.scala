package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a symmetric key or an asymmetric key pair. */
@js.native
trait CryptographicKey extends StObject {
  
  /**
    * Exports the key pair to a buffer.
    * @return Buffer that contains the key pair.
    */
  def `export`(): IBuffer = js.native
  /**
    * Exports the key pair to a buffer given a specified format.
    * @param BlobType A CryptographicPrivateKeyBlobType enumeration value that specifies the format of the key in the buffer. The default value is Pkcs8RawPrivateKeyInfo.
    * @return Buffer that contains the key pair.
    */
  def `export`(BlobType: CryptographicPrivateKeyBlobType): IBuffer = js.native
  
  /**
    * Exports a public key to a buffer.
    * @return Buffer that contains the public key.
    */
  def exportPublicKey(): IBuffer = js.native
  /**
    * Exports a public key to a buffer given a specified format.
    * @param BlobType A CryptographicPublicKeyBlobType enumeration value that specifies the format of the key in the buffer. The default value is X509SubjectPublicKeyInfo.
    * @return Buffer that contains the public key.
    */
  def exportPublicKey(BlobType: CryptographicPublicKeyBlobType): IBuffer = js.native
  
  /** Gets the size, in bits, of the key. */
  var keySize: Double = js.native
}
