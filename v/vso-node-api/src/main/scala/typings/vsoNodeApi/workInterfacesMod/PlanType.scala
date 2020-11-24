package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanType extends js.Object
@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanType")
@js.native
object PlanType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanType with Double] = js.native
  
  @js.native
  sealed trait DeliveryTimelineView extends PlanType
  /* 0 */ @js.native
  object DeliveryTimelineView extends TopLevel[DeliveryTimelineView with Double]
}
