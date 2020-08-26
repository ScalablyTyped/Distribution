package typings.useMediaAntdQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinWidth extends js.Object {
  var matchMedia: String = js.native
  var minWidth: Double = js.native
}

object MinWidth {
  @scala.inline
  def apply(matchMedia: String, minWidth: Double): MinWidth = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidth]
  }
  @scala.inline
  implicit class MinWidthOps[Self <: MinWidth] (val x: Self) extends AnyVal {
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
    def setMatchMedia(value: String): Self = this.set("matchMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
  }
  
}

