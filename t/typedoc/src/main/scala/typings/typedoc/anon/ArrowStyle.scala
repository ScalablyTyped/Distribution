package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowStyle extends StObject {
  
  var arrowStyle: js.UndefOr[Boolean] = js.undefined
  
  var hideName: js.UndefOr[Boolean] = js.undefined
}
object ArrowStyle {
  
  inline def apply(): ArrowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowStyle] (val x: Self) extends AnyVal {
    
    inline def setArrowStyle(value: Boolean): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
    
    inline def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
    
    inline def setHideName(value: Boolean): Self = StObject.set(x, "hideName", value.asInstanceOf[js.Any])
    
    inline def setHideNameUndefined: Self = StObject.set(x, "hideName", js.undefined)
  }
}
