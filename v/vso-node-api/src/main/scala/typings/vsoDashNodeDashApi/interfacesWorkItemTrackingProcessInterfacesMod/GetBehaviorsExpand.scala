package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand.Fields
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.GetBehaviorsExpand.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetBehaviorsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetBehaviorsExpand")
@js.native
object GetBehaviorsExpand extends js.Object {
  @js.native
  sealed trait Fields extends GetBehaviorsExpand
  
  @js.native
  sealed trait None extends GetBehaviorsExpand
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetBehaviorsExpand with Double] = js.native
  /* 1 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

