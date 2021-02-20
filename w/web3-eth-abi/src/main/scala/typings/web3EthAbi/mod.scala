package typings.web3EthAbi

import org.scalablytyped.runtime.StringDictionary
import typings.web3Utils.mod.AbiInput
import typings.web3Utils.mod.AbiItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth-abi", "AbiCoder")
  @js.native
  class AbiCoder () extends StObject {
    
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
