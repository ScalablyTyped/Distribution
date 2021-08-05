package typings.wxServerSdk.anon

import typings.wxServerSdk.wxServerSdkStrings.wx_client
import typings.wxServerSdk.wxServerSdkStrings.wx_devtools
import typings.wxServerSdk.wxServerSdkStrings.wx_http
import typings.wxServerSdk.wxServerSdkStrings.wx_unknown
import typings.wxServerSdk.wxServerSdkStrings.其他
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APPID extends StObject {
  
  var APPID: String
  
  var ENV: String
  
  var OPENID: String
  
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他
  
  var UNIONID: String
}
object APPID {
  
  inline def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): APPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPID]
  }
  
  extension [Self <: APPID](x: Self) {
    
    inline def setAPPID(value: String): Self = StObject.set(x, "APPID", value.asInstanceOf[js.Any])
    
    inline def setENV(value: String): Self = StObject.set(x, "ENV", value.asInstanceOf[js.Any])
    
    inline def setOPENID(value: String): Self = StObject.set(x, "OPENID", value.asInstanceOf[js.Any])
    
    inline def setSOURCE(value: wx_devtools | wx_client | wx_http | wx_unknown | 其他): Self = StObject.set(x, "SOURCE", value.asInstanceOf[js.Any])
    
    inline def setUNIONID(value: String): Self = StObject.set(x, "UNIONID", value.asInstanceOf[js.Any])
  }
}
