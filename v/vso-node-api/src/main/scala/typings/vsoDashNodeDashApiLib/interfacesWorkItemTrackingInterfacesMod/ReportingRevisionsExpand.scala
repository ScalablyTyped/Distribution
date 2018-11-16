package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReportingRevisionsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends js.Object {
  @js.native
  sealed trait Fields
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand
  
  /* 1 */ val Fields: Fields with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand with scala.Double
  ] = js.native
}

