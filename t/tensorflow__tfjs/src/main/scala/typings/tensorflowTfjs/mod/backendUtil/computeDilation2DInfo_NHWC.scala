package typings.tensorflowTfjs.mod.backendUtil

import typings.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typings.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
@js.native
object computeDilation2DInfo_NHWC extends js.Object {
  
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  def apply(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
}
