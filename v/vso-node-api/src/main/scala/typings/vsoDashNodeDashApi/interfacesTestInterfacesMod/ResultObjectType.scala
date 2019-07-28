package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultObjectType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "ResultObjectType")
@js.native
object ResultObjectType extends js.Object {
  @js.native
  sealed trait TestPlan extends ResultObjectType
  
  @js.native
  sealed trait TestSuite extends ResultObjectType
  
  /* 1 */ val TestPlan: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultObjectType.TestPlan with Double = js.native
  /* 0 */ val TestSuite: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.ResultObjectType.TestSuite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultObjectType with Double] = js.native
}

