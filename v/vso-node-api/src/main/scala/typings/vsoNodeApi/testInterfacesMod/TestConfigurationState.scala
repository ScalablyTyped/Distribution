package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestConfigurationState extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestConfigurationState")
@js.native
object TestConfigurationState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestConfigurationState with Double] = js.native
  
  /**
    * The configuration can be used for new test runs.
    */
  @js.native
  sealed trait Active extends TestConfigurationState
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /**
    * The configuration has been retired and should not be used for new test runs.
    */
  @js.native
  sealed trait Inactive extends TestConfigurationState
  /* 2 */ @js.native
  object Inactive extends TopLevel[Inactive with Double]
}
