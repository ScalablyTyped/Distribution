package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoverageQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "CoverageQueryFlags")
@js.native
object CoverageQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoverageQueryFlags with Double] = js.native
  
  /**
    * If set, the ModuleCoverage.CoverageData field will be populated.
    */
  @js.native
  sealed trait BlockData extends CoverageQueryFlags
  /* 4 */ val BlockData: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.BlockData with Double = js.native
  
  /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
  @js.native
  sealed trait Functions extends CoverageQueryFlags
  /* 2 */ val Functions: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.Functions with Double = js.native
  
  /**
    * If set, the Coverage.Modules property will be populated.
    */
  @js.native
  sealed trait Modules extends CoverageQueryFlags
  /* 1 */ val Modules: typings.vsoNodeApi.testInterfacesMod.CoverageQueryFlags.Modules with Double = js.native
}
