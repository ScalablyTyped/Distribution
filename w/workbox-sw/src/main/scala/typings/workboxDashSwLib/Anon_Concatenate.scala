package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Concatenate
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StreamsNamespace] {
  /**
  	 * Takes multiple source Promises, each of which could resolve to a Response, a ReadableStream, or a BodyInit.
  	 * Returns an object exposing a ReadableStream with each individual stream's data returned in sequence,
  	 * along with a Promise which signals when the stream is finished (useful for passing to a FetchEvent's waitUntil()).
  	 * @param {Promise<StreamSource>[]} sourcePromises - Array of Promise containing StreamSource
  	 * @returns {IConcatenateResult}
  	 */
  def concatenate(sourcePromises: js.Array[js.Promise[StreamSource]]): workboxDashSwLib.workboxDashSwMod.IConcatenateResult = js.native
  /**
  	 * Takes multiple source Promises, each of which could resolve to a Response, a ReadableStream, or a BodyInit,along with a HeadersInit.
  	 * Returns an object exposing a Response whose body consists of each individual stream's data returned in sequence,
  	 * along with a Promise which signals when the stream is finished (useful for passing to a FetchEvent's waitUntil()).
  	 * @param {Promise<StreamSource>[]} sourcePromises - Array of Promise containing StreamSource
  	 * @param {HeadersInit} [headersInit] - If there's no Content-Type specified, 'text/html' will be used by default.
  	 * @returns {IConcatenateToResponseResult}
  	 */
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): workboxDashSwLib.workboxDashSwMod.IConcatenateToResponseResult = js.native
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: stdLib.HeadersInit): workboxDashSwLib.workboxDashSwMod.IConcatenateToResponseResult = js.native
  /**
  	 * This is a utility method that determines whether the current browser supports the features required to create streamed responses. Currently, it checks if ReadableStream is available.
  	 * @param {HeadersInit} [headersInit] - If there's no Content-Type specified, 'text/html' will be used by default.
  	 * @returns {boolean} - true, if the current browser meets the requirements for streaming responses, and false otherwise.
  	 */
  def createHeaders(): scala.Boolean = js.native
  def createHeaders(headersInit: stdLib.HeadersInit): scala.Boolean = js.native
  /**
  	 * This is a utility method that determines whether the current browser supports the features required to create streamed responses. Currently, it checks if ReadableStream is available.
  	 * @returns {boolean} - true, if the current browser meets the requirements for streaming responses, and false otherwise.
  	 */
  def isSupported(): scala.Boolean = js.native
  /**
  	 * A shortcut to create a strategy that could be dropped-in to Workbox's router.
  	 * On browsers that do not support constructing new ReadableStreams, this strategy will automatically wait for
  	 * all the sourceFunctions to complete, and create a final response that concatenates their values together.
  	 * @param {HandlerCallback[]} sourceFunctions - Each function should return a workbox.streams.StreamSource (or a Promise which resolves to one).
  	 * @param {HeadersInit} headersInit . If there's no Content-Type specified, 'text/html' will be used by default.
  	 * @returns {HandlerCallback}
  	 */
  def strategy(sourceFunctions: js.Array[HandlerCallback]): HandlerCallback = js.native
  def strategy(sourceFunctions: js.Array[HandlerCallback], headersInit: stdLib.HeadersInit): HandlerCallback = js.native
}

