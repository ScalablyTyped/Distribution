package typings.vsoDashNodeDashApi

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorCreateModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorReplaceModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldUpdate
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FormLayout
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.HideStateModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListMetadataModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateInputModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeUpdateModel
import typings.vsoDashNodeDashApi.workItemTrackingProcessDefinitionsApiMod.IWorkItemTrackingProcessDefinitionsApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WorkItemTrackingProcessDefinitionsApi", JSImport.Namespace)
@js.native
object workItemTrackingProcessDefinitionsApiMod extends js.Object {
  @js.native
  trait IWorkItemTrackingProcessDefinitionsApi extends ClientApiBase {
    def addBehaviorToWorkItemType(behavior: WorkItemTypeBehavior, processId: String, witRefNameForBehaviors: String): js.Promise[WorkItemTypeBehavior] = js.native
    def addControlToGroup(control: Control, processId: String, witRefName: String, groupId: String): js.Promise[Control] = js.native
    def addFieldToWorkItemType(field: WorkItemTypeFieldModel, processId: String, witRefNameForFields: String): js.Promise[WorkItemTypeFieldModel] = js.native
    def addGroup(group: Group, processId: String, witRefName: String, pageId: String, sectionId: String): js.Promise[Group] = js.native
    def addPage(page: Page, processId: String, witRefName: String): js.Promise[Page] = js.native
    def createBehavior(behavior: BehaviorCreateModel, processId: String): js.Promise[BehaviorModel] = js.native
    def createField(field: FieldModel, processId: String): js.Promise[FieldModel] = js.native
    def createList(picklist: PickListModel): js.Promise[PickListModel] = js.native
    def createStateDefinition(stateModel: WorkItemStateInputModel, processId: String, witRefName: String): js.Promise[WorkItemStateResultModel] = js.native
    def createWorkItemType(workItemType: WorkItemTypeModel, processId: String): js.Promise[WorkItemTypeModel] = js.native
    def deleteBehavior(processId: String, behaviorId: String): js.Promise[Unit] = js.native
    def deleteList(listId: String): js.Promise[Unit] = js.native
    def deleteStateDefinition(processId: String, witRefName: String, stateId: String): js.Promise[Unit] = js.native
    def deleteWorkItemType(processId: String, witRefName: String): js.Promise[Unit] = js.native
    def editControl(control: Control, processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Control] = js.native
    def editGroup(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String
    ): js.Promise[Group] = js.native
    def editPage(page: Page, processId: String, witRefName: String): js.Promise[Page] = js.native
    def getBehavior(processId: String, behaviorId: String): js.Promise[BehaviorModel] = js.native
    def getBehaviorForWorkItemType(processId: String, witRefNameForBehaviors: String, behaviorRefName: String): js.Promise[WorkItemTypeBehavior] = js.native
    def getBehaviors(processId: String): js.Promise[js.Array[BehaviorModel]] = js.native
    def getBehaviorsForWorkItemType(processId: String, witRefNameForBehaviors: String): js.Promise[js.Array[WorkItemTypeBehavior]] = js.native
    def getFormLayout(processId: String, witRefName: String): js.Promise[FormLayout] = js.native
    def getList(listId: String): js.Promise[PickListModel] = js.native
    def getListsMetadata(): js.Promise[js.Array[PickListMetadataModel]] = js.native
    def getStateDefinition(processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    def getStateDefinitions(processId: String, witRefName: String): js.Promise[js.Array[WorkItemStateResultModel]] = js.native
    def getWorkItemType(processId: String, witRefName: String): js.Promise[WorkItemTypeModel] = js.native
    def getWorkItemType(processId: String, witRefName: String, expand: GetWorkItemTypeExpand): js.Promise[WorkItemTypeModel] = js.native
    def getWorkItemTypeField(processId: String, witRefNameForFields: String, fieldRefName: String): js.Promise[WorkItemTypeFieldModel] = js.native
    def getWorkItemTypeFields(processId: String, witRefNameForFields: String): js.Promise[js.Array[WorkItemTypeFieldModel]] = js.native
    def getWorkItemTypes(processId: String): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    def getWorkItemTypes(processId: String, expand: GetWorkItemTypeExpand): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    def hideStateDefinition(hideStateModel: HideStateModel, processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    def removeBehaviorFromWorkItemType(processId: String, witRefNameForBehaviors: String, behaviorRefName: String): js.Promise[Unit] = js.native
    def removeControlFromGroup(processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Unit] = js.native
    def removeFieldFromWorkItemType(processId: String, witRefNameForFields: String, fieldRefName: String): js.Promise[Unit] = js.native
    def removeGroup(processId: String, witRefName: String, pageId: String, sectionId: String, groupId: String): js.Promise[Unit] = js.native
    def removePage(processId: String, witRefName: String, pageId: String): js.Promise[Unit] = js.native
    def replaceBehavior(behaviorData: BehaviorReplaceModel, processId: String, behaviorId: String): js.Promise[BehaviorModel] = js.native
    def setControlInGroup(control: Control, processId: String, witRefName: String, groupId: String, controlId: String): js.Promise[Control] = js.native
    def setControlInGroup(
      control: Control,
      processId: String,
      witRefName: String,
      groupId: String,
      controlId: String,
      removeFromGroupId: String
    ): js.Promise[Control] = js.native
    def setGroupInPage(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String,
      removeFromPageId: String,
      removeFromSectionId: String
    ): js.Promise[Group] = js.native
    def setGroupInSection(
      group: Group,
      processId: String,
      witRefName: String,
      pageId: String,
      sectionId: String,
      groupId: String,
      removeFromSectionId: String
    ): js.Promise[Group] = js.native
    def updateBehaviorToWorkItemType(behavior: WorkItemTypeBehavior, processId: String, witRefNameForBehaviors: String): js.Promise[WorkItemTypeBehavior] = js.native
    def updateField(field: FieldUpdate, processId: String): js.Promise[FieldModel] = js.native
    def updateList(picklist: PickListModel, listId: String): js.Promise[PickListModel] = js.native
    def updateStateDefinition(stateModel: WorkItemStateInputModel, processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    def updateWorkItemType(workItemTypeUpdate: WorkItemTypeUpdateModel, processId: String, witRefName: String): js.Promise[WorkItemTypeModel] = js.native
  }
  
  @js.native
  class WorkItemTrackingProcessDefinitionsApi protected () extends IWorkItemTrackingProcessDefinitionsApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

