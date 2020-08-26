package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewPortOptions extends js.Object {
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: js.UndefOr[AnimationOptions | Boolean] = js.native
  /**
    * The offset (in DOM units) is how many pixels from the center the view is focussed.
    * Default value is {x:0,y:0}
    */
  var offset: js.UndefOr[Position] = js.native
  /**
    * The scale is the target zoomlevel.
    * Default value is 1.0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object ViewPortOptions {
  @scala.inline
  def apply(): ViewPortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewPortOptions]
  }
  @scala.inline
  implicit class ViewPortOptionsOps[Self <: ViewPortOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: AnimationOptions | Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setOffset(value: Position): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

