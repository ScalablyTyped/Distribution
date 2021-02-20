package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.LocalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocalImgDataConfig extends WxBaseRequestConfig {
  
  /**
    * 图片的 localID
    */
  var localId: String = js.native
  
  /**
    * 成功后的回调, localData是图片的base64数据，可以用img标签显示
    */
  @JSName("success")
  def success_MGetLocalImgDataConfig(res: LocalData): Unit = js.native
}
object GetLocalImgDataConfig {
  
  @scala.inline
  def apply(localId: String, success: LocalData => Unit): GetLocalImgDataConfig = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetLocalImgDataConfig]
  }
  
  @scala.inline
  implicit class GetLocalImgDataConfigMutableBuilder[Self <: GetLocalImgDataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: LocalData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
