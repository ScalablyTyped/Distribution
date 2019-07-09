package typings
package atTensorflowTfjsDashCoreLib.distOpsLstmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LSTMCellFunc extends js.Object {
  def apply(
    data: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    c: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D,
    h: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ): js.Tuple2[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D
  ] = js.native
}

