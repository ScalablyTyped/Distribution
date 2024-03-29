package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomTestFieldScope extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldScope")
@js.native
object CustomTestFieldScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldScope & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with CustomTestFieldScope
  /* 7 */ val All: typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope.All & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CustomTestFieldScope
  /* 0 */ val None: typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope.None & Double = js.native
  
  @js.native
  sealed trait System
    extends StObject
       with CustomTestFieldScope
  /* 4 */ val System: typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope.System & Double = js.native
  
  @js.native
  sealed trait TestResult
    extends StObject
       with CustomTestFieldScope
  /* 2 */ val TestResult: typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestResult & Double = js.native
  
  @js.native
  sealed trait TestRun
    extends StObject
       with CustomTestFieldScope
  /* 1 */ val TestRun: typings.vsoNodeApi.interfacesTestInterfacesMod.CustomTestFieldScope.TestRun & Double = js.native
}
