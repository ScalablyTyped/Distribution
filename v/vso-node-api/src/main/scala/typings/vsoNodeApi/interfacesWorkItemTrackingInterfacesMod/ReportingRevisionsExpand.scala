package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReportingRevisionsExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "ReportingRevisionsExpand")
@js.native
object ReportingRevisionsExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReportingRevisionsExpand & Double] = js.native
  
  @js.native
  sealed trait Fields
    extends StObject
       with ReportingRevisionsExpand
  /* 1 */ val Fields: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.Fields & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ReportingRevisionsExpand
  /* 0 */ val None: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.ReportingRevisionsExpand.None & Double = js.native
}
