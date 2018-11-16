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

