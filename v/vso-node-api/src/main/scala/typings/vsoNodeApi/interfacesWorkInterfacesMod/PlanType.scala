package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlanType extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "PlanType")
@js.native
object PlanType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlanType & Double] = js.native
  
  @js.native
  sealed trait DeliveryTimelineView
    extends StObject
       with PlanType
  /* 0 */ val DeliveryTimelineView: typings.vsoNodeApi.interfacesWorkInterfacesMod.PlanType.DeliveryTimelineView & Double = js.native
}
