package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/confusion_matrix", JSImport.Namespace)
@js.native
object distOpsConfusionUnderscoreMatrixMod extends js.Object {
  val confusionMatrix: js.Function3[
    /* labels */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* predictions */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* numClasses */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  def confusionMatrix_(
    labels: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    predictions: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    numClasses: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def confusionMatrix_(
    labels: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    numClasses: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def confusionMatrix_(
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D,
    numClasses: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def confusionMatrix_(
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    numClasses: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
}

