package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCDHW
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NDHWC
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.computePool3DInfo")
@js.native
object computePool3DInfo extends js.Object {
  def apply(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = js.native
}

