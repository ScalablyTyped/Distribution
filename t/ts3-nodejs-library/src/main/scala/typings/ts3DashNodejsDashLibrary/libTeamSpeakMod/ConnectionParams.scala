package typings.ts3DashNodejsDashLibrary.libTeamSpeakMod

import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.QueryProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParams extends js.Object {
  /** the host to connect to (default: 127.0.0.1) */
  var host: String
  /** wether a keepalive should get sent (default: true) */
  var keepAlive: Boolean
  /** local address the socket should connect from */
  var localAddress: js.UndefOr[String] = js.undefined
  /** the nickname to connect with */
  var nickname: js.UndefOr[String] = js.undefined
  /** the password to use with the login (default: none) */
  var password: js.UndefOr[String] = js.undefined
  /** the query protocol to use (default: @see QueryProtocol ) */
  var protocol: QueryProtocol
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
    keepAlive: Boolean,
    protocol: QueryProtocol,
    queryport: Double,
    readyTimeout: Double,
    localAddress: String = null,
    nickname: String = null,
    password: String = null,
    serverport: Int | Double = null,
    username: String = null
  ): ConnectionParams = {
    val __obj = js.Dynamic.literal(host = host, keepAlive = keepAlive, protocol = protocol, queryport = queryport, readyTimeout = readyTimeout)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (password != null) __obj.updateDynamic("password")(password)
    if (serverport != null) __obj.updateDynamic("serverport")(serverport.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ConnectionParams]
  }
}

