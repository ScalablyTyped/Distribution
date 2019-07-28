package typings.websocket.websocketMod

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
    closeTimeout: Int | Double = null,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: Int | Double = null,
    maxReceivedFrameSize: Int | Double = null,
    maxReceivedMessageSize: Int | Double = null
  ): IConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments)
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages)
    if (fragmentationThreshold != null) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.asInstanceOf[js.Any])
    if (maxReceivedFrameSize != null) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.asInstanceOf[js.Any])
    if (maxReceivedMessageSize != null) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

