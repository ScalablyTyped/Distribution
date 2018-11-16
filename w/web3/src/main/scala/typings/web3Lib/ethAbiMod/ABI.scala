package typings
package web3Lib.ethAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ABI extends js.Object {
  def decodeLog(inputs: js.Object, hexString: java.lang.String, topics: js.Array[java.lang.String]): js.Object = js.native
  def decodeParameter(`type`: java.lang.String, hex: java.lang.String): js.Any = js.native
  def decodeParameters(types: js.Array[java.lang.String], hex: java.lang.String): EthAbiDecodeParametersResultArray = js.native
  @JSName("decodeParameters")
  def decodeParameters_EthAbiDecodeParametersResultObject(types: js.Array[EthAbiDecodeParametersType], hex: java.lang.String): EthAbiDecodeParametersResultObject = js.native
  def encodeEventSignature(name: java.lang.String): java.lang.String = js.native
  def encodeEventSignature(name: js.Object): java.lang.String = js.native
  def encodeFunctionCall(jsonInterface: js.Object, parameters: js.Array[_]): java.lang.String = js.native
  def encodeFunctionSignature(name: java.lang.String): java.lang.String = js.native
  def encodeFunctionSignature(name: js.Object): java.lang.String = js.native
  def encodeParameter(`type`: java.lang.String, parameter: js.Any): java.lang.String = js.native
  def encodeParameters(types: js.Array[java.lang.String], paramaters: js.Array[_]): java.lang.String = js.native
}

