package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/norm", JSImport.Namespace)
@js.native
object distOpsNormMod extends js.Object {
  val norm: js.Function4[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, 
    /* ord */ js.UndefOr[
      scala.Double | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.euclidean | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.fro
    ], 
    /* axis */ js.UndefOr[scala.Double | js.Array[scala.Double]], 
    /* keepDims */ js.UndefOr[scala.Boolean], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

