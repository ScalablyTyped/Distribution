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
    createKey: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, CryptographicKey],
    macLength: scala.Double
  ): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithmName")(algorithmName)
    __obj.updateDynamic("createKey")(createKey)
    __obj.updateDynamic("macLength")(macLength)
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
}

