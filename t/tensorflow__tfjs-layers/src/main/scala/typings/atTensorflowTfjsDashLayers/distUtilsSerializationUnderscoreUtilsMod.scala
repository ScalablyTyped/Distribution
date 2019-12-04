package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDictValue
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.PyJsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/serialization_utils", JSImport.Namespace)
@js.native
object distUtilsSerializationUnderscoreUtilsMod extends js.Object {
  def convertPythonicToTs(pythonicConfig: PyJsonValue): ConfigDictValue = js.native
  def convertPythonicToTs(pythonicConfig: PyJsonValue, key: String): ConfigDictValue = js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue): PyJsonValue = js.native
  def convertTsToPythonic(tsConfig: ConfigDictValue, key: String): PyJsonValue = js.native
}

