package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TemplateType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TemplateType")
@js.native
object TemplateType extends js.Object {
  @js.native
  sealed trait GlobalWorkflow extends TemplateType
  
  @js.native
  sealed trait WorkItemType extends TemplateType
  
  /* 1 */ val GlobalWorkflow: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TemplateType.GlobalWorkflow with Double = js.native
  /* 0 */ val WorkItemType: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TemplateType.WorkItemType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateType with Double] = js.native
}

