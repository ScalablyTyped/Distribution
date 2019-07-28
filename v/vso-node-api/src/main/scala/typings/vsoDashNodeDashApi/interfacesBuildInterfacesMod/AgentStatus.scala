package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

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
  
  /* 1 */ val Available: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AgentStatus.Available with Double = js.native
  /* 2 */ val Offline: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AgentStatus.Offline with Double = js.native
  /* 0 */ val Unavailable: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.AgentStatus.Unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentStatus with Double] = js.native
}

