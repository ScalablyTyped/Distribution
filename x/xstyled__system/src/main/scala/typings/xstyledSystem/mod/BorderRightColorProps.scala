package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRightColorProps extends StObject {
  
  val borderRightColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderRightColorProps {
  
  inline def apply(): BorderRightColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderRightColorProps] (val x: Self) extends AnyVal {
    
    inline def setBorderRightColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    inline def setBorderRightColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderRightColor", js.Array(value*))
  }
}
