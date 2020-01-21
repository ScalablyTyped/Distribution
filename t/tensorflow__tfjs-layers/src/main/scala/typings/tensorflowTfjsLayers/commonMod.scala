package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/backend/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  def epsilon(): Double = js.native
  def imageDataFormat(): DataFormat = js.native
  def setEpsilon(e: Double): Unit = js.native
}

