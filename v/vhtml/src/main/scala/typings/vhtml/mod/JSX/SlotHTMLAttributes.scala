package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var name: js.UndefOr[String] = js.undefined
}
object SlotHTMLAttributes {
  
  inline def apply(): SlotHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotHTMLAttributes]
  }
  
  extension [Self <: SlotHTMLAttributes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
