package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.AllPermissions
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Delete
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Edit
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.Manage
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.None
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanUserPermissions.View
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanUserPermissions with Double] = js.native
  /* 15 */ @js.native
  object AllPermissions extends TopLevel[AllPermissions with Double]
  
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 2 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 8 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
  
}

