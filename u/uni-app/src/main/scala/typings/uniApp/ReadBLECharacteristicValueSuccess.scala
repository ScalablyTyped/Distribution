package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadBLECharacteristicValueSuccess extends StObject {
  
  /**
    * 错误码
    */
  var errCode: js.UndefOr[String] = js.native
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.native
}
object ReadBLECharacteristicValueSuccess {
  
  @scala.inline
  def apply(): ReadBLECharacteristicValueSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBLECharacteristicValueSuccess]
  }
  
  @scala.inline
  implicit class ReadBLECharacteristicValueSuccessMutableBuilder[Self <: ReadBLECharacteristicValueSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: String): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrCodeUndefined: Self = StObject.set(x, "errCode", js.undefined)
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
