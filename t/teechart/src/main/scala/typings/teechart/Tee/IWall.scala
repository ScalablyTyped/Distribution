package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWall extends js.Object {
  var bounds: IRectangle = js.native
  var format: IFormat = js.native
  var visible: Boolean = js.native
}

object IWall {
  @scala.inline
  def apply(bounds: IRectangle, format: IFormat, visible: Boolean): IWall = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWall]
  }
  @scala.inline
  implicit class IWallOps[Self <: IWall] (val x: Self) extends AnyVal {
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
    def setBounds(value: IRectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: IFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

