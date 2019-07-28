package typings.web3.ethAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ABI extends js.Object {
  def decodeLog(inputs: js.Object, hexString: String, topics: js.Array[String]): js.Object = js.native
  def decodeParameter(`type`: String, hex: String): js.Any = js.native
  def decodeParameters(types: js.Array[String], hex: String): EthAbiDecodeParametersResultArray = js.native
  @JSName("decodeParameters")
  def decodeParameters_EthAbiDecodeParametersResultObject(types: js.Array[EthAbiDecodeParametersType], hex: String): EthAbiDecodeParametersResultObject = js.native
  def encodeEventSignature(name: String): String = js.native
  def encodeEventSignature(name: js.Object): String = js.native
  def encodeFunctionCall(jsonInterface: js.Object, parameters: js.Array[_]): String = js.native
  def encodeFunctionSignature(name: String): String = js.native
  def encodeFunctionSignature(name: js.Object): String = js.native
  def encodeParameter(`type`: String, parameter: js.Any): String = js.native
  def encodeParameters(types: js.Array[String], paramaters: js.Array[_]): String = js.native
}

