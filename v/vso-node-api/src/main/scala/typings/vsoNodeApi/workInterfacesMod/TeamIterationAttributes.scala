package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamIterationAttributes extends StObject {
  
  var finishDate: Date
  
  var startDate: Date
  
  var timeFrame: TimeFrame
}
object TeamIterationAttributes {
  
  @scala.inline
  def apply(finishDate: Date, startDate: Date, timeFrame: TimeFrame): TeamIterationAttributes = {
    val __obj = js.Dynamic.literal(finishDate = finishDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], timeFrame = timeFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamIterationAttributes]
  }
  
  @scala.inline
  implicit class TeamIterationAttributesMutableBuilder[Self <: TeamIterationAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishDate(value: Date): Self = StObject.set(x, "finishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFrame(value: TimeFrame): Self = StObject.set(x, "timeFrame", value.asInstanceOf[js.Any])
  }
}
