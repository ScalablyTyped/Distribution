package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonceStr extends StObject {
  
  @JSName("package")
  var _package: String
  
  var nonceStr: String
  
  var paySign: String
  
  var signType: String
  
  var timeStamp: String
}
object NonceStr {
  
  inline def apply(_package: String, nonceStr: String, paySign: String, signType: String, timeStamp: String): NonceStr = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonceStr]
  }
  
  extension [Self <: NonceStr](x: Self) {
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    inline def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
