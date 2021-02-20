package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildPhaseStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildPhaseStatus")
@js.native
object BuildPhaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildPhaseStatus with Double] = js.native
  
  /**
    * The build phase completed unsuccessfully.
    */
  @js.native
  sealed trait Failed extends BuildPhaseStatus
  /* 1 */ val Failed: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Failed with Double = js.native
  
  /**
    * The build phase completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildPhaseStatus
  /* 2 */ val Succeeded: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Succeeded with Double = js.native
  
  /**
    * The state is not known.
    */
  @js.native
  sealed trait Unknown extends BuildPhaseStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.buildInterfacesMod.BuildPhaseStatus.Unknown with Double = js.native
}
