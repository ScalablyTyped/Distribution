package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadBLECharacteristicValueSuccess extends StObject {
  
  /**
    * 错误码
    */
  var errCode: js.UndefOr[String] = js.undefined
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}
object ReadBLECharacteristicValueSuccess {
  
  inline def apply(): ReadBLECharacteristicValueSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBLECharacteristicValueSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadBLECharacteristicValueSuccess] (val x: Self) extends AnyVal {
    
    inline def setErrCode(value: String): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrCodeUndefined: Self = StObject.set(x, "errCode", js.undefined)
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
  }
}
