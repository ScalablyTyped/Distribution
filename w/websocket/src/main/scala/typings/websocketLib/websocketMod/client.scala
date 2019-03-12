package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait client
  extends nodeLib.eventsMod.EventEmitter {
  var origin: java.lang.String = js.native
  var protocols: js.Array[java.lang.String] = js.native
  var response: nodeLib.httpMod.IncomingMessage = js.native
  var secure: scala.Boolean = js.native
  var socket: nodeLib.netMod.Socket = js.native
  var url: nodeLib.urlMod.Url = js.native
  /**
    * Will cancel an in-progress connection request before either the `connect` event or the `connectFailed` event has been emitted.
    * If the `connect` or `connectFailed` event has already been emitted, calling `abort()` will do nothing.
    */
  def abort(): scala.Unit = js.native
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connect(
    event: websocketLib.websocketLibStrings.connect,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connectFailed(
    event: websocketLib.websocketLibStrings.connectFailed,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def connect(requestUrl: java.lang.String): scala.Unit = js.native
  def connect(requestUrl: java.lang.String, protocols: java.lang.String): scala.Unit = js.native
  def connect(requestUrl: java.lang.String, protocols: java.lang.String, origin: java.lang.String): scala.Unit = js.native
  def connect(
    requestUrl: java.lang.String,
    protocols: java.lang.String,
    origin: java.lang.String,
    headers: js.Object
  ): scala.Unit = js.native
  def connect(
    requestUrl: java.lang.String,
    protocols: java.lang.String,
    origin: java.lang.String,
    headers: js.Object,
    extraRequestOptions: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def connect(requestUrl: java.lang.String, protocols: js.Array[java.lang.String]): scala.Unit = js.native
  def connect(requestUrl: java.lang.String, protocols: js.Array[java.lang.String], origin: java.lang.String): scala.Unit = js.native
  def connect(
    requestUrl: java.lang.String,
    protocols: js.Array[java.lang.String],
    origin: java.lang.String,
    headers: js.Object
  ): scala.Unit = js.native
  def connect(
    requestUrl: java.lang.String,
    protocols: js.Array[java.lang.String],
    origin: java.lang.String,
    headers: js.Object,
    extraRequestOptions: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  /**
    * Establish a connection. The remote server will select the best subprotocol that
    * it supports and send that back when establishing the connection.
    *
    * @param [origin] can be used in user-agent scenarios to identify the page containing
    *                 any scripting content that caused the connection to be requested.
    * @param requestUrl should be a standard websocket url
    */
  def connect(requestUrl: nodeLib.urlMod.Url): scala.Unit = js.native
  def connect(requestUrl: nodeLib.urlMod.Url, protocols: java.lang.String): scala.Unit = js.native
  def connect(requestUrl: nodeLib.urlMod.Url, protocols: java.lang.String, origin: java.lang.String): scala.Unit = js.native
  def connect(
    requestUrl: nodeLib.urlMod.Url,
    protocols: java.lang.String,
    origin: java.lang.String,
    headers: js.Object
  ): scala.Unit = js.native
  def connect(
    requestUrl: nodeLib.urlMod.Url,
    protocols: java.lang.String,
    origin: java.lang.String,
    headers: js.Object,
    extraRequestOptions: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  def connect(requestUrl: nodeLib.urlMod.Url, protocols: js.Array[java.lang.String]): scala.Unit = js.native
  def connect(requestUrl: nodeLib.urlMod.Url, protocols: js.Array[java.lang.String], origin: java.lang.String): scala.Unit = js.native
  def connect(
    requestUrl: nodeLib.urlMod.Url,
    protocols: js.Array[java.lang.String],
    origin: java.lang.String,
    headers: js.Object
  ): scala.Unit = js.native
  def connect(
    requestUrl: nodeLib.urlMod.Url,
    protocols: js.Array[java.lang.String],
    origin: java.lang.String,
    headers: js.Object,
    extraRequestOptions: nodeLib.httpMod.RequestOptions
  ): scala.Unit = js.native
  // Events
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_connect(
    event: websocketLib.websocketLibStrings.connect,
    cb: js.Function1[/* connection */ connection, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connectFailed(
    event: websocketLib.websocketLibStrings.connectFailed,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
}

