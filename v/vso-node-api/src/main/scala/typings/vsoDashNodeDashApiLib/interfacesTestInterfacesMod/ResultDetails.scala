package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultDetails extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultDetails")
@js.native
object ResultDetails extends js.Object {
  @js.native
  sealed trait Iterations
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails
  
  @js.native
  sealed trait WorkItems
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails
  
  /* 1 */ val Iterations: Iterations with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val WorkItems: WorkItems with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultDetails with scala.Double
  ] = js.native
}

