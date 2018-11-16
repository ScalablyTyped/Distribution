package typings
package vsoDashNodeDashApiLib.releaseapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReleaseApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def addDefinitionTag(project: java.lang.String, releaseDefinitionId: scala.Double, tag: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def addDefinitionTags(tags: js.Array[java.lang.String], project: java.lang.String, releaseDefinitionId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def addReleaseTag(project: java.lang.String, releaseId: scala.Double, tag: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def addReleaseTags(tags: js.Array[java.lang.String], project: java.lang.String, releaseId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def createDefinitionEnvironmentTemplate(
    template: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate,
    project: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
  ] = js.native
  def createFavorites(
    favoriteItems: js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem],
    project: java.lang.String,
    scope: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem]] = js.native
  def createFavorites(
    favoriteItems: js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem],
    project: java.lang.String,
    scope: java.lang.String,
    identityId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem]] = js.native
  def createFolder(
    folder: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder,
    project: java.lang.String,
    path: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder] = js.native
  def createRelease(
    releaseStartMetadata: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStartMetadata,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def createReleaseDefinition(
    releaseDefinition: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition] = js.native
  def deleteDefinitionEnvironmentTemplate(project: java.lang.String, templateId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteDefinitionTag(project: java.lang.String, releaseDefinitionId: scala.Double, tag: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def deleteFavorites(project: java.lang.String, scope: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteFavorites(project: java.lang.String, scope: java.lang.String, identityId: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteFavorites(
    project: java.lang.String,
    scope: java.lang.String,
    identityId: java.lang.String,
    favoriteItemIds: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteFolder(project: java.lang.String, path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteRelease(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteRelease(project: java.lang.String, releaseId: scala.Double, comment: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteReleaseDefinition(project: java.lang.String, definitionId: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def deleteReleaseDefinition(project: java.lang.String, definitionId: scala.Double, comment: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteReleaseDefinition(
    project: java.lang.String,
    definitionId: scala.Double,
    comment: java.lang.String,
    forceDelete: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteReleaseTag(project: java.lang.String, releaseId: scala.Double, tag: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getAgentArtifactDefinitions(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AgentArtifactDefinition]
  ] = js.native
  def getApproval(project: java.lang.String, approvalId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval] = js.native
  def getApproval(project: java.lang.String, approvalId: scala.Double, includeHistory: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval] = js.native
  def getApprovalHistory(project: java.lang.String, approvalStepId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval] = js.native
  def getApprovals(
    project: java.lang.String,
    assignedToFilter: js.UndefOr[java.lang.String],
    statusFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalStatus],
    releaseIdsFilter: js.UndefOr[js.Array[scala.Double]],
    typeFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalType],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[scala.Double],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder],
    includeMyGroupApprovals: js.UndefOr[scala.Boolean]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval]] = js.native
  def getArtifactTypeDefinitions(project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ArtifactTypeDefinition]
  ] = js.native
  def getArtifactVersions(project: java.lang.String, releaseDefinitionId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ArtifactVersionQueryResult] = js.native
  def getArtifactVersionsForSources(
    artifacts: js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Artifact],
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ArtifactVersionQueryResult] = js.native
  def getAutoTriggerIssues(artifactType: java.lang.String, sourceId: java.lang.String, artifactVersionId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AutoTriggerIssue]] = js.native
  def getAutoTriggerIssues(
    artifactType: java.lang.String,
    sourceId: java.lang.String,
    artifactVersionId: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AutoTriggerIssue]] = js.native
  def getDefinitionEnvironmentTemplate(project: java.lang.String, templateId: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
  ] = js.native
  def getDefinitionEnvironments(project: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DefinitionEnvironmentReference
    ]
  ] = js.native
  def getDefinitionEnvironments(project: java.lang.String, taskGroupId: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DefinitionEnvironmentReference
    ]
  ] = js.native
  def getDefinitionEnvironments(
    project: java.lang.String,
    taskGroupId: java.lang.String,
    propertyFilters: js.Array[java.lang.String]
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DefinitionEnvironmentReference
    ]
  ] = js.native
  def getDefinitionRevision(project: java.lang.String, definitionId: scala.Double, revision: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getDefinitionTags(project: java.lang.String, releaseDefinitionId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getDeploymentBadge(projectId: java.lang.String, releaseDefinitionId: scala.Double, environmentId: scala.Double): stdLib.Promise[java.lang.String] = js.native
  def getDeploymentBadge(
    projectId: java.lang.String,
    releaseDefinitionId: scala.Double,
    environmentId: scala.Double,
    branchName: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def getDeployments(
    project: java.lang.String,
    definitionId: js.UndefOr[scala.Double],
    definitionEnvironmentId: js.UndefOr[scala.Double],
    createdBy: js.UndefOr[java.lang.String],
    minModifiedTime: js.UndefOr[stdLib.Date],
    maxModifiedTime: js.UndefOr[stdLib.Date],
    deploymentStatus: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentStatus],
    operationStatus: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentOperationStatus],
    latestAttemptsOnly: js.UndefOr[scala.Boolean],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[scala.Double],
    createdFor: js.UndefOr[java.lang.String]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Deployment]] = js.native
  def getDeploymentsForMultipleEnvironments(
    queryParameters: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentQueryParameters,
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Deployment]] = js.native
  def getFavorites(project: java.lang.String, scope: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem]] = js.native
  def getFavorites(project: java.lang.String, scope: java.lang.String, identityId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FavoriteItem]] = js.native
  def getFolders(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder]] = js.native
  def getFolders(project: java.lang.String, path: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder]] = js.native
  def getFolders(
    project: java.lang.String,
    path: java.lang.String,
    queryOrder: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FolderPathQueryOrder
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder]] = js.native
  def getGateLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    gateId: scala.Double,
    taskId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getInputValues(
    query: vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValuesQuery,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesCommonFormInputInterfacesMod.InputValuesQuery] = js.native
  def getIssues(project: java.lang.String, buildId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AutoTriggerIssue]] = js.native
  def getIssues(project: java.lang.String, buildId: scala.Double, sourceId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.AutoTriggerIssue]] = js.native
  def getLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    taskId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    taskId: scala.Double,
    attemptId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getLogs(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getManualIntervention(project: java.lang.String, releaseId: scala.Double, manualInterventionId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualIntervention] = js.native
  def getManualInterventions(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualIntervention]
  ] = js.native
  def getMetrics(project: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Metric]] = js.native
  def getMetrics(project: java.lang.String, minMetricsTime: stdLib.Date): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Metric]] = js.native
  def getRelease(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def getRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    approvalFilters: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def getRelease(
    project: java.lang.String,
    releaseId: scala.Double,
    approvalFilters: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ApprovalFilters,
    propertyFilters: js.Array[java.lang.String]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def getReleaseChanges(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Change]] = js.native
  def getReleaseChanges(project: java.lang.String, releaseId: scala.Double, baseReleaseId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Change]] = js.native
  def getReleaseChanges(project: java.lang.String, releaseId: scala.Double, baseReleaseId: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Change]] = js.native
  def getReleaseDefinition(project: java.lang.String, definitionId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition] = js.native
  def getReleaseDefinition(project: java.lang.String, definitionId: scala.Double, propertyFilters: js.Array[java.lang.String]): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition] = js.native
  def getReleaseDefinitionHistory(project: java.lang.String, definitionId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionRevision]
  ] = js.native
  def getReleaseDefinitionRevision(project: java.lang.String, definitionId: scala.Double, revision: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getReleaseDefinitionSummary(project: java.lang.String, definitionId: scala.Double, releaseCount: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSummary] = js.native
  def getReleaseDefinitionSummary(
    project: java.lang.String,
    definitionId: scala.Double,
    releaseCount: scala.Double,
    includeArtifact: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSummary] = js.native
  def getReleaseDefinitionSummary(
    project: java.lang.String,
    definitionId: scala.Double,
    releaseCount: scala.Double,
    includeArtifact: scala.Boolean,
    definitionEnvironmentIdsFilter: js.Array[scala.Double]
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionSummary] = js.native
  def getReleaseDefinitions(
    project: java.lang.String,
    searchText: js.UndefOr[java.lang.String],
    expand: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionExpands],
    artifactType: js.UndefOr[java.lang.String],
    artifactSourceId: js.UndefOr[java.lang.String],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[java.lang.String],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionQueryOrder],
    path: js.UndefOr[java.lang.String],
    isExactNameMatch: js.UndefOr[scala.Boolean],
    tagFilter: js.UndefOr[js.Array[java.lang.String]],
    propertyFilters: js.UndefOr[js.Array[java.lang.String]],
    definitionIdFilter: js.UndefOr[js.Array[java.lang.String]],
    isDeleted: js.UndefOr[scala.Boolean]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition]] = js.native
  def getReleaseEnvironment(project: java.lang.String, releaseId: scala.Double, environmentId: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseEnvironment] = js.native
  def getReleaseHistory(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseRevision]] = js.native
  def getReleaseProjects(artifactType: java.lang.String, artifactSourceId: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ProjectReference]] = js.native
  def getReleaseRevision(project: java.lang.String, releaseId: scala.Double, definitionSnapshotRevision: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getReleaseSettings(project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseSettings] = js.native
  def getReleaseTags(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getReleaseWorkItemsRefs(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseWorkItemRef]
  ] = js.native
  def getReleaseWorkItemsRefs(project: java.lang.String, releaseId: scala.Double, baseReleaseId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseWorkItemRef]
  ] = js.native
  def getReleaseWorkItemsRefs(project: java.lang.String, releaseId: scala.Double, baseReleaseId: scala.Double, top: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseWorkItemRef]
  ] = js.native
  def getReleases(
    project: js.UndefOr[java.lang.String],
    definitionId: js.UndefOr[scala.Double],
    definitionEnvironmentId: js.UndefOr[scala.Double],
    searchText: js.UndefOr[java.lang.String],
    createdBy: js.UndefOr[java.lang.String],
    statusFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseStatus],
    environmentStatusFilter: js.UndefOr[scala.Double],
    minCreatedTime: js.UndefOr[stdLib.Date],
    maxCreatedTime: js.UndefOr[stdLib.Date],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseQueryOrder],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[scala.Double],
    expand: js.UndefOr[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseExpands],
    artifactTypeId: js.UndefOr[java.lang.String],
    sourceId: js.UndefOr[java.lang.String],
    artifactVersionId: js.UndefOr[java.lang.String],
    sourceBranchFilter: js.UndefOr[java.lang.String],
    isDeleted: js.UndefOr[scala.Boolean],
    tagFilter: js.UndefOr[js.Array[java.lang.String]],
    propertyFilters: js.UndefOr[js.Array[java.lang.String]],
    releaseIdFilter: js.UndefOr[js.Array[scala.Double]]
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release]] = js.native
  def getSourceBranches(project: java.lang.String, definitionId: scala.Double): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getSummaryMailSections(project: java.lang.String, releaseId: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.SummaryMailSection]
  ] = js.native
  def getTags(project: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getTaskAttachmentContent(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String,
    recordId: java.lang.String,
    `type`: java.lang.String,
    name: java.lang.String
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskAttachments(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String,
    `type`: java.lang.String
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTaskAttachment]
  ] = js.native
  def getTaskLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    releaseDeployPhaseId: scala.Double,
    taskId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    releaseDeployPhaseId: scala.Double,
    taskId: scala.Double,
    startLine: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskLog(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    releaseDeployPhaseId: scala.Double,
    taskId: scala.Double,
    startLine: scala.Double,
    endLine: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskLog2(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String,
    taskId: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskLog2(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String,
    taskId: scala.Double,
    startLine: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTaskLog2(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String,
    taskId: scala.Double,
    startLine: scala.Double,
    endLine: scala.Double
  ): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getTasks(project: java.lang.String, releaseId: scala.Double, environmentId: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTask]] = js.native
  def getTasks(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTask]] = js.native
  def getTasks2(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    attemptId: scala.Double,
    timelineId: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTask]] = js.native
  def getTasksForTaskGroup(
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double,
    releaseDeployPhaseId: scala.Double
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseTask]] = js.native
  def listDefinitionEnvironmentTemplates(project: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
    ]
  ] = js.native
  def listDefinitionEnvironmentTemplates(project: java.lang.String, isDeleted: scala.Boolean): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
    ]
  ] = js.native
  def sendSummaryMail(
    mailMessage: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.MailMessage,
    project: java.lang.String,
    releaseId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def undeleteRelease(project: java.lang.String, releaseId: scala.Double, comment: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def undeleteReleaseDefinition(
    releaseDefinitionUndeleteParameter: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionUndeleteParameter,
    project: java.lang.String,
    definitionId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition] = js.native
  def undeleteReleaseDefinitionEnvironmentTemplate(project: java.lang.String, templateId: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinitionEnvironmentTemplate
  ] = js.native
  def updateFolder(
    folder: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder,
    project: java.lang.String,
    path: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Folder] = js.native
  def updateManualIntervention(
    manualInterventionUpdateMetadata: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualInterventionUpdateMetadata,
    project: java.lang.String,
    releaseId: scala.Double,
    manualInterventionId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ManualIntervention] = js.native
  def updateRelease(
    release: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release,
    project: java.lang.String,
    releaseId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def updateReleaseApproval(
    approval: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval,
    project: java.lang.String,
    approvalId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval] = js.native
  def updateReleaseApprovals(
    approvals: js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval],
    project: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseApproval]] = js.native
  def updateReleaseDefinition(
    releaseDefinition: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseDefinition] = js.native
  def updateReleaseEnvironment(
    environmentUpdateData: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseEnvironmentUpdateMetadata,
    project: java.lang.String,
    releaseId: scala.Double,
    environmentId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseEnvironment] = js.native
  def updateReleaseResource(
    releaseUpdateMetadata: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseUpdateMetadata,
    project: java.lang.String,
    releaseId: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.Release] = js.native
  def updateReleaseSettings(
    releaseSettings: vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseSettings,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.ReleaseSettings] = js.native
}

