package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftColorProps extends StObject {
  
  val borderLeftColor: js.UndefOr[ResponsiveValue[BorderColor]] = js.undefined
}
object BorderLeftColorProps {
  
  inline def apply(): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftColorProps]
  }
  
  extension [Self <: BorderLeftColorProps](x: Self) {
    
    inline def setBorderLeftColor(value: ResponsiveValue[BorderColor]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    inline def setBorderLeftColorVarargs(value: BorderColor*): Self = StObject.set(x, "borderLeftColor", js.Array(value*))
  }
}
