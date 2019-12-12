package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestConfigurationState.Active
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestConfigurationState.Inactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TestConfigurationState extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "TestConfigurationState")
@js.native
object TestConfigurationState extends js.Object {
  /**
    * The configuration can be used for new test runs.
    */
  @js.native
  sealed trait Active extends TestConfigurationState
  
  /**
    * The configuration has been retired and should not be used for new test runs.
    */
  @js.native
  sealed trait Inactive extends TestConfigurationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestConfigurationState with Double] = js.native
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 2 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
  
}

