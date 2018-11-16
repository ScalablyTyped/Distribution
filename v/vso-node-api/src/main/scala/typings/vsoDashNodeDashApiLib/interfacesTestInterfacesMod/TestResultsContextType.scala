package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestResultsContextType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestResultsContextType")
@js.native
object TestResultsContextType extends js.Object {
  @js.native
  sealed trait Build
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsContextType
  
  @js.native
  sealed trait Release
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsContextType
  
  /* 1 */ val Build: Build with scala.Double = js.native
  /* 2 */ val Release: Release with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestResultsContextType with scala.Double
  ] = js.native
}

