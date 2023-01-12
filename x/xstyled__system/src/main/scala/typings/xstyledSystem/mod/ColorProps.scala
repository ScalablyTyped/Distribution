package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorProps extends StObject {
  
  // Clash with HTMLAttributes interface declared in React module
  // that includes a non-standard HTML attribute `color?: string`.
  // Type here should be `ResponsiveValue<CSS.Property.Color>`.
  val color: js.UndefOr[Any] = js.undefined
}
object ColorProps {
  
  inline def apply(): ColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorProps] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
