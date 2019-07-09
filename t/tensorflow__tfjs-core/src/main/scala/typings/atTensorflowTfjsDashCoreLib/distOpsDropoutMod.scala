package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/dropout", JSImport.Namespace)
@js.native
object distOpsDropoutMod extends js.Object {
  val dropout: js.Function4[
    /* x */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* rate */ atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | scala.Double, 
    /* noiseShape */ js.UndefOr[js.Array[scala.Double]], 
    /* seed */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

