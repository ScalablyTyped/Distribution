package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/linalg_ops", JSImport.Namespace)
@js.native
object distOpsLinalgUnderscoreOpsMod extends js.Object {
  val gramSchmidt: js.Function1[
    /* xs */ js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D, 
    js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
  val qr: js.Function2[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* fullMatrices */ js.UndefOr[scala.Boolean], 
    js.Tuple2[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
}

