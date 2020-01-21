package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a provider of asymmetric (public) key algorithms. For more information, see Cryptographic keys. */
@JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
@js.native
abstract class AsymmetricKeyAlgorithmProvider () extends js.Object {
  /** Gets the name of the open asymmetric algorithm. */
  var algorithmName: String = js.native
  /**
    * Creates a public/private key pair.
    * @param keySize Size, in bits, of the key. Typical key sizes are 512, 1024, 2048, or 4096 bits.
    * @return Represents the asymmetric key pair.
    */
  def createKeyPair(keySize: Double): CryptographicKey = js.native
  /**
    * Creates a public/private key pair using a curve name.
    * @param curveName The name of the curve.
    * @return Represents the asymmetric key pair.
    */
  def createKeyPairWithCurveName(curveName: String): CryptographicKey = js.native
  /**
    * Creates a public/private key pair using curve parameters.
    * @param parameters The curve parameters.
    * @return Represents the asymmetric key pair.
    */
  def createKeyPairWithCurveParameters(parameters: js.Array[Double]): CryptographicKey = js.native
  /**
    * Imports a public/private key pair from a buffer.
    * @param keyBlob Buffer that contains the key pair to import.
    * @return Represents the imported key pair.
    */
  def importKeyPair(keyBlob: IBuffer): CryptographicKey = js.native
  /**
    * Imports a public/private key pair from a buffer in the specified format.
    * @param keyBlob Buffer that contains the key pair to import.
    * @param BlobType A CryptographicPrivateKeyBlobType enumeration value that specifies information about the private key contained in the keyBlob buffer. The default value is Pkcs8RawPrivateKeyInfo.
    * @return Represents the imported key pair.
    */
  def importKeyPair(keyBlob: IBuffer, BlobType: CryptographicPrivateKeyBlobType): CryptographicKey = js.native
  /**
    * Imports a public key into a buffer.
    * @param keyBlob Buffer that contains the key to import.
    * @return Represents the imported key.
    */
  def importPublicKey(keyBlob: IBuffer): CryptographicKey = js.native
  /**
    * Imports a public key into a buffer for a specified format.
    * @param keyBlob Buffer that contains the key to import.
    * @param BlobType A CryptographicPublicKeyBlobType enumeration value that specifies the format of the public key contained in the keyBlob buffer. The default value is X509SubjectPublicKeyInfo.
    * @return Represents the imported key.
    */
  def importPublicKey(keyBlob: IBuffer, BlobType: CryptographicPublicKeyBlobType): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.AsymmetricKeyAlgorithmProvider")
@js.native
object AsymmetricKeyAlgorithmProvider extends js.Object {
  /**
    * Creates an instance of the AsymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a public key algorithm provider.
    */
  def openAlgorithm(algorithm: String): AsymmetricKeyAlgorithmProvider = js.native
}

