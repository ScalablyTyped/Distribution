package typings.atTensorflowTfjsDashCore.distOpsLstmMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LSTMCellFunc extends js.Object {
  def apply(data: Tensor2D, c: Tensor2D, h: Tensor2D): js.Tuple2[Tensor2D, Tensor2D] = js.native
}

