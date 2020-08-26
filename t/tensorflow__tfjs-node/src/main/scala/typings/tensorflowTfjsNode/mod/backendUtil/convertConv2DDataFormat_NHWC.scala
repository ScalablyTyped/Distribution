package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NHWC
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NHWC extends js.Object {
  def apply(dataFormat: NHWC): channelsLast | channelsFirst = js.native
}

