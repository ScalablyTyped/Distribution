package typings.websocket.mod

import typings.node.httpMod.Server
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
  var autoAcceptConnections: js.UndefOr[Boolean] = js.undefined
  /**
    * The Nagle Algorithm makes more efficient use of network resources by introducing a
    * small delay before sending small packets so that multiple messages can be batched
    * together before going onto the wire. This however comes at the cost of latency.
    * @default true
    */
  var disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the server will consider any connection that has not received any
    * data within the amount of time specified by `keepaliveGracePeriod` after a
    * `keepalive` ping has been sent. Ignored if `keepalive` is false.
    * @default true
    */
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined
  /** The http or https server instance(s) to attach to */
  var httpServer: Server | typings.node.httpsMod.Server | (js.Array[Server | typings.node.httpsMod.Server])
  /**
    * Whether or not the X-Forwarded-For header should be respected.
    * It's important to set this to 'true' when accepting connections
    * from untrusted clients, as a malicious client could spoof its
    * IP address by simply setting this header.  It's meant to be added
    * by a trusted proxy or other intermediary within your own
    * infrastructure.
    * See:  http://en.wikipedia.org/wiki/X-Forwarded-For
    * @default false
    */
  var ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the server will automatically send a ping to all clients every
    * `keepaliveInterval` milliseconds. Each client has an independent `keepalive`
    * timer, which is reset when any data is received from that client.
    * @default true
    */
  var keepalive: js.UndefOr[Boolean] = js.undefined
  /**
    * The amount of time to wait after sending a `keepalive` ping before closing
    * the connection if the connected peer does not respond. Ignored if `keepalive`
    * or `dropConnectionOnKeepaliveTimeout` are false. The grace period timer is
    * reset when any data is received from the client.
    * @default 10000
    */
  var keepaliveGracePeriod: js.UndefOr[Double] = js.undefined
  /**
    * The interval in milliseconds to send `keepalive` pings to connected clients.
    * @default 20000
    */
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
  /**
    * Whether to use native TCP keep-alive instead of WebSockets ping
    * and pong packets.  Native TCP keep-alive sends smaller packets
    * on the wire and so uses bandwidth more efficiently.  This may
    * be more important when talking to mobile devices.
    * If this value is set to true, then these values will be ignored:
    *   keepaliveGracePeriod
    *   dropConnectionOnKeepaliveTimeout
    * @default false
    */
  var useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
}

object IServerConfig {
  @scala.inline
  def apply(
    httpServer: Server | typings.node.httpsMod.Server | (js.Array[Server | typings.node.httpsMod.Server]),
    assembleFragments: js.UndefOr[Boolean] = js.undefined,
    autoAcceptConnections: js.UndefOr[Boolean] = js.undefined,
    closeTimeout: Int | Double = null,
    disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined,
    dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: Int | Double = null,
    ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    keepaliveGracePeriod: Int | Double = null,
    keepaliveInterval: Int | Double = null,
    maxReceivedFrameSize: Int | Double = null,
    maxReceivedMessageSize: Int | Double = null,
    useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
  ): IServerConfig = {
    val __obj = js.Dynamic.literal(httpServer = httpServer.asInstanceOf[js.Any])
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptConnections)) __obj.updateDynamic("autoAcceptConnections")(autoAcceptConnections.asInstanceOf[js.Any])
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagleAlgorithm)) __obj.updateDynamic("disableNagleAlgorithm")(disableNagleAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(dropConnectionOnKeepaliveTimeout)) __obj.updateDynamic("dropConnectionOnKeepaliveTimeout")(dropConnectionOnKeepaliveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages.asInstanceOf[js.Any])
    if (fragmentationThreshold != null) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreXForwardedFor)) __obj.updateDynamic("ignoreXForwardedFor")(ignoreXForwardedFor.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (keepaliveGracePeriod != null) __obj.updateDynamic("keepaliveGracePeriod")(keepaliveGracePeriod.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    if (maxReceivedFrameSize != null) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.asInstanceOf[js.Any])
    if (maxReceivedMessageSize != null) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeKeepalive)) __obj.updateDynamic("useNativeKeepalive")(useNativeKeepalive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServerConfig]
  }
}

