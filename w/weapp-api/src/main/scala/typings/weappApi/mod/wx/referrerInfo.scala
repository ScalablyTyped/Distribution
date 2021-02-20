package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait referrerInfo extends StObject {
  
  /** 来源小程序、公众号或 App 的 appId */
  var appId: String = js.native
  
  /** 来源小程序传过来的数据，scene=1037或1038时支持 */
  var extraData: js.Object = js.native
}
object referrerInfo {
  
  @scala.inline
  def apply(appId: String, extraData: js.Object): referrerInfo = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[referrerInfo]
  }
  
  @scala.inline
  implicit class referrerInfoMutableBuilder[Self <: referrerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Object): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
  }
}
