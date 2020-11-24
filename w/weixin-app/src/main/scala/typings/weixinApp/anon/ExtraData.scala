package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraData extends js.Object {
  
  /* 来源小程序或公众号或App的 appId，详见下方说明 */
  var appId: String = js.native
  
  /* 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object = js.native
}
object ExtraData {
  
  @scala.inline
  def apply(appId: String, extraData: js.Object): ExtraData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraData]
  }
  
  @scala.inline
  implicit class ExtraDataOps[Self <: ExtraData] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Object): Self = this.set("extraData", value.asInstanceOf[js.Any])
  }
}
