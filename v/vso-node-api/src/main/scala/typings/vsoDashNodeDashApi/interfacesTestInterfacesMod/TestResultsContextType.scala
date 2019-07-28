package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestResultsContextType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestResultsContextType")
@js.native
object TestResultsContextType extends js.Object {
  @js.native
  sealed trait Build extends TestResultsContextType
  
  @js.native
  sealed trait Release extends TestResultsContextType
  
  /* 1 */ val Build: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsContextType.Build with Double = js.native
  /* 2 */ val Release: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsContextType.Release with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestResultsContextType with Double] = js.native
}

