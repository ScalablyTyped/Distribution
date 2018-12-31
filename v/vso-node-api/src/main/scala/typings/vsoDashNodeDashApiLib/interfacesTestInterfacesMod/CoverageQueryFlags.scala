package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

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
  sealed trait BlockData
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CoverageQueryFlags
  
  /**
    * If set, the ModuleCoverage.Functions properties will be populated.
    */
  @js.native
  sealed trait Functions
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CoverageQueryFlags
  
  /**
    * If set, the Coverage.Modules property will be populated.
    */
  @js.native
  sealed trait Modules
    extends vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CoverageQueryFlags
  
  /* 4 */ val BlockData: BlockData with scala.Double = js.native
  /* 2 */ val Functions: Functions with scala.Double = js.native
  /* 1 */ val Modules: Modules with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTestInterfacesMod.CoverageQueryFlags with scala.Double
  ] = js.native
}

