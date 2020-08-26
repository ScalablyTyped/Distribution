package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated
  */
@js.native
trait MenuShareQQ extends ShareTimelineConfig {
  /**
    * 分享描述
    */
  var desc: String = js.native
}

object MenuShareQQ {
  @scala.inline
  def apply(desc: String, link: String, title: String): MenuShareQQ = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuShareQQ]
  }
  @scala.inline
  implicit class MenuShareQQOps[Self <: MenuShareQQ] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
  }
  
}

