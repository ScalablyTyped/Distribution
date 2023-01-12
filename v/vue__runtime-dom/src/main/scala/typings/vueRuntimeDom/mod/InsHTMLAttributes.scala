package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var cite: js.UndefOr[String] = js.undefined
  
  var datetime: js.UndefOr[String] = js.undefined
}
object InsHTMLAttributes {
  
  inline def apply(): InsHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
  }
}
