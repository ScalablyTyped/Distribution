package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoverageQueryFlags extends js.Object
@JSImport("vso-node-api/interfaces/TestInterfaces", "CoverageQueryFlags")
@js.native
object CoverageQueryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoverageQueryFlags with Double] = js.native
  
  /**
    * If set, the ModuleCoverage.CoverageData field will be populated.
    */
  @js.native
  sealed trait BlockData extends CoverageQueryFlags
  /* 4 */ @js.native
  object BlockData extends TopLevel[BlockData with Double]
  
  /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
  @js.native
  sealed trait Functions extends CoverageQueryFlags
  /* 2 */ @js.native
  object Functions extends TopLevel[Functions with Double]
  
  /**
    * If set, the Coverage.Modules property will be populated.
    */
  @js.native
  sealed trait Modules extends CoverageQueryFlags
  /* 1 */ @js.native
  object Modules extends TopLevel[Modules with Double]
}
