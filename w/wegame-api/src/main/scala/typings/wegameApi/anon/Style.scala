package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String = js.native
  /**
    * 小游戏推荐banner组件样式
    */
  var style: Left = js.native
}

object Style {
  @scala.inline
  def apply(adUnitId: String, style: Left): Style = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setAdUnitId(value: String): Self = this.set("adUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Left): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

