package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorProps extends StObject {
  
  // Clash with HTMLAttributes interface declared in React module
  // that includes a non-standard HTML attribute `color?: string`.
  // Type here should be `ResponsiveValue<CSS.Property.Color>`.
  val color: js.UndefOr[js.Any] = js.native
}
object ColorProps {
  
  @scala.inline
  def apply(): ColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps]
  }
  
  @scala.inline
  implicit class ColorPropsMutableBuilder[Self <: ColorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
