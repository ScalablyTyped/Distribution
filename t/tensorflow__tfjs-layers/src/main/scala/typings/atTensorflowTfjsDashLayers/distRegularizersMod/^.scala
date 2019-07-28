package typings.atTensorflowTfjsDashLayers.distRegularizersMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDictValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeRegularizer(config: ConfigDict): Regularizer = js.native
  def deserializeRegularizer(config: ConfigDict, customObjects: ConfigDict): Regularizer = js.native
  def getRegularizer(identifier: ConfigDict): Regularizer = js.native
  def getRegularizer(identifier: Regularizer): Regularizer = js.native
  def getRegularizer(identifier: RegularizerIdentifier): Regularizer = js.native
  def l1(): L1L2 = js.native
  def l1(args: L1Args): L1L2 = js.native
  def l2(args: L2Args): L1L2 = js.native
  def serializeRegularizer(constraint: Regularizer): ConfigDictValue = js.native
}

