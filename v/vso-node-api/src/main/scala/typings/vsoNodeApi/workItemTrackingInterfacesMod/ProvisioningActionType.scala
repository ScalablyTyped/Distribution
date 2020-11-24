package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProvisioningActionType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ProvisioningActionType")
@js.native
object ProvisioningActionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProvisioningActionType with Double] = js.native
  
  @js.native
  sealed trait Import extends ProvisioningActionType
  /* 0 */ @js.native
  object Import extends TopLevel[Import with Double]
  
  @js.native
  sealed trait Validate extends ProvisioningActionType
  /* 1 */ @js.native
  object Validate extends TopLevel[Validate with Double]
}
