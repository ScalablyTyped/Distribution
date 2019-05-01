package typings
package twilioDashSyncLib.twilioDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Client
  * @classdesc
  * Client for the Twilio Sync service.
  * @constructor
  * @param {String} token - Twilio access token.
  * @param {Client#ClientOptions} [options] - Options to customize the Client.
  * @example
  * // Using NPM
  * var SyncClient = require('twilio-sync');
  * var syncClient = new SyncClient(token, { logLevel: 'debug' });
  *
  * // Using CDN
  * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
  *
  * @property {Client#ConnectionState} connectionState - Contains current service connection state.
  * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
  */
@JSImport("twilio-sync", "SyncClient")
@js.native
class SyncClient protected ()
  extends twilioDashSyncLib.libClientMod.SyncClient {
  def this(fpaToken: java.lang.String) = this()
  def this(fpaToken: java.lang.String, options: js.Any) = this()
}

/* static members */
@JSImport("twilio-sync", "SyncClient")
@js.native
object SyncClient extends js.Object {
  /**
    * Current version of Sync client.
    * @name Client#version
    * @type String
    * @readonly
    */
  val version: js.Any = js.native
}

