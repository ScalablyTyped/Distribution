package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderStyleProps extends StObject {
  
  val borderStyle: js.UndefOr[ResponsiveValue[BorderStyle | Double]] = js.undefined
}
object BorderStyleProps {
  
  inline def apply(): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderStyleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderStyleProps] (val x: Self) extends AnyVal {
    
    inline def setBorderStyle(value: ResponsiveValue[BorderStyle | Double]): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    inline def setBorderStyleVarargs(value: (BorderStyle | Double)*): Self = StObject.set(x, "borderStyle", js.Array(value*))
  }
}
