package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Custom
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.Derived
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends js.Object {
  @js.native
  sealed trait Custom extends ProcessClass
  
  @js.native
  sealed trait Derived extends ProcessClass
  
  @js.native
  sealed trait System extends ProcessClass
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessClass with Double] = js.native
  /* 2 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 1 */ @js.native
  object Derived extends TopLevel[Derived with Double]
  
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
  
}

