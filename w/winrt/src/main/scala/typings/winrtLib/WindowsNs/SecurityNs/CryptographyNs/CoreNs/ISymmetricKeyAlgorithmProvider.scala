package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymmetricKeyAlgorithmProvider extends js.Object {
  var algorithmName: java.lang.String
  var blockLength: scala.Double
  def createSymmetricKey(keyMaterial: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): CryptographicKey
}

object ISymmetricKeyAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: java.lang.String,
    blockLength: scala.Double,
    createSymmetricKey: js.Function1[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, CryptographicKey]
  ): ISymmetricKeyAlgorithmProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithmName")(algorithmName)
    __obj.updateDynamic("blockLength")(blockLength)
    __obj.updateDynamic("createSymmetricKey")(createSymmetricKey)
    __obj.asInstanceOf[ISymmetricKeyAlgorithmProvider]
  }
}

