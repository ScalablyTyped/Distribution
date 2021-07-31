package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeClass extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with WorkItemTypeClass
  /* 2 */ val Custom: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.Custom & Double = js.native
  
  @js.native
  sealed trait Derived
    extends StObject
       with WorkItemTypeClass
  /* 1 */ val Derived: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.Derived & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with WorkItemTypeClass
  /* 0 */ val System: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.WorkItemTypeClass.System & Double = js.native
}
