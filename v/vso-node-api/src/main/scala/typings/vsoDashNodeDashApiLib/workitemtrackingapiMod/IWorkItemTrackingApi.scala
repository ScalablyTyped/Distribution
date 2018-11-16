package typings
package vsoDashNodeDashApiLib.workitemtrackingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkItemTrackingApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createAttachment(customHeaders: js.Any, contentStream: nodeLib.NodeJSNs.ReadableStream): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(customHeaders: js.Any, contentStream: nodeLib.NodeJSNs.ReadableStream, fileName: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    uploadType: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createAttachment(
    customHeaders: js.Any,
    contentStream: nodeLib.NodeJSNs.ReadableStream,
    fileName: java.lang.String,
    uploadType: java.lang.String,
    areaPath: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AttachmentReference
  ] = js.native
  def createOrUpdateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def createOrUpdateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def createQuery(
    postedQuery: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def createTemplate(
    template: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def createWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    `type`: java.lang.String,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean,
    suppressNotifications: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String,
    reclassifyId: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteField(fieldNameOrRefName: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteField(fieldNameOrRefName: java.lang.String, project: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteQuery(project: java.lang.String, query: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteTemplate(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def deleteWorkItem(id: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def deleteWorkItem(id: scala.Double, destroy: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def destroyWorkItem(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def destroyWorkItem(id: scala.Double, project: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def evaluateRulesOnField(ruleEngineInput: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldsToEvaluate): stdLib.Promise[scala.Unit] = js.native
  def exportWorkItemTypeDefinition(): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String, `type`: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def exportWorkItemTypeDefinition(project: java.lang.String, `type`: java.lang.String, exportGlobalLists: scala.Boolean): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplate
  ] = js.native
  def getAccountMyWorkData(): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountMyWorkResult
  ] = js.native
  def getAccountMyWorkData(queryOption: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryOption): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountMyWorkResult
  ] = js.native
  def getAttachmentContent(id: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentContent(id: java.lang.String, fileName: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(id: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getAttachmentZip(id: java.lang.String, fileName: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getClassificationNode(
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String,
    depth: scala.Double
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def getComment(id: scala.Double, revision: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComment] = js.native
  def getComments(id: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(id: scala.Double, fromRevision: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(id: scala.Double, fromRevision: scala.Double, top: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getComments(
    id: scala.Double,
    fromRevision: scala.Double,
    top: scala.Double,
    order: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemComments] = js.native
  def getDeletedWorkItem(id: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def getDeletedWorkItem(id: scala.Double, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def getDeletedWorkItemReferences(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemReference]
  ] = js.native
  def getDeletedWorkItemReferences(project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemReference]
  ] = js.native
  def getDeletedWorkItems(ids: js.Array[scala.Double]): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteReference
    ]
  ] = js.native
  def getDeletedWorkItems(ids: js.Array[scala.Double], project: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteReference
    ]
  ] = js.native
  def getField(fieldNameOrRefName: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField] = js.native
  def getField(fieldNameOrRefName: java.lang.String, project: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField] = js.native
  def getFields(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getFields(project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getFields(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField]
  ] = js.native
  def getQueries(project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQueries(
    project: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double,
    includeDeleted: scala.Boolean
  ): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem]
  ] = js.native
  def getQuery(project: java.lang.String, query: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getQuery(
    project: java.lang.String,
    query: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    depth: scala.Double,
    includeDeleted: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def getRecentActivityData(): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountRecentActivityWorkItemModel
    ]
  ] = js.native
  def getRecentMentions(): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.AccountRecentMentionWorkItemModel
    ]
  ] = js.native
  def getRelationType(relation: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRelationType
  ] = js.native
  def getRelationTypes(): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemRelationType
    ]
  ] = js.native
  def getReportingLinks(): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String, types: js.Array[java.lang.String]): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(project: java.lang.String, types: js.Array[java.lang.String], continuationToken: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getReportingLinks(
    project: java.lang.String,
    types: js.Array[java.lang.String],
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemLinksBatch
  ] = js.native
  def getRevision(id: scala.Double, revisionNumber: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getRevision(
    id: scala.Double,
    revisionNumber: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getRevisions(id: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(id: scala.Double, top: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(id: scala.Double, top: scala.Double, skip: scala.Double): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRevisions(
    id: scala.Double,
    top: scala.Double,
    skip: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getRootNodes(project: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
    ]
  ] = js.native
  def getRootNodes(project: java.lang.String, depth: scala.Double): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
    ]
  ] = js.native
  def getTemplate(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def getTemplates(teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplateReference
    ]
  ] = js.native
  def getTemplates(
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    workitemtypename: java.lang.String
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplateReference
    ]
  ] = js.native
  def getUpdate(id: scala.Double, updateNumber: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate] = js.native
  def getUpdates(id: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getUpdates(id: scala.Double, top: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getUpdates(id: scala.Double, top: scala.Double, skip: scala.Double): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemUpdate]
  ] = js.native
  def getWorkArtifactLinkTypes(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkArtifactLink]
  ] = js.native
  def getWorkItem(id: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(id: scala.Double, fields: js.Array[java.lang.String]): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(id: scala.Double, fields: js.Array[java.lang.String], asOf: stdLib.Date): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItem(
    id: scala.Double,
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemIconJson(icon: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconJson(icon: java.lang.String, color: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconJson(icon: java.lang.String, color: java.lang.String, v: scala.Double): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon] = js.native
  def getWorkItemIconSvg(icon: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIconSvg(icon: java.lang.String, color: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIconSvg(icon: java.lang.String, color: java.lang.String, v: scala.Double): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getWorkItemIcons(): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemIcon]
  ] = js.native
  def getWorkItemNextStatesOnCheckinAction(ids: js.Array[scala.Double]): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemNextStateOnTransition
    ]
  ] = js.native
  def getWorkItemNextStatesOnCheckinAction(ids: js.Array[scala.Double], action: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemNextStateOnTransition
    ]
  ] = js.native
  def getWorkItemStateColors(projectNames: js.Array[java.lang.String]): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProjectWorkItemStateColors
    ]
  ] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String, fields: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(project: java.lang.String, `type`: java.lang.String, fields: java.lang.String, asOf: stdLib.Date): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemTemplate(
    project: java.lang.String,
    `type`: java.lang.String,
    fields: java.lang.String,
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def getWorkItemType(project: java.lang.String, `type`: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemType] = js.native
  def getWorkItemTypeCategories(project: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeCategory
    ]
  ] = js.native
  def getWorkItemTypeCategory(project: java.lang.String, category: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeCategory
  ] = js.native
  def getWorkItemTypeColorAndIcons(projectNames: js.Array[java.lang.String]): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.Anon_KeyValueStringArray]] = js.native
  def getWorkItemTypeColors(projectNames: js.Array[java.lang.String]): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.Anon_KeyValueStringArrayWorkItemTypeColor]] = js.native
  def getWorkItemTypeField(project: java.lang.String, `type`: java.lang.String, field: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
  ] = js.native
  def getWorkItemTypeField(
    project: java.lang.String,
    `type`: java.lang.String,
    field: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
  ] = js.native
  def getWorkItemTypeFields(project: java.lang.String, `type`: java.lang.String): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
    ]
  ] = js.native
  def getWorkItemTypeFields(
    project: java.lang.String,
    `type`: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldInstance
    ]
  ] = js.native
  def getWorkItemTypeStates(project: java.lang.String, `type`: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemStateColor]
  ] = js.native
  def getWorkItemTypes(project: java.lang.String): stdLib.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemType]
  ] = js.native
  def getWorkItems(ids: js.Array[scala.Double]): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(ids: js.Array[scala.Double], fields: js.Array[java.lang.String]): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(ids: js.Array[scala.Double], fields: js.Array[java.lang.String], asOf: stdLib.Date): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(
    ids: js.Array[scala.Double],
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def getWorkItems(
    ids: js.Array[scala.Double],
    fields: js.Array[java.lang.String],
    asOf: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand,
    errorPolicy: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem]] = js.native
  def queryById(id: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryById(id: java.lang.String, teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryById(
    id: java.lang.String,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryByWiql(
    wiql: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.Wiql,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    timePrecision: scala.Boolean,
    top: scala.Double
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemQueryResult
  ] = js.native
  def queryWorkItemsForArtifactUris(artifactUriQuery: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ArtifactUriQuery): stdLib.Promise[
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
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def readReportingRevisionsPost(
    filter: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsFilter,
    project: java.lang.String,
    continuationToken: java.lang.String,
    startDateTime: stdLib.Date,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingWorkItemRevisionsBatch
  ] = js.native
  def replaceTemplate(
    templateContent: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate,
    teamContext: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamContext,
    templateId: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTemplate] = js.native
  def restoreWorkItem(
    payload: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteUpdate,
    id: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def restoreWorkItem(
    payload: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDeleteUpdate,
    id: scala.Double,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemDelete] = js.native
  def searchQueries(project: java.lang.String, filter: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(project: java.lang.String, filter: java.lang.String, top: scala.Double): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(
    project: java.lang.String,
    filter: java.lang.String,
    top: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def searchQueries(
    project: java.lang.String,
    filter: java.lang.String,
    top: scala.Double,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryExpand,
    includeDeleted: scala.Boolean
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItemsResult
  ] = js.native
  def updateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def updateClassificationNode(
    postedNode: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode,
    project: java.lang.String,
    structureGroup: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TreeStructureGroup,
    path: java.lang.String
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemClassificationNode
  ] = js.native
  def updateField(
    workItemField: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField,
    fieldNameOrRefName: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updateField(
    workItemField: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemField,
    fieldNameOrRefName: java.lang.String,
    project: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updateQuery(
    queryUpdate: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def updateQuery(
    queryUpdate: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem,
    project: java.lang.String,
    query: java.lang.String,
    undeleteDescendants: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.QueryHierarchyItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItem(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    id: scala.Double,
    validateOnly: scala.Boolean,
    bypassRules: scala.Boolean,
    suppressNotifications: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItem] = js.native
  def updateWorkItemTypeDefinition(
    updateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningResult] = js.native
  def updateWorkItemTypeDefinition(
    updateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeTemplateUpdateModel,
    project: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ProvisioningResult] = js.native
}

