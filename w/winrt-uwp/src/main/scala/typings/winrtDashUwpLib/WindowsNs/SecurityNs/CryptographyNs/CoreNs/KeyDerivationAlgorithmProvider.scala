package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a key derivation algorithm provider. */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
abstract class KeyDerivationAlgorithmProvider () extends js.Object {
  /** Gets the name of the open key derivation function (KDF) algorithm. */
  var algorithmName: java.lang.String = js.native
  /**
    * Creates a KDF key.
    * @param keyMaterial Data used to create the key.
    * @return Represents the KDF key.
    */
  def createKey(keyMaterial: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationAlgorithmProvider")
@js.native
object KeyDerivationAlgorithmProvider extends js.Object {
  /**
    * Creates an instance of the KeyDerivationAlgorithmProvider class and opens the specified algorithm for use.
    * @param algorithm Represents a KDF algorithm provider.
    * @return The algorithm provider.
    */
  def openAlgorithm(algorithm: java.lang.String): winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.KeyDerivationAlgorithmProvider = js.native
}

