package typings.ts3NodejsLibrary.teamSpeakMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParams extends js.Object {
  /** wether it should automatically connect after instanciating (default: true) */
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  /** the host to connect to (default: 127.0.0.1) */
  var host: String
  /** wether query clients should be ignored allover (clientList, events, etc) */
  var ignoreQueries: Boolean
  /** wether a keepalive should get sent (default: true) */
  var keepAlive: Boolean
  /** sends the keepalive after x seconds of inactivity (default: 250s) */
  var keepAliveTimeout: Double
  /** local address the socket should connect from */
  var localAddress: js.UndefOr[String] = js.undefined
  /** the nickname to connect with */
  var nickname: js.UndefOr[String] = js.undefined
  /** the password to use with the login (default: none) */
  var password: js.UndefOr[String] = js.undefined
  /** the query protocol to use (default: @see QueryProtocol ) */
  var protocol: typings.ts3NodejsLibrary.enumMod.QueryProtocol
  /** the queryport to use (default: raw=10011 ssh=10022) */
  var queryport: Double
  /** time to wait until a timeout gets fired (default: 10000) */
  var readyTimeout: Double
  /** the server to select upon connect (default: none) */
  var serverport: js.UndefOr[Double] = js.undefined
  /** the username to login with (default: none) */
  var username: js.UndefOr[String] = js.undefined
}

object ConnectionParams {
  @scala.inline
  def apply(
    host: String,
    ignoreQueries: Boolean,
    keepAlive: Boolean,
    keepAliveTimeout: Double,
    protocol: typings.ts3NodejsLibrary.enumMod.QueryProtocol,
    queryport: Double,
    readyTimeout: Double,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    nickname: String = null,
    password: String = null,
    serverport: js.UndefOr[Double] = js.undefined,
    username: String = null
  ): ConnectionParams = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], ignoreQueries = ignoreQueries.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], keepAliveTimeout = keepAliveTimeout.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], queryport = queryport.asInstanceOf[js.Any], readyTimeout = readyTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(serverport)) __obj.updateDynamic("serverport")(serverport.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParams]
  }
}

