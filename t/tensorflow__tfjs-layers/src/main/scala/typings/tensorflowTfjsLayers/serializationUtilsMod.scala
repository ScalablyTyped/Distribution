package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import typings.tensorflowTfjsLayers.typesMod.PyJsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", JSImport.Namespace)
@js.native
object serializationUtilsMod extends js.Object {
  def convertPythonicToTs(pythonicConfig: PyJsonValue): ConfigDictValue = js.native
  def convertPythonicToTs(pythonicConfig: PyJsonValue, key: String): ConfigDictValue = js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue): PyJsonValue = js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue, key: String): PyJsonValue = js.native
}

