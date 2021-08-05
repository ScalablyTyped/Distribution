package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iv extends StObject {
  
  var encryptedData: String
  
  var iv: String
  
  var rawData: String
  
  var signature: String
  
  var userInfo: js.Object
}
object Iv {
  
  inline def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: js.Object): Iv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
  
  extension [Self <: Iv](x: Self) {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setUserInfo(value: js.Object): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
  }
}
