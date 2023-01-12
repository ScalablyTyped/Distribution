package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var ontoggle: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply(): DetailsHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailsHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setOntoggle(value: String): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
    
    inline def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
