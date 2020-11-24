package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControllerStatus extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ControllerStatus")
@js.native
object ControllerStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControllerStatus with Double] = js.native
  
  /**
    * Indicates that the build controller is currently available.
    */
  @js.native
  sealed trait Available extends ControllerStatus
  /* 1 */ @js.native
  object Available extends TopLevel[Available with Double]
  
  /**
    * Indicates that the build controller has taken itself offline.
    */
  @js.native
  sealed trait Offline extends ControllerStatus
  /* 2 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /**
    * Indicates that the build controller cannot be contacted.
    */
  @js.native
  sealed trait Unavailable extends ControllerStatus
  /* 0 */ @js.native
  object Unavailable extends TopLevel[Unavailable with Double]
}
