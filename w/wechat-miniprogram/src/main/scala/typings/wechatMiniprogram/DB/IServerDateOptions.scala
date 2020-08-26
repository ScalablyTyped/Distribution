package typings.wechatMiniprogram.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerDateOptions extends js.Object {
  var offset: Double = js.native
}

object IServerDateOptions {
  @scala.inline
  def apply(offset: Double): IServerDateOptions = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerDateOptions]
  }
  @scala.inline
  implicit class IServerDateOptionsOps[Self <: IServerDateOptions] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

