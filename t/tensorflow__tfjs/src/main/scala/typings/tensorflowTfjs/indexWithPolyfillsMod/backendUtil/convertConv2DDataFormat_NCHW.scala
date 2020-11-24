package typings.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typings.tensorflowTfjs.tensorflowTfjsStrings.NCHW
import typings.tensorflowTfjs.tensorflowTfjsStrings.channelsFirst
import typings.tensorflowTfjs.tensorflowTfjsStrings.channelsLast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.convertConv2DDataFormat")
@js.native
object convertConv2DDataFormat_NCHW extends js.Object {
  
  def apply(dataFormat: NCHW): channelsLast | channelsFirst = js.native
}
