package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReportingRevisionsExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReportingRevisionsExpand with Double] = js.native
  
  @js.native
  sealed trait Fields extends ReportingRevisionsExpand
  /* 1 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  @js.native
  sealed trait None extends ReportingRevisionsExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
