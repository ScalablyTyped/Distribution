package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoverageQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CoverageQueryFlags")
@js.native
object CoverageQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoverageQueryFlags & Double] = js.native
  
  /**
    * If set, the ModuleCoverage.CoverageData field will be populated.
    */
  @js.native
  sealed trait BlockData
    extends StObject
       with CoverageQueryFlags
  /* 4 */ val BlockData: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.BlockData & Double = js.native
  
  /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
  @js.native
  sealed trait Functions
    extends StObject
       with CoverageQueryFlags
  /* 2 */ val Functions: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.Functions & Double = js.native
  
  /**
    * If set, the Coverage.Modules property will be populated.
    */
  @js.native
  sealed trait Modules
    extends StObject
       with CoverageQueryFlags
  /* 1 */ val Modules: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.Modules & Double = js.native
}
