package typings.xstyledSystem.mod

import typings.csstype.mod.Property.TextTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTransformProps extends StObject {
  
  val textTransform: js.UndefOr[ResponsiveValue[TextTransform]] = js.undefined
}
object TextTransformProps {
  
  inline def apply(): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTransformProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextTransformProps] (val x: Self) extends AnyVal {
    
    inline def setTextTransform(value: ResponsiveValue[TextTransform]): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    inline def setTextTransformVarargs(value: TextTransform*): Self = StObject.set(x, "textTransform", js.Array(value*))
  }
}
