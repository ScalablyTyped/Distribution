package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridAreaProps extends StObject {
  
  // Number allowed here but is converted into px value, which is invalid.
  // readonly gridArea?: ResponsiveValue<CSS.Property.GridArea>;
  val gridArea: js.UndefOr[ResponsiveValue[String]] = js.undefined
}
object GridAreaProps {
  
  @scala.inline
  def apply(): GridAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps]
  }
  
  @scala.inline
  implicit class GridAreaPropsMutableBuilder[Self <: GridAreaProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridArea(value: ResponsiveValue[String]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    @scala.inline
    def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value :_*))
  }
}
