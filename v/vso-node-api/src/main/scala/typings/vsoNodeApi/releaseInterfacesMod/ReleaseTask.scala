package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseTask extends StObject {
  
  var agentName: String = js.native
  
  var dateEnded: Date = js.native
  
  var dateStarted: Date = js.native
  
  var finishTime: Date = js.native
  
  var id: Double = js.native
  
  var issues: js.Array[Issue] = js.native
  
  var lineCount: Double = js.native
  
  var logUrl: String = js.native
  
  var name: String = js.native
  
  var percentComplete: Double = js.native
  
  var rank: Double = js.native
  
  var startTime: Date = js.native
  
  var status: TaskStatus = js.native
  
  var task: WorkflowTaskReference = js.native
  
  var timelineRecordId: String = js.native
}
object ReleaseTask {
  
  @scala.inline
  def apply(
    agentName: String,
    dateEnded: Date,
    dateStarted: Date,
    finishTime: Date,
    id: Double,
    issues: js.Array[Issue],
    lineCount: Double,
    logUrl: String,
    name: String,
    percentComplete: Double,
    rank: Double,
    startTime: Date,
    status: TaskStatus,
    task: WorkflowTaskReference,
    timelineRecordId: String
  ): ReleaseTask = {
    val __obj = js.Dynamic.literal(agentName = agentName.asInstanceOf[js.Any], dateEnded = dateEnded.asInstanceOf[js.Any], dateStarted = dateStarted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], logUrl = logUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTask]
  }
  
  @scala.inline
  implicit class ReleaseTaskMutableBuilder[Self <: ReleaseTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentName(value: String): Self = StObject.set(x, "agentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateEnded(value: Date): Self = StObject.set(x, "dateEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateStarted(value: Date): Self = StObject.set(x, "dateStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUrl(value: String): Self = StObject.set(x, "logUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: WorkflowTaskReference): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineRecordId(value: String): Self = StObject.set(x, "timelineRecordId", value.asInstanceOf[js.Any])
  }
}
