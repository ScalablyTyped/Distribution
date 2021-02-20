package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraData extends StObject {
  
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
  implicit class ExtraDataMutableBuilder[Self <: ExtraData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
  }
}
