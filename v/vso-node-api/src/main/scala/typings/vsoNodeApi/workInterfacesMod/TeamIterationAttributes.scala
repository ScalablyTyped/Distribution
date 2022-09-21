package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamIterationAttributes extends StObject {
  
  var finishDate: js.Date
  
  var startDate: js.Date
  
  var timeFrame: TimeFrame
}
object TeamIterationAttributes {
  
  inline def apply(finishDate: js.Date, startDate: js.Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamIterationAttributes]
  }
  
  extension [Self <: TeamIterationAttributes](x: Self) {
    
    inline def setFinishDate(value: js.Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setTimeFrame(value: TimeFrame): Self = StObject.set(x, "timeFrame", value.asInstanceOf[js.Any])
  }
}
