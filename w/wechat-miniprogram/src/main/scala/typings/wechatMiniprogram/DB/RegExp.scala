package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExp extends StObject {
  
  val options: String
  
  val regexp: String
}
object RegExp {
  
  inline def apply(options: String, regexp: String): RegExp = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExp]
  }
  
  extension [Self <: RegExp](x: Self) {
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
