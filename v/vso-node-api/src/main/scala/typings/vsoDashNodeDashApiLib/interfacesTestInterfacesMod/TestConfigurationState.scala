package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
  sealed trait Active
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfigurationState
  
  /**
       * The configuration has been retired and should not be used for new test runs.
       */
  @js.native
  sealed trait Inactive
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfigurationState
  
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 2 */ val Inactive: Inactive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.TestConfigurationState with scala.Double
  ] = js.native
}

