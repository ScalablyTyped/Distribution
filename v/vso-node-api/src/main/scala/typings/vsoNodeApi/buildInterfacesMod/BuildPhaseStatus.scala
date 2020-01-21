package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildPhaseStatus with Double] = js.native
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

