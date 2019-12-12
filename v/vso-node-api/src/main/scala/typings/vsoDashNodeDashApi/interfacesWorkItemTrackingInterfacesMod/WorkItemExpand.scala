package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.All
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Fields
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Links
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.None
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemExpand.Relations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemExpand")
@js.native
object WorkItemExpand extends js.Object {
  @js.native
  sealed trait All extends WorkItemExpand
  
  @js.native
  sealed trait Fields extends WorkItemExpand
  
  @js.native
  sealed trait Links extends WorkItemExpand
  
  @js.native
  sealed trait None extends WorkItemExpand
  
  @js.native
  sealed trait Relations extends WorkItemExpand
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemExpand with Double] = js.native
  /* 4 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  /* 3 */ @js.native
  object Links extends TopLevel[Links with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Relations extends TopLevel[Relations with Double]
  
}

