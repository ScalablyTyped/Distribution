package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProvisioningActionType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends js.Object {
  @js.native
  sealed trait Import extends ProvisioningActionType
  
  @js.native
  sealed trait Validate extends ProvisioningActionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProvisioningActionType with Double] = js.native
  /* 0 */ @js.native
  object Import extends TopLevel[Import with Double]
  
  /* 1 */ @js.native
  object Validate extends TopLevel[Validate with Double]
  
}

