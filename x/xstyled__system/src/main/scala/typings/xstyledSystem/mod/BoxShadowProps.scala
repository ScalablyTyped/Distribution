package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BoxShadow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxShadowProps extends StObject {
  
  val boxShadow: js.UndefOr[ResponsiveValue[BoxShadow | Double]] = js.undefined
}
object BoxShadowProps {
  
  inline def apply(): BoxShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps]
  }
  
  extension [Self <: BoxShadowProps](x: Self) {
    
    inline def setBoxShadow(value: ResponsiveValue[BoxShadow | Double]): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    inline def setBoxShadowVarargs(value: (BoxShadow | Double)*): Self = StObject.set(x, "boxShadow", js.Array(value*))
  }
}
