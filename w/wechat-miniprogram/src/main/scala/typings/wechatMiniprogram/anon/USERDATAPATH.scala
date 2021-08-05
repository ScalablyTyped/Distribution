package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USERDATAPATH extends StObject {
  
  var USER_DATA_PATH: String
}
object USERDATAPATH {
  
  inline def apply(USER_DATA_PATH: String): USERDATAPATH = {
    val __obj = js.Dynamic.literal(USER_DATA_PATH = USER_DATA_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[USERDATAPATH]
  }
  
  extension [Self <: USERDATAPATH](x: Self) {
    
    inline def setUSER_DATA_PATH(value: String): Self = StObject.set(x, "USER_DATA_PATH", value.asInstanceOf[js.Any])
  }
}
