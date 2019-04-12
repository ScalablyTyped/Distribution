package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to manage storing failed requests in IndexedDB and retrying them
  * later. All parts of the storing and replaying process are observable via
  * callbacks.
  */
trait Queue extends js.Object {
  val name: java.lang.String
  /**
  	 * Removes and returns the last request in the queue (along with its
  	 * timestamp and any metadata). The returned object takes the form:
  	 * `{request, timestamp, metadata}`.
  	 * @return {Promise<QueueEntry>}
  	 */
  def popRequest(): js.Promise[QueueEntry]
  /**
  	 * Stores the passed request in IndexedDB (with its timestamp and any
  	 * metadata) at the end of the queue.
  	 * @param {QueueEntry} entry
  	 * @returns {Promise<void>}
  	 */
  def pushRequest(entry: QueueEntry): js.Promise[scala.Unit]
  /**
  	 * Registers a sync event with a tag unique to this instance.
  	 * @return {Promise<void>}
  	 */
  def registerSync(): js.Promise[scala.Unit]
  /**
  	 * Loops through each request in the queue and attempts to re-fetch it.
  	 * If any request fails to re-fetch, it's put back in the same position in
  	 * the queue (which registers a retry for the next sync event).
  	 * @returns {Promise<void>}
  	 */
  def replayRequests(): js.Promise[scala.Unit]
  /**
  	 * Removes and returns the first request in the queue (along with its
  	 * timestamp and any metadata). The returned object takes the form:
  	 * `{request, timestamp, metadata}`.
  	 * @return {Promise<QueueEntry>}
  	 */
  def shiftRequest(): js.Promise[QueueEntry]
  /**
  	 * Stores the passed request in IndexedDB (with its timestamp and any
  	 * metadata) at the beginning of the queue.
  	 * @param {QueueEntry} entry
  	 * @return {Promise<void>}
  	 */
  def unshiftRequest(entry: QueueEntry): js.Promise[scala.Unit]
}

object Queue {
  @scala.inline
  def apply(
    name: java.lang.String,
    popRequest: () => js.Promise[QueueEntry],
    pushRequest: QueueEntry => js.Promise[scala.Unit],
    registerSync: () => js.Promise[scala.Unit],
    replayRequests: () => js.Promise[scala.Unit],
    shiftRequest: () => js.Promise[QueueEntry],
    unshiftRequest: QueueEntry => js.Promise[scala.Unit]
  ): Queue = {
    val __obj = js.Dynamic.literal(name = name, popRequest = js.Any.fromFunction0(popRequest), pushRequest = js.Any.fromFunction1(pushRequest), registerSync = js.Any.fromFunction0(registerSync), replayRequests = js.Any.fromFunction0(replayRequests), shiftRequest = js.Any.fromFunction0(shiftRequest), unshiftRequest = js.Any.fromFunction1(unshiftRequest))
  
    __obj.asInstanceOf[Queue]
  }
}

