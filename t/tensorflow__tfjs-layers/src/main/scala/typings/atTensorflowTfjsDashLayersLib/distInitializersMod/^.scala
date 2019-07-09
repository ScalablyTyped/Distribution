package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkDistribution(): scala.Unit = js.native
  def checkDistribution(value: java.lang.String): scala.Unit = js.native
  def checkFanMode(): scala.Unit = js.native
  def checkFanMode(value: java.lang.String): scala.Unit = js.native
  def getInitializer(identifier: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict): Initializer = js.native
  def getInitializer(identifier: Initializer): Initializer = js.native
  def getInitializer(identifier: InitializerIdentifier): Initializer = js.native
  def serializeInitializer(initializer: Initializer): atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDictValue = js.native
}

