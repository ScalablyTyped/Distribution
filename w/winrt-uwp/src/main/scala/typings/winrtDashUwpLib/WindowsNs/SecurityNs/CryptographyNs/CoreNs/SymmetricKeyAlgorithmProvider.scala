package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
abstract class SymmetricKeyAlgorithmProvider () extends js.Object {
  /** Gets the name of the open symmetric algorithm. */
  var algorithmName: java.lang.String = js.native
  /** Gets the size, in bytes, of the cipher block for the open algorithm. */
  var blockLength: scala.Double = js.native
  /**
                       * Creates a symmetric key.
                       * @param keyMaterial Data used to generate the key. You can call the GenerateRandom method to create random key material.
                       * @return Symmetric key.
                       */
  def createSymmetricKey(keyMaterial: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
}

/** Represents a provider of symmetric key algorithms. For more information, see Cryptographic keys. */
@JSGlobal("Windows.Security.Cryptography.Core.SymmetricKeyAlgorithmProvider")
@js.native
object SymmetricKeyAlgorithmProvider extends js.Object {
  /**
                       * Creates an instance of the SymmetricKeyAlgorithmProvider class and opens the specified algorithm for use.
                       * @param algorithm Algorithm name.
                       * @return Represents a symmetric key algorithm provider.
                       */
  def openAlgorithm(algorithm: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.SymmetricKeyAlgorithmProvider = js.native
}

