package typings
package vsoDashNodeDashApiLib.workitemtrackingprocessapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkItemTrackingProcessApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def addWorkItemTypeRule(
    fieldRule: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel,
    processId: java.lang.String,
    witRefName: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel
  ] = js.native
  def createProcess(
    createRequest: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.CreateProcessModel
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
  ] = js.native
  def deleteProcess(processTypeId: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteWorkItemTypeRule(processId: java.lang.String, witRefName: java.lang.String, ruleId: java.lang.String): js.Promise[scala.Unit] = js.native
  def getBehavior(processId: java.lang.String, behaviorRefName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemBehavior
  ] = js.native
  def getBehavior(
    processId: java.lang.String,
    behaviorRefName: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemBehavior
  ] = js.native
  def getBehaviors(processId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemBehavior
    ]
  ] = js.native
  def getBehaviors(
    processId: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemBehavior
    ]
  ] = js.native
  def getFields(processId: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldModel]
  ] = js.native
  def getProcessById(processTypeId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
  ] = js.native
  def getProcessById(
    processTypeId: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
  ] = js.native
  def getProcesses(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
    ]
  ] = js.native
  def getProcesses(expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
    ]
  ] = js.native
  def getStateDefinition(processId: java.lang.String, witRefName: java.lang.String, stateId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemStateResultModel
  ] = js.native
  def getStateDefinitions(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemStateResultModel
    ]
  ] = js.native
  def getWorkItemType(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeModel
  ] = js.native
  def getWorkItemType(
    processId: java.lang.String,
    witRefName: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeModel
  ] = js.native
  def getWorkItemTypeFields(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldModel]
  ] = js.native
  def getWorkItemTypeRule(processId: java.lang.String, witRefName: java.lang.String, ruleId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel
  ] = js.native
  def getWorkItemTypeRules(processId: java.lang.String, witRefName: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel
    ]
  ] = js.native
  def getWorkItemTypes(processId: java.lang.String): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeModel
    ]
  ] = js.native
  def getWorkItemTypes(
    processId: java.lang.String,
    expand: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeModel
    ]
  ] = js.native
  def updateProcess(
    updateRequest: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.UpdateProcessModel,
    processTypeId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
  ] = js.native
  def updateWorkItemTypeRule(
    fieldRule: vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel,
    processId: java.lang.String,
    witRefName: java.lang.String,
    ruleId: java.lang.String
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel
  ] = js.native
}

