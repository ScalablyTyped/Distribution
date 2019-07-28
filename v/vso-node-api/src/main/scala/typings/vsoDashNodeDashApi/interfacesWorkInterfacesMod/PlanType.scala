package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlanType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanType")
@js.native
object PlanType extends js.Object {
  @js.native
  sealed trait DeliveryTimelineView extends PlanType
  
  /* 0 */ val DeliveryTimelineView: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanType.DeliveryTimelineView with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanType with Double] = js.native
}

