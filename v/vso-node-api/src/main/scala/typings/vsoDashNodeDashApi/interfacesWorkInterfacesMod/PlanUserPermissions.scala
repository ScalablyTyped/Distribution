package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlanUserPermissions extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanUserPermissions")
@js.native
object PlanUserPermissions extends js.Object {
  /**
    * Full control permission for this plan.
    */
  @js.native
  sealed trait AllPermissions extends PlanUserPermissions
  
  /**
    * Permission to delete this plan.
    */
  @js.native
  sealed trait Delete extends PlanUserPermissions
  
  /**
    * Permission to update this plan.
    */
  @js.native
  sealed trait Edit extends PlanUserPermissions
  
  /**
    * Permission to manage this plan.
    */
  @js.native
  sealed trait Manage extends PlanUserPermissions
  
  /**
    * None
    */
  @js.native
  sealed trait None extends PlanUserPermissions
  
  /**
    * Permission to view this plan.
    */
  @js.native
  sealed trait View extends PlanUserPermissions
  
  /* 15 */ val AllPermissions: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.AllPermissions with Double = js.native
  /* 4 */ val Delete: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Delete with Double = js.native
  /* 2 */ val Edit: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Edit with Double = js.native
  /* 8 */ val Manage: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.None with Double = js.native
  /* 1 */ val View: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.View with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanUserPermissions with Double] = js.native
}

