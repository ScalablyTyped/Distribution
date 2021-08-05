package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineRecord extends StObject {
  
  var changeId: Double
  
  var currentOperation: String
  
  var details: TimelineReference
  
  var errorCount: Double
  
  var finishTime: Date
  
  var id: String
  
  var issues: js.Array[Issue]
  
  var lastModified: Date
  
  var location: String
  
  var log: TaskLogReference
  
  var name: String
  
  var order: Double
  
  var parentId: String
  
  var percentComplete: Double
  
  var result: TaskResult
  
  var resultCode: String
  
  var startTime: Date
  
  var state: TimelineRecordState
  
  var task: TaskReference
  
  var `type`: String
  
  var warningCount: Double
  
  var workerName: String
}
object TimelineRecord {
  
  inline def apply(
    changeId: Double,
    currentOperation: String,
    details: TimelineReference,
    errorCount: Double,
    finishTime: Date,
    id: String,
    issues: js.Array[Issue],
    lastModified: Date,
    location: String,
    log: TaskLogReference,
    name: String,
    order: Double,
    parentId: String,
    percentComplete: Double,
    result: TaskResult,
    resultCode: String,
    startTime: Date,
    state: TimelineRecordState,
    task: TaskReference,
    `type`: String,
    warningCount: Double,
    workerName: String
  ): TimelineRecord = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], currentOperation = currentOperation.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any], workerName = workerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecord]
  }
  
  extension [Self <: TimelineRecord](x: Self) {
    
    inline def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setCurrentOperation(value: String): Self = StObject.set(x, "currentOperation", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: TimelineReference): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setFinishTime(value: Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    inline def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLog(value: TaskLogReference): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setState(value: TimelineRecordState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTask(value: TaskReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
  }
}
