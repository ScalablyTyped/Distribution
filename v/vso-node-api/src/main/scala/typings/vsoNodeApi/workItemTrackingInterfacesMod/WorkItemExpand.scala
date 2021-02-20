package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemExpand with Double] = js.native
  
  @js.native
  sealed trait All extends WorkItemExpand
  /* 4 */ val All: typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand.All with Double = js.native
  
  @js.native
  sealed trait Fields extends WorkItemExpand
  /* 2 */ val Fields: typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand.Fields with Double = js.native
  
  @js.native
  sealed trait Links extends WorkItemExpand
  /* 3 */ val Links: typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand.Links with Double = js.native
  
  @js.native
  sealed trait None extends WorkItemExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand.None with Double = js.native
  
  @js.native
  sealed trait Relations extends WorkItemExpand
  /* 1 */ val Relations: typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemExpand.Relations with Double = js.native
}
