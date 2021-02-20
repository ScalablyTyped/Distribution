package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldScope extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldScope")
@js.native
object CustomTestFieldScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldScope with Double] = js.native
  
  @js.native
  sealed trait All extends CustomTestFieldScope
  /* 7 */ val All: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.All with Double = js.native
  
  @js.native
  sealed trait None extends CustomTestFieldScope
  /* 0 */ val None: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.None with Double = js.native
  
  @js.native
  sealed trait System extends CustomTestFieldScope
  /* 4 */ val System: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.System with Double = js.native
  
  @js.native
  sealed trait TestResult extends CustomTestFieldScope
  /* 2 */ val TestResult: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.TestResult with Double = js.native
  
  @js.native
  sealed trait TestRun extends CustomTestFieldScope
  /* 1 */ val TestRun: typings.vsoNodeApi.testInterfacesMod.CustomTestFieldScope.TestRun with Double = js.native
}
