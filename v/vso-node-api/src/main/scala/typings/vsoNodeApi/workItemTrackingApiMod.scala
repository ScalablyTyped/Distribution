package typings.vsoNodeApi

import typings.node.NodeJS.ReadableStream
import typings.vsoNodeApi.anon.Key
import typings.vsoNodeApi.anon.Value
import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.JsonPatchDocument
import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamContext
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.AccountMyWorkResult
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.AccountRecentActivityWorkItemModel
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.AccountRecentMentionWorkItemModel
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ArtifactUriQuery
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ArtifactUriQueryResult
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldsToEvaluate
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ProjectWorkItemStateColors
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ProvisioningResult
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.QueryOption
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.Wiql
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkArtifactLink
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItem
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemComment
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemComments
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteReference
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteUpdate
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemField
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemNextStateOnTransition
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemReference
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemRelationType
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemStateColor
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplateReference
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemType
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeCategory
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel
import typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workItemTrackingApiMod {
  
  @JSImport("vso-node-api/WorkItemTrackingApi", "WorkItemTrackingApi")
  @js.native
  open class WorkItemTrackingApi protected () extends IWorkItemTrackingApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object WorkItemTrackingApi {
    
    @JSImport("vso-node-api/WorkItemTrackingApi", "WorkItemTrackingApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IWorkItemTrackingApi extends ClientApiBase {
    
    def createAttachment(customHeaders: Any, contentStream: ReadableStream): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: Any, contentStream: ReadableStream, fileName: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: Any, contentStream: ReadableStream, fileName: String, uploadType: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: String,
      uploadType: String,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: String,
      uploadType: Unit,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(customHeaders: Any, contentStream: ReadableStream, fileName: Unit, uploadType: String): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: Unit,
      uploadType: String,
      areaPath: String
    ): js.Promise[AttachmentReference] = js.native
    def createAttachment(
      customHeaders: Any,
      contentStream: ReadableStream,
      fileName: Unit,
      uploadType: Unit,
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
    
    def createWorkItem(customHeaders: Any, document: JsonPatchDocument, project: String, `type`: String): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Boolean,
      bypassRules: Unit,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Unit,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Unit,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def createWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      project: String,
      `type`: String,
      validateOnly: Unit,
      bypassRules: Unit,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, reclassifyId: Double): js.Promise[Unit] = js.native
    def deleteClassificationNode(project: String, structureGroup: TreeStructureGroup, path: Unit, reclassifyId: Double): js.Promise[Unit] = js.native
    
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
    def exportWorkItemTypeDefinition(project: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: String, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: String, `type`: Unit, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: Unit, `type`: String): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: Unit, `type`: String, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    def exportWorkItemTypeDefinition(project: Unit, `type`: Unit, exportGlobalLists: Boolean): js.Promise[WorkItemTypeTemplate] = js.native
    
    def getAccountMyWorkData(): js.Promise[AccountMyWorkResult] = js.native
    def getAccountMyWorkData(queryOption: QueryOption): js.Promise[AccountMyWorkResult] = js.native
    
    def getAttachmentContent(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentContent(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getAttachmentZip(id: String): js.Promise[ReadableStream] = js.native
    def getAttachmentZip(id: String, fileName: String): js.Promise[ReadableStream] = js.native
    
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: String, depth: Double): js.Promise[WorkItemClassificationNode] = js.native
    def getClassificationNode(project: String, structureGroup: TreeStructureGroup, path: Unit, depth: Double): js.Promise[WorkItemClassificationNode] = js.native
    
    def getComment(id: Double, revision: Double): js.Promise[WorkItemComment] = js.native
    
    def getComments(id: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Double, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Double, top: Unit, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Unit, top: Double): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Unit, top: Double, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    def getComments(id: Double, fromRevision: Unit, top: Unit, order: CommentSortOrder): js.Promise[WorkItemComments] = js.native
    
    def getDeletedWorkItem(id: Double): js.Promise[WorkItemDelete] = js.native
    def getDeletedWorkItem(id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    
    def getDeletedWorkItemReferences(): js.Promise[js.Array[WorkItemReference]] = js.native
    def getDeletedWorkItemReferences(project: String): js.Promise[js.Array[WorkItemReference]] = js.native
    
    def getDeletedWorkItems(ids: js.Array[Double]): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    def getDeletedWorkItems(ids: js.Array[Double], project: String): js.Promise[js.Array[WorkItemDeleteReference]] = js.native
    
    def getField(fieldNameOrRefName: String): js.Promise[WorkItemField] = js.native
    def getField(fieldNameOrRefName: String, project: String): js.Promise[WorkItemField] = js.native
    
    def getFields(): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: String, expand: GetFieldsExpand): js.Promise[js.Array[WorkItemField]] = js.native
    def getFields(project: Unit, expand: GetFieldsExpand): js.Promise[js.Array[WorkItemField]] = js.native
    
    def getQueries(project: String): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: Unit, depth: Double): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: Unit, depth: Double, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: Unit, depth: Unit, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    def getQueries(project: String, expand: QueryExpand, depth: Unit, includeDeleted: Boolean): js.Promise[js.Array[QueryHierarchyItem]] = js.native
    
    def getQuery(project: String, query: String): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: Unit, depth: Double): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: Unit, depth: Double, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: Unit, depth: Unit, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Double, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    def getQuery(project: String, query: String, expand: QueryExpand, depth: Unit, includeDeleted: Boolean): js.Promise[QueryHierarchyItem] = js.native
    
    def getRecentActivityData(): js.Promise[js.Array[AccountRecentActivityWorkItemModel]] = js.native
    
    def getRecentMentions(): js.Promise[js.Array[AccountRecentMentionWorkItemModel]] = js.native
    
    def getRelationType(relation: String): js.Promise[WorkItemRelationType] = js.native
    
    def getRelationTypes(): js.Promise[js.Array[WorkItemRelationType]] = js.native
    
    def getReportingLinks(): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String]): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: String, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: js.Array[String], continuationToken: Unit, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: Unit, continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: Unit, continuationToken: String, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: String, types: Unit, continuationToken: Unit, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: js.Array[String]): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: js.Array[String], continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: js.Array[String], continuationToken: String, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: js.Array[String], continuationToken: Unit, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: Unit, continuationToken: String): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: Unit, continuationToken: String, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    def getReportingLinks(project: Unit, types: Unit, continuationToken: Unit, startDateTime: js.Date): js.Promise[ReportingWorkItemLinksBatch] = js.native
    
    def getRevision(id: Double, revisionNumber: Double): js.Promise[WorkItem] = js.native
    def getRevision(id: Double, revisionNumber: Double, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
    def getRevisions(id: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Double, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Double, skip: Unit, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Unit, skip: Double): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Unit, skip: Double, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getRevisions(id: Double, top: Unit, skip: Unit, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    
    def getRootNodes(project: String): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    def getRootNodes(project: String, depth: Double): js.Promise[js.Array[WorkItemClassificationNode]] = js.native
    
    def getTemplate(teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    
    def getTemplates(teamContext: TeamContext): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    def getTemplates(teamContext: TeamContext, workitemtypename: String): js.Promise[js.Array[WorkItemTemplateReference]] = js.native
    
    def getUpdate(id: Double, updateNumber: Double): js.Promise[WorkItemUpdate] = js.native
    
    def getUpdates(id: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Double, skip: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    def getUpdates(id: Double, top: Unit, skip: Double): js.Promise[js.Array[WorkItemUpdate]] = js.native
    
    def getWorkArtifactLinkTypes(): js.Promise[js.Array[WorkArtifactLink]] = js.native
    
    def getWorkItem(id: Double): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String]): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: js.Array[String], asOf: Unit, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: Unit, asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: Unit, asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItem(id: Double, fields: Unit, asOf: Unit, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
    def getWorkItemIconJson(icon: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: String, v: Double): js.Promise[WorkItemIcon] = js.native
    def getWorkItemIconJson(icon: String, color: Unit, v: Double): js.Promise[WorkItemIcon] = js.native
    
    def getWorkItemIconSvg(icon: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: String, v: Double): js.Promise[ReadableStream] = js.native
    def getWorkItemIconSvg(icon: String, color: Unit, v: Double): js.Promise[ReadableStream] = js.native
    
    def getWorkItemIcons(): js.Promise[js.Array[WorkItemIcon]] = js.native
    
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double]): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    def getWorkItemNextStatesOnCheckinAction(ids: js.Array[Double], action: String): js.Promise[js.Array[WorkItemNextStateOnTransition]] = js.native
    
    def getWorkItemStateColors(projectNames: js.Array[String]): js.Promise[js.Array[ProjectWorkItemStateColors]] = js.native
    
    def getWorkItemTemplate(project: String, `type`: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: String, asOf: Unit, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: Unit, asOf: js.Date): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: Unit, asOf: js.Date, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    def getWorkItemTemplate(project: String, `type`: String, fields: Unit, asOf: Unit, expand: WorkItemExpand): js.Promise[WorkItem] = js.native
    
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
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String]): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: js.Date): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.Date,
      expand: Unit,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: js.Date, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: js.Date,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: Unit,
      expand: Unit,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: js.Array[String], asOf: Unit, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: js.Array[String],
      asOf: Unit,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: Unit, asOf: js.Date): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: Unit, asOf: js.Date, expand: Unit, errorPolicy: WorkItemErrorPolicy): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: Unit, asOf: js.Date, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: Unit,
      asOf: js.Date,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: Unit, asOf: Unit, expand: Unit, errorPolicy: WorkItemErrorPolicy): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(ids: js.Array[Double], fields: Unit, asOf: Unit, expand: WorkItemExpand): js.Promise[js.Array[WorkItem]] = js.native
    def getWorkItems(
      ids: js.Array[Double],
      fields: Unit,
      asOf: Unit,
      expand: WorkItemExpand,
      errorPolicy: WorkItemErrorPolicy
    ): js.Promise[js.Array[WorkItem]] = js.native
    
    def queryById(id: String): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: Unit, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryById(id: String, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    
    def queryByWiql(wiql: Wiql): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: Unit, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: Unit, timePrecision: Boolean, top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: Unit, timePrecision: Unit, top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Boolean, top: Double): js.Promise[WorkItemQueryResult] = js.native
    def queryByWiql(wiql: Wiql, teamContext: TeamContext, timePrecision: Unit, top: Double): js.Promise[WorkItemQueryResult] = js.native
    
    def queryWorkItemsForArtifactUris(artifactUriQuery: ArtifactUriQuery): js.Promise[ArtifactUriQueryResult] = js.native
    
    def readReportingRevisionsGet(
      project: js.UndefOr[String],
      fields: js.UndefOr[js.Array[String]],
      types: js.UndefOr[js.Array[String]],
      continuationToken: js.UndefOr[String],
      startDateTime: js.UndefOr[js.Date],
      includeIdentityRef: js.UndefOr[Boolean],
      includeDeleted: js.UndefOr[Boolean],
      includeTagRef: js.UndefOr[Boolean],
      includeLatestOnly: js.UndefOr[Boolean],
      expand: js.UndefOr[ReportingRevisionsExpand],
      includeDiscussionChangesOnly: js.UndefOr[Boolean],
      maxPageSize: js.UndefOr[Double]
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: String, continuationToken: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: js.Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: js.Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: String,
      startDateTime: Unit,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: Unit,
      startDateTime: js.Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: Unit,
      startDateTime: js.Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: String,
      continuationToken: Unit,
      startDateTime: Unit,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(filter: ReportingWorkItemRevisionsFilter, project: Unit, continuationToken: String): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: String,
      startDateTime: js.Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: String,
      startDateTime: js.Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: String,
      startDateTime: Unit,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: Unit,
      startDateTime: js.Date
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: Unit,
      startDateTime: js.Date,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    def readReportingRevisionsPost(
      filter: ReportingWorkItemRevisionsFilter,
      project: Unit,
      continuationToken: Unit,
      startDateTime: Unit,
      expand: ReportingRevisionsExpand
    ): js.Promise[ReportingWorkItemRevisionsBatch] = js.native
    
    def replaceTemplate(templateContent: WorkItemTemplate, teamContext: TeamContext, templateId: String): js.Promise[WorkItemTemplate] = js.native
    
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double): js.Promise[WorkItemDelete] = js.native
    def restoreWorkItem(payload: WorkItemDeleteUpdate, id: Double, project: String): js.Promise[WorkItemDelete] = js.native
    
    def searchQueries(project: String, filter: String): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: Unit, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Double, expand: QueryExpand, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Unit, expand: Unit, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Unit, expand: QueryExpand): js.Promise[QueryHierarchyItemsResult] = js.native
    def searchQueries(project: String, filter: String, top: Unit, expand: QueryExpand, includeDeleted: Boolean): js.Promise[QueryHierarchyItemsResult] = js.native
    
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
    
    def updateWorkItem(customHeaders: Any, document: JsonPatchDocument, id: Double): js.Promise[WorkItem] = js.native
    def updateWorkItem(customHeaders: Any, document: JsonPatchDocument, id: Double, validateOnly: Boolean): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Boolean,
      bypassRules: Unit,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Unit,
      bypassRules: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Unit,
      bypassRules: Boolean,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    def updateWorkItem(
      customHeaders: Any,
      document: JsonPatchDocument,
      id: Double,
      validateOnly: Unit,
      bypassRules: Unit,
      suppressNotifications: Boolean
    ): js.Promise[WorkItem] = js.native
    
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel): js.Promise[ProvisioningResult] = js.native
    def updateWorkItemTypeDefinition(updateModel: WorkItemTypeTemplateUpdateModel, project: String): js.Promise[ProvisioningResult] = js.native
  }
}
