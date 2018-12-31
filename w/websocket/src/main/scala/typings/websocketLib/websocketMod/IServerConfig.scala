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

