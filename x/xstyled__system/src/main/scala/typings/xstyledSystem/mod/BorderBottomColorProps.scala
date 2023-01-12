package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomColorProps extends StObject {
  
  val borderBottomColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderBottomColorProps {
  
  inline def apply(): BorderBottomColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderBottomColorProps] (val x: Self) extends AnyVal {
    
    inline def setBorderBottomColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    inline def setBorderBottomColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderBottomColor", js.Array(value*))
  }
}
