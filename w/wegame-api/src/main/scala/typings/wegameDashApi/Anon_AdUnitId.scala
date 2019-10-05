package typings.wegameDashApi

import typings.wegameDashApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdUnitId extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle
}

object Anon_AdUnitId {
  @scala.inline
  def apply(adUnitId: String, style: AdStyle): Anon_AdUnitId = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId, style = style)
  
    __obj.asInstanceOf[Anon_AdUnitId]
  }
}

