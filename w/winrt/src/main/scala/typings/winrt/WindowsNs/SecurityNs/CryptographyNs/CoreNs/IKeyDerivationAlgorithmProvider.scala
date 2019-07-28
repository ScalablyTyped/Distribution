package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationAlgorithmProvider extends js.Object {
  var algorithmName: String
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object IKeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName, createKey = js.Any.fromFunction1(createKey))
  
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
}

