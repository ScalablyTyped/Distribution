package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TemplateType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TemplateType")
@js.native
object TemplateType extends js.Object {
  @js.native
  sealed trait GlobalWorkflow
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TemplateType
  
  @js.native
  sealed trait WorkItemType
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TemplateType
  
  /* 1 */ val GlobalWorkflow: GlobalWorkflow with scala.Double = js.native
  /* 0 */ val WorkItemType: WorkItemType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.TemplateType with scala.Double
  ] = js.native
}

