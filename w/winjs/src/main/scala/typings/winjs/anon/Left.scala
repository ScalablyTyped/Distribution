package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Left extends js.Object {
  /**
    * Pane is positioned below the SplitView's content.
    **/
  var bottom: String = js.native
  /**
    * Pane is positioned left of the SplitView's content.
    **/
  var left: String = js.native
  /**
    * Pane is positioned right of the SplitView's content.
    **/
  var right: String = js.native
  /**
    * Pane is positioned above the SplitView's content.
    **/
  var top: String = js.native
}

object Left {
  @scala.inline
  def apply(bottom: String, left: String, right: String, top: String): Left = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  @scala.inline
  implicit class LeftOps[Self <: Left] (val x: Self) extends AnyVal {
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
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

