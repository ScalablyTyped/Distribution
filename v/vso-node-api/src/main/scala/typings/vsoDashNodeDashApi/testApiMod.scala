package typings.vsoDashNodeDashApi

import typings.node.NodeJS.ReadableStream
import typings.std.Date
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.AggregatedDataForResultTrend
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.BuildCoverage
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.BuildReference
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CloneOperationInformation
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CodeCoverageData
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CodeCoverageSummary
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldDefinition
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.LinkedWorkItemsQuery
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.LinkedWorkItemsQueryResult
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.PlanUpdateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.PointUpdateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ReleaseReference
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultDetails
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultRetentionSettings
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultsFilter
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.RunCreateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.RunUpdateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.SuiteCreateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.SuiteEntry
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.SuiteEntryUpdateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.SuiteTestCase
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.SuiteUpdateModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestActionResultModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestAttachment
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestAttachmentReference
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestAttachmentRequestModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestCaseResult
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestConfiguration
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestIterationDetailsModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestMessageLogDetails
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestOutcome
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestPlan
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestPlanCloneRequest
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestPoint
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestPointsQuery
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultDocument
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultHistory
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultParameterModel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultSummary
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultTrendFilter
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsContext
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsDetails
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsGroupsForBuild
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsGroupsForRelease
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsQuery
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRun
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunCoverage
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunPublishContext
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunState
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestRunStatistic
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSession
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSessionSource
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSettings
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSuite
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSuiteCloneRequest
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestSummaryForWorkItem
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestToWorkItemLinks
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestVariable
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.WorkItemReference
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.WorkItemToTestLinks
import typings.vsoDashNodeDashApi.testApiMod.ITestApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/TestApi", JSImport.Namespace)
@js.native
object testApiMod extends js.Object {
  @js.native
  trait ITestApi extends ClientApiBase {
    def addCustomFields(newFields: js.Array[CustomTestFieldDefinition], project: String): js.Promise[js.Array[CustomTestFieldDefinition]] = js.native
    def addTestCasesToSuite(project: String, planId: Double, suiteId: Double, testCaseIds: String): js.Promise[js.Array[SuiteTestCase]] = js.native
    def addTestResultsToTestRun(results: js.Array[TestCaseResult], project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def addWorkItemToTestLinks(workItemToTestLinks: WorkItemToTestLinks, project: String): js.Promise[WorkItemToTestLinks] = js.native
    def cloneTestPlan(cloneRequestBody: TestPlanCloneRequest, project: String, planId: Double): js.Promise[CloneOperationInformation] = js.native
    def cloneTestSuite(cloneRequestBody: TestSuiteCloneRequest, project: String, planId: Double, sourceSuiteId: Double): js.Promise[CloneOperationInformation] = js.native
    def createTestConfiguration(testConfiguration: TestConfiguration, project: String): js.Promise[TestConfiguration] = js.native
    def createTestIterationResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double
    ): js.Promise[TestAttachmentReference] = js.native
    def createTestIterationResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double,
      actionPath: String
    ): js.Promise[TestAttachmentReference] = js.native
    def createTestPlan(testPlan: PlanUpdateModel, project: String): js.Promise[TestPlan] = js.native
    def createTestResultAttachment(
      attachmentRequestModel: TestAttachmentRequestModel,
      project: String,
      runId: Double,
      testCaseResultId: Double
    ): js.Promise[TestAttachmentReference] = js.native
    def createTestRun(testRun: RunCreateModel, project: String): js.Promise[TestRun] = js.native
    def createTestRunAttachment(attachmentRequestModel: TestAttachmentRequestModel, project: String, runId: Double): js.Promise[TestAttachmentReference] = js.native
    def createTestSession(testSession: TestSession, teamContext: TeamContext): js.Promise[TestSession] = js.native
    def createTestSettings(testSettings: TestSettings, project: String): js.Promise[Double] = js.native
    def createTestSuite(testSuite: SuiteCreateModel, project: String, planId: Double, suiteId: Double): js.Promise[js.Array[TestSuite]] = js.native
    def createTestVariable(testVariable: TestVariable, project: String): js.Promise[TestVariable] = js.native
    def deleteSharedParameter(project: String, sharedParameterId: Double): js.Promise[Unit] = js.native
    def deleteSharedStep(project: String, sharedStepId: Double): js.Promise[Unit] = js.native
    def deleteTestCase(project: String, testCaseId: Double): js.Promise[Unit] = js.native
    def deleteTestConfiguration(project: String, testConfigurationId: Double): js.Promise[Unit] = js.native
    def deleteTestMethodToWorkItemLink(project: String, testName: String, workItemId: Double): js.Promise[Boolean] = js.native
    def deleteTestPlan(project: String, planId: Double): js.Promise[Unit] = js.native
    def deleteTestRun(project: String, runId: Double): js.Promise[Unit] = js.native
    def deleteTestSettings(project: String, testSettingsId: Double): js.Promise[Unit] = js.native
    def deleteTestSuite(project: String, planId: Double, suiteId: Double): js.Promise[Unit] = js.native
    def deleteTestVariable(project: String, testVariableId: Double): js.Promise[Unit] = js.native
    def getActionResults(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[js.Array[TestActionResultModel]] = js.native
    def getActionResults(project: String, runId: Double, testCaseResultId: Double, iterationId: Double, actionPath: String): js.Promise[js.Array[TestActionResultModel]] = js.native
    def getBugsLinkedToTestResult(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[WorkItemReference]] = js.native
    def getBuildCodeCoverage(project: String, buildId: Double, flags: Double): js.Promise[js.Array[BuildCoverage]] = js.native
    def getCloneInformation(project: String, cloneOperationId: Double): js.Promise[CloneOperationInformation] = js.native
    def getCloneInformation(project: String, cloneOperationId: Double, includeDetails: Boolean): js.Promise[CloneOperationInformation] = js.native
    def getCodeCoverageSummary(project: String, buildId: Double): js.Promise[CodeCoverageSummary] = js.native
    def getCodeCoverageSummary(project: String, buildId: Double, deltaBuildId: Double): js.Promise[CodeCoverageSummary] = js.native
    def getLinkedWorkItemsByQuery(workItemQuery: LinkedWorkItemsQuery, project: String): js.Promise[js.Array[LinkedWorkItemsQueryResult]] = js.native
    def getPlanById(project: String, planId: Double): js.Promise[TestPlan] = js.native
    def getPlans(project: String): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double, top: Double, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPoint(project: String, planId: Double, suiteId: Double, pointIds: Double): js.Promise[TestPoint] = js.native
    def getPoint(project: String, planId: Double, suiteId: Double, pointIds: Double, witFields: String): js.Promise[TestPoint] = js.native
    def getPoints(
      project: String,
      planId: Double,
      suiteId: Double,
      witFields: js.UndefOr[String],
      configurationId: js.UndefOr[String],
      testCaseId: js.UndefOr[String],
      testPointIds: js.UndefOr[String],
      includePointDetails: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double]
    ): js.Promise[js.Array[TestPoint]] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String): js.Promise[TestPointsQuery] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: Double): js.Promise[TestPointsQuery] = js.native
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: Double, top: Double): js.Promise[TestPointsQuery] = js.native
    def getResultGroupsByBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultsGroupsForBuild] = js.native
    def getResultGroupsByBuild(project: String, buildId: Double, publishContext: String, fields: js.Array[String]): js.Promise[TestResultsGroupsForBuild] = js.native
    def getResultGroupsByRelease(project: String, releaseId: Double, publishContext: String): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultGroupsByRelease(project: String, releaseId: Double, publishContext: String, releaseEnvId: Double): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultGroupsByRelease(
      project: String,
      releaseId: Double,
      publishContext: String,
      releaseEnvId: Double,
      fields: js.Array[String]
    ): js.Promise[TestResultsGroupsForRelease] = js.native
    def getResultParameters(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[js.Array[TestResultParameterModel]] = js.native
    def getResultParameters(project: String, runId: Double, testCaseResultId: Double, iterationId: Double, paramName: String): js.Promise[js.Array[TestResultParameterModel]] = js.native
    def getResultRetentionSettings(project: String): js.Promise[ResultRetentionSettings] = js.native
    def getSuiteEntries(project: String, suiteId: Double): js.Promise[js.Array[SuiteEntry]] = js.native
    def getSuitesByTestCaseId(testCaseId: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestCaseById(project: String, planId: Double, suiteId: Double, testCaseIds: Double): js.Promise[SuiteTestCase] = js.native
    def getTestCases(project: String, planId: Double, suiteId: Double): js.Promise[js.Array[SuiteTestCase]] = js.native
    def getTestConfigurationById(project: String, testConfigurationId: Double): js.Promise[TestConfiguration] = js.native
    def getTestConfigurations(project: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Double, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(
      project: String,
      skip: Double,
      top: Double,
      continuationToken: String,
      includeAllProperties: Boolean
    ): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestIteration(project: String, runId: Double, testCaseResultId: Double, iterationId: Double): js.Promise[TestIterationDetailsModel] = js.native
    def getTestIteration(
      project: String,
      runId: Double,
      testCaseResultId: Double,
      iterationId: Double,
      includeActionResults: Boolean
    ): js.Promise[TestIterationDetailsModel] = js.native
    def getTestIterations(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[TestIterationDetailsModel]] = js.native
    def getTestIterations(project: String, runId: Double, testCaseResultId: Double, includeActionResults: Boolean): js.Promise[js.Array[TestIterationDetailsModel]] = js.native
    def getTestResultAttachmentContent(project: String, runId: Double, testCaseResultId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    def getTestResultAttachmentZip(project: String, runId: Double, testCaseResultId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    def getTestResultAttachments(project: String, runId: Double, testCaseResultId: Double): js.Promise[js.Array[TestAttachment]] = js.native
    def getTestResultById(project: String, runId: Double, testCaseResultId: Double): js.Promise[TestCaseResult] = js.native
    def getTestResultById(project: String, runId: Double, testCaseResultId: Double, detailsToInclude: ResultDetails): js.Promise[TestCaseResult] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String, groupBy: String, filter: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResults(project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails, skip: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails, skip: Double, top: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Double,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResultsByQuery(query: TestResultsQuery, project: String): js.Promise[TestResultsQuery] = js.native
    def getTestRunAttachmentContent(project: String, runId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    def getTestRunAttachmentZip(project: String, runId: Double, attachmentId: Double): js.Promise[ReadableStream] = js.native
    def getTestRunAttachments(project: String, runId: Double): js.Promise[js.Array[TestAttachment]] = js.native
    def getTestRunById(project: String, runId: Double): js.Promise[TestRun] = js.native
    def getTestRunCodeCoverage(project: String, runId: Double, flags: Double): js.Promise[js.Array[TestRunCoverage]] = js.native
    def getTestRunLogs(project: String, runId: Double): js.Promise[js.Array[TestMessageLogDetails]] = js.native
    def getTestRunStatistics(project: String, runId: Double): js.Promise[TestRunStatistic] = js.native
    def getTestRuns(
      project: String,
      buildUri: js.UndefOr[String],
      owner: js.UndefOr[String],
      tmiRunId: js.UndefOr[String],
      planId: js.UndefOr[Double],
      includeRunDetails: js.UndefOr[Boolean],
      automated: js.UndefOr[Boolean],
      skip: js.UndefOr[Double],
      top: js.UndefOr[Double]
    ): js.Promise[js.Array[TestRun]] = js.native
    def getTestSessions(teamContext: TeamContext): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double, allSessions: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double, allSessions: Boolean, includeAllProperties: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSettingsById(project: String, testSettingsId: Double): js.Promise[TestSettings] = js.native
    def getTestSuiteById(project: String, planId: Double, suiteId: Double): js.Promise[TestSuite] = js.native
    def getTestSuiteById(project: String, planId: Double, suiteId: Double, includeChildSuites: Boolean): js.Promise[TestSuite] = js.native
    def getTestSuitesForPlan(project: String, planId: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean, skip: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean, skip: Double, top: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Double,
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestVariableById(project: String, testVariableId: Double): js.Promise[TestVariable] = js.native
    def getTestVariables(project: String): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double, top: Double): js.Promise[js.Array[TestVariable]] = js.native
    def publishTestResultDocument(document: TestResultDocument, project: String, runId: Double): js.Promise[TestResultDocument] = js.native
    def queryCustomFields(project: String, scopeFilter: CustomTestFieldScope): js.Promise[js.Array[CustomTestFieldDefinition]] = js.native
    def queryResultTrendForBuild(filter: TestResultTrendFilter, project: String): js.Promise[js.Array[AggregatedDataForResultTrend]] = js.native
    def queryResultTrendForRelease(filter: TestResultTrendFilter, project: String): js.Promise[js.Array[AggregatedDataForResultTrend]] = js.native
    def queryTestMethodLinkedWorkItems(project: String, testName: String): js.Promise[TestToWorkItemLinks] = js.native
    def queryTestResultHistory(filter: ResultsFilter, project: String): js.Promise[TestResultHistory] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String, automatedTestName: String): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String, automatedTestName: String, testCaseId: Double): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double, publishContext: String): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double, publishContext: String, includeFailureDetails: Boolean): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      includeFailureDetails: Boolean,
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(project: String, releaseId: Double, releaseEnvId: Double): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: String): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: Boolean
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: Boolean,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsSummaryForReleases(releases: js.Array[ReleaseReference], project: String): js.Promise[js.Array[TestResultSummary]] = js.native
    def queryTestRuns(
      project: String,
      minLastUpdatedDate: Date,
      maxLastUpdatedDate: Date,
      state: js.UndefOr[TestRunState],
      planIds: js.UndefOr[js.Array[Double]],
      isAutomated: js.UndefOr[Boolean],
      publishContext: js.UndefOr[TestRunPublishContext],
      buildIds: js.UndefOr[js.Array[Double]],
      buildDefIds: js.UndefOr[js.Array[Double]],
      branchName: js.UndefOr[String],
      releaseIds: js.UndefOr[js.Array[Double]],
      releaseDefIds: js.UndefOr[js.Array[Double]],
      releaseEnvIds: js.UndefOr[js.Array[Double]],
      releaseEnvDefIds: js.UndefOr[js.Array[Double]],
      runTitle: js.UndefOr[String],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String]
    ): js.Promise[js.Array[TestRun]] = js.native
    def queryTestSummaryByRequirement(resultsContext: TestResultsContext, project: String): js.Promise[js.Array[TestSummaryForWorkItem]] = js.native
    def queryTestSummaryByRequirement(resultsContext: TestResultsContext, project: String, workItemIds: js.Array[Double]): js.Promise[js.Array[TestSummaryForWorkItem]] = js.native
    def removeTestCasesFromSuiteUrl(project: String, planId: Double, suiteId: Double, testCaseIds: String): js.Promise[Unit] = js.native
    def reorderSuiteEntries(suiteEntries: js.Array[SuiteEntryUpdateModel], project: String, suiteId: Double): js.Promise[js.Array[SuiteEntry]] = js.native
    def updateCodeCoverageSummary(coverageData: CodeCoverageData, project: String, buildId: Double): js.Promise[Unit] = js.native
    def updateResultRetentionSettings(retentionSettings: ResultRetentionSettings, project: String): js.Promise[ResultRetentionSettings] = js.native
    def updateTestConfiguration(testConfiguration: TestConfiguration, project: String, testConfigurationId: Double): js.Promise[TestConfiguration] = js.native
    def updateTestPlan(planUpdateModel: PlanUpdateModel, project: String, planId: Double): js.Promise[TestPlan] = js.native
    def updateTestPoints(
      pointUpdateModel: PointUpdateModel,
      project: String,
      planId: Double,
      suiteId: Double,
      pointIds: String
    ): js.Promise[js.Array[TestPoint]] = js.native
    def updateTestResults(results: js.Array[TestCaseResult], project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def updateTestRun(runUpdateModel: RunUpdateModel, project: String, runId: Double): js.Promise[TestRun] = js.native
    def updateTestSession(testSession: TestSession, teamContext: TeamContext): js.Promise[TestSession] = js.native
    def updateTestSuite(suiteUpdateModel: SuiteUpdateModel, project: String, planId: Double, suiteId: Double): js.Promise[TestSuite] = js.native
    def updateTestVariable(testVariable: TestVariable, project: String, testVariableId: Double): js.Promise[TestVariable] = js.native
  }
  
  @js.native
  class TestApi protected () extends ITestApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

