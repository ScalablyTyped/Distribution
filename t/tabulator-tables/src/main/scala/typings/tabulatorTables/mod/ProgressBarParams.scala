package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tabulatorTables.mod._FormatterParams because Already inherited */ trait ProgressBarParams
  extends StObject
     with TrafficParams {
  
  // Progress Bar
  var legend: js.UndefOr[String | `true` | ValueStringCallback] = js.undefined
  
  var legendAlign: js.UndefOr[Align] = js.undefined
  
  var legendColor: js.UndefOr[Color] = js.undefined
}
object ProgressBarParams {
  
  inline def apply(): ProgressBarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressBarParams] (val x: Self) extends AnyVal {
    
    inline def setLegend(value: String | `true` | ValueStringCallback): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendAlign(value: Align): Self = StObject.set(x, "legendAlign", value.asInstanceOf[js.Any])
    
    inline def setLegendAlignUndefined: Self = StObject.set(x, "legendAlign", js.undefined)
    
    inline def setLegendColor(value: Color): Self = StObject.set(x, "legendColor", value.asInstanceOf[js.Any])
    
    inline def setLegendColorFunction1(value: /* value */ Any => String): Self = StObject.set(x, "legendColor", js.Any.fromFunction1(value))
    
    inline def setLegendColorUndefined: Self = StObject.set(x, "legendColor", js.undefined)
    
    inline def setLegendColorVarargs(value: Any*): Self = StObject.set(x, "legendColor", js.Array(value*))
    
    inline def setLegendFunction1(value: /* value */ Any => String): Self = StObject.set(x, "legend", js.Any.fromFunction1(value))
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
  }
}
