package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorProps extends StObject {
  
  val borderColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderColorProps {
  
  inline def apply(): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderColorProps] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderColor", js.Array(value*))
  }
}
