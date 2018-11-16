package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomTestFieldScope extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldScope")
@js.native
object CustomTestFieldScope extends js.Object {
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  
  @js.native
  sealed trait TestResult
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  
  @js.native
  sealed trait TestRun
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope
  
  /* 7 */ val All: All with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val System: System with scala.Double = js.native
  /* 2 */ val TestResult: TestResult with scala.Double = js.native
  /* 1 */ val TestRun: TestRun with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CustomTestFieldScope with scala.Double
  ] = js.native
}

