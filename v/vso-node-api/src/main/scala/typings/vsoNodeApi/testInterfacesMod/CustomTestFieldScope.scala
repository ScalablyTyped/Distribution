package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldScope extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldScope")
@js.native
object CustomTestFieldScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldScope with Double] = js.native
  
  @js.native
  sealed trait All extends CustomTestFieldScope
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait None extends CustomTestFieldScope
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait System extends CustomTestFieldScope
  /* 4 */ @js.native
  object System extends TopLevel[System with Double]
  
  @js.native
  sealed trait TestResult extends CustomTestFieldScope
  /* 2 */ @js.native
  object TestResult extends TopLevel[TestResult with Double]
  
  @js.native
  sealed trait TestRun extends CustomTestFieldScope
  /* 1 */ @js.native
  object TestRun
    extends TopLevel[typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.TestRun with Double]
}
