package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildPhaseStatus extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildPhaseStatus")
@js.native
object BuildPhaseStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildPhaseStatus with Double] = js.native
  
  /**
    * The build phase completed unsuccessfully.
    */
  @js.native
  sealed trait Failed extends BuildPhaseStatus
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The build phase completed successfully.
    */
  @js.native
  sealed trait Succeeded extends BuildPhaseStatus
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /**
    * The state is not known.
    */
  @js.native
  sealed trait Unknown extends BuildPhaseStatus
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
}
