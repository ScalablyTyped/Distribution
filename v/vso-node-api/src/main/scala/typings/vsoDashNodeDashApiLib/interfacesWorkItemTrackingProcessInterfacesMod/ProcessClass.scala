package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends js.Object {
  @js.native
  sealed trait Custom
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass
  
  @js.native
  sealed trait Derived
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass
  
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass
  
  /* 2 */ val Custom: Custom with scala.Double = js.native
  /* 1 */ val Derived: Derived with scala.Double = js.native
  /* 0 */ val System: System with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod.ProcessClass with scala.Double
  ] = js.native
}

