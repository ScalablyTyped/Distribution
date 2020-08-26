package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  /**
    * The AppBar appears at the bottom of the main view
    **/
  var bottom: String = js.native
  /**
    * The AppBar appears at the top of the main view
    **/
  var top: String = js.native
}

object Bottom {
  @scala.inline
  def apply(bottom: String, top: String): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

