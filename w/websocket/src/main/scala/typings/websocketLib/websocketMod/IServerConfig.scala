package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerConfig extends IConfig {
  /**
    * If this is true, websocket connections will be accepted regardless of the path
    * and protocol specified by the client. The protocol accepted will be the first
    * that was requested by the client.
    * @default false
    */
  var autoAcceptConnections: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Nagle Algorithm makes more efficient use of network resources by introducing a
    * small delay before sending small packets so that multiple messages can be batched
    * together before going onto the wire. This however comes at the cost of latency.
    * @default true
    */
  var disableNagleAlgorithm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the server will consider any connection that has not received any
    * data within the amount of time specified by `keepaliveGracePeriod` after a
    * `keepalive` ping has been sent. Ignored if `keepalive` is false.
    * @default true
    */
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[scala.Boolean] = js.undefined
  /** The http or https server instance(s) to attach to */
  var httpServer: nodeLib.httpMod.Server | nodeLib.httpsMod.Server | (js.Array[nodeLib.httpMod.Server | nodeLib.httpsMod.Server])
  /**
    * If true, the server will automatically send a ping to all clients every
    * `keepaliveInterval` milliseconds. Each client has an independent `keepalive`
    * timer, which is reset when any data is received from that client.
    * @default true
    */
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount of time to wait after sending a `keepalive` ping before closing
    * the connection if the connected peer does not respond. Ignored if `keepalive`
    * or `dropConnectionOnKeepaliveTimeout` are false. The grace period timer is
    * reset when any data is received from the client.
    * @default 10000
    */
  var keepaliveGracePeriod: js.UndefOr[scala.Double] = js.undefined
  /**
    * The interval in milliseconds to send `keepalive` pings to connected clients.
    * @default 20000
    */
  var keepaliveInterval: js.UndefOr[scala.Double] = js.undefined
}

object IServerConfig {
  @scala.inline
  def apply(
    httpServer: nodeLib.httpMod.Server | nodeLib.httpsMod.Server | (js.Array[nodeLib.httpMod.Server | nodeLib.httpsMod.Server]),
    assembleFragments: js.UndefOr[scala.Boolean] = js.undefined,
    autoAcceptConnections: js.UndefOr[scala.Boolean] = js.undefined,
    closeTimeout: scala.Int | scala.Double = null,
    disableNagleAlgorithm: js.UndefOr[scala.Boolean] = js.undefined,
    dropConnectionOnKeepaliveTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentationThreshold: scala.Int | scala.Double = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    keepaliveGracePeriod: scala.Int | scala.Double = null,
    keepaliveInterval: scala.Int | scala.Double = null,
    maxReceivedFrameSize: scala.Int | scala.Double = null,
    maxReceivedMessageSize: scala.Int | scala.Double = null
  ): IServerConfig = {
    val __obj = js.Dynamic.literal(httpServer = httpServer.asInstanceOf[js.Any])
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments)
    if (!js.isUndefined(autoAcceptConnections)) __obj.updateDynamic("autoAcceptConnections")(autoAcceptConnections)
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagleAlgorithm)) __obj.updateDynamic("disableNagleAlgorithm")(disableNagleAlgorithm)
    if (!js.isUndefined(dropConnectionOnKeepaliveTimeout)) __obj.updateDynamic("dropConnectionOnKeepaliveTimeout")(dropConnectionOnKeepaliveTimeout)
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages)
    if (fragmentationThreshold != null) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (keepaliveGracePeriod != null) __obj.updateDynamic("keepaliveGracePeriod")(keepaliveGracePeriod.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    if (maxReceivedFrameSize != null) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.asInstanceOf[js.Any])
    if (maxReceivedMessageSize != null) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerConfig]
  }
}

