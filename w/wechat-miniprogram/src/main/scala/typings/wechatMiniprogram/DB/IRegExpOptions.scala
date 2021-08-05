package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRegExpOptions extends StObject {
  
  var options: js.UndefOr[String] = js.undefined
  
  var regexp: String
}
object IRegExpOptions {
  
  inline def apply(regexp: String): IRegExpOptions = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegExpOptions]
  }
  
  extension [Self <: IRegExpOptions](x: Self) {
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
