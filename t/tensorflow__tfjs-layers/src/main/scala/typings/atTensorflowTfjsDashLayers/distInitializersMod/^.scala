package typings.atTensorflowTfjsDashLayers.distInitializersMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDictValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkDistribution(): Unit = js.native
  def checkDistribution(value: String): Unit = js.native
  def checkFanMode(): Unit = js.native
  def checkFanMode(value: String): Unit = js.native
  def getInitializer(identifier: ConfigDict): Initializer = js.native
  def getInitializer(identifier: Initializer): Initializer = js.native
  def getInitializer(identifier: InitializerIdentifier): Initializer = js.native
  def serializeInitializer(initializer: Initializer): ConfigDictValue = js.native
}

