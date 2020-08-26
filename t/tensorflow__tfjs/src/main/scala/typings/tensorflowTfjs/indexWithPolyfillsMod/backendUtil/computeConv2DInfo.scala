package typings.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typings.tensorflowTfjs.tensorflowTfjsStrings.ceil
import typings.tensorflowTfjs.tensorflowTfjsStrings.channelsFirst
import typings.tensorflowTfjs.tensorflowTfjsStrings.channelsLast
import typings.tensorflowTfjs.tensorflowTfjsStrings.floor
import typings.tensorflowTfjs.tensorflowTfjsStrings.round
import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.computeConv2DInfo")
@js.native
object computeConv2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double | ExplicitPadding,
    roundingMode: js.UndefOr[floor | round | ceil],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
}

