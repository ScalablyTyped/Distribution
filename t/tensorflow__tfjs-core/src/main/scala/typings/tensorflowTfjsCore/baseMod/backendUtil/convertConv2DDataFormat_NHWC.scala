package typings.tensorflowTfjsCore.baseMod.backendUtil

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NHWC extends js.Object {
  
  def apply(dataFormat: NHWC): channelsLast | channelsFirst = js.native
}
