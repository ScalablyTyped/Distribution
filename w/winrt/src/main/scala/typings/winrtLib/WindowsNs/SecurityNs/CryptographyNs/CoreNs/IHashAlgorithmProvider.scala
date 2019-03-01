package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashAlgorithmProvider extends js.Object {
  var algorithmName: java.lang.String
  var hashLength: scala.Double
  def createHash(): CryptographicHash
  def hashData(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
}

object IHashAlgorithmProvider {
  @scala.inline
  def apply(
    algorithmName: java.lang.String,
    createHash: js.Function0[CryptographicHash],
    hashData: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
    ],
    hashLength: scala.Double
  ): IHashAlgorithmProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithmName")(algorithmName)
    __obj.updateDynamic("createHash")(createHash)
    __obj.updateDynamic("hashData")(hashData)
    __obj.updateDynamic("hashLength")(hashLength)
    __obj.asInstanceOf[IHashAlgorithmProvider]
  }
}

