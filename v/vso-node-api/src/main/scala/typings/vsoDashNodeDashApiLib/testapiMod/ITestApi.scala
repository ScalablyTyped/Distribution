package typings
package vsoDashNodeDashApiLib.testapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def addCustomFields(
    newFields: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldDefinition],
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldDefinition]
  ] = js.native
  def addTestCasesToSuite(
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    testCaseIds: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteTestCase]] = js.native
  def addTestResultsToTestRun(
    results: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult],
    project: java.lang.String,
    runId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def addWorkItemToTestLinks(
    workItemToTestLinks: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemToTestLinks,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemToTestLinks] = js.native
  def cloneTestPlan(
    cloneRequestBody: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlanCloneRequest,
    project: java.lang.String,
    planId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationInformation] = js.native
  def cloneTestSuite(
    cloneRequestBody: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuiteCloneRequest,
    project: java.lang.String,
    planId: scala.Double,
    sourceSuiteId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationInformation] = js.native
  def createTestConfiguration(
    testConfiguration: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration] = js.native
  def createTestIterationResultAttachment(
    attachmentRequestModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentRequestModel,
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentReference] = js.native
  def createTestIterationResultAttachment(
    attachmentRequestModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentRequestModel,
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double,
    actionPath: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentReference] = js.native
  def createTestPlan(
    testPlan: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.PlanUpdateModel,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan] = js.native
  def createTestResultAttachment(
    attachmentRequestModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentRequestModel,
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentReference] = js.native
  def createTestRun(
    testRun: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.RunCreateModel,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRun] = js.native
  def createTestRunAttachment(
    attachmentRequestModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentRequestModel,
    project: java.lang.String,
    runId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachmentReference] = js.native
  def createTestSession(
    testSession: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession] = js.native
  def createTestSettings(
    testSettings: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSettings,
    project: java.lang.String
  ): stdLib.Promise[scala.Double] = js.native
  def createTestSuite(
    testSuite: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteCreateModel,
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def createTestVariable(
    testVariable: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable] = js.native
  def deleteSharedParameter(project: java.lang.String, sharedParameterId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteSharedStep(project: java.lang.String, sharedStepId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestCase(project: java.lang.String, testCaseId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestConfiguration(project: java.lang.String, testConfigurationId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestMethodToWorkItemLink(project: java.lang.String, testName: java.lang.String, workItemId: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def deleteTestPlan(project: java.lang.String, planId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestRun(project: java.lang.String, runId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestSettings(project: java.lang.String, testSettingsId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestSuite(project: java.lang.String, planId: scala.Double, suiteId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteTestVariable(project: java.lang.String, testVariableId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def getActionResults(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestActionResultModel]
  ] = js.native
  def getActionResults(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double,
    actionPath: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestActionResultModel]
  ] = js.native
  def getBugsLinkedToTestResult(project: java.lang.String, runId: scala.Double, testCaseResultId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def getBuildCodeCoverage(project: java.lang.String, buildId: scala.Double, flags: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.BuildCoverage]] = js.native
  def getCloneInformation(project: java.lang.String, cloneOperationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationInformation] = js.native
  def getCloneInformation(project: java.lang.String, cloneOperationId: scala.Double, includeDetails: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CloneOperationInformation] = js.native
  def getCodeCoverageSummary(project: java.lang.String, buildId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CodeCoverageSummary] = js.native
  def getCodeCoverageSummary(project: java.lang.String, buildId: scala.Double, deltaBuildId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CodeCoverageSummary] = js.native
  def getLinkedWorkItemsByQuery(
    workItemQuery: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.LinkedWorkItemsQuery,
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.LinkedWorkItemsQueryResult]
  ] = js.native
  def getPlanById(project: java.lang.String, planId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan] = js.native
  def getPlans(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPlans(project: java.lang.String, owner: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPlans(project: java.lang.String, owner: java.lang.String, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPlans(project: java.lang.String, owner: java.lang.String, skip: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPlans(
    project: java.lang.String,
    owner: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    includePlanDetails: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPlans(
    project: java.lang.String,
    owner: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    includePlanDetails: scala.Boolean,
    filterActivePlans: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan]] = js.native
  def getPoint(project: java.lang.String, planId: scala.Double, suiteId: scala.Double, pointIds: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPoint] = js.native
  def getPoint(
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    pointIds: scala.Double,
    witFields: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPoint] = js.native
  def getPoints(
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    witFields: js.UndefOr[java.lang.String],
    configurationId: js.UndefOr[java.lang.String],
    testCaseId: js.UndefOr[java.lang.String],
    testPointIds: js.UndefOr[java.lang.String],
    includePointDetails: js.UndefOr[scala.Boolean],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPoint]] = js.native
  def getPointsByQuery(
    query: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery] = js.native
  def getPointsByQuery(
    query: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery,
    project: java.lang.String,
    skip: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery] = js.native
  def getPointsByQuery(
    query: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery,
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPointsQuery] = js.native
  def getResultGroupsByBuild(project: java.lang.String, buildId: scala.Double, publishContext: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsGroupsForBuild] = js.native
  def getResultGroupsByBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    fields: js.Array[java.lang.String]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsGroupsForBuild] = js.native
  def getResultGroupsByRelease(project: java.lang.String, releaseId: scala.Double, publishContext: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsGroupsForRelease] = js.native
  def getResultGroupsByRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    publishContext: java.lang.String,
    releaseEnvId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsGroupsForRelease] = js.native
  def getResultGroupsByRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    publishContext: java.lang.String,
    releaseEnvId: scala.Double,
    fields: js.Array[java.lang.String]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsGroupsForRelease] = js.native
  def getResultParameters(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultParameterModel]
  ] = js.native
  def getResultParameters(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double,
    paramName: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultParameterModel]
  ] = js.native
  def getResultRetentionSettings(project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultRetentionSettings] = js.native
  def getSuiteEntries(project: java.lang.String, suiteId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteEntry]] = js.native
  def getSuitesByTestCaseId(testCaseId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestCaseById(project: java.lang.String, planId: scala.Double, suiteId: scala.Double, testCaseIds: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteTestCase] = js.native
  def getTestCases(project: java.lang.String, planId: scala.Double, suiteId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteTestCase]] = js.native
  def getTestConfigurationById(project: java.lang.String, testConfigurationId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration] = js.native
  def getTestConfigurations(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration]] = js.native
  def getTestConfigurations(project: java.lang.String, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration]] = js.native
  def getTestConfigurations(project: java.lang.String, skip: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration]] = js.native
  def getTestConfigurations(
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    continuationToken: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration]] = js.native
  def getTestConfigurations(
    project: java.lang.String,
    skip: scala.Double,
    top: scala.Double,
    continuationToken: java.lang.String,
    includeAllProperties: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration]] = js.native
  def getTestIteration(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestIterationDetailsModel] = js.native
  def getTestIteration(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    iterationId: scala.Double,
    includeActionResults: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestIterationDetailsModel] = js.native
  def getTestIterations(project: java.lang.String, runId: scala.Double, testCaseResultId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestIterationDetailsModel]
  ] = js.native
  def getTestIterations(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    includeActionResults: scala.Boolean
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestIterationDetailsModel]
  ] = js.native
  def getTestResultAttachmentContent(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    attachmentId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTestResultAttachmentZip(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    attachmentId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTestResultAttachments(project: java.lang.String, runId: scala.Double, testCaseResultId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachment]] = js.native
  def getTestResultById(project: java.lang.String, runId: scala.Double, testCaseResultId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult] = js.native
  def getTestResultById(
    project: java.lang.String,
    runId: scala.Double,
    testCaseResultId: scala.Double,
    detailsToInclude: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult] = js.native
  def getTestResultDetailsForBuild(project: java.lang.String, buildId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForBuild(project: java.lang.String, buildId: scala.Double, publishContext: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String,
    filter: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String,
    filter: java.lang.String,
    orderby: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForRelease(project: java.lang.String, releaseId: scala.Double, releaseEnvId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String,
    filter: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResultDetailsForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String,
    groupBy: java.lang.String,
    filter: java.lang.String,
    orderby: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsDetails] = js.native
  def getTestResults(project: java.lang.String, runId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def getTestResults(
    project: java.lang.String,
    runId: scala.Double,
    detailsToInclude: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def getTestResults(
    project: java.lang.String,
    runId: scala.Double,
    detailsToInclude: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails,
    skip: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def getTestResults(
    project: java.lang.String,
    runId: scala.Double,
    detailsToInclude: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def getTestResults(
    project: java.lang.String,
    runId: scala.Double,
    detailsToInclude: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails,
    skip: scala.Double,
    top: scala.Double,
    outcomes: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestOutcome]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def getTestResultsByQuery(
    query: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsQuery,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsQuery] = js.native
  def getTestRunAttachmentContent(project: java.lang.String, runId: scala.Double, attachmentId: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTestRunAttachmentZip(project: java.lang.String, runId: scala.Double, attachmentId: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTestRunAttachments(project: java.lang.String, runId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestAttachment]] = js.native
  def getTestRunById(project: java.lang.String, runId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRun] = js.native
  def getTestRunCodeCoverage(project: java.lang.String, runId: scala.Double, flags: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunCoverage]] = js.native
  def getTestRunLogs(project: java.lang.String, runId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestMessageLogDetails]
  ] = js.native
  def getTestRunStatistics(project: java.lang.String, runId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunStatistic] = js.native
  def getTestRuns(
    project: java.lang.String,
    buildUri: js.UndefOr[java.lang.String],
    owner: js.UndefOr[java.lang.String],
    tmiRunId: js.UndefOr[java.lang.String],
    planId: js.UndefOr[scala.Double],
    includeRunDetails: js.UndefOr[scala.Boolean],
    automated: js.UndefOr[scala.Boolean],
    skip: js.UndefOr[scala.Double],
    top: js.UndefOr[scala.Double]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRun]] = js.native
  def getTestSessions(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSessions(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext, period: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSessions(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    period: scala.Double,
    allSessions: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSessions(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    period: scala.Double,
    allSessions: scala.Boolean,
    includeAllProperties: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSessions(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    period: scala.Double,
    allSessions: scala.Boolean,
    includeAllProperties: scala.Boolean,
    source: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSessions(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    period: scala.Double,
    allSessions: scala.Boolean,
    includeAllProperties: scala.Boolean,
    source: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSessionSource,
    includeOnlyCompletedSessions: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession]] = js.native
  def getTestSettingsById(project: java.lang.String, testSettingsId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSettings] = js.native
  def getTestSuiteById(project: java.lang.String, planId: scala.Double, suiteId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite] = js.native
  def getTestSuiteById(
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    includeChildSuites: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite] = js.native
  def getTestSuitesForPlan(project: java.lang.String, planId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestSuitesForPlan(project: java.lang.String, planId: scala.Double, includeSuites: scala.Boolean): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestSuitesForPlan(project: java.lang.String, planId: scala.Double, includeSuites: scala.Boolean, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestSuitesForPlan(
    project: java.lang.String,
    planId: scala.Double,
    includeSuites: scala.Boolean,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestSuitesForPlan(
    project: java.lang.String,
    planId: scala.Double,
    includeSuites: scala.Boolean,
    skip: scala.Double,
    top: scala.Double,
    asTreeView: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite]] = js.native
  def getTestVariableById(project: java.lang.String, testVariableId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable] = js.native
  def getTestVariables(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable]] = js.native
  def getTestVariables(project: java.lang.String, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable]] = js.native
  def getTestVariables(project: java.lang.String, skip: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable]] = js.native
  def publishTestResultDocument(
    document: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultDocument,
    project: java.lang.String,
    runId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultDocument] = js.native
  def queryCustomFields(
    project: java.lang.String,
    scopeFilter: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldDefinition]
  ] = js.native
  def queryResultTrendForBuild(
    filter: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultTrendFilter,
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.AggregatedDataForResultTrend]
  ] = js.native
  def queryResultTrendForRelease(
    filter: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultTrendFilter,
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.AggregatedDataForResultTrend]
  ] = js.native
  def queryTestMethodLinkedWorkItems(project: java.lang.String, testName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestToWorkItemLinks] = js.native
  def queryTestResultHistory(filter: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultsFilter, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultHistory] = js.native
  def queryTestResultWorkItems(project: java.lang.String, workItemCategory: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultWorkItems(project: java.lang.String, workItemCategory: java.lang.String, automatedTestName: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultWorkItems(
    project: java.lang.String,
    workItemCategory: java.lang.String,
    automatedTestName: java.lang.String,
    testCaseId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultWorkItems(
    project: java.lang.String,
    workItemCategory: java.lang.String,
    automatedTestName: java.lang.String,
    testCaseId: scala.Double,
    maxCompleteDate: stdLib.Date
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultWorkItems(
    project: java.lang.String,
    workItemCategory: java.lang.String,
    automatedTestName: java.lang.String,
    testCaseId: scala.Double,
    maxCompleteDate: stdLib.Date,
    days: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultWorkItems(
    project: java.lang.String,
    workItemCategory: java.lang.String,
    automatedTestName: java.lang.String,
    testCaseId: scala.Double,
    maxCompleteDate: stdLib.Date,
    days: scala.Double,
    workItemCount: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.WorkItemReference]] = js.native
  def queryTestResultsReportForBuild(project: java.lang.String, buildId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForBuild(project: java.lang.String, buildId: scala.Double, publishContext: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    includeFailureDetails: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForBuild(
    project: java.lang.String,
    buildId: scala.Double,
    publishContext: java.lang.String,
    includeFailureDetails: scala.Boolean,
    buildToCompare: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.BuildReference
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForRelease(project: java.lang.String, releaseId: scala.Double, releaseEnvId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String,
    includeFailureDetails: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsReportForRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    releaseEnvId: scala.Double,
    publishContext: java.lang.String,
    includeFailureDetails: scala.Boolean,
    releaseToCompare: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ReleaseReference
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary] = js.native
  def queryTestResultsSummaryForReleases(
    releases: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ReleaseReference],
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultSummary]] = js.native
  def queryTestRuns(
    project: java.lang.String,
    minLastUpdatedDate: stdLib.Date,
    maxLastUpdatedDate: stdLib.Date,
    state: js.UndefOr[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunState],
    planIds: js.UndefOr[js.Array[scala.Double]],
    isAutomated: js.UndefOr[scala.Boolean],
    publishContext: js.UndefOr[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRunPublishContext],
    buildIds: js.UndefOr[js.Array[scala.Double]],
    buildDefIds: js.UndefOr[js.Array[scala.Double]],
    branchName: js.UndefOr[java.lang.String],
    releaseIds: js.UndefOr[js.Array[scala.Double]],
    releaseDefIds: js.UndefOr[js.Array[scala.Double]],
    releaseEnvIds: js.UndefOr[js.Array[scala.Double]],
    releaseEnvDefIds: js.UndefOr[js.Array[scala.Double]],
    runTitle: js.UndefOr[java.lang.String],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[java.lang.String]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRun]] = js.native
  def queryTestSummaryByRequirement(
    resultsContext: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsContext,
    project: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSummaryForWorkItem]
  ] = js.native
  def queryTestSummaryByRequirement(
    resultsContext: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsContext,
    project: java.lang.String,
    workItemIds: js.Array[scala.Double]
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSummaryForWorkItem]
  ] = js.native
  def removeTestCasesFromSuiteUrl(
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    testCaseIds: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def reorderSuiteEntries(
    suiteEntries: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteEntryUpdateModel],
    project: java.lang.String,
    suiteId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteEntry]] = js.native
  def updateCodeCoverageSummary(
    coverageData: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CodeCoverageData,
    project: java.lang.String,
    buildId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def updateResultRetentionSettings(
    retentionSettings: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultRetentionSettings,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultRetentionSettings] = js.native
  def updateTestConfiguration(
    testConfiguration: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration,
    project: java.lang.String,
    testConfigurationId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfiguration] = js.native
  def updateTestPlan(
    planUpdateModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.PlanUpdateModel,
    project: java.lang.String,
    planId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPlan] = js.native
  def updateTestPoints(
    pointUpdateModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.PointUpdateModel,
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double,
    pointIds: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestPoint]] = js.native
  def updateTestResults(
    results: js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult],
    project: java.lang.String,
    runId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestCaseResult]] = js.native
  def updateTestRun(
    runUpdateModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.RunUpdateModel,
    project: java.lang.String,
    runId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestRun] = js.native
  def updateTestSession(
    testSession: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSession] = js.native
  def updateTestSuite(
    suiteUpdateModel: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.SuiteUpdateModel,
    project: java.lang.String,
    planId: scala.Double,
    suiteId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestSuite] = js.native
  def updateTestVariable(
    testVariable: vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable,
    project: java.lang.String,
    testVariableId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestVariable] = js.native
}

