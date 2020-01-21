package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AgentStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "AgentStatus")
@js.native
object AgentStatus extends js.Object {
  /**
    * Indicates that the build agent is currently available.
    */
  @js.native
  sealed trait Available extends AgentStatus
  
  /**
    * Indicates that the build agent has taken itself offline.
    */
  @js.native
  sealed trait Offline extends AgentStatus
  
  /**
    * Indicates that the build agent cannot be contacted.
    */
  @js.native
  sealed trait Unavailable extends AgentStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentStatus with Double] = js.native
  /* 1 */ @js.native
  object Available extends TopLevel[Available with Double]
  
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 0 */ @js.native
  object Unavailable extends TopLevel[Unavailable with Double]
  
}

