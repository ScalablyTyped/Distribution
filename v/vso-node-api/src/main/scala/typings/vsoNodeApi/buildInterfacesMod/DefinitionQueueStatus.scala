package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefinitionQueueStatus extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionQueueStatus")
@js.native
object DefinitionQueueStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionQueueStatus with Double] = js.native
  
  /**
    * When disabled the definition queue will not allow builds to be queued by users and the system will not queue scheduled, gated or continuous integration builds. Builds already in the queue will not be started by the system.
    */
  @js.native
  sealed trait Disabled extends DefinitionQueueStatus
  /* 2 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /**
    * When enabled the definition queue allows builds to be queued by users, the system will queue scheduled, gated and continuous integration builds, and the queued builds will be started by the system.
    */
  @js.native
  sealed trait Enabled extends DefinitionQueueStatus
  /* 0 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  /**
    * When paused the definition queue allows builds to be queued by users and the system will queue scheduled, gated and continuous integration builds. Builds in the queue will not be started by the system.
    */
  @js.native
  sealed trait Paused extends DefinitionQueueStatus
  /* 1 */ @js.native
  object Paused extends TopLevel[Paused with Double]
}
