package typings.xstyledSystem.mod

import typings.csstype.mod.Property.TextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlignProps extends StObject {
  
  val textAlign: js.UndefOr[ResponsiveValue[TextAlign]] = js.undefined
}
object TextAlignProps {
  
  inline def apply(): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAlignProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAlignProps] (val x: Self) extends AnyVal {
    
    inline def setTextAlign(value: ResponsiveValue[TextAlign]): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextAlignVarargs(value: TextAlign*): Self = StObject.set(x, "textAlign", js.Array(value*))
  }
}
