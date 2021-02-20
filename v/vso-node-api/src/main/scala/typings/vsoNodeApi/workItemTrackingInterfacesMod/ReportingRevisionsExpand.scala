package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReportingRevisionsExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReportingRevisionsExpand with Double] = js.native
  
  @js.native
  sealed trait Fields extends ReportingRevisionsExpand
  /* 1 */ val Fields: typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingRevisionsExpand.Fields with Double = js.native
  
  @js.native
  sealed trait None extends ReportingRevisionsExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.ReportingRevisionsExpand.None with Double = js.native
}
