package typings.victoryCore.anon

import typings.victoryCore.libVictoryThemeTypesMod.VictoryLabelStyleObject
import typings.victoryCore.libVictoryThemeTypesMod.VictoryStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var data: js.UndefOr[VictoryStyleObjecttypestr] = js.undefined
  
  var labels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var title: js.UndefOr[VictoryLabelStyleObject] = js.undefined
}
object Border {
  
  inline def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: VictoryStyleObject): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setData(value: VictoryStyleObjecttypestr): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setTitle(value: VictoryLabelStyleObject): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
