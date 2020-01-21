package typings.wonderJs.deviceManagerMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasMapData extends js.Object {
  var canvas: HTMLCanvasElement
  var context: CanvasRenderingContext2D
}

object CanvasMapData {
  @scala.inline
  def apply(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): CanvasMapData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CanvasMapData]
  }
}

