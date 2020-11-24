package typings.winrtUwp.Windows.Security.Cryptography.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a key derivation algorithm provider. */
@js.native
trait KeyDerivationAlgorithmProvider extends js.Object {
  
  /** Gets the name of the open key derivation function (KDF) algorithm. */
  var algorithmName: String = js.native
  
  /**
    * Creates a KDF key.
    * @param keyMaterial Data used to create the key.
    * @return Represents the KDF key.
    */
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}
object KeyDerivationAlgorithmProvider {
  
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): KeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[KeyDerivationAlgorithmProvider]
  }
  
  @scala.inline
  implicit class KeyDerivationAlgorithmProviderOps[Self <: KeyDerivationAlgorithmProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmName(value: String): Self = this.set("algorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateKey(value: IBuffer => CryptographicKey): Self = this.set("createKey", js.Any.fromFunction1(value))
  }
}
