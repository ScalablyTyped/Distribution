package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  sealed trait Failed extends BuildPhaseStatus
  
  /**
    * The build phase completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildPhaseStatus
  
  /**
    * The state is not known.
    */
  @js.native
  sealed trait Unknown extends BuildPhaseStatus
  
  /* 1 */ val Failed: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildPhaseStatus.Failed with Double = js.native
  /* 2 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildPhaseStatus.Succeeded with Double = js.native
  /* 0 */ val Unknown: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildPhaseStatus.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildPhaseStatus with Double] = js.native
}

