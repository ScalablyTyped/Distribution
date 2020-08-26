package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWalls extends js.Object {
  var back: IWall = js.native
  var bottom: IWall = js.native
  var left: IWall = js.native
  var right: IWall = js.native
  var visible: Boolean = js.native
}

object IWalls {
  @scala.inline
  def apply(back: IWall, bottom: IWall, left: IWall, right: IWall, visible: Boolean): IWalls = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWalls]
  }
  @scala.inline
  implicit class IWallsOps[Self <: IWalls] (val x: Self) extends AnyVal {
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
    def setBack(value: IWall): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: IWall): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: IWall): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: IWall): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

