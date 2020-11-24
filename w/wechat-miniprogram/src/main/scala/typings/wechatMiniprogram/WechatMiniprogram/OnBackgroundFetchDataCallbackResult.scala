package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBackgroundFetchDataCallbackResult extends js.Object {
  
  /** 缓存数据类别 (periodic) */
  var fetchType: String = js.native
  
  /** 缓存数据 */
  var fetchedData: String = js.native
  
  /** 客户端拿到缓存数据的时间戳 */
  var timeStamp: Double = js.native
}
object OnBackgroundFetchDataCallbackResult {
  
  @scala.inline
  def apply(fetchType: String, fetchedData: String, timeStamp: Double): OnBackgroundFetchDataCallbackResult = {
    val __obj = js.Dynamic.literal(fetchType = fetchType.asInstanceOf[js.Any], fetchedData = fetchedData.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBackgroundFetchDataCallbackResult]
  }
  
  @scala.inline
  implicit class OnBackgroundFetchDataCallbackResultOps[Self <: OnBackgroundFetchDataCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setFetchType(value: String): Self = this.set("fetchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchedData(value: String): Self = this.set("fetchedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
