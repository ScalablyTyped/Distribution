package typings.victoryCore.anon

import typings.victoryCore.libVictoryThemeTypesMod.VictoryLabelStyleObject
import typings.victoryCore.libVictoryThemeTypesMod.VictoryStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabels extends StObject {
  
  var data: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var labels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
}
object DataLabels {
  
  inline def apply(): DataLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataLabels] (val x: Self) extends AnyVal {
    
    inline def setData(value: VictoryStyleObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
