package typings.wepy.anon

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var canvasId: String = js.native
  var data: Uint8ClampedArray = js.native
  var height: js.UndefOr[Double] = js.native
  var wdith: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Height {
  @scala.inline
  def apply(canvasId: String, data: Uint8ClampedArray, wdith: Double, x: Double, y: Double): Height = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], wdith = wdith.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Uint8ClampedArray): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setWdith(value: Double): Self = this.set("wdith", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
  
}

