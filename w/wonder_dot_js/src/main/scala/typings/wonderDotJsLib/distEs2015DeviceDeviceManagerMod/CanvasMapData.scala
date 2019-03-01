package typings
package wonderDotJsLib.distEs2015DeviceDeviceManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasMapData extends js.Object {
  var canvas: stdLib.HTMLCanvasElement
  var context: stdLib.CanvasRenderingContext2D
}

object CanvasMapData {
  @scala.inline
  def apply(canvas: stdLib.HTMLCanvasElement, context: stdLib.CanvasRenderingContext2D): CanvasMapData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canvas")(canvas)
    __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[CanvasMapData]
  }
}

