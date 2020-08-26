package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.computePool2DInfo")
@js.native
object computePool2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
}

