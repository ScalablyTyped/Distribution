package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.enumMod.QueryProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/TeamSpeak.ConnectionParams> */
trait PartialConnectionParams extends js.Object {
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var ignoreQueries: js.UndefOr[Boolean] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepAliveTimeout: js.UndefOr[Double] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var nickname: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[QueryProtocol] = js.undefined
  var queryport: js.UndefOr[Double] = js.undefined
  var readyTimeout: js.UndefOr[Double] = js.undefined
  var serverport: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object PartialConnectionParams {
  @scala.inline
  def apply(
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    ignoreQueries: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepAliveTimeout: js.UndefOr[Double] = js.undefined,
    localAddress: String = null,
    nickname: String = null,
    password: String = null,
    protocol: QueryProtocol = null,
    queryport: js.UndefOr[Double] = js.undefined,
    readyTimeout: js.UndefOr[Double] = js.undefined,
    serverport: js.UndefOr[Double] = js.undefined,
    username: String = null
  ): PartialConnectionParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreQueries)) __obj.updateDynamic("ignoreQueries")(ignoreQueries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAliveTimeout)) __obj.updateDynamic("keepAliveTimeout")(keepAliveTimeout.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(queryport)) __obj.updateDynamic("queryport")(queryport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readyTimeout)) __obj.updateDynamic("readyTimeout")(readyTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverport)) __obj.updateDynamic("serverport")(serverport.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConnectionParams]
  }
}

