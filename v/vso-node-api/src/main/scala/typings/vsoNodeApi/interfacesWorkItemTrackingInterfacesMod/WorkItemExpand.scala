package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemExpand & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with WorkItemExpand
  /* 4 */ val All: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.All & Double = js.native
  
  @js.native
  sealed trait Fields
    extends StObject
       with WorkItemExpand
  /* 2 */ val Fields: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Fields & Double = js.native
  
  @js.native
  sealed trait Links
    extends StObject
       with WorkItemExpand
  /* 3 */ val Links: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Links & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with WorkItemExpand
  /* 0 */ val None: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.None & Double = js.native
  
  @js.native
  sealed trait Relations
    extends StObject
       with WorkItemExpand
  /* 1 */ val Relations: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Relations & Double = js.native
}
