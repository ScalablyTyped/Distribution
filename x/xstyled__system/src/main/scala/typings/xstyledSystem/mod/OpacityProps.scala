package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProps extends StObject {
  
  val opacity: js.UndefOr[ResponsiveValue[Opacity]] = js.undefined
}
object OpacityProps {
  
  inline def apply(): OpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacityProps] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: ResponsiveValue[Opacity]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOpacityVarargs(value: Opacity*): Self = StObject.set(x, "opacity", js.Array(value*))
  }
}
