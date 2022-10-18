package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestResultsContextType extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestResultsContextType")
@js.native
object TestResultsContextType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestResultsContextType & Double] = js.native
  
  @js.native
  sealed trait Build
    extends StObject
       with TestResultsContextType
  /* 1 */ val Build: typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsContextType.Build & Double = js.native
  
  @js.native
  sealed trait Release
    extends StObject
       with TestResultsContextType
  /* 2 */ val Release: typings.vsoNodeApi.interfacesTestInterfacesMod.TestResultsContextType.Release & Double = js.native
}
