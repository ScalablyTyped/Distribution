package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.All
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.None
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.System
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomTestFieldScope extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldScope")
@js.native
object CustomTestFieldScope extends js.Object {
  @js.native
  sealed trait All extends CustomTestFieldScope
  
  @js.native
  sealed trait None extends CustomTestFieldScope
  
  @js.native
  sealed trait System extends CustomTestFieldScope
  
  @js.native
  sealed trait TestResult extends CustomTestFieldScope
  
  @js.native
  sealed trait TestRun extends CustomTestFieldScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldScope with Double] = js.native
  /* 7 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object System extends TopLevel[System with Double]
  
  /* 2 */ @js.native
  object TestResult extends TopLevel[TestResult with Double]
  
  /* 1 */ @js.native
  object TestRun
    extends TopLevel[
          typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestRun with Double
        ]
  
}

