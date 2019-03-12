package typings
package vsoDashNodeDashApiLib.workItemTrackingApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkItemTrackingApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def createAttachment(customHeaders: js.Any, contentStream: nodeLib.NodeJSNs.ReadableStream): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(customHeaders: js.Any, contentStream: nodeLib.NodeJSNs.ReadableStream, fileName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    uploadType: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    uploadType: java.lang.String,
    areaPath: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createOrUpdateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def createOrUpdateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def createQuery(
    postedQuery: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def createTemplate(
    template: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean,
    suppressNotifications: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): js.Promise[scala.Unit] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String,
    reclassifyId: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def deleteField(fieldNameOrRefName: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteField(fieldNameOrRefName: java.lang.String, project: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteQuery(project: java.lang.String, query: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTemplate(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def deleteWorkItem(id: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def deleteWorkItem(id: scala.Double, destroy: scala.Boolean): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def destroyWorkItem(id: scala.Double): js.Promise[scala.Unit] = js.native
  def destroyWorkItem(id: scala.Double, project: java.lang.String): js.Promise[scala.Unit] = js.native
  def evaluateRulesOnField(ruleEngineInput: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldsToEvaluate): js.Promise[scala.Unit] = js.native
  def exportWorkItemTypeDefinition(): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String, `type`: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String, `type`: java.lang.String, exportGlobalLists: scala.Boolean): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def getAccountMyWorkData(): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountMyWorkResult
  ] = js.native
  def getAccountMyWorkData(queryOption: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountMyWorkResult
  ] = js.native
  def getAttachmentContent(id: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentContent(id: java.lang.String, fileName: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(id: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(id: java.lang.String, fileName: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String,
    depth: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getComment(id: scala.Double, revision: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComment] = js.native
  def getComments(id: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(id: scala.Double, fromRevision: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(id: scala.Double, fromRevision: scala.Double, top: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(
    id: scala.Double,
    fromRevision: scala.Double,
    top: scala.Double,
    order: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getDeletedWorkItem(id: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def getDeletedWorkItem(id: scala.Double, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def getDeletedWorkItemReferences(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemReference]
  ] = js.native
  def getDeletedWorkItemReferences(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemReference]
  ] = js.native
  def getDeletedWorkItems(ids: js.Array[scala.Double]): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteReference
    ]
  ] = js.native
  def getDeletedWorkItems(ids: js.Array[scala.Double], project: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteReference
    ]
  ] = js.native
  def getField(fieldNameOrRefName: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField] = js.native
  def getField(fieldNameOrRefName: java.lang.String, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField] = js.native
  def getFields(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getFields(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getFields(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getQueries(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double,
    includeDeleted: scala.Boolean
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQuery(project: java.lang.String, query: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double,
    includeDeleted: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getRecentActivityData(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountRecentActivityWorkItemModel
    ]
  ] = js.native
  def getRecentMentions(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountRecentMentionWorkItemModel
    ]
  ] = js.native
  def getRelationType(relation: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRelationType
  ] = js.native
  def getRelationTypes(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRelationType
    ]
  ] = js.native
  def getReportingLinks(): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String, types: js.Array[java.lang.String]): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String, types: js.Array[java.lang.String], continuationToken: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(
    project: java.lang.String,
    types: js.Array[java.lang.String],
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getRevision(id: scala.Double, revisionNumber: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getRevision(
    id: scala.Double,
    revisionNumber: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getRevisions(id: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(id: scala.Double, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(id: scala.Double, top: scala.Double, skip: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(
    id: scala.Double,
    top: scala.Double,
    skip: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRootNodes(project: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
    ]
  ] = js.native
  def getRootNodes(project: java.lang.String, depth: scala.Double): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
    ]
  ] = js.native
  def getTemplate(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def getTemplates(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplateReference
    ]
  ] = js.native
  def getTemplates(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    workitemtypename: java.lang.String
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplateReference
    ]
  ] = js.native
  def getUpdate(id: scala.Double, updateNumber: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate] = js.native
  def getUpdates(id: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getUpdates(id: scala.Double, top: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getUpdates(id: scala.Double, top: scala.Double, skip: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getWorkArtifactLinkTypes(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkArtifactLink]
  ] = js.native
  def getWorkItem(id: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(id: scala.Double, fields: js.Array[java.lang.String]): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(id: scala.Double, fields: js.Array[java.lang.String], asOf: stdLib.Date): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(
    id: scala.Double,
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemIconJson(icon: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconJson(icon: java.lang.String, color: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconJson(icon: java.lang.String, color: java.lang.String, v: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconSvg(icon: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIconSvg(icon: java.lang.String, color: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIconSvg(icon: java.lang.String, color: java.lang.String, v: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIcons(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon]
  ] = js.native
  def getWorkItemNextStatesOnCheckinAction(ids: js.Array[scala.Double]): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemNextStateOnTransition
    ]
  ] = js.native
  def getWorkItemNextStatesOnCheckinAction(ids: js.Array[scala.Double], action: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemNextStateOnTransition
    ]
  ] = js.native
  def getWorkItemStateColors(projectNames: js.Array[java.lang.String]): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProjectWorkItemStateColors
    ]
  ] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String, fields: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String, fields: java.lang.String, asOf: stdLib.Date): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(
    project: java.lang.String,
    `type`: java.lang.String,
    fields: java.lang.String,
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemType(project: java.lang.String, `type`: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemType] = js.native
  def getWorkItemTypeCategories(project: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeCategory
    ]
  ] = js.native
  def getWorkItemTypeCategory(project: java.lang.String, category: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeCategory
  ] = js.native
  def getWorkItemTypeColorAndIcons(projectNames: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.Anon_KeyValue]] = js.native
  def getWorkItemTypeColors(projectNames: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.Anon_Key]] = js.native
  def getWorkItemTypeField(project: java.lang.String, `type`: java.lang.String, field: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
  ] = js.native
  def getWorkItemTypeField(
    project: java.lang.String,
    `type`: java.lang.String,
    field: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
  ] = js.native
  def getWorkItemTypeFields(project: java.lang.String, `type`: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
    ]
  ] = js.native
  def getWorkItemTypeFields(
    project: java.lang.String,
    `type`: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
    ]
  ] = js.native
  def getWorkItemTypeStates(project: java.lang.String, `type`: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemStateColor]
  ] = js.native
  def getWorkItemTypes(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemType]
  ] = js.native
  def getWorkItems(ids: js.Array[scala.Double]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(ids: js.Array[scala.Double], fields: js.Array[java.lang.String]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(ids: js.Array[scala.Double], fields: js.Array[java.lang.String], asOf: stdLib.Date): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(
    ids: js.Array[scala.Double],
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(
    ids: js.Array[scala.Double],
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand,
    errorPolicy: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def queryById(id: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryById(id: java.lang.String, teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryById(
    id: java.lang.String,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean,
    top: scala.Double
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryWorkItemsForArtifactUris(artifactUriQuery: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ArtifactUriQuery): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ArtifactUriQueryResult
  ] = js.native
  def readReportingRevisionsGet(
    project: js.UndefOr[java.lang.String],
    fields: js.UndefOr[js.Array[java.lang.String]],
    types: js.UndefOr[js.Array[java.lang.String]],
    continuationToken: js.UndefOr[java.lang.String],
    startDateTime: js.UndefOr[stdLib.Date],
    includeIdentityRef: js.UndefOr[scala.Boolean],
    includeDeleted: js.UndefOr[scala.Boolean],
    includeTagRef: js.UndefOr[scala.Boolean],
    includeLatestOnly: js.UndefOr[scala.Boolean],
    expand: js.UndefOr[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
    ],
    includeDiscussionChangesOnly: js.UndefOr[scala.Boolean],
    maxPageSize: js.UndefOr[scala.Double]
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def replaceTemplate(
    templateContent: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def restoreWorkItem(
    payload: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteUpdate,
    id: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def restoreWorkItem(
    payload: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteUpdate,
    id: scala.Double,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def searchQueries(project: java.lang.String, filter: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(project: java.lang.String, filter: java.lang.String, top: scala.Double): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(
    project: java.lang.String,
    filter: java.lang.String,
    top: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(
    project: java.lang.String,
    filter: java.lang.String,
    top: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    includeDeleted: scala.Boolean
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def updateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def updateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def updateField(
    workItemField: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField,
    fieldNameOrRefName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def updateField(
    workItemField: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField,
    fieldNameOrRefName: java.lang.String,
    project: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def updateQuery(
    queryUpdate: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def updateQuery(
    queryUpdate: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String,
    undeleteDescendants: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean,
    suppressNotifications: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItemTypeDefinition(
    updateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningResult] = js.native
  def updateWorkItemTypeDefinition(
    updateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningResult] = js.native
}

