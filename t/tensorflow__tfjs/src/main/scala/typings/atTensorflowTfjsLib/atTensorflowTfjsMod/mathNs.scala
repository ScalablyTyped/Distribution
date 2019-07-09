package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "math")
@js.native
object mathNs extends js.Object {
  val confusionMatrix: js.Function3[
    /* labels */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* predictions */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* numClasses */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
}

