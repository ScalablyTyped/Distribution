package typings.winrtUwp.global.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
abstract class SymmetricKeyAlgorithmProvider ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider {
  /** Gets the name of the open symmetric algorithm. */
  /* CompleteClass */
  override var algorithmName: String = js.native
  /** Gets the size, in bytes, of the cipher block for the open algorithm. */
  /* CompleteClass */
  override var blockLength: Double = js.native
  /**
    * Creates a symmetric key.
    * @param keyMaterial Data used to generate the key. You can call the GenerateRandom method to create random key material.
    * @return Symmetric key.
    */
  /* CompleteClass */
  override def createSymmetricKey(keyMaterial: IBuffer): typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
object SymmetricKeyAlgorithmProvider extends js.Object {
  /**
    * Creates an instance of the SymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Algorithm name.
    * @return Represents a symmetric key algorithm provider.
    */
  def openAlgorithm(algorithm: String): typings.winrtUwp.Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider = js.native
}

