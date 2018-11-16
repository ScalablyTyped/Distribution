package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultObjectType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultObjectType")
@js.native
object ResultObjectType extends js.Object {
  @js.native
  sealed trait TestPlan
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultObjectType
  
  @js.native
  sealed trait TestSuite
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultObjectType
  
  /* 1 */ val TestPlan: TestPlan with scala.Double = js.native
  /* 0 */ val TestSuite: TestSuite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.ResultObjectType with scala.Double
  ] = js.native
}

