package typings
package vsoDashNodeDashApiLib.workitemtrackingprocessdefinitionsapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkItemTrackingProcessDefinitionsApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def addBehaviorToWorkItemType(
    behavior: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior,
    processId: java.lang.String,
    witRefNameForBehaviors: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
  ] = js.native
  def addControlToGroup(
    control: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control,
    processId: java.lang.String,
    witRefName: java.lang.String,
    groupId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
  ] = js.native
  def addFieldToWorkItemType(
    field: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel,
    processId: java.lang.String,
    witRefNameForFields: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel
  ] = js.native
  def addGroup(
    group: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group,
    processId: java.lang.String,
    witRefName: java.lang.String,
    pageId: java.lang.String,
    sectionId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
  ] = js.native
  def addPage(
    page: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page,
    processId: java.lang.String,
    witRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page
  ] = js.native
  def createBehavior(
    behavior: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorCreateModel,
    processId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
  ] = js.native
  def createField(
    field: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldModel,
    processId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldModel
  ] = js.native
  def createList(
    picklist: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
  ] = js.native
  def createStateDefinition(
    stateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateInputModel,
    processId: java.lang.String,
    witRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
  ] = js.native
  def createWorkItemType(
    workItemType: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel,
    processId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
  ] = js.native
  def deleteBehavior(processId: java.lang.String, behaviorId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteList(listId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteStateDefinition(processId: java.lang.String, witRefName: java.lang.String, stateId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteWorkItemType(processId: java.lang.String, witRefName: java.lang.String): js.Promise[scala.Unit] = js.native
  def editControl(
    control: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control,
    processId: java.lang.String,
    witRefName: java.lang.String,
    groupId: java.lang.String,
    controlId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
  ] = js.native
  def editGroup(
    group: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group,
    processId: java.lang.String,
    witRefName: java.lang.String,
    pageId: java.lang.String,
    sectionId: java.lang.String,
    groupId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
  ] = js.native
  def editPage(
    page: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page,
    processId: java.lang.String,
    witRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Page
  ] = js.native
  def getBehavior(processId: java.lang.String, behaviorId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
  ] = js.native
  def getBehaviorForWorkItemType(
    processId: java.lang.String,
    witRefNameForBehaviors: java.lang.String,
    behaviorRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
  ] = js.native
  def getBehaviors(processId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
    ]
  ] = js.native
  def getBehaviorsForWorkItemType(processId: java.lang.String, witRefNameForBehaviors: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
    ]
  ] = js.native
  def getFormLayout(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FormLayout
  ] = js.native
  def getList(listId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
  ] = js.native
  def getListsMetadata(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListMetadataModel
    ]
  ] = js.native
  def getStateDefinition(processId: java.lang.String, witRefName: java.lang.String, stateId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
  ] = js.native
  def getStateDefinitions(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
    ]
  ] = js.native
  def getWorkItemType(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
  ] = js.native
  def getWorkItemType(
    processId: java.lang.String,
    witRefName: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
  ] = js.native
  def getWorkItemTypeField(processId: java.lang.String, witRefNameForFields: java.lang.String, fieldRefName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel
  ] = js.native
  def getWorkItemTypeFields(processId: java.lang.String, witRefNameForFields: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeFieldModel
    ]
  ] = js.native
  def getWorkItemTypes(processId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
    ]
  ] = js.native
  def getWorkItemTypes(
    processId: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.GetWorkItemTypeExpand
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
    ]
  ] = js.native
  def hideStateDefinition(
    hideStateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.HideStateModel,
    processId: java.lang.String,
    witRefName: java.lang.String,
    stateId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
  ] = js.native
  def removeBehaviorFromWorkItemType(
    processId: java.lang.String,
    witRefNameForBehaviors: java.lang.String,
    behaviorRefName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def removeControlFromGroup(
    processId: java.lang.String,
    witRefName: java.lang.String,
    groupId: java.lang.String,
    controlId: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def removeFieldFromWorkItemType(processId: java.lang.String, witRefNameForFields: java.lang.String, fieldRefName: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeGroup(
    processId: java.lang.String,
    witRefName: java.lang.String,
    pageId: java.lang.String,
    sectionId: java.lang.String,
    groupId: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def removePage(processId: java.lang.String, witRefName: java.lang.String, pageId: java.lang.String): js.Promise[scala.Unit] = js.native
  def replaceBehavior(
    behaviorData: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorReplaceModel,
    processId: java.lang.String,
    behaviorId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.BehaviorModel
  ] = js.native
  def setControlInGroup(
    control: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control,
    processId: java.lang.String,
    witRefName: java.lang.String,
    groupId: java.lang.String,
    controlId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
  ] = js.native
  def setControlInGroup(
    control: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control,
    processId: java.lang.String,
    witRefName: java.lang.String,
    groupId: java.lang.String,
    controlId: java.lang.String,
    removeFromGroupId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Control
  ] = js.native
  def setGroupInPage(
    group: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group,
    processId: java.lang.String,
    witRefName: java.lang.String,
    pageId: java.lang.String,
    sectionId: java.lang.String,
    groupId: java.lang.String,
    removeFromPageId: java.lang.String,
    removeFromSectionId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
  ] = js.native
  def setGroupInSection(
    group: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group,
    processId: java.lang.String,
    witRefName: java.lang.String,
    pageId: java.lang.String,
    sectionId: java.lang.String,
    groupId: java.lang.String,
    removeFromSectionId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.Group
  ] = js.native
  def updateBehaviorToWorkItemType(
    behavior: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior,
    processId: java.lang.String,
    witRefNameForBehaviors: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeBehavior
  ] = js.native
  def updateField(
    field: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldUpdate,
    processId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.FieldModel
  ] = js.native
  def updateList(
    picklist: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel,
    listId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.PickListModel
  ] = js.native
  def updateStateDefinition(
    stateModel: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateInputModel,
    processId: java.lang.String,
    witRefName: java.lang.String,
    stateId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemStateResultModel
  ] = js.native
  def updateWorkItemType(
    workItemTypeUpdate: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeUpdateModel,
    processId: java.lang.String,
    witRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeModel
  ] = js.native
}

