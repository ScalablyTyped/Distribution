package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestConfigurationState extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestConfigurationState")
@js.native
object TestConfigurationState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestConfigurationState & Double] = js.native
  
  /**
    * The configuration can be used for new test runs.
    */
  @js.native
  sealed trait Active
    extends StObject
       with TestConfigurationState
  /* 1 */ val Active: typings.vsoNodeApi.testInterfacesMod.TestConfigurationState.Active & Double = js.native
  
  /**
    * The configuration has been retired and should not be used for new test runs.
    */
  @js.native
  sealed trait Inactive
    extends StObject
       with TestConfigurationState
  /* 2 */ val Inactive: typings.vsoNodeApi.testInterfacesMod.TestConfigurationState.Inactive & Double = js.native
}
