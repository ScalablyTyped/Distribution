package typings.tensorflowTfjsNode.mod.backendUtil

import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCHW
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsFirst
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}
