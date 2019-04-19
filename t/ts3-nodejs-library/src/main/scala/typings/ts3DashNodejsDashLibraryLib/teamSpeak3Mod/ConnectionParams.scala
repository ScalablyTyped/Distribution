package typings
package ts3DashNodejsDashLibraryLib.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionParams extends js.Object {
  /** The Host on which the TeamSpeak Server runs. Defaults to 127.0.0.1. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The Nickname the Client should have */
  var nickname: java.lang.String
  /** The password to authenticate with the TeamSpeak Server */
  var password: java.lang.String
  /** The Protocol to use. Defaults to raw. */
  var protocol: js.UndefOr[
    ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibStrings.ssh | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibStrings.raw
  ] = js.undefined
  /** The Queryport on which the TeamSpeak Server runs. Defaults to 10011. */
  var queryport: js.UndefOr[scala.Double] = js.undefined
  /** Maximum wait time for the connection to get established. Defaults to 20000. */
  var readyTimeout: js.UndefOr[scala.Double] = js.undefined
  /** The Serverport on which the TeamSpeak Instance runs. Defaults to 9987. */
  var serverport: js.UndefOr[scala.Double] = js.undefined
  /** The username to authenticate with the TeamSpeak Server. */
  var username: java.lang.String
}

object ConnectionParams {
  @scala.inline
  def apply(
    nickname: java.lang.String,
    password: java.lang.String,
    username: java.lang.String,
    host: java.lang.String = null,
    protocol: ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibStrings.ssh | ts3DashNodejsDashLibraryLib.ts3DashNodejsDashLibraryLibStrings.raw = null,
    queryport: scala.Int | scala.Double = null,
    readyTimeout: scala.Int | scala.Double = null,
    serverport: scala.Int | scala.Double = null
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

