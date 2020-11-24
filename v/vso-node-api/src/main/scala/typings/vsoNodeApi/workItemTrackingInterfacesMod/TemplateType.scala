package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TemplateType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "TemplateType")
@js.native
object TemplateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateType with Double] = js.native
  
  @js.native
  sealed trait GlobalWorkflow extends TemplateType
  /* 1 */ @js.native
  object GlobalWorkflow extends TopLevel[GlobalWorkflow with Double]
  
  @js.native
  sealed trait WorkItemType extends TemplateType
  /* 0 */ @js.native
  object WorkItemType
    extends TopLevel[
          typings.vsoNodeApi.workItemTrackingInterfacesMod.TemplateType.WorkItemType with Double
        ]
}
