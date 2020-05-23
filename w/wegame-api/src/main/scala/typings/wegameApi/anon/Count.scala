package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  /**
    * 推荐单元 id
    */
  var adUnitId: String
  /**
    * 游戏icon的数量，请注意，正式版下面渲染出来的icon数量会小于等于count，请注册做好样式兼容
    */
  var count: Double
  /**
    * 数组的每一项可以针对对应的icon设置位置和样式等信息，style的每一项称为styleItem
    */
  var style: js.Array[AppNameHidden]
}

object Count {
  @scala.inline
  def apply(adUnitId: String, count: Double, style: js.Array[AppNameHidden]): Count = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

