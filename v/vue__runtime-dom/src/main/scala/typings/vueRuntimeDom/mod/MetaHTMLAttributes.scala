package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var charset: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var httpequiv: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object MetaHTMLAttributes {
  
  inline def apply(): MetaHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaHTMLAttributes]
  }
  
  extension [Self <: MetaHTMLAttributes](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHttpequiv(value: String): Self = StObject.set(x, "httpequiv", value.asInstanceOf[js.Any])
    
    inline def setHttpequivUndefined: Self = StObject.set(x, "httpequiv", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
