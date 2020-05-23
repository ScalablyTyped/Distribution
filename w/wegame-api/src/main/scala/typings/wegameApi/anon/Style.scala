package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String
  /**
    * 小游戏推荐banner组件样式
    */
  var style: Left
}

object Style {
  @scala.inline
  def apply(adUnitId: String, style: Left): Style = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

