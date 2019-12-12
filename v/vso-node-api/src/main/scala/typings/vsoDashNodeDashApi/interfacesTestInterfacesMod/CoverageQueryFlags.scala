package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.BlockData
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.Functions
import typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.Modules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoverageQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CoverageQueryFlags")
@js.native
object CoverageQueryFlags extends js.Object {
  /**
    * If set, the ModuleCoverage.CoverageData field will be populated.
    */
  @js.native
  sealed trait BlockData extends CoverageQueryFlags
  
  /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
  @js.native
  sealed trait Functions extends CoverageQueryFlags
  
  /**
    * If set, the Coverage.Modules property will be populated.
    */
  @js.native
  sealed trait Modules extends CoverageQueryFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoverageQueryFlags with Double] = js.native
  /* 4 */ @js.native
  object BlockData extends TopLevel[BlockData with Double]
  
  /* 2 */ @js.native
  object Functions extends TopLevel[Functions with Double]
  
  /* 1 */ @js.native
  object Modules extends TopLevel[Modules with Double]
  
}

