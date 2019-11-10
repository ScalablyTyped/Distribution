package typings.web3DashEthDashAbi

import org.scalablytyped.runtime.StringDictionary
import typings.web3DashUtils.web3DashUtilsMod.AbiInput
import typings.web3DashUtils.web3DashUtilsMod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-abi", JSImport.Namespace)
@js.native
object web3DashEthDashAbiMod extends js.Object {
  @js.native
  class AbiCoder () extends js.Object {
    def decodeLog(inputs: js.Array[AbiInput], hex: String, topics: js.Array[String]): StringDictionary[String] = js.native
    def decodeParameter(`type`: js.Any, hex: String): StringDictionary[js.Any] = js.native
    def decodeParameters(types: js.Array[_], hex: String): StringDictionary[js.Any] = js.native
    def encodeEventSignature(functionName: String): String = js.native
    def encodeEventSignature(functionName: AbiItem): String = js.native
    def encodeFunctionCall(abiItem: AbiItem, params: js.Array[String]): String = js.native
    def encodeFunctionSignature(functionName: String): String = js.native
    def encodeFunctionSignature(functionName: AbiItem): String = js.native
    def encodeParameter(`type`: js.Any, parameter: js.Any): String = js.native
    def encodeParameters(types: js.Array[_], paramaters: js.Array[_]): String = js.native
  }
  
}

