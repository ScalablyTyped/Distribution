package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionQueueStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueueStatus")
@js.native
object DefinitionQueueStatus extends js.Object {
  /**
       * When disabled the definition queue will not allow builds to be queued by users and the system will not queue scheduled, gated or continuous integration builds. Builds already in the queue will not be started by the system.
       */
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueueStatus
  
  /**
       * When enabled the definition queue allows builds to be queued by users, the system will queue scheduled, gated and continuous integration builds, and the queued builds will be started by the system.
       */
  @js.native
  sealed trait Enabled
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueueStatus
  
  /**
       * When paused the definition queue allows builds to be queued by users and the system will queue scheduled, gated and continuous integration builds. Builds in the queue will not be started by the system.
       */
  @js.native
  sealed trait Paused
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueueStatus
  
  /* 2 */ val Disabled: Disabled with scala.Double = js.native
  /* 0 */ val Enabled: Enabled with scala.Double = js.native
  /* 1 */ val Paused: Paused with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueueStatus with scala.Double
  ] = js.native
}

