package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryStyleInterface extends StObject {
  
  var data: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var labels: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var parent: js.UndefOr[VictoryStyleObject] = js.undefined
}
object VictoryStyleInterface {
  
  inline def apply(): VictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryStyleInterface]
  }
  
  extension [Self <: VictoryStyleInterface](x: Self) {
    
    inline def setData(value: VictoryStyleObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabels(value: VictoryStyleObject): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setParent(value: VictoryStyleObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
