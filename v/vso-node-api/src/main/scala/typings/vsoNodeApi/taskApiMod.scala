package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.taskAgentInterfacesMod.PlanGroupStatusFilter
import typings.vsoNodeApi.taskAgentInterfacesMod.TaskAttachment
import typings.vsoNodeApi.taskAgentInterfacesMod.TaskLog
import typings.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationPlan
import typings.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationQueuedPlanGroup
import typings.vsoNodeApi.taskAgentInterfacesMod.Timeline
import typings.vsoNodeApi.taskAgentInterfacesMod.TimelineRecord
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.VssJsonCollectionWrapperV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/TaskApi", JSImport.Namespace)
@js.native
object taskApiMod extends js.Object {
  @js.native
  trait ITaskApi extends ClientApiBase {
    def appendLogContent(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      logId: Double
    ): js.Promise[TaskLog] = js.native
    def appendTimelineRecordFeed(
      lines: VssJsonCollectionWrapperV[js.Array[String]],
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String
    ): js.Promise[Unit] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[TaskAttachment] = js.native
    def createLog(log: TaskLog, scopeIdentifier: String, hubName: String, planId: String): js.Promise[TaskLog] = js.native
    def createTimeline(timeline: Timeline, scopeIdentifier: String, hubName: String, planId: String): js.Promise[Timeline] = js.native
    def deleteTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[Unit] = js.native
    def getAttachment(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[TaskAttachment] = js.native
    def getAttachmentContent(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String,
      name: String
    ): js.Promise[ReadableStream] = js.native
    def getAttachments(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      recordId: String,
      `type`: String
    ): js.Promise[js.Array[TaskAttachment]] = js.native
    def getLog(scopeIdentifier: String, hubName: String, planId: String, logId: Double): js.Promise[js.Array[String]] = js.native
    def getLog(scopeIdentifier: String, hubName: String, planId: String, logId: Double, startLine: Double): js.Promise[js.Array[String]] = js.native
    def getLog(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      logId: Double,
      startLine: Double,
      endLine: Double
    ): js.Promise[js.Array[String]] = js.native
    def getLogs(scopeIdentifier: String, hubName: String, planId: String): js.Promise[js.Array[TaskLog]] = js.native
    def getPlan(scopeIdentifier: String, hubName: String, planId: String): js.Promise[TaskOrchestrationPlan] = js.native
    def getPlanAttachments(scopeIdentifier: String, hubName: String, planId: String, `type`: String): js.Promise[js.Array[TaskAttachment]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String, statusFilter: PlanGroupStatusFilter): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getQueuedPlanGroups(scopeIdentifier: String, hubName: String, statusFilter: PlanGroupStatusFilter, count: Double): js.Promise[js.Array[TaskOrchestrationQueuedPlanGroup]] = js.native
    def getRecords(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[js.Array[TimelineRecord]] = js.native
    def getRecords(scopeIdentifier: String, hubName: String, planId: String, timelineId: String, changeId: Double): js.Promise[js.Array[TimelineRecord]] = js.native
    def getTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String): js.Promise[Timeline] = js.native
    def getTimeline(scopeIdentifier: String, hubName: String, planId: String, timelineId: String, changeId: Double): js.Promise[Timeline] = js.native
    def getTimeline(
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String,
      changeId: Double,
      includeRecords: Boolean
    ): js.Promise[Timeline] = js.native
    def getTimelines(scopeIdentifier: String, hubName: String, planId: String): js.Promise[js.Array[Timeline]] = js.native
    def updateRecords(
      records: VssJsonCollectionWrapperV[js.Array[TimelineRecord]],
      scopeIdentifier: String,
      hubName: String,
      planId: String,
      timelineId: String
    ): js.Promise[js.Array[TimelineRecord]] = js.native
  }
  
  @js.native
  class TaskApi protected () extends ITaskApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

