package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanUserPermissions extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanUserPermissions")
@js.native
object PlanUserPermissions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanUserPermissions with Double] = js.native
  
  /**
    * Full control permission for this plan.
    */
  @js.native
  sealed trait AllPermissions extends PlanUserPermissions
  /* 15 */ @js.native
  object AllPermissions extends TopLevel[AllPermissions with Double]
  
  /**
    * Permission to delete this plan.
    */
  @js.native
  sealed trait Delete extends PlanUserPermissions
  /* 4 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /**
    * Permission to update this plan.
    */
  @js.native
  sealed trait Edit extends PlanUserPermissions
  /* 2 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /**
    * Permission to manage this plan.
    */
  @js.native
  sealed trait Manage extends PlanUserPermissions
  /* 8 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /**
    * None
    */
  @js.native
  sealed trait None extends PlanUserPermissions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Permission to view this plan.
    */
  @js.native
  sealed trait View extends PlanUserPermissions
  /* 1 */ @js.native
  object View extends TopLevel[View with Double]
}
