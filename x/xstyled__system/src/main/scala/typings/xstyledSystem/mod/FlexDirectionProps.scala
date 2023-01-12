package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FlexDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexDirectionProps extends StObject {
  
  val flexDirection: js.UndefOr[ResponsiveValue[FlexDirection]] = js.undefined
}
object FlexDirectionProps {
  
  inline def apply(): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexDirectionProps] (val x: Self) extends AnyVal {
    
    inline def setFlexDirection(value: ResponsiveValue[FlexDirection]): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    inline def setFlexDirectionVarargs(value: FlexDirection*): Self = StObject.set(x, "flexDirection", js.Array(value*))
  }
}
