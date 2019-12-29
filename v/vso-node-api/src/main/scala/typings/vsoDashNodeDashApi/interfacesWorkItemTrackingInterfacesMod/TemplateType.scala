package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TemplateType with Double] = js.native
  /* 1 */ @js.native
  object GlobalWorkflow extends TopLevel[GlobalWorkflow with Double]
  
  /* 0 */ @js.native
  object WorkItemType
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.TemplateType.WorkItemType with Double
        ]
  
}

