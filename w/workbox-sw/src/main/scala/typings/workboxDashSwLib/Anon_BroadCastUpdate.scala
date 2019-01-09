package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BroadCastUpdate
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.BroadcastUpdateNamespace] {
  /**
  	 * Uses the Broadcast Channel API to notify interested parties when a cached response has been updated.
  	 * For efficiency's sake, the underlying response bodies are not compared; only specific response headers are checked.
  	 */
  val BroadcastCacheUpdate: workboxDashSwLib.workboxDashSwMod.IBroadcastCacheUpdateConstructor = js.native
  /**
  	 * This plugin will automatically broadcast a message whenever a cached response is updated.
  	 */
  val Plugin: workboxDashSwLib.workboxDashSwMod.IBroadcastUpdatePluginConstructor = js.native
  /**
  	 * You would not normally call this method directly;
  	 * it's called automatically by an instance of the BroadcastCacheUpdate class.
  	 * It's exposed here for the benefit of developers who would rather not use the full BroadcastCacheUpdate implementation.
  	 * Calling this will dispatch a message on the provided Broadcast Channel to notify interested subscribers about a
  	 * change to a cached resource.
  	 * The message that's posted has a formation inspired by the Flux standard action format like so:
  	 * @param {BroadcastChannel} channel - The BroadcastChannel to use.
  	 * @param {string} cacheName - The name of the cache in which the updated Response was stored.
  	 * @param {string} url - The URL associated with the updated Response.
  	 * @param {string} source - A string identifying this library as the source of the update message.
  	 */
  def broadCastUpdate(
    channel: stdLib.BroadcastChannel,
    cacheName: java.lang.String,
    url: java.lang.String,
    source: java.lang.String
  ): scala.Unit = js.native
}

