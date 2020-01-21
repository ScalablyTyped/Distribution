package typings.watsonDeveloperCloud.synthesizeStreamMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pipe()-able Node.js Readable stream - accepts text in the constructor and emits binary audio data in its 'message' events
  *
  * Cannot be instantiated directly, instead created by calling #synthesizeUsingWebSocket()
  *
  * Uses WebSockets under the hood.
  * @param {Object} options
  * @constructor
  */
@js.native
trait SynthesizeStream extends Readable {
  var _readableState: js.Any = js.native
  var authenticated: js.Any = js.native
  var initialized: js.Any = js.native
  var options: js.Any = js.native
  var socket: js.Any = js.native
  def _read(): Unit = js.native
  def initialize(): Unit = js.native
  /**
    * This function retrieves an IAM access token and stores it in the
    * request header before calling the callback function, which will
    * execute the next iteration of `_read()`
    *
    *
    * @private
    * @param {Function} callback
    */
  def setAuthorizationHeaderToken(callback: js.Any): Unit = js.native
}

