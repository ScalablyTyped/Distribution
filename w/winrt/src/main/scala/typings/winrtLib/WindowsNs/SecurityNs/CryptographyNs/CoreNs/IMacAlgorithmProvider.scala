package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProvider extends js.Object {
  var algorithmName: java.lang.String
  var macLength: scala.Double
  def createKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey
}

object IMacAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: java.lang.String,
    createKey: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => CryptographicKey,
    macLength: scala.Double
  ): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName, createKey = js.Any.fromFunction1(createKey), macLength = macLength)
  
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
}

