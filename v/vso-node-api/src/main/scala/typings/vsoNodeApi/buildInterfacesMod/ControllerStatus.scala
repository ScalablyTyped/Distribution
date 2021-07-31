package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControllerStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ControllerStatus")
@js.native
object ControllerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControllerStatus & Double] = js.native
  
  /**
    * Indicates that the build controller is currently available.
    */
  @js.native
  sealed trait Available
    extends StObject
       with ControllerStatus
  /* 1 */ val Available: typings.vsoNodeApi.buildInterfacesMod.ControllerStatus.Available & Double = js.native
  
  /**
    * Indicates that the build controller has taken itself offline.
    */
  @js.native
  sealed trait Offline
    extends StObject
       with ControllerStatus
  /* 2 */ val Offline: typings.vsoNodeApi.buildInterfacesMod.ControllerStatus.Offline & Double = js.native
  
  /**
    * Indicates that the build controller cannot be contacted.
    */
  @js.native
  sealed trait Unavailable
    extends StObject
       with ControllerStatus
  /* 0 */ val Unavailable: typings.vsoNodeApi.buildInterfacesMod.ControllerStatus.Unavailable & Double = js.native
}
