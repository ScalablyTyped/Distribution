package typings.tunnelSsh.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.tunnelSsh.anon.Cipher
import typings.tunnelSsh.tunnelSshStrings.force
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var agent: js.UndefOr[String] = js.native
  
  var agentForward: js.UndefOr[Boolean] = js.native
  
  var algorithms: js.UndefOr[Cipher] = js.native
  
  var authHandler: js.UndefOr[
    js.Function3[
      /* methodsLeft */ Null | js.Array[String], 
      /* partialSuccess */ Null | Boolean, 
      /* cb */ js.Function1[/* nextMethod */ String, Unit], 
      String
    ]
  ] = js.native
  
  var compress: js.UndefOr[force | Boolean] = js.native
  
  var debug: js.UndefOr[js.Function1[/* info */ String, Unit]] = js.native
  
  var dstHost: js.UndefOr[String] = js.native
  
  var dstPort: js.UndefOr[Double] = js.native
  
  var forceIPv4: js.UndefOr[Boolean] = js.native
  
  var forceIPv6: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hostHast: js.UndefOr[String] = js.native
  
  var hostVerifier: js.UndefOr[
    js.Function2[
      /* hashedKey */ String, 
      /* repeated */ js.Function1[/* doContinue */ Boolean, Unit], 
      Boolean
    ]
  ] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepaliveCountMax: js.UndefOr[Double] = js.native
  
  var keepaliveInterval: js.UndefOr[Double] = js.native
  
  var localAddress: js.UndefOr[String] = js.native
  
  var localHost: js.UndefOr[String] = js.native
  
  var localHostname: js.UndefOr[String] = js.native
  
  var localPort: js.UndefOr[Double] = js.native
  
  var localUsername: js.UndefOr[String] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var privateKey: js.UndefOr[Buffer | String] = js.native
  
  var readyTimeout: js.UndefOr[Double] = js.native
  
  var sock: js.UndefOr[ReadableStream] = js.native
  
  var strictVendor: js.UndefOr[Boolean] = js.native
  
  var tryKeyboard: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: String): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAgentForward(value: Boolean): Self = this.set("agentForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentForward: Self = this.set("agentForward", js.undefined)
    
    @scala.inline
    def setAlgorithms(value: Cipher): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setAuthHandler(
      value: (/* methodsLeft */ Null | js.Array[String], /* partialSuccess */ Null | Boolean, /* cb */ js.Function1[/* nextMethod */ String, Unit]) => String
    ): Self = this.set("authHandler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAuthHandler: Self = this.set("authHandler", js.undefined)
    
    @scala.inline
    def setCompress(value: force | Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setDebug(value: /* info */ String => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDstHost(value: String): Self = this.set("dstHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstHost: Self = this.set("dstHost", js.undefined)
    
    @scala.inline
    def setDstPort(value: Double): Self = this.set("dstPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDstPort: Self = this.set("dstPort", js.undefined)
    
    @scala.inline
    def setForceIPv4(value: Boolean): Self = this.set("forceIPv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIPv4: Self = this.set("forceIPv4", js.undefined)
    
    @scala.inline
    def setForceIPv6(value: Boolean): Self = this.set("forceIPv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIPv6: Self = this.set("forceIPv6", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostHast(value: String): Self = this.set("hostHast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostHast: Self = this.set("hostHast", js.undefined)
    
    @scala.inline
    def setHostVerifier(
      value: (/* hashedKey */ String, /* repeated */ js.Function1[/* doContinue */ Boolean, Unit]) => Boolean
    ): Self = this.set("hostVerifier", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHostVerifier: Self = this.set("hostVerifier", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepaliveCountMax(value: Double): Self = this.set("keepaliveCountMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepaliveCountMax: Self = this.set("keepaliveCountMax", js.undefined)
    
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = this.set("keepaliveInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepaliveInterval: Self = this.set("keepaliveInterval", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setLocalHost(value: String): Self = this.set("localHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalHost: Self = this.set("localHost", js.undefined)
    
    @scala.inline
    def setLocalHostname(value: String): Self = this.set("localHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalHostname: Self = this.set("localHostname", js.undefined)
    
    @scala.inline
    def setLocalPort(value: Double): Self = this.set("localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    
    @scala.inline
    def setLocalUsername(value: String): Self = this.set("localUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalUsername: Self = this.set("localUsername", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: Buffer | String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    
    @scala.inline
    def setReadyTimeout(value: Double): Self = this.set("readyTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyTimeout: Self = this.set("readyTimeout", js.undefined)
    
    @scala.inline
    def setSock(value: ReadableStream): Self = this.set("sock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSock: Self = this.set("sock", js.undefined)
    
    @scala.inline
    def setStrictVendor(value: Boolean): Self = this.set("strictVendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictVendor: Self = this.set("strictVendor", js.undefined)
    
    @scala.inline
    def setTryKeyboard(value: Boolean): Self = this.set("tryKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTryKeyboard: Self = this.set("tryKeyboard", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
