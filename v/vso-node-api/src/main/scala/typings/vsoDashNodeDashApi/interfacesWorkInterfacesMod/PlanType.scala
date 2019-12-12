package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.PlanType.DeliveryTimelineView
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanType with Double] = js.native
  /* 0 */ @js.native
  object DeliveryTimelineView extends TopLevel[DeliveryTimelineView with Double]
  
}

