package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdUnitIdCount extends js.Object {
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
  var style: js.Array[Anon_AppNameHidden]
}

object Anon_AdUnitIdCount {
  @scala.inline
  def apply(adUnitId: String, count: Double, style: js.Array[Anon_AppNameHidden]): Anon_AdUnitIdCount = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId, count = count, style = style)
  
    __obj.asInstanceOf[Anon_AdUnitIdCount]
  }
}

