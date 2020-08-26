package typings.terminalKit.screenBufferMod

import typings.terminalKit.terminalKitStrings.down
import typings.terminalKit.terminalKitStrings.left
import typings.terminalKit.terminalKitStrings.right
import typings.terminalKit.terminalKitStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOptions extends js.Object {
  var attr: Attributes | Double = js.native
  var direction: js.UndefOr[right | left | up | down | Null] = js.native
  var dx: Double = js.native
  var dy: Double = js.native
  var wrap: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object PutOptions {
  @scala.inline
  def apply(attr: Attributes | Double, dx: Double, dy: Double, wrap: Boolean, x: Double, y: Double): PutOptions = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOptions]
  }
  @scala.inline
  implicit class PutOptionsOps[Self <: PutOptions] (val x: Self) extends AnyVal {
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
    def setAttr(value: Attributes | Double): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: right | left | up | down): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDirectionNull: Self = this.set("direction", null)
  }
  
}

