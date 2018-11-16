package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  sealed trait AllPermissions
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /**
       * Permission to delete this plan.
       */
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /**
       * Permission to update this plan.
       */
  @js.native
  sealed trait Edit
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /**
       * Permission to manage this plan.
       */
  @js.native
  sealed trait Manage
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /**
       * None
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /**
       * Permission to view this plan.
       */
  @js.native
  sealed trait View
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions
  
  /* 15 */ val AllPermissions: AllPermissions with scala.Double = js.native
  /* 4 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Edit: Edit with scala.Double = js.native
  /* 8 */ val Manage: Manage with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanUserPermissions with scala.Double
  ] = js.native
}

