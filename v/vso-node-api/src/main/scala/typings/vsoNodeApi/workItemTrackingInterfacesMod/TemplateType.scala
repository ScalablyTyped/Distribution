package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TemplateType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TemplateType")
@js.native
object TemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateType with Double] = js.native
  
  @js.native
  sealed trait GlobalWorkflow extends TemplateType
  /* 1 */ val GlobalWorkflow: typings.vsoNodeApi.workItemTrackingInterfacesMod.TemplateType.GlobalWorkflow with Double = js.native
  
  @js.native
  sealed trait WorkItemType extends TemplateType
  /* 0 */ val WorkItemType: typings.vsoNodeApi.workItemTrackingInterfacesMod.TemplateType.WorkItemType with Double = js.native
}
