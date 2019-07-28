package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
  
  /* 4 */ val BlockData: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.BlockData with Double = js.native
  /* 2 */ val Functions: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.Functions with Double = js.native
  /* 1 */ val Modules: typings.vsoDashNodeDashApi.interfacesTestInterfacesMod.CoverageQueryFlags.Modules with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoverageQueryFlags with Double] = js.native
}

