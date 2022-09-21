package typings.vsoNodeApi

import typings.std.ReadableStream
import typings.vsoNodeApi.buildInterfacesMod.Build
import typings.vsoNodeApi.buildInterfacesMod.BuildArtifact
import typings.vsoNodeApi.buildInterfacesMod.BuildBadge
import typings.vsoNodeApi.buildInterfacesMod.BuildController
import typings.vsoNodeApi.buildInterfacesMod.BuildDefinition
import typings.vsoNodeApi.buildInterfacesMod.BuildDefinitionReference
import typings.vsoNodeApi.buildInterfacesMod.BuildDefinitionRevision
import typings.vsoNodeApi.buildInterfacesMod.BuildDefinitionTemplate
import typings.vsoNodeApi.buildInterfacesMod.BuildLog
import typings.vsoNodeApi.buildInterfacesMod.BuildMetric
import typings.vsoNodeApi.buildInterfacesMod.BuildOptionDefinition
import typings.vsoNodeApi.buildInterfacesMod.BuildQueryOrder
import typings.vsoNodeApi.buildInterfacesMod.BuildReason
import typings.vsoNodeApi.buildInterfacesMod.BuildReportMetadata
import typings.vsoNodeApi.buildInterfacesMod.BuildResourceUsage
import typings.vsoNodeApi.buildInterfacesMod.BuildResult
import typings.vsoNodeApi.buildInterfacesMod.BuildSettings
import typings.vsoNodeApi.buildInterfacesMod.BuildStatus
import typings.vsoNodeApi.buildInterfacesMod.Change
import typings.vsoNodeApi.buildInterfacesMod.DefinitionQueryOrder
import typings.vsoNodeApi.buildInterfacesMod.Folder
import typings.vsoNodeApi.buildInterfacesMod.FolderQueryOrder
import typings.vsoNodeApi.buildInterfacesMod.QueryDeletedOption
import typings.vsoNodeApi.buildInterfacesMod.RepositoryWebhook
import typings.vsoNodeApi.buildInterfacesMod.SourceProviderAttributes
import typings.vsoNodeApi.buildInterfacesMod.SourceRepository
import typings.vsoNodeApi.buildInterfacesMod.Timeline
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildApiMod {
  
  @JSImport("vso-node-api/BuildApi", "BuildApi")
  @js.native
  open class BuildApi protected () extends IBuildApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object BuildApi {
    
    @JSImport("vso-node-api/BuildApi", "BuildApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IBuildApi extends ClientApiBase {
    
    def addBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addBuildTags(tags: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
    
    def addDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def addDefinitionTags(tags: js.Array[String], project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    
    def createArtifact(artifact: BuildArtifact, buildId: Double): js.Promise[BuildArtifact] = js.native
    def createArtifact(artifact: BuildArtifact, buildId: Double, project: String): js.Promise[BuildArtifact] = js.native
    
    def createDefinition(definition: BuildDefinition): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: String): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: String, definitionToCloneId: Double): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: String,
      definitionToCloneId: Double,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: String,
      definitionToCloneId: Unit,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(definition: BuildDefinition, project: Unit, definitionToCloneId: Double): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: Unit,
      definitionToCloneId: Double,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def createDefinition(
      definition: BuildDefinition,
      project: Unit,
      definitionToCloneId: Unit,
      definitionToCloneRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    
    def createFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
    
    def deleteBuild(buildId: Double): js.Promise[Unit] = js.native
    def deleteBuild(buildId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def deleteDefinition(definitionId: Double): js.Promise[Unit] = js.native
    def deleteDefinition(definitionId: Double, project: String): js.Promise[Unit] = js.native
    
    def deleteDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
    
    def deleteFolder(project: String, path: String): js.Promise[Unit] = js.native
    
    def deleteTemplate(project: String, templateId: String): js.Promise[Unit] = js.native
    
    def getArtifact(buildId: Double, artifactName: String): js.Promise[BuildArtifact] = js.native
    def getArtifact(buildId: Double, artifactName: String, project: String): js.Promise[BuildArtifact] = js.native
    
    def getArtifactContentZip(buildId: Double, artifactName: String): js.Promise[ReadableStream[Any]] = js.native
    def getArtifactContentZip(buildId: Double, artifactName: String, project: String): js.Promise[ReadableStream[Any]] = js.native
    
    def getArtifacts(buildId: Double): js.Promise[js.Array[BuildArtifact]] = js.native
    def getArtifacts(buildId: Double, project: String): js.Promise[js.Array[BuildArtifact]] = js.native
    
    def getBadge(project: String, definitionId: Double): js.Promise[String] = js.native
    def getBadge(project: String, definitionId: Double, branchName: String): js.Promise[String] = js.native
    
    def getBuild(buildId: Double): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: String): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: String, propertyFilters: String): js.Promise[Build] = js.native
    def getBuild(buildId: Double, project: Unit, propertyFilters: String): js.Promise[Build] = js.native
    
    def getBuildBadge(project: String, repoType: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: String, branchName: String): js.Promise[BuildBadge] = js.native
    def getBuildBadge(project: String, repoType: String, repoId: Unit, branchName: String): js.Promise[BuildBadge] = js.native
    
    def getBuildBadgeData(project: String, repoType: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: String, branchName: String): js.Promise[String] = js.native
    def getBuildBadgeData(project: String, repoType: String, repoId: Unit, branchName: String): js.Promise[String] = js.native
    
    def getBuildChanges(project: String, buildId: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: String): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: String, top: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: String,
      top: Double,
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: String,
      top: Unit,
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: Unit, top: Double): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(
      project: String,
      buildId: Double,
      continuationToken: Unit,
      top: Double,
      includeSourceChange: Boolean
    ): js.Promise[js.Array[Change]] = js.native
    def getBuildChanges(project: String, buildId: Double, continuationToken: Unit, top: Unit, includeSourceChange: Boolean): js.Promise[js.Array[Change]] = js.native
    
    def getBuildController(controllerId: Double): js.Promise[BuildController] = js.native
    
    def getBuildControllers(): js.Promise[js.Array[BuildController]] = js.native
    def getBuildControllers(name: String): js.Promise[js.Array[BuildController]] = js.native
    
    def getBuildLog(project: String, buildId: Double, logId: Double): js.Promise[ReadableStream[Any]] = js.native
    def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[ReadableStream[Any]] = js.native
    def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[ReadableStream[Any]] = js.native
    def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Unit, endLine: Double): js.Promise[ReadableStream[Any]] = js.native
    
    def getBuildLogLines(project: String, buildId: Double, logId: Double): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[js.Array[String]] = js.native
    def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Unit, endLine: Double): js.Promise[js.Array[String]] = js.native
    
    def getBuildLogs(project: String, buildId: Double): js.Promise[js.Array[BuildLog]] = js.native
    
    def getBuildLogsZip(project: String, buildId: Double): js.Promise[ReadableStream[Any]] = js.native
    
    def getBuildOptionDefinitions(): js.Promise[js.Array[BuildOptionDefinition]] = js.native
    def getBuildOptionDefinitions(project: String): js.Promise[js.Array[BuildOptionDefinition]] = js.native
    
    def getBuildProperties(project: String, buildId: Double): js.Promise[Any] = js.native
    def getBuildProperties(project: String, buildId: Double, filter: js.Array[String]): js.Promise[Any] = js.native
    
    def getBuildReport(project: String, buildId: Double): js.Promise[BuildReportMetadata] = js.native
    def getBuildReport(project: String, buildId: Double, `type`: String): js.Promise[BuildReportMetadata] = js.native
    
    def getBuildReportHtmlContent(project: String, buildId: Double): js.Promise[ReadableStream[Any]] = js.native
    def getBuildReportHtmlContent(project: String, buildId: Double, `type`: String): js.Promise[ReadableStream[Any]] = js.native
    
    def getBuildSettings(): js.Promise[BuildSettings] = js.native
    
    def getBuildTags(project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
    
    def getBuildTimeline(project: String, buildId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double, planId: String): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Unit, planId: String): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: Unit, changeId: Double): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: Unit, changeId: Double, planId: String): js.Promise[Timeline] = js.native
    def getBuildTimeline(project: String, buildId: Double, timelineId: Unit, changeId: Unit, planId: String): js.Promise[Timeline] = js.native
    
    def getBuildWorkItemsRefs(project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getBuildWorkItemsRefs(project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def getBuilds(
      project: js.UndefOr[String],
      definitions: js.UndefOr[js.Array[Double]],
      queues: js.UndefOr[js.Array[Double]],
      buildNumber: js.UndefOr[String],
      minTime: js.UndefOr[js.Date],
      maxTime: js.UndefOr[js.Date],
      requestedFor: js.UndefOr[String],
      reasonFilter: js.UndefOr[BuildReason],
      statusFilter: js.UndefOr[BuildStatus],
      resultFilter: js.UndefOr[BuildResult],
      tagFilters: js.UndefOr[js.Array[String]],
      properties: js.UndefOr[js.Array[String]],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      maxBuildsPerDefinition: js.UndefOr[Double],
      deletedFilter: js.UndefOr[QueryDeletedOption],
      queryOrder: js.UndefOr[BuildQueryOrder],
      branchName: js.UndefOr[String],
      buildIds: js.UndefOr[js.Array[Double]],
      repositoryId: js.UndefOr[String],
      repositoryType: js.UndefOr[String]
    ): js.Promise[js.Array[Build]] = js.native
    
    def getChangesBetweenBuilds(project: String): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Unit, top: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Unit, toBuildId: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Unit, toBuildId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
    def getChangesBetweenBuilds(project: String, fromBuildId: Unit, toBuildId: Unit, top: Double): js.Promise[js.Array[Change]] = js.native
    
    def getDefinition(definitionId: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String, revision: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String, revision: Double, minMetricsTime: js.Date): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: String, revision: Unit, minMetricsTime: js.Date): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: String,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: Unit, revision: Double): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: Unit, revision: Double, minMetricsTime: js.Date): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: js.Date,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Double,
      minMetricsTime: Unit,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(definitionId: Double, project: Unit, revision: Unit, minMetricsTime: js.Date): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: js.Date,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String]
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: js.Array[String],
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    def getDefinition(
      definitionId: Double,
      project: Unit,
      revision: Unit,
      minMetricsTime: Unit,
      propertyFilters: Unit,
      includeLatestBuilds: Boolean
    ): js.Promise[BuildDefinition] = js.native
    
    def getDefinitionMetrics(project: String, definitionId: Double): js.Promise[js.Array[BuildMetric]] = js.native
    def getDefinitionMetrics(project: String, definitionId: Double, minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    
    def getDefinitionProperties(project: String, definitionId: Double): js.Promise[Any] = js.native
    def getDefinitionProperties(project: String, definitionId: Double, filter: js.Array[String]): js.Promise[Any] = js.native
    
    def getDefinitionRevisions(project: String, definitionId: Double): js.Promise[js.Array[BuildDefinitionRevision]] = js.native
    
    def getDefinitionTags(project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
    def getDefinitionTags(project: String, definitionId: Double, revision: Double): js.Promise[js.Array[String]] = js.native
    
    def getDefinitions(
      project: js.UndefOr[String],
      name: js.UndefOr[String],
      repositoryId: js.UndefOr[String],
      repositoryType: js.UndefOr[String],
      queryOrder: js.UndefOr[DefinitionQueryOrder],
      top: js.UndefOr[Double],
      continuationToken: js.UndefOr[String],
      minMetricsTime: js.UndefOr[js.Date],
      definitionIds: js.UndefOr[js.Array[Double]],
      path: js.UndefOr[String],
      builtAfter: js.UndefOr[js.Date],
      notBuiltAfter: js.UndefOr[js.Date],
      includeAllProperties: js.UndefOr[Boolean],
      includeLatestBuilds: js.UndefOr[Boolean],
      taskIdFilter: js.UndefOr[String]
    ): js.Promise[js.Array[BuildDefinitionReference]] = js.native
    
    def getFolders(project: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: String, queryOrder: FolderQueryOrder): js.Promise[js.Array[Folder]] = js.native
    def getFolders(project: String, path: Unit, queryOrder: FolderQueryOrder): js.Promise[js.Array[Folder]] = js.native
    
    def getProjectMetrics(project: String): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: String): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: String, minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    def getProjectMetrics(project: String, metricAggregationType: Unit, minMetricsTime: js.Date): js.Promise[js.Array[BuildMetric]] = js.native
    
    def getResourceUsage(): js.Promise[BuildResourceUsage] = js.native
    
    def getTags(project: String): js.Promise[js.Array[String]] = js.native
    
    def getTemplate(project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
    
    def getTemplates(project: String): js.Promise[js.Array[BuildDefinitionTemplate]] = js.native
    
    def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
    def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
    
    def listBranches(project: String, providerName: String): js.Promise[js.Array[String]] = js.native
    def listBranches(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[String]] = js.native
    def listBranches(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[String]] = js.native
    def listBranches(project: String, providerName: String, serviceEndpointId: Unit, repository: String): js.Promise[js.Array[String]] = js.native
    
    def listRepositories(project: String, providerName: String): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[SourceRepository]] = js.native
    def listRepositories(project: String, providerName: String, serviceEndpointId: Unit, repository: String): js.Promise[js.Array[SourceRepository]] = js.native
    
    def listSourceProviders(project: String): js.Promise[js.Array[SourceProviderAttributes]] = js.native
    
    def listWebhooks(project: String, providerName: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    def listWebhooks(project: String, providerName: String, serviceEndpointId: Unit, repository: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
    
    def queueBuild(build: Build): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: Boolean): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: Boolean, checkInTicket: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: String, ignoreWarnings: Unit, checkInTicket: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: Unit, ignoreWarnings: Boolean): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: Unit, ignoreWarnings: Boolean, checkInTicket: String): js.Promise[Build] = js.native
    def queueBuild(build: Build, project: Unit, ignoreWarnings: Unit, checkInTicket: String): js.Promise[Build] = js.native
    
    def saveTemplate(template: BuildDefinitionTemplate, project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
    
    def updateBuild(build: Build, buildId: Double): js.Promise[Build] = js.native
    def updateBuild(build: Build, buildId: Double, project: String): js.Promise[Build] = js.native
    
    def updateBuildProperties(customHeaders: Any, document: JsonPatchDocument, project: String, buildId: Double): js.Promise[Any] = js.native
    
    def updateBuildSettings(settings: BuildSettings): js.Promise[BuildSettings] = js.native
    
    def updateBuilds(builds: js.Array[Build]): js.Promise[js.Array[Build]] = js.native
    def updateBuilds(builds: js.Array[Build], project: String): js.Promise[js.Array[Build]] = js.native
    
    def updateDefinition(definition: BuildDefinition, definitionId: Double): js.Promise[BuildDefinition] = js.native
    def updateDefinition(definition: BuildDefinition, definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: Double,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: String,
      secretsSourceDefinitionId: Unit,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: Unit,
      secretsSourceDefinitionId: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: Unit,
      secretsSourceDefinitionId: Double,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    def updateDefinition(
      definition: BuildDefinition,
      definitionId: Double,
      project: Unit,
      secretsSourceDefinitionId: Unit,
      secretsSourceDefinitionRevision: Double
    ): js.Promise[BuildDefinition] = js.native
    
    def updateDefinitionProperties(customHeaders: Any, document: JsonPatchDocument, project: String, definitionId: Double): js.Promise[Any] = js.native
    
    def updateFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
  }
}
