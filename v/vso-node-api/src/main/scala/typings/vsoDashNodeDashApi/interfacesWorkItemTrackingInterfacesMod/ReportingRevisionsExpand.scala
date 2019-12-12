package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.Fields
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReportingRevisionsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends js.Object {
  @js.native
  sealed trait Fields extends ReportingRevisionsExpand
  
  @js.native
  sealed trait None extends ReportingRevisionsExpand
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReportingRevisionsExpand with Double] = js.native
  /* 1 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

