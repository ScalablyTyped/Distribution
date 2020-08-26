package typings.victory.anon

import typings.victory.mod.CallbackArgs
import typings.victory.mod.NumberOrCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  var bottom: js.UndefOr[NumberOrCallback] = js.native
  var bottomLeft: js.UndefOr[NumberOrCallback] = js.native
  var bottomRight: js.UndefOr[NumberOrCallback] = js.native
  var top: js.UndefOr[NumberOrCallback] = js.native
  var topLeft: js.UndefOr[NumberOrCallback] = js.native
  var topRight: js.UndefOr[NumberOrCallback] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
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
    def setBottomFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("bottom", js.Any.fromFunction1(value))
    @scala.inline
    def setBottom(value: NumberOrCallback): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setBottomLeftFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("bottomLeft", js.Any.fromFunction1(value))
    @scala.inline
    def setBottomLeft(value: NumberOrCallback): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    @scala.inline
    def setBottomRightFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("bottomRight", js.Any.fromFunction1(value))
    @scala.inline
    def setBottomRight(value: NumberOrCallback): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    @scala.inline
    def setTopFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("top", js.Any.fromFunction1(value))
    @scala.inline
    def setTop(value: NumberOrCallback): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTopLeftFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("topLeft", js.Any.fromFunction1(value))
    @scala.inline
    def setTopLeft(value: NumberOrCallback): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    @scala.inline
    def setTopRightFunction1(value: /* args */ CallbackArgs => Double): Self = this.set("topRight", js.Any.fromFunction1(value))
    @scala.inline
    def setTopRight(value: NumberOrCallback): Self = this.set("topRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
  
}

