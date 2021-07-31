package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeClass extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with WorkItemTypeClass
  /* 2 */ val Custom: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.WorkItemTypeClass.Custom & Double = js.native
  
  @js.native
  sealed trait Derived
    extends StObject
       with WorkItemTypeClass
  /* 1 */ val Derived: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.WorkItemTypeClass.Derived & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with WorkItemTypeClass
  /* 0 */ val System: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.WorkItemTypeClass.System & Double = js.native
}
