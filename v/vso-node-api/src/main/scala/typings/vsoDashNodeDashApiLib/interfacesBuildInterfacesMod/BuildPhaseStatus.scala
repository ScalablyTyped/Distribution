package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildPhaseStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildPhaseStatus")
@js.native
object BuildPhaseStatus extends js.Object {
  /**
    * The build phase completed unsuccessfully.
    */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildPhaseStatus
  
  /**
    * The build phase completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildPhaseStatus
  
  /**
    * The state is not known.
    */
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildPhaseStatus
  
  /* 1 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildPhaseStatus with scala.Double
  ] = js.native
}

