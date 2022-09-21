package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var open: js.UndefOr[Booleanish] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply(): DetailsHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes]
  }
  
  extension [Self <: DetailsHTMLAttributes](x: Self) {
    
    inline def setOpen(value: Booleanish): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
