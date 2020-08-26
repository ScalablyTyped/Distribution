package typings.tensorflowTfjsCore.mod.backendUtil

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}

