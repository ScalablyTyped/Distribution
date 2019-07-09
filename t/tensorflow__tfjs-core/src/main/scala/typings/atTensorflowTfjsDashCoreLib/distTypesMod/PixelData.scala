package typings
package atTensorflowTfjsDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelData extends js.Object {
  var data: stdLib.Uint8Array
  var height: scala.Double
  var width: scala.Double
}

object PixelData {
  @scala.inline
  def apply(data: stdLib.Uint8Array, height: scala.Double, width: scala.Double): PixelData = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[PixelData]
  }
}

