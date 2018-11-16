package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemTypeClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends js.Object {
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass
  
  @js.native
  sealed trait Derived
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass
  
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass
  
  /* 2 */ val Custom: Custom with scala.Double = js.native
  /* 1 */ val Derived: Derived with scala.Double = js.native
  /* 0 */ val System: System with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.WorkItemTypeClass with scala.Double
  ] = js.native
}

