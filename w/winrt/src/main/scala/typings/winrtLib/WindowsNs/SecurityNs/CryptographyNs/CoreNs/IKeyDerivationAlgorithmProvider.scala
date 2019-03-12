package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationAlgorithmProvider extends js.Object {
  var algorithmName: java.lang.String
  def createKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey
}

object IKeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: java.lang.String,
    createKey: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => CryptographicKey
  ): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName, createKey = js.Any.fromFunction1(createKey))
  
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
}

