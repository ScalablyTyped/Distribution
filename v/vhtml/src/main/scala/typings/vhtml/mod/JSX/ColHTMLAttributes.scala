package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var span: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ColHTMLAttributes {
  
  inline def apply(): ColHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
