package typings.workboxDashSw

import org.scalablytyped.runtime.Instantiable0
import typings.workboxDashSw.workboxDashSwMod.BackgroundSyncNamespace
import typings.workboxDashSw.workboxDashSwMod.BackgroundSyncPluginConstructor
import typings.workboxDashSw.workboxDashSwMod.QueueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBackgroundSyncNamespace extends Instantiable0[BackgroundSyncNamespace] {
  /**
  	 * A class implementing the `fetchDidFail` lifecycle callback. This makes it
  	 * easier to add failed requests to a background sync Queue.
  	 */
  val Plugin: BackgroundSyncPluginConstructor = js.native
  /**
  	 * A class to manage storing failed requests in IndexedDB and retrying them
  	 * later. All parts of the storing and replaying process are observable via
  	 * callbacks.
  	 */
  val Queue: QueueConstructor = js.native
}

