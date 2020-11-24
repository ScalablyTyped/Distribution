package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.high
import typings.wechatMiniprogram.wechatMiniprogramStrings.low
import typings.wechatMiniprogram.wechatMiniprogramStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAdvertisingObject extends js.Object {
  
  /** 广播自定义参数 */
  var advertiseRequest: AdvertiseReqObj = js.native
  
  /** 广播功率
    *
    * 可选值：
    * - 'low': 功率低;
    * - 'medium': 功率适中;
    * - 'high': 功率高; */
  var powerLevel: js.UndefOr[low | medium | high] = js.native
}
object StartAdvertisingObject {
  
  @scala.inline
  def apply(advertiseRequest: AdvertiseReqObj): StartAdvertisingObject = {
    val __obj = js.Dynamic.literal(advertiseRequest = advertiseRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAdvertisingObject]
  }
  
  @scala.inline
  implicit class StartAdvertisingObjectOps[Self <: StartAdvertisingObject] (val x: Self) extends AnyVal {
    
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
    def setAdvertiseRequest(value: AdvertiseReqObj): Self = this.set("advertiseRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerLevel(value: low | medium | high): Self = this.set("powerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerLevel: Self = this.set("powerLevel", js.undefined)
  }
}
