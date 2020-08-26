package typings.victory.mod

import typings.victory.anon.XY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the first parameter of a callback when a callback is used to
  * resolve the value of a property instead of a concrete value.
  *
  * Note that additional properties here like `scale`, `x`, `y`, etc are resolved
  * values of properties from the VictoryXXXProps for each component.
  */
@js.native
trait CallbackArgs extends js.Object {
  var active: Boolean = js.native
  var datum: js.Any = js.native
  var horizontal: Boolean = js.native
  var scale: js.UndefOr[XY] = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object CallbackArgs {
  @scala.inline
  def apply(active: Boolean, datum: js.Any, horizontal: Boolean, x: Double, y: Double): CallbackArgs = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgs]
  }
  @scala.inline
  implicit class CallbackArgsOps[Self <: CallbackArgs] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatum(value: js.Any): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: XY): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

