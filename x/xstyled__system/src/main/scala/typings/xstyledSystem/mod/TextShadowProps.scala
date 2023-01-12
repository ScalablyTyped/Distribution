package typings.xstyledSystem.mod

import typings.csstype.mod.Property.TextShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextShadowProps extends StObject {
  
  val textShadow: js.UndefOr[ResponsiveValue[TextShadow | Double]] = js.undefined
}
object TextShadowProps {
  
  inline def apply(): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextShadowProps] (val x: Self) extends AnyVal {
    
    inline def setTextShadow(value: ResponsiveValue[TextShadow | Double]): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    inline def setTextShadowVarargs(value: (TextShadow | Double)*): Self = StObject.set(x, "textShadow", js.Array(value*))
  }
}
