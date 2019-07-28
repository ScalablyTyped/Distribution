package typings.atTensorflowTfjsDashCore.distTypesMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelData extends js.Object {
  var data: Uint8Array
  var height: Double
  var width: Double
}

object PixelData {
  @scala.inline
  def apply(data: Uint8Array, height: Double, width: Double): PixelData = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[PixelData]
  }
}

