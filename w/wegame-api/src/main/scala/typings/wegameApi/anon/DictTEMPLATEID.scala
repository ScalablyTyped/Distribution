package typings.wegameApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.wegameApi.wegameApiStrings.accept
import typings.wegameApi.wegameApiStrings.ban
import typings.wegameApi.wegameApiStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictTEMPLATEID extends /**
  * [TEMPLATE_ID]是动态的键，即模板id，值包括'accept'、'reject'、'ban'。'accept'表示用户同意订阅该条id对应的模板消息，'reject'表示用户拒绝订阅该条id对应的模板消息，'ban'表示
  * 已被后台封禁。例如 { errMsg: "requestSubscribeMessage:ok", zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE: "accept"} 表示用户同意订阅zun-LzcQyW-edafCVvzPkK4de2Rllr1fFpw2A_x0oXE这条消息
  */
/* TEMPLATE_ID */ StringDictionary[accept | reject | ban | String] {
  
  /**
    * 接口调用成功时errMsg值为'requestSubscribeMessage:ok'
    */
  var errMsg: String = js.native
}
object DictTEMPLATEID {
  
  @scala.inline
  def apply(errMsg: String): DictTEMPLATEID = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictTEMPLATEID]
  }
  
  @scala.inline
  implicit class DictTEMPLATEIDMutableBuilder[Self <: DictTEMPLATEID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
