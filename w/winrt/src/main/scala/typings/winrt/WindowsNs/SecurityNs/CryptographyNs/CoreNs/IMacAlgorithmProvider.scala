package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProvider extends js.Object {
  var algorithmName: String
  var macLength: Double
  def createKey(keyMaterial: IBuffer): CryptographicKey
}

object IMacAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey, macLength: Double): IMacAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName, createKey = js.Any.fromFunction1(createKey), macLength = macLength)
  
    __obj.asInstanceOf[IMacAlgorithmProvider]
  }
}

