package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait Available
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AgentStatus
  
  /**
    * Indicates that the build agent has taken itself offline.
    */
  @js.native
  sealed trait Offline
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AgentStatus
  
  /**
    * Indicates that the build agent cannot be contacted.
    */
  @js.native
  sealed trait Unavailable
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AgentStatus
  
  /* 1 */ val Available: Available with scala.Double = js.native
  /* 2 */ val Offline: Offline with scala.Double = js.native
  /* 0 */ val Unavailable: Unavailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.AgentStatus with scala.Double] = js.native
}

