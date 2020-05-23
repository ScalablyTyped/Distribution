package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  /**
    * If true, fragmented messages will be automatically assembled and the full
    * message will be emitted via a `message` event. If false, each frame will be
    * emitted on the `connection` object via a `frame` event and the application
    * will be responsible for aggregating multiple fragmented frames. Single-frame
    * messages will emit a `message` event in addition to the `frame` event.
    * @default true
    */
  var assembleFragments: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds to wait after sending a close frame for an
    * `acknowledgement` to come back before giving up and just closing the socket.
    * @default 5000
    */
  var closeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to fragment outgoing messages. If true, messages will be
    * automatically fragmented into chunks of up to `fragmentationThreshold` bytes.
    * @default true
    */
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum size of a frame in bytes before it is automatically fragmented.
    * @default 16KiB
    */
  var fragmentationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The maximum allowed received frame size in bytes.
    * Single frame messages will also be limited to this maximum.
    */
  var maxReceivedFrameSize: js.UndefOr[Double] = js.undefined
  /** The maximum allowed aggregate message size (for fragmented messages) in bytes */
  var maxReceivedMessageSize: js.UndefOr[Double] = js.undefined
}

object IConfig {
  @scala.inline
  def apply(
    assembleFragments: js.UndefOr[Boolean] = js.undefined,
    closeTimeout: js.UndefOr[Double] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: js.UndefOr[Double] = js.undefined,
    maxReceivedFrameSize: js.UndefOr[Double] = js.undefined,
    maxReceivedMessageSize: js.UndefOr[Double] = js.undefined
  ): IConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTimeout)) __obj.updateDynamic("closeTimeout")(closeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentationThreshold)) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedFrameSize)) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedMessageSize)) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

