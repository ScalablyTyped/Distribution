package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlanType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanType")
@js.native
object PlanType extends js.Object {
  @js.native
  sealed trait DeliveryTimelineView
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanType
  
  /* 0 */ val DeliveryTimelineView: DeliveryTimelineView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.PlanType with scala.Double] = js.native
}

