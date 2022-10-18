package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoNodeApi.interfacesTestInterfacesMod.AggregatedDataForResultTrend
import typings.vsoNodeApi.interfacesTestInterfacesMod.BuildCoverage
import typings.vsoNodeApi.interfacesTestInterfacesMod.BuildReference
import typings.vsoNodeApi.interfacesTestInterfacesMod.CloneOperationInformation
import typings.vsoNodeApi.interfacesTestInterfacesMod.CodeCoverageData
import typings.vsoNodeApi.interfacesTestInterfacesMod.CodeCoverageSummary
import typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldDefinition
import typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope
import typings.vsoNodeApi.interfacesTestInterfacesMod.LinkedWorkItemsQuery
import typings.vsoNodeApi.interfacesTestInterfacesMod.LinkedWorkItemsQueryResult
import typings.vsoNodeApi.interfacesTestInterfacesMod.PlanUpdateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.PointUpdateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.ReleaseReference
import typings.vsoNodeApi.interfacesTestInterfacesMod.ResultDetails
import typings.vsoNodeApi.interfacesTestInterfacesMod.ResultRetentionSettings
import typings.vsoNodeApi.interfacesTestInterfacesMod.ResultsFilter
import typings.vsoNodeApi.interfacesTestInterfacesMod.RunCreateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.RunUpdateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.SuiteCreateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.SuiteEntry
import typings.vsoNodeApi.interfacesTestInterfacesMod.SuiteEntryUpdateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.SuiteTestCase
import typings.vsoNodeApi.interfacesTestInterfacesMod.SuiteUpdateModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestActionResultModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestAttachment
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestAttachmentReference
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestAttachmentRequestModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestCaseResult
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestConfiguration
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestIterationDetailsModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestMessageLogDetails
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestPlan
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestPlanCloneRequest
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestPoint
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestPointsQuery
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultDocument
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultHistory
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultParameterModel
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultSummary
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultTrendFilter
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsContext
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsDetails
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsGroupsForBuild
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsGroupsForRelease
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsQuery
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestRun
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunCoverage
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunPublishContext
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunState
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestRunStatistic
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSession
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSessionSource
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSettings
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSuite
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSuiteCloneRequest
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestSummaryForWorkItem
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestToWorkItemLinks
import typings.vsoNodeApi.interfacesTestInterfacesMod.TestVariable
import typings.vsoNodeApi.interfacesTestInterfacesMod.WorkItemReference
import typings.vsoNodeApi.interfacesTestInterfacesMod.WorkItemToTestLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testApiMod {
  
  @JSImport("vso-node-api/TestApi", "TestApi")
  @js.native
  open class TestApi protected () extends ITestApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
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
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Double,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Double, top: Unit, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Unit,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Double,
      top: Unit,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Unit, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Unit, top: Double, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Unit,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Unit,
      top: Double,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: String, skip: Unit, top: Unit, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Unit,
      top: Unit,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: String,
      skip: Unit,
      top: Unit,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Double, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Double, top: Double, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Double,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Double,
      top: Double,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Double, top: Unit, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Double,
      top: Unit,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Double,
      top: Unit,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Unit, top: Double): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Unit, top: Double, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Unit,
      top: Double,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Unit,
      top: Double,
      includePlanDetails: Unit,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(project: String, owner: Unit, skip: Unit, top: Unit, includePlanDetails: Boolean): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Unit,
      top: Unit,
      includePlanDetails: Boolean,
      filterActivePlans: Boolean
    ): js.Promise[js.Array[TestPlan]] = js.native
    def getPlans(
      project: String,
      owner: Unit,
      skip: Unit,
      top: Unit,
      includePlanDetails: Unit,
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
    def getPointsByQuery(query: TestPointsQuery, project: String, skip: Unit, top: Double): js.Promise[TestPointsQuery] = js.native
    
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
    def getResultGroupsByRelease(
      project: String,
      releaseId: Double,
      publishContext: String,
      releaseEnvId: Unit,
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
    def getTestConfigurations(project: String, skip: Double, top: Double, continuationToken: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Unit, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Unit, continuationToken: String, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Double, top: Unit, continuationToken: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Double): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Double, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Double, continuationToken: String, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Double, continuationToken: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Unit, continuationToken: String): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Unit, continuationToken: String, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    def getTestConfigurations(project: String, skip: Unit, top: Unit, continuationToken: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestConfiguration]] = js.native
    
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
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: String,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: String, groupBy: Unit, filter: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: Unit,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      groupBy: Unit,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: Unit, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: Unit, groupBy: String, filter: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      groupBy: String,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(project: String, buildId: Double, publishContext: Unit, groupBy: Unit, filter: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      groupBy: Unit,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      groupBy: Unit,
      filter: Unit,
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
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: String,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: Unit,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: Unit,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      groupBy: Unit,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(project: String, releaseId: Double, releaseEnvId: Double, publishContext: Unit, groupBy: String): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: String,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: String,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: String,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: Unit,
      filter: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: Unit,
      filter: String,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    def getTestResultDetailsForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      groupBy: Unit,
      filter: Unit,
      orderby: String
    ): js.Promise[TestResultsDetails] = js.native
    
    def getTestResults(project: String, runId: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: Unit, skip: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: Unit, skip: Double, top: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: Unit,
      skip: Double,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: Unit,
      skip: Double,
      top: Unit,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: Unit, skip: Unit, top: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: Unit,
      skip: Unit,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: Unit,
      skip: Unit,
      top: Unit,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
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
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Double,
      top: Unit,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(project: String, runId: Double, detailsToInclude: ResultDetails, skip: Unit, top: Double): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Unit,
      top: Double,
      outcomes: js.Array[TestOutcome]
    ): js.Promise[js.Array[TestCaseResult]] = js.native
    def getTestResults(
      project: String,
      runId: Double,
      detailsToInclude: ResultDetails,
      skip: Unit,
      top: Unit,
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
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
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
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Double, allSessions: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Unit,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Unit,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Double,
      allSessions: Unit,
      includeAllProperties: Unit,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Unit, allSessions: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Unit, allSessions: Boolean, includeAllProperties: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Boolean,
      includeAllProperties: Unit,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(teamContext: TeamContext, period: Unit, allSessions: Unit, includeAllProperties: Boolean): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Boolean,
      source: TestSessionSource,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Unit,
      source: Unit,
      includeOnlyCompletedSessions: Boolean
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Unit,
      source: TestSessionSource
    ): js.Promise[js.Array[TestSession]] = js.native
    def getTestSessions(
      teamContext: TeamContext,
      period: Unit,
      allSessions: Unit,
      includeAllProperties: Unit,
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
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Double,
      top: Unit,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Boolean, skip: Unit, top: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Unit,
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Boolean,
      skip: Unit,
      top: Unit,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Double, top: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(
      project: String,
      planId: Double,
      includeSuites: Unit,
      skip: Double,
      top: Double,
      asTreeView: Boolean
    ): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Double, top: Unit, asTreeView: Boolean): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Unit, top: Double): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Unit, top: Double, asTreeView: Boolean): js.Promise[js.Array[TestSuite]] = js.native
    def getTestSuitesForPlan(project: String, planId: Double, includeSuites: Unit, skip: Unit, top: Unit, asTreeView: Boolean): js.Promise[js.Array[TestSuite]] = js.native
    
    def getTestVariableById(project: String, testVariableId: Double): js.Promise[TestVariable] = js.native
    
    def getTestVariables(project: String): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Double, top: Double): js.Promise[js.Array[TestVariable]] = js.native
    def getTestVariables(project: String, skip: Unit, top: Double): js.Promise[js.Array[TestVariable]] = js.native
    
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
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: String,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(project: String, workItemCategory: String, automatedTestName: Unit, testCaseId: Double): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: js.Date,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Double,
      maxCompleteDate: Unit,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: js.Date
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: js.Date,
      days: Unit,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Double,
      workItemCount: Double
    ): js.Promise[js.Array[WorkItemReference]] = js.native
    def queryTestResultWorkItems(
      project: String,
      workItemCategory: String,
      automatedTestName: Unit,
      testCaseId: Unit,
      maxCompleteDate: Unit,
      days: Unit,
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
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: String,
      includeFailureDetails: Unit,
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(project: String, buildId: Double, publishContext: Unit, includeFailureDetails: Boolean): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      includeFailureDetails: Boolean,
      buildToCompare: BuildReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForBuild(
      project: String,
      buildId: Double,
      publishContext: Unit,
      includeFailureDetails: Unit,
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
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: String,
      includeFailureDetails: Unit,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      includeFailureDetails: Boolean
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      includeFailureDetails: Boolean,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    def queryTestResultsReportForRelease(
      project: String,
      releaseId: Double,
      releaseEnvId: Double,
      publishContext: Unit,
      includeFailureDetails: Unit,
      releaseToCompare: ReleaseReference
    ): js.Promise[TestResultSummary] = js.native
    
    def queryTestResultsSummaryForReleases(releases: js.Array[ReleaseReference], project: String): js.Promise[js.Array[TestResultSummary]] = js.native
    
    def queryTestRuns(
      project: String,
      minLastUpdatedDate: js.Date,
      maxLastUpdatedDate: js.Date,
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
}
