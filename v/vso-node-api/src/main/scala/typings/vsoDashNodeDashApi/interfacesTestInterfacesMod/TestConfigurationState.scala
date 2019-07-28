package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  
  /* 1 */ val Active: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestConfigurationState.Active with Double = js.native
  /* 2 */ val Inactive: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.TestConfigurationState.Inactive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestConfigurationState with Double] = js.native
}

