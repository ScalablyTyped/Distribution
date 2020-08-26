package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dDrawPointsOption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var onRender: js.UndefOr[js.Function0[Boolean]] = js.native
   // TODO
  var size: js.UndefOr[Double] = js.native
  var style: Graph2dDrawPointsStyle = js.native
}

object Graph2dDrawPointsOption {
  @scala.inline
  def apply(style: Graph2dDrawPointsStyle): Graph2dDrawPointsOption = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDrawPointsOption]
  }
  @scala.inline
  implicit class Graph2dDrawPointsOptionOps[Self <: Graph2dDrawPointsOption] (val x: Self) extends AnyVal {
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
    def setStyle(value: Graph2dDrawPointsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOnRender(value: () => Boolean): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

