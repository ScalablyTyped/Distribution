package typings
package tunnelDashSshLib.tunnelDashSshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var agent: js.UndefOr[java.lang.String] = js.undefined
  var agentForward: js.UndefOr[scala.Boolean] = js.undefined
  var algorithms: js.UndefOr[tunnelDashSshLib.Anon_Cipher] = js.undefined
  var authHandler: js.UndefOr[
    js.Function3[
      /* methodsLeft */ scala.Null | js.Array[java.lang.String], 
      /* partialSuccess */ scala.Null | scala.Boolean, 
      /* cb */ js.Function1[/* nextMethod */ java.lang.String, scala.Unit], 
      java.lang.String
    ]
  ] = js.undefined
  var compress: js.UndefOr[tunnelDashSshLib.tunnelDashSshLibStrings.force | scala.Boolean] = js.undefined
  var debug: js.UndefOr[js.Function1[/* info */ java.lang.String, scala.Unit]] = js.undefined
  var dstHost: js.UndefOr[java.lang.String] = js.undefined
  var dstPort: js.UndefOr[scala.Double] = js.undefined
  var forceIPv4: js.UndefOr[scala.Boolean] = js.undefined
  var forceIPv6: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostHast: js.UndefOr[java.lang.String] = js.undefined
  var hostVerifier: js.UndefOr[
    js.Function2[
      /* hashedKey */ java.lang.String, 
      /* repeated */ js.Function1[/* doContinue */ scala.Boolean, scala.Unit], 
      scala.Boolean
    ]
  ] = js.undefined
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  var keepaliveCountMax: js.UndefOr[scala.Double] = js.undefined
  var keepaliveInterval: js.UndefOr[scala.Double] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localHost: js.UndefOr[java.lang.String] = js.undefined
  var localHostname: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[scala.Double] = js.undefined
  var localUsername: js.UndefOr[java.lang.String] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var privateKey: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var readyTimeout: js.UndefOr[scala.Double] = js.undefined
  var sock: js.UndefOr[nodeLib.NodeJSNs.ReadableStream] = js.undefined
  var strictVendor: js.UndefOr[scala.Boolean] = js.undefined
  var tryKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    agent: java.lang.String = null,
    agentForward: js.UndefOr[scala.Boolean] = js.undefined,
    algorithms: tunnelDashSshLib.Anon_Cipher = null,
    authHandler: (/* methodsLeft */ scala.Null | js.Array[java.lang.String], /* partialSuccess */ scala.Null | scala.Boolean, /* cb */ js.Function1[/* nextMethod */ java.lang.String, scala.Unit]) => java.lang.String = null,
    compress: tunnelDashSshLib.tunnelDashSshLibStrings.force | scala.Boolean = null,
    debug: /* info */ java.lang.String => scala.Unit = null,
    dstHost: java.lang.String = null,
    dstPort: scala.Int | scala.Double = null,
    forceIPv4: js.UndefOr[scala.Boolean] = js.undefined,
    forceIPv6: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    hostHast: java.lang.String = null,
    hostVerifier: (/* hashedKey */ java.lang.String, /* repeated */ js.Function1[/* doContinue */ scala.Boolean, scala.Unit]) => scala.Boolean = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepaliveCountMax: scala.Int | scala.Double = null,
    keepaliveInterval: scala.Int | scala.Double = null,
    localAddress: java.lang.String = null,
    localHost: java.lang.String = null,
    localHostname: java.lang.String = null,
    localPort: scala.Int | scala.Double = null,
    localUsername: java.lang.String = null,
    passphrase: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    privateKey: nodeLib.Buffer | java.lang.String = null,
    readyTimeout: scala.Int | scala.Double = null,
    sock: nodeLib.NodeJSNs.ReadableStream = null,
    strictVendor: js.UndefOr[scala.Boolean] = js.undefined,
    tryKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (!js.isUndefined(agentForward)) __obj.updateDynamic("agentForward")(agentForward)
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (authHandler != null) __obj.updateDynamic("authHandler")(js.Any.fromFunction3(authHandler))
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (dstHost != null) __obj.updateDynamic("dstHost")(dstHost)
    if (dstPort != null) __obj.updateDynamic("dstPort")(dstPort.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIPv4)) __obj.updateDynamic("forceIPv4")(forceIPv4)
    if (!js.isUndefined(forceIPv6)) __obj.updateDynamic("forceIPv6")(forceIPv6)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostHast != null) __obj.updateDynamic("hostHast")(hostHast)
    if (hostVerifier != null) __obj.updateDynamic("hostVerifier")(js.Any.fromFunction2(hostVerifier))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepaliveCountMax != null) __obj.updateDynamic("keepaliveCountMax")(keepaliveCountMax.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localHost != null) __obj.updateDynamic("localHost")(localHost)
    if (localHostname != null) __obj.updateDynamic("localHostname")(localHostname)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (localUsername != null) __obj.updateDynamic("localUsername")(localUsername)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (readyTimeout != null) __obj.updateDynamic("readyTimeout")(readyTimeout.asInstanceOf[js.Any])
    if (sock != null) __obj.updateDynamic("sock")(sock)
    if (!js.isUndefined(strictVendor)) __obj.updateDynamic("strictVendor")(strictVendor)
    if (!js.isUndefined(tryKeyboard)) __obj.updateDynamic("tryKeyboard")(tryKeyboard)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Config]
  }
}

