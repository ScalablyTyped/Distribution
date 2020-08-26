package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String = js.native
}

object UnlinkOptions {
  @scala.inline
  def apply(filePath: String): UnlinkOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkOptions]
  }
  @scala.inline
  implicit class UnlinkOptionsOps[Self <: UnlinkOptions] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
  }
  
}

