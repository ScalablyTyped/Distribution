package typings.watsonDeveloperCloud.recognizeStreamMod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pipe()-able Node.js Readable/Writeable stream - accepts binary audio and emits text in its `data` events.
  * Also emits `results` events with interim results and other data.
  *
  * Cannot be instantiated directly, instead created by calling #recognizeUsingWebSocket()
  *
  * Uses WebSockets under the hood. For audio with no recognizable speech, no `data` events are emitted.
  * @param {Object} options
  * @constructor
  */
@js.native
trait RecognizeStream extends Duplex {
  var _writableState: js.Any = js.native
  var authenticated: js.Any = js.native
  var finished: js.Any = js.native
  var initialized: js.Any = js.native
  var listening: js.Any = js.native
  var options: js.Any = js.native
  var socket: js.Any = js.native
  def _read(): Unit = js.native
  def _write(chunk: js.Any, encoding: js.Any, callback: js.Any): Unit = js.native
  /**
    * Flow control - don't ask for more data until we've finished what we have
    *
    * Notes:
    *
    * This limits upload speed to 100 * options.highWaterMark / second.
    *
    * The default highWaterMark is 16kB, so the default max upload speed is ~1.6MB/s.
    *
    * Microphone input provides audio at a (downsampled) rate of:
    *   16000 samples/s * 16-bits * 1 channel = 32kB/s
    * (note the bits to Bytes conversion there)
    *
    * @private
    * @param {Function} next
    */
  def afterSend(next: js.Any): Unit = js.native
  def finish(): Unit = js.native
  /**
    * Returns a Promise that resolves with Watson Transaction ID from the X-Transaction-ID header
    *
    * Works in Node.js but not in browsers (the W3C WebSocket API does not expose headers)
    *
    * @return Promise<String>
    */
  def getTransactionId(): js.Promise[String] = js.native
  def initialize(): Unit = js.native
  def sendData(data: js.Any): Unit = js.native
  def sendJSON(msg: js.Any): Unit = js.native
  /**
    * This function retrieves an IAM access token and stores it in the
    * request header before calling the callback function, which will
    * execute the next iteration of `_write()`
    *
    *
    * @private
    * @param {Function} callback
    */
  def setAuthorizationHeaderToken(callback: js.Any): Unit = js.native
  /**
    * Prevents any more audio from being sent over the WebSocket and gracefully closes the connection.
    * Additional data may still be emitted up until the `end` event is triggered.
    */
  def stop(): Unit = js.native
}

