package typings.tunnelSsh.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.tunnelSsh.anon.Cipher
import typings.tunnelSsh.tunnelSshStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var agent: js.UndefOr[String] = js.undefined
  var agentForward: js.UndefOr[Boolean] = js.undefined
  var algorithms: js.UndefOr[Cipher] = js.undefined
  var authHandler: js.UndefOr[
    js.Function3[
      /* methodsLeft */ Null | js.Array[String], 
      /* partialSuccess */ Null | Boolean, 
      /* cb */ js.Function1[/* nextMethod */ String, Unit], 
      String
    ]
  ] = js.undefined
  var compress: js.UndefOr[force | Boolean] = js.undefined
  var debug: js.UndefOr[js.Function1[/* info */ String, Unit]] = js.undefined
  var dstHost: js.UndefOr[String] = js.undefined
  var dstPort: js.UndefOr[Double] = js.undefined
  var forceIPv4: js.UndefOr[Boolean] = js.undefined
  var forceIPv6: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostHast: js.UndefOr[String] = js.undefined
  var hostVerifier: js.UndefOr[
    js.Function2[
      /* hashedKey */ String, 
      /* repeated */ js.Function1[/* doContinue */ Boolean, Unit], 
      Boolean
    ]
  ] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var keepaliveCountMax: js.UndefOr[Double] = js.undefined
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var localHost: js.UndefOr[String] = js.undefined
  var localHostname: js.UndefOr[String] = js.undefined
  var localPort: js.UndefOr[Double] = js.undefined
  var localUsername: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var privateKey: js.UndefOr[Buffer | String] = js.undefined
  var readyTimeout: js.UndefOr[Double] = js.undefined
  var sock: js.UndefOr[ReadableStream] = js.undefined
  var strictVendor: js.UndefOr[Boolean] = js.undefined
  var tryKeyboard: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    agent: String = null,
    agentForward: js.UndefOr[Boolean] = js.undefined,
    algorithms: Cipher = null,
    authHandler: (/* methodsLeft */ Null | js.Array[String], /* partialSuccess */ Null | Boolean, /* cb */ js.Function1[/* nextMethod */ String, Unit]) => String = null,
    compress: force | Boolean = null,
    debug: /* info */ String => Unit = null,
    dstHost: String = null,
    dstPort: js.UndefOr[Double] = js.undefined,
    forceIPv4: js.UndefOr[Boolean] = js.undefined,
    forceIPv6: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostHast: String = null,
    hostVerifier: (/* hashedKey */ String, /* repeated */ js.Function1[/* doContinue */ Boolean, Unit]) => Boolean = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    keepaliveCountMax: js.UndefOr[Double] = js.undefined,
    keepaliveInterval: js.UndefOr[Double] = js.undefined,
    localAddress: String = null,
    localHost: String = null,
    localHostname: String = null,
    localPort: js.UndefOr[Double] = js.undefined,
    localUsername: String = null,
    passphrase: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    privateKey: Buffer | String = null,
    readyTimeout: js.UndefOr[Double] = js.undefined,
    sock: ReadableStream = null,
    strictVendor: js.UndefOr[Boolean] = js.undefined,
    tryKeyboard: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(agentForward)) __obj.updateDynamic("agentForward")(agentForward.get.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (authHandler != null) __obj.updateDynamic("authHandler")(js.Any.fromFunction3(authHandler))
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (dstHost != null) __obj.updateDynamic("dstHost")(dstHost.asInstanceOf[js.Any])
    if (!js.isUndefined(dstPort)) __obj.updateDynamic("dstPort")(dstPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIPv4)) __obj.updateDynamic("forceIPv4")(forceIPv4.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIPv6)) __obj.updateDynamic("forceIPv6")(forceIPv6.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostHast != null) __obj.updateDynamic("hostHast")(hostHast.asInstanceOf[js.Any])
    if (hostVerifier != null) __obj.updateDynamic("hostVerifier")(js.Any.fromFunction2(hostVerifier))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepaliveCountMax)) __obj.updateDynamic("keepaliveCountMax")(keepaliveCountMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepaliveInterval)) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (localHost != null) __obj.updateDynamic("localHost")(localHost.asInstanceOf[js.Any])
    if (localHostname != null) __obj.updateDynamic("localHostname")(localHostname.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.get.asInstanceOf[js.Any])
    if (localUsername != null) __obj.updateDynamic("localUsername")(localUsername.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (privateKey != null) __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    if (!js.isUndefined(readyTimeout)) __obj.updateDynamic("readyTimeout")(readyTimeout.get.asInstanceOf[js.Any])
    if (sock != null) __obj.updateDynamic("sock")(sock.asInstanceOf[js.Any])
    if (!js.isUndefined(strictVendor)) __obj.updateDynamic("strictVendor")(strictVendor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tryKeyboard)) __obj.updateDynamic("tryKeyboard")(tryKeyboard.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

