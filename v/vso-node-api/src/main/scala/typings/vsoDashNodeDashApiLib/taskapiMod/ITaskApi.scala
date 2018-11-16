package typings
package vsoDashNodeDashApiLib.taskapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITaskApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def appendLogContent(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    logId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskLog] = js.native
  def appendTimelineRecordFeed(
    lines: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[js.Array[java.lang.String]],
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    recordId: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    recordId: java.lang.String,
    `type`: java.lang.String,
    name: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAttachment] = js.native
  def createLog(
    log: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskLog,
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskLog] = js.native
  def createTimeline(
    timeline: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline,
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline] = js.native
  def deleteTimeline(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def getAttachment(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    recordId: java.lang.String,
    `type`: java.lang.String,
    name: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAttachment] = js.native
  def getAttachmentContent(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    recordId: java.lang.String,
    `type`: java.lang.String,
    name: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachments(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    recordId: java.lang.String,
    `type`: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAttachment]] = js.native
  def getLog(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    logId: scala.Double
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getLog(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    logId: scala.Double,
    startLine: scala.Double
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getLog(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    logId: scala.Double,
    startLine: scala.Double,
    endLine: scala.Double
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getLogs(scopeIdentifier: java.lang.String, hubName: java.lang.String, planId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskLog]] = js.native
  def getPlan(scopeIdentifier: java.lang.String, hubName: java.lang.String, planId: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationPlan] = js.native
  def getPlanAttachments(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    `type`: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskAttachment]] = js.native
  def getQueuedPlanGroups(scopeIdentifier: java.lang.String, hubName: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationQueuedPlanGroup
    ]
  ] = js.native
  def getQueuedPlanGroups(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    statusFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationQueuedPlanGroup
    ]
  ] = js.native
  def getQueuedPlanGroups(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    statusFilter: vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.PlanGroupStatusFilter,
    count: scala.Double
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationQueuedPlanGroup
    ]
  ] = js.native
  def getRecords(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecord]] = js.native
  def getRecords(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    changeId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecord]] = js.native
  def getTimeline(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline] = js.native
  def getTimeline(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    changeId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline] = js.native
  def getTimeline(
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String,
    changeId: scala.Double,
    includeRecords: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline] = js.native
  def getTimelines(scopeIdentifier: java.lang.String, hubName: java.lang.String, planId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.Timeline]] = js.native
  def updateRecords(
    records: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecord]],
    scopeIdentifier: java.lang.String,
    hubName: java.lang.String,
    planId: java.lang.String,
    timelineId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecord]] = js.native
}

