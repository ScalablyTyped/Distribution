package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsContextType.Build
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestResultsContextType.Release
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestResultsContextType with Double] = js.native
  /* 1 */ @js.native
  object Build extends TopLevel[Build with Double]
  
  /* 2 */ @js.native
  object Release extends TopLevel[Release with Double]
  
}

