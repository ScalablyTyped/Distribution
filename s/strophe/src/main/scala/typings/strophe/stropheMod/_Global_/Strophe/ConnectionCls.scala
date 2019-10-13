package typings.strophe.stropheMod._Global_.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class: Strophe.Connection
  *  XMPP Connection manager.
  *
  *  This class is the main part of Strophe.  It manages a BOSH connection
  *  to an XMPP server and dispatches events to the user callbacks as
  *  data arrives.  It supports SASL PLAIN, SASL DIGEST-MD5, SASL SCRAM-SHA1
  *  and legacy authentication.
  *
  *  After creating a Strophe.Connection object, the user will typically
  *  call connect() with a user supplied callback to handle connection level
  *  events like authentication failure, disconnection, or connection
  *  complete.
  *
  *  The user will also have several event handlers defined by using
  *  addHandler() and addTimedHandler().  These will allow the user code to
  *  respond to interesting stanzas or do something periodically with the
  *  connection.  These handlers will be active once authentication is
  *  finished.
  *
  *  To send data to the connection, use send().
  */
@JSGlobal("Strophe.Connection")
@js.native
class ConnectionCls protected ()
  extends typings.strophe.stropheMod.Strophe.Connection {
  //todo: what other members are meant to be public?
  /** Constructor: Strophe.Connection
    *  Create and initialize a Strophe.Connection object.
    *
    *  The transport-protocol for this connection will be chosen automatically
    *  based on the given service parameter. URLs starting with "ws://" or
    *  "wss://" will use WebSockets, URLs starting with "http://", "https://"
    *  or without a protocol will use BOSH.
    *
    *  To make Strophe connect to the current host you can leave out the protocol
    *  and host part and just pass the path, e.g.
    *
    *  > var conn = new Strophe.Connection("/http-bind/");
    *
    *  WebSocket options:
    *
    *  If you want to connect to the current host with a WebSocket connection you
    *  can tell Strophe to use WebSockets through a "protocol" attribute in the
    *  optional options parameter. Valid values are "ws" for WebSocket and "wss"
    *  for Secure WebSocket.
    *  So to connect to "wss://CURRENT_HOSTNAME/xmpp-websocket" you would call
    *
    *  > var conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
    *
    *  Note that relative URLs _NOT_ starting with a "/" will also include the path
    *  of the current site.
    *
    *  Also because downgrading security is not permitted by browsers, when using
    *  relative URLs both BOSH and WebSocket connections will use their secure
    *  variants if the current connection to the site is also secure (https).
    *
    *  BOSH options:
    *
    *  by adding "sync" to the options, you can control if requests will
    *  be made synchronously or not. The default behaviour is asynchronous.
    *  If you want to make requests synchronous, make "sync" evaluate to true:
    *  > var conn = new Strophe.Connection("/http-bind/", {sync: true});
    *  You can also toggle this on an already established connection:
    *  > conn.options.sync = true;
    *
    *
    *  Parameters:
    *    (String) service - The BOSH or WebSocket service URL.
    *    (Object) options - A hash of configuration options
    *
    *  Returns:
    *    A new Strophe.Connection object.
    */
  def this(service: String) = this()
  def this(service: String, options: typings.strophe.stropheMod.Strophe.ConnectionOptions) = this()
}

