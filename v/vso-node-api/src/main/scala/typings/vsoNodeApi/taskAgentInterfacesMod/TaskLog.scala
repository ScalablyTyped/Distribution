package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskLog
  extends StObject
     with TaskLogReference {
  
  var createdOn: Date
  
  var indexLocation: String
  
  var lastChangedOn: Date
  
  var lineCount: Double
  
  var path: String
}
object TaskLog {
  
  @scala.inline
  def apply(
    createdOn: Date,
    id: Double,
    indexLocation: String,
    lastChangedOn: Date,
    lineCount: Double,
    location: String,
    path: String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexLocation = indexLocation.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLog]
  }
  
  @scala.inline
  implicit class TaskLogMutableBuilder[Self <: TaskLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedOn(value: Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexLocation(value: String): Self = StObject.set(x, "indexLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChangedOn(value: Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
