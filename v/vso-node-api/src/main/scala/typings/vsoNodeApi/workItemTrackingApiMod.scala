package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.std.Date
import typings.vsoNodeApi.anon.Key
import typings.vsoNodeApi.anon.Value
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.coreInterfacesMod.TeamContext
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vssinterfacesMod.JsonPatchDocument
import typings.vsoNodeApi.workItemTrackingInterfacesMod.AccountMyWorkResult
import typings.vsoNodeApi.workItemTrackingInterfacesMod.AccountRecentActivityWorkItemModel
import typings.vsoNodeApi.workItemTrackingInterfacesMod.AccountRecentMentionWorkItemModel
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ArtifactUriQuery
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ArtifactUriQueryResult
import typings.vsoNodeApi.workItemTrackingInterfacesMod.AttachmentReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.CommentSortOrder
import typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldsToEvaluate
import typings.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ProjectWorkItemStateColors
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ProvisioningResult
import typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryExpand
import typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryHierarchyItem
import typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryHierarchyItemsResult
import typings.vsoNodeApi.workItemTrackingInterfacesMod.QueryOption
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingRevisionsExpand
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
import typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter
import typings.vsoNodeApi.workItemTrackingInterfacesMod.TreeStructureGroup
import typings.vsoNodeApi.workItemTrackingInterfacesMod.Wiql
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkArtifactLink
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItem
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemClassificationNode
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemComment
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemComments
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDelete
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDeleteReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemDeleteUpdate
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemErrorPolicy
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemField
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemIcon
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemNextStateOnTransition
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemQueryResult
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemRelationType
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemStateColor
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTemplate
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTemplateReference
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemType
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeCategory
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeFieldInstance
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeTemplate
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel
import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/WorkItemTrackingApi", JSImport.Namespace)
@js.native
object workItemTrackingApiMod extends js.Object {
  
  @js.native
  trait IWorkItemTrackingApi extends ClientApiBase {
    
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: js.UndefOr[scala.Nothing],
      uploadType: js.UndefOr[scala.Nothing],
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: js.UndefOr[scala.Nothing],
      uploadType: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: js.UndefOr[scala.Nothing],
      uploadType: String,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream, fileName: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: String,
      uploadType: js.UndefOr[scala.Nothing],
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: js.Any, contentStream: ReadableStream, fileName: String, uploadType: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: js.Any,
      contentStream: ReadableStream,
      fileName: String,
      uploadType: String,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    
    def createOrUpdateClassificationNode(postedNode: WorkItemClassificationNode, project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def createOrUpdateClassificationNode(
      postedNode: WorkItemClassificationNode,
      project: String,
      structureGroup: TreeStructureGroup,
      path: String
    ): js.Promise[WorkItemClassificationNode] = js.native
    
    def createQuery(postedQuery: QueryHierarchyItem, project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    
    def createTemplate(template: WorkItemTemplate, teamContext: TeamContext): js.Promise[WorkItemTemplate] = js.native
    
    def createWorkItem(customHeaders: js.Any, document: JsonPatchDocument, project: String, `type`: String): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: js.UndefOr[scala.Nothing],
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: js.UndefOr[scala.Nothing],
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[Unit] = js.native
    def deleteClassificationNode(
      project: String,
      structureGroup: TreeStructureGroup,
      path: js.UndefOr[scala.Nothing],
      reclassifyId: Double
    ): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, reclassifyId: Double): js.Promise[Unit] = js.native
    
    def deleteField(fieldNameOrRefName: String): js.Promise[Unit] = js.native
    def deleteField(fieldNameOrRefName: String, project: String): js.Promise[Unit] = js.native
    
    def deleteQuery(project: String, query: String): js.Promise[Unit] = js.native
    
    def deleteTemplate(teamContext: TeamContext, templateId: String): js.Promise[Unit] = js.native
    
    def deleteWorkItem(id: Double): js.Promise[WorkItemDelete] = js.native
    def deleteWorkItem(id: Double, destroy: Boolean): js.Promise[WorkItemDelete] = js.native
    
    def destroyWorkItem(id: Double): js.Promise[Unit] = js.native
    def destroyWorkItem(id: Double, project: String): js.Promise[Unit] = js.native
    
    def evaluateRulesOnField(ruleEngineInput: FieldsToEvaluate): js.Promise[Unit] = js.native
    
    def exportWorkItemTypeDefinition(): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: js.UndefOr[scala.Nothing], `type`: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: js.UndefOr[scala.Nothing], `type`: String, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: js.UndefOr[scala.Nothing], exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    
    def getAccountMyWorkData(): js.Promise[AccountMyWorkResult] = js.native
    def getAccountMyWorkData(queryOption: QueryOption): js.Promise[AccountMyWorkResult] = js.native
    
    def getAttachmentContent(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentContent(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getAttachmentZip(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(
      project: String,
      structureGroup: TreeStructureGroup,
      path: js.UndefOr[scala.Nothing],
      depth: Double
    ): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, depth: Double): js.Promise[WorkItemClassificationNode] = js.native
    
    def getComment(id: Double, revision: Double): js.Promise[WorkItemComment] = js.native
    
    def getComments(id: Double): js.Promise[WorkItemComments] = js.native
    def getComments(
      id: Double,
      fromRevision: js.UndefOr[scala.Nothing],
      top: js.UndefOr[scala.Nothing],
      order: CommentSortOrder
    ): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: js.UndefOr[scala.Nothing], top: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: js.UndefOr[scala.Nothing], top: Double, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: js.UndefOr[scala.Nothing], order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    
    def getDeletedWorkItem(id: Double): js.Promise[WorkItemDelete] = js.native
    def getDeletedWorkItem(id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    
    def getDeletedWorkItemReferences(): js.Promise[js.Array[WorkItemReference]] = js.native
    def getDeletedWorkItemReferences(project: String): js.Promise[js.Array[WorkItemReference]] = js.native
    
    def getDeletedWorkItems(ids: js.Array[Double]): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    def getDeletedWorkItems(ids: js.Array[Double], project: String): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    
    def getField(fieldNameOrRefName: String): js.Promise[WorkItemField] = js.native
    def getField(fieldNameOrRefName: String, project: String): js.Promise[WorkItemField] = js.native
    
    def getFields(): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: js.UndefOr[scala.Nothing], expand: GetFieldsExpand): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String, expand: GetFieldsExpand): js.Promise[js.Array[WorkItemField]] = js.native
    
    def getQueries(project: String): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(
      project: String,
      expand: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      includeDeleted: Boolean
    ): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: js.UndefOr[scala.Nothing], depth: Double): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: js.UndefOr[scala.Nothing], depth: Double, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: js.UndefOr[scala.Nothing], includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    
    def getQuery(project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(
      project: String,
      query: String,
      expand: js.UndefOr[scala.Nothing],
      depth: js.UndefOr[scala.Nothing],
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: js.UndefOr[scala.Nothing], depth: Double): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(
      project: String,
      query: String,
      expand: js.UndefOr[scala.Nothing],
      depth: Double,
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(
      project: String,
      query: String,
      expand: QueryExpand,
      depth: js.UndefOr[scala.Nothing],
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    
    def getRecentActivityData(): js.Promise[js.Array[AccountRecentActivityWorkItemModel]] = js.native
    
    def getRecentMentions(): js.Promise[js.Array[AccountRecentMentionWorkItemModel]] = js.native
    
    def getRelationType(relation: String): js.Promise[WorkItemRelationType] = js.native
    
    def getRelationTypes(): js.Promise[js.Array[WorkItemRelationType]] = js.native
    
    def getReportingLinks(): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: js.UndefOr[scala.Nothing],
      types: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: js.UndefOr[scala.Nothing], types: js.UndefOr[scala.Nothing], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: js.UndefOr[scala.Nothing],
      types: js.UndefOr[scala.Nothing],
      continuationToken: String,
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: js.UndefOr[scala.Nothing], types: js.Array[String]): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: js.UndefOr[scala.Nothing],
      types: js.Array[String],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: js.UndefOr[scala.Nothing], types: js.Array[String], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: js.UndefOr[scala.Nothing],
      types: js.Array[String],
      continuationToken: String,
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: String,
      types: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.UndefOr[scala.Nothing], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.UndefOr[scala.Nothing], continuationToken: String, startDateTime: Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String]): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(
      project: String,
      types: js.Array[String],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String, startDateTime: Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    
    def getRevision(id: Double, revisionNumber: Double): js.Promise[WorkItem] = js.native
    def getRevision(id: Double, revisionNumber: Double, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
    def getRevisions(id: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(
      id: Double,
      top: js.UndefOr[scala.Nothing],
      skip: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: js.UndefOr[scala.Nothing], skip: Double, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: js.UndefOr[scala.Nothing], expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    
    def getRootNodes(project: String): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    def getRootNodes(project: String, depth: Double): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    
    def getTemplate(teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    
    def getTemplates(teamContext: TeamContext): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    def getTemplates(teamContext: TeamContext, workitemtypename: String): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    
    def getUpdate(id: Double, updateNumber: Double): js.Promise[WorkItemUpdate] = js.native
    
    def getUpdates(id: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: js.UndefOr[scala.Nothing], skip: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    
    def getWorkArtifactLinkTypes(): js.Promise[js.Array[WorkArtifactLink]] = js.native
    
    def getWorkItem(id: Double): js.Promise[WorkItem] = js.native
    def getWorkItem(
      id: Double,
      fields: js.UndefOr[scala.Nothing],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.UndefOr[scala.Nothing], asOf: Date): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.UndefOr[scala.Nothing], asOf: Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String]): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: js.UndefOr[scala.Nothing], expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: Date): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
    def getWorkItemIconJson(icon: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: js.UndefOr[scala.Nothing], v: Double): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String, v: Double): js.Promise[WorkItemIcon] = js.native
    
    def getWorkItemIconSvg(icon: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: js.UndefOr[scala.Nothing], v: Double): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String, v: Double): js.Promise[ReadableStream] = js.native
    
    def getWorkItemIcons(): js.Promise[js.Array[WorkItemIcon]] = js.native
    
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double]): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double], action: String): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    
    def getWorkItemStateColors(projectNames: js.Array[String]): js.Promise[js.Array[ProjectWorkItemStateColors]] = js.native
    
    def getWorkItemTemplate(project: String, `type`: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(
      project: String,
      `type`: String,
      fields: js.UndefOr[scala.Nothing],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: js.UndefOr[scala.Nothing], asOf: Date): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(
      project: String,
      `type`: String,
      fields: js.UndefOr[scala.Nothing],
      asOf: Date,
      expand: WorkItemExpand
    ): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(
      project: String,
      `type`: String,
      fields: String,
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: Date): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
    def getWorkItemType(project: String, `type`: String): js.Promise[WorkItemType] = js.native
    
    def getWorkItemTypeCategories(project: String): js.Promise[js.Array[WorkItemTypeCategory]] = js.native
    
    def getWorkItemTypeCategory(project: String, category: String): js.Promise[WorkItemTypeCategory] = js.native
    
    def getWorkItemTypeColorAndIcons(projectNames: js.Array[String]): js.Promise[js.Array[Value]] = js.native
    
    def getWorkItemTypeColors(projectNames: js.Array[String]): js.Promise[js.Array[Key]] = js.native
    
    def getWorkItemTypeField(project: String, `type`: String, field: String): js.Promise[WorkItemTypeFieldInstance] = js.native
    def getWorkItemTypeField(project: String, `type`: String, field: String, expand: WorkItemTypeFieldsExpandLevel): js.Promise[WorkItemTypeFieldInstance] = js.native
    
    def getWorkItemTypeFields(project: String, `type`: String): js.Promise[js.Array[WorkItemTypeFieldInstance]] = js.native
    def getWorkItemTypeFields(project: String, `type`: String, expand: WorkItemTypeFieldsExpandLevel): js.Promise[js.Array[WorkItemTypeFieldInstance]] = js.native
    
    def getWorkItemTypeStates(project: String, `type`: String): js.Promise[js.Array[WorkItemStateColor]] = js.native
    
    def getWorkItemTypes(project: String): js.Promise[js.Array[WorkItemType]] = js.native
    
    def getWorkItems(ids: js.Array[Double]): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.UndefOr[scala.Nothing],
      asOf: js.UndefOr[scala.Nothing],
      expand: js.UndefOr[scala.Nothing],
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.UndefOr[scala.Nothing],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.UndefOr[scala.Nothing],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.UndefOr[scala.Nothing], asOf: Date): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.UndefOr[scala.Nothing],
      asOf: Date,
      expand: js.UndefOr[scala.Nothing],
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.UndefOr[scala.Nothing], asOf: Date, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.UndefOr[scala.Nothing],
      asOf: Date,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String]): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.UndefOr[scala.Nothing],
      expand: js.UndefOr[scala.Nothing],
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.UndefOr[scala.Nothing],
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: Date): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: Date,
      expand: js.UndefOr[scala.Nothing],
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: Date, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: Date,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    
    def queryById(id: String): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: js.UndefOr[scala.Nothing], timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    
    def queryByWiql(wiql: Wiql): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(
      wiql: Wiql,
      teamContext: js.UndefOr[scala.Nothing],
      timePrecision: js.UndefOr[scala.Nothing],
      top: Double
    ): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: js.UndefOr[scala.Nothing], timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: js.UndefOr[scala.Nothing], timePrecision: Boolean, top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: js.UndefOr[scala.Nothing], top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean, top: Double): js.Promise[WorkItemQueryResult] = js.native
    
    def queryWorkItemsForArtifactUris(artifactUriQuery: ArtifactUriQuery): js.Promise[ArtifactUriQueryResult] = js.native
    
    def readReportingRevisionsGet(
      project: js.UndefOr[String],
      fields: js.UndefOr[js.Array[String]],
      types: js.UndefOr[js.Array[String]],
      continuationToken: js.UndefOr[String],
      startDateTime: js.UndefOr[Date],
      includeIdentityRef: js.UndefOr[Boolean],
      includeDeleted: js.UndefOr[Boolean],
      includeTagRef: js.UndefOr[Boolean],
      includeLatestOnly: js.UndefOr[Boolean],
      expand: js.UndefOr[ReportingRevisionsExpand],
      includeDiscussionChangesOnly: js.UndefOr[Boolean],
      maxPageSize: js.UndefOr[Double]
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: js.UndefOr[scala.Nothing],
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: String
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: String,
      startDateTime: js.UndefOr[scala.Nothing],
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: String,
      startDateTime: Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: js.UndefOr[scala.Nothing],
      continuationToken: String,
      startDateTime: Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: js.UndefOr[scala.Nothing],
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: js.UndefOr[scala.Nothing],
      startDateTime: Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String, continuationToken: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: js.UndefOr[scala.Nothing],
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    
    def replaceTemplate(templateContent: WorkItemTemplate, teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double): js.Promise[WorkItemDelete] = js.native
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    
    def searchQueries(project: String, filter: String): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(
      project: String,
      filter: String,
      top: js.UndefOr[scala.Nothing],
      expand: js.UndefOr[scala.Nothing],
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: js.UndefOr[scala.Nothing], expand: QueryExpand): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(
      project: String,
      filter: String,
      top: js.UndefOr[scala.Nothing],
      expand: QueryExpand,
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(
      project: String,
      filter: String,
      top: Double,
      expand: js.UndefOr[scala.Nothing],
      includeDeleted: Boolean
    ): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    
    def updateClassificationNode(postedNode: WorkItemClassificationNode, project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def updateClassificationNode(
      postedNode: WorkItemClassificationNode,
      project: String,
      structureGroup: TreeStructureGroup,
      path: String
    ): js.Promise[WorkItemClassificationNode] = js.native
    
    def updateField(workItemField: WorkItemField, fieldNameOrRefName: String): js.Promise[Unit] = js.native
    def updateField(workItemField: WorkItemField, fieldNameOrRefName: String, project: String): js.Promise[Unit] = js.native
    
    def updateQuery(queryUpdate: QueryHierarchyItem, project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def updateQuery(queryUpdate: QueryHierarchyItem, project: String, query: String, undeleteDescendants: Boolean): js.Promise[QueryHierarchyItem] = js.native
    
    def updateWorkItem(customHeaders: js.Any, document: JsonPatchDocument, id: Double): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: js.UndefOr[scala.Nothing],
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: js.UndefOr[scala.Nothing],
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(customHeaders: js.Any, document: JsonPatchDocument, id: Double, validateOnly: Boolean): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: js.UndefOr[scala.Nothing],
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: js.Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel): js.Promise[ProvisioningResult] = js.native
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel, project: String): js.Promise[ProvisioningResult] = js.native
  }
  
  @js.native
  class WorkItemTrackingApi protected () extends IWorkItemTrackingApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  @js.native
  object WorkItemTrackingApi extends js.Object {
    
    val RESOURCE_AREA_ID: String = js.native
  }
}
