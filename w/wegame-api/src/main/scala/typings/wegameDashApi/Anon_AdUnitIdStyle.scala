package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdUnitIdStyle extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String
  /**
    * 小游戏推荐banner组件样式
    */
  var style: Anon_Left
}

object Anon_AdUnitIdStyle {
  @scala.inline
  def apply(adUnitId: String, style: Anon_Left): Anon_AdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdUnitIdStyle]
  }
}

