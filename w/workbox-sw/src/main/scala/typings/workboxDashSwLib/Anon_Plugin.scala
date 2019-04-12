package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Plugin
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.BackgroundSyncNamespace] {
  /**
  	 * A class implementing the `fetchDidFail` lifecycle callback. This makes it
  	 * easier to add failed requests to a background sync Queue.
  	 */
  val Plugin: workboxDashSwLib.workboxDashSwMod.BackgroundSyncPluginConstructor = js.native
  /**
  	 * A class to manage storing failed requests in IndexedDB and retrying them
  	 * later. All parts of the storing and replaying process are observable via
  	 * callbacks.
  	 */
  val Queue: workboxDashSwLib.workboxDashSwMod.QueueConstructor = js.native
}

