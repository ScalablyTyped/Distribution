package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.raw
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.ssh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParams extends js.Object {
  /** The Host on which the TeamSpeak Server runs. Defaults to 127.0.0.1. */
  var host: js.UndefOr[String] = js.undefined
  /** The Nickname the Client should have */
  var nickname: String
  /** The password to authenticate with the TeamSpeak Server */
  var password: String
  /** The Protocol to use. Defaults to raw. */
  var protocol: js.UndefOr[ssh | raw] = js.undefined
  /** The Queryport on which the TeamSpeak Server runs. Defaults to 10011. */
  var queryport: js.UndefOr[Double] = js.undefined
  /** Maximum wait time for the connection to get established. Defaults to 20000. */
  var readyTimeout: js.UndefOr[Double] = js.undefined
  /** The Serverport on which the TeamSpeak Instance runs. Defaults to 9987. */
  var serverport: js.UndefOr[Double] = js.undefined
  /** The username to authenticate with the TeamSpeak Server. */
  var username: String
}

object ConnectionParams {
  @scala.inline
  def apply(
    nickname: String,
    password: String,
    username: String,
    host: String = null,
    protocol: ssh | raw = null,
    queryport: Int | Double = null,
    readyTimeout: Int | Double = null,
    serverport: Int | Double = null
  ): ConnectionParams = {
    val __obj = js.Dynamic.literal(nickname = nickname, password = password, username = username)
    if (host != null) __obj.updateDynamic("host")(host)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryport != null) __obj.updateDynamic("queryport")(queryport.asInstanceOf[js.Any])
    if (readyTimeout != null) __obj.updateDynamic("readyTimeout")(readyTimeout.asInstanceOf[js.Any])
    if (serverport != null) __obj.updateDynamic("serverport")(serverport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParams]
  }
}

