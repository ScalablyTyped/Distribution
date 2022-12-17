package typings.styledSystem.mod

import typings.csstype.mod.Property.GridTemplateAreas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateAreasProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreas, ThemeType]] = js.undefined
}
object GridTemplateAreasProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridTemplateAreasProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps[ThemeType]]
  }
  
  extension [Self <: GridTemplateAreasProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */](x: Self & GridTemplateAreasProps[ThemeType]) {
    
    inline def setGridTemplateAreas(value: ResponsiveValue[GridTemplateAreas, ThemeType]): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateAreasNull: Self = StObject.set(x, "gridTemplateAreas", null)
    
    inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    inline def setGridTemplateAreasVarargs(value: (GridTemplateAreas | Null)*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
  }
}
