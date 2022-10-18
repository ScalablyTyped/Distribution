package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.CreateProcessModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.FieldModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.FieldRuleModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.GetProcessExpandLevel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.GetWorkItemTypeExpand
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.UpdateProcessModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemBehavior
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemStateResultModel
import typings.vsoNodeApi.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workItemTrackingProcessApiMod {
  
  @JSImport("vso-node-api/WorkItemTrackingProcessApi", "WorkItemTrackingProcessApi")
  @js.native
  open class WorkItemTrackingProcessApi protected () extends IWorkItemTrackingProcessApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IWorkItemTrackingProcessApi extends ClientApiBase {
    
    def addWorkItemTypeRule(fieldRule: FieldRuleModel, processId: String, witRefName: String): js.Promise[FieldRuleModel] = js.native
    
    def createProcess(createRequest: CreateProcessModel): js.Promise[ProcessModel] = js.native
    
    def deleteProcess(processTypeId: String): js.Promise[Unit] = js.native
    
    def deleteWorkItemTypeRule(processId: String, witRefName: String, ruleId: String): js.Promise[Unit] = js.native
    
    def getBehavior(processId: String, behaviorRefName: String): js.Promise[WorkItemBehavior] = js.native
    def getBehavior(processId: String, behaviorRefName: String, expand: GetBehaviorsExpand): js.Promise[WorkItemBehavior] = js.native
    
    def getBehaviors(processId: String): js.Promise[js.Array[WorkItemBehavior]] = js.native
    def getBehaviors(processId: String, expand: GetBehaviorsExpand): js.Promise[js.Array[WorkItemBehavior]] = js.native
    
    def getFields(processId: String): js.Promise[js.Array[FieldModel]] = js.native
    
    def getProcessById(processTypeId: String): js.Promise[ProcessModel] = js.native
    def getProcessById(processTypeId: String, expand: GetProcessExpandLevel): js.Promise[ProcessModel] = js.native
    
    def getProcesses(): js.Promise[js.Array[ProcessModel]] = js.native
    def getProcesses(expand: GetProcessExpandLevel): js.Promise[js.Array[ProcessModel]] = js.native
    
    def getStateDefinition(processId: String, witRefName: String, stateId: String): js.Promise[WorkItemStateResultModel] = js.native
    
    def getStateDefinitions(processId: String, witRefName: String): js.Promise[js.Array[WorkItemStateResultModel]] = js.native
    
    def getWorkItemType(processId: String, witRefName: String): js.Promise[WorkItemTypeModel] = js.native
    def getWorkItemType(processId: String, witRefName: String, expand: GetWorkItemTypeExpand): js.Promise[WorkItemTypeModel] = js.native
    
    def getWorkItemTypeFields(processId: String, witRefName: String): js.Promise[js.Array[FieldModel]] = js.native
    
    def getWorkItemTypeRule(processId: String, witRefName: String, ruleId: String): js.Promise[FieldRuleModel] = js.native
    
    def getWorkItemTypeRules(processId: String, witRefName: String): js.Promise[js.Array[FieldRuleModel]] = js.native
    
    def getWorkItemTypes(processId: String): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    def getWorkItemTypes(processId: String, expand: GetWorkItemTypeExpand): js.Promise[js.Array[WorkItemTypeModel]] = js.native
    
    def updateProcess(updateRequest: UpdateProcessModel, processTypeId: String): js.Promise[ProcessModel] = js.native
    
    def updateWorkItemTypeRule(fieldRule: FieldRuleModel, processId: String, witRefName: String, ruleId: String): js.Promise[FieldRuleModel] = js.native
  }
}
