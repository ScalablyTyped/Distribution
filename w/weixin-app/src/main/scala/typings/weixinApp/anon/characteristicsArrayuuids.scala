package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  characteristics :std.Array<{  uuid :string,   properties :std.Array<{  read :boolean,   write :boolean,   notify :boolean,   indicate :boolean}>}>} & weixin-app.wx.ErrMsgResponse */
trait characteristicsArrayuuids extends StObject {
  
  var characteristics: js.Array[Properties]
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}
object characteristicsArrayuuids {
  
  @scala.inline
  def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArrayuuids = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArrayuuids]
  }
  
  @scala.inline
  implicit class characteristicsArrayuuidsMutableBuilder[Self <: characteristicsArrayuuids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristics(value: js.Array[Properties]): Self = StObject.set(x, "characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacteristicsVarargs(value: Properties*): Self = StObject.set(x, "characteristics", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
