package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Overflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowProps extends StObject {
  
  val overflow: js.UndefOr[ResponsiveValue[Overflow]] = js.undefined
}
object OverflowProps {
  
  inline def apply(): OverflowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps]
  }
  
  extension [Self <: OverflowProps](x: Self) {
    
    inline def setOverflow(value: ResponsiveValue[Overflow]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setOverflowVarargs(value: Overflow*): Self = StObject.set(x, "overflow", js.Array(value*))
  }
}
