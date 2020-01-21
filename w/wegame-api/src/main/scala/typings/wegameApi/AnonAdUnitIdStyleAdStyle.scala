package typings.wegameApi

import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdUnitIdStyleAdStyle extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle
}

object AnonAdUnitIdStyleAdStyle {
  @scala.inline
  def apply(adUnitId: String, style: AdStyle): AnonAdUnitIdStyleAdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdUnitIdStyleAdStyle]
  }
}

