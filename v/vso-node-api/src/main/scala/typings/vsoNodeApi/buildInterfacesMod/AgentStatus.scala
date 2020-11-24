package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentStatus extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "AgentStatus")
@js.native
object AgentStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentStatus with Double] = js.native
  
  /**
    * Indicates that the build agent is currently available.
    */
  @js.native
  sealed trait Available extends AgentStatus
  /* 1 */ @js.native
  object Available extends TopLevel[Available with Double]
  
  /**
    * Indicates that the build agent has taken itself offline.
    */
  @js.native
  sealed trait Offline extends AgentStatus
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /**
    * Indicates that the build agent cannot be contacted.
    */
  @js.native
  sealed trait Unavailable extends AgentStatus
  /* 0 */ @js.native
  object Unavailable extends TopLevel[Unavailable with Double]
}
