package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskLog
  extends StObject
     with TaskLogReference {
  
  var createdOn: js.Date
  
  var indexLocation: String
  
  var lastChangedOn: js.Date
  
  var lineCount: Double
  
  var path: String
}
object TaskLog {
  
  inline def apply(
    createdOn: js.Date,
    id: Double,
    indexLocation: String,
    lastChangedOn: js.Date,
    lineCount: Double,
    location: String,
    path: String
  ): TaskLog = {
    val __obj = js.Dynamic.literal(createdOn = createdOn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexLocation = indexLocation.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskLog] (val x: Self) extends AnyVal {
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setIndexLocation(value: String): Self = StObject.set(x, "indexLocation", value.asInstanceOf[js.Any])
    
    inline def setLastChangedOn(value: js.Date): Self = StObject.set(x, "lastChangedOn", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
