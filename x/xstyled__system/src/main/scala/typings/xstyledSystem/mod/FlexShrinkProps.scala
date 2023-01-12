package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FlexShrink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexShrinkProps extends StObject {
  
  val flexShrink: js.UndefOr[ResponsiveValue[FlexShrink]] = js.undefined
}
object FlexShrinkProps {
  
  inline def apply(): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexShrinkProps] (val x: Self) extends AnyVal {
    
    inline def setFlexShrink(value: ResponsiveValue[FlexShrink]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    inline def setFlexShrinkVarargs(value: FlexShrink*): Self = StObject.set(x, "flexShrink", js.Array(value*))
  }
}
