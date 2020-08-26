package typings.tensorflowTfjs.mod.backendUtil

import typings.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typings.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typings.tensorflowTfjs.tensorflowTfjsStrings.ceil
import typings.tensorflowTfjs.tensorflowTfjsStrings.floor
import typings.tensorflowTfjs.tensorflowTfjsStrings.round
import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.computePool3DInfo")
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

