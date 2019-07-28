package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  
  /* 7 */ val All: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.All with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.None with Double = js.native
  /* 4 */ val System: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.System with Double = js.native
  /* 2 */ val TestResult: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestResult with Double = js.native
  /* 1 */ val TestRun: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestRun with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldScope with Double] = js.native
}

