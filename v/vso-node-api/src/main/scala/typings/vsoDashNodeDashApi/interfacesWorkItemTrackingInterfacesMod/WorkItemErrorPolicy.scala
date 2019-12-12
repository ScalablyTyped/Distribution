package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Fail
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemErrorPolicy.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemErrorPolicy extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemErrorPolicy")
@js.native
object WorkItemErrorPolicy extends js.Object {
  @js.native
  sealed trait Fail extends WorkItemErrorPolicy
  
  @js.native
  sealed trait Omit extends WorkItemErrorPolicy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemErrorPolicy with Double] = js.native
  /* 1 */ @js.native
  object Fail extends TopLevel[Fail with Double]
  
  /* 2 */ @js.native
  object Omit extends TopLevel[Omit with Double]
  
}

