package typings.wegameApi.anon

import typings.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdUnitIdStyle extends js.Object {
  
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
  
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle = js.native
}
object AdUnitIdStyle {
  
  @scala.inline
  def apply(adUnitId: String, style: AdStyle): AdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitIdStyle]
  }
  
  @scala.inline
  implicit class AdUnitIdStyleOps[Self <: AdUnitIdStyle] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: AdStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
