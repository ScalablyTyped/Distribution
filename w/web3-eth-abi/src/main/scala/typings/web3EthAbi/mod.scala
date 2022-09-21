package typings.web3EthAbi

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.web3Utils.mod.AbiInput
import typings.web3Utils.mod.AbiItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("web3-eth-abi", JSImport.Default)
  @js.native
  val default: AbiCoder = js.native
  
  @JSImport("web3-eth-abi", "AbiCoder")
  @js.native
  open class AbiCoder () extends StObject {
    
    def decodeLog(inputs: js.Array[AbiInput], hex: String, topics: js.Array[String]): StringDictionary[String] = js.native
    
    def decodeParameter(`type`: Any, hex: String): StringDictionary[Any] = js.native
    
    def decodeParameters(types: js.Array[Any], hex: String): StringDictionary[Any] = js.native
    
    def encodeEventSignature(functionName: String): String = js.native
    def encodeEventSignature(functionName: AbiItem): String = js.native
    
    def encodeFunctionCall(abiItem: AbiItem, params: js.Array[String]): String = js.native
    
    def encodeFunctionSignature(functionName: String): String = js.native
    def encodeFunctionSignature(functionName: AbiItem): String = js.native
    
    def encodeParameter(`type`: Any, parameter: Any): String = js.native
    
    def encodeParameters(types: js.Array[Any], paramaters: js.Array[Any]): String = js.native
  }
  
  type _To = AbiCoder
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AbiCoder = default
}
