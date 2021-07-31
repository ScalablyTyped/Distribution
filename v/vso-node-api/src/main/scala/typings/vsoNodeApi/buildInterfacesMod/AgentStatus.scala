package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "AgentStatus")
@js.native
object AgentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentStatus & Double] = js.native
  
  /**
    * Indicates that the build agent is currently available.
    */
  @js.native
  sealed trait Available
    extends StObject
       with AgentStatus
  /* 1 */ val Available: typings.vsoNodeApi.buildInterfacesMod.AgentStatus.Available & Double = js.native
  
  /**
    * Indicates that the build agent has taken itself offline.
    */
  @js.native
  sealed trait Offline
    extends StObject
       with AgentStatus
  /* 2 */ val Offline: typings.vsoNodeApi.buildInterfacesMod.AgentStatus.Offline & Double = js.native
  
  /**
    * Indicates that the build agent cannot be contacted.
    */
  @js.native
  sealed trait Unavailable
    extends StObject
       with AgentStatus
  /* 0 */ val Unavailable: typings.vsoNodeApi.buildInterfacesMod.AgentStatus.Unavailable & Double = js.native
}
