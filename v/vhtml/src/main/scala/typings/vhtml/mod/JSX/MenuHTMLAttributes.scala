package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MenuHTMLAttributes {
  
  inline def apply(): MenuHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuHTMLAttributes]
  }
  
  extension [Self <: MenuHTMLAttributes](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
