package typings.webpackHotClient.anon

import typings.node.netMod.Server
import typings.webpackHotClient.mod.WebpackHotHost
import typings.webpackHotClient.webpackHotClientStrings.debug
import typings.webpackHotClient.webpackHotClientStrings.error
import typings.webpackHotClient.webpackHotClientStrings.info
import typings.webpackHotClient.webpackHotClientStrings.silent
import typings.webpackHotClient.webpackHotClientStrings.trace
import typings.webpackHotClient.webpackHotClientStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
@js.native
trait ReadonlyOptions extends js.Object {
  
  val allEntries: js.UndefOr[Boolean] = js.native
  
  val autoConfigure: js.UndefOr[Boolean] = js.native
  
  val hmr: js.UndefOr[Boolean] = js.native
  
  val host: js.UndefOr[WebpackHotHost | String] = js.native
  
  val https: js.UndefOr[Boolean] = js.native
  
  val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.native
  
  val logTime: js.UndefOr[Boolean] = js.native
  
  val port: js.UndefOr[Double] = js.native
  
  val reload: js.UndefOr[Boolean] = js.native
  
  val server: js.UndefOr[Server] = js.native
  
  val stats: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
  ] = js.native
  
  val validTargets: js.UndefOr[js.Array[String]] = js.native
}
object ReadonlyOptions {
  
  @scala.inline
  def apply(): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyOptions]
  }
  
  @scala.inline
  implicit class ReadonlyOptionsOps[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
    
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
    def setAllEntries(value: Boolean): Self = this.set("allEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllEntries: Self = this.set("allEntries", js.undefined)
    
    @scala.inline
    def setAutoConfigure(value: Boolean): Self = this.set("autoConfigure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConfigure: Self = this.set("autoConfigure", js.undefined)
    
    @scala.inline
    def setHmr(value: Boolean): Self = this.set("hmr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmr: Self = this.set("hmr", js.undefined)
    
    @scala.inline
    def setHost(value: WebpackHotHost | String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setLogLevel(value: trace | debug | info | warn | error | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogTime(value: Boolean): Self = this.set("logTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTime: Self = this.set("logTime", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setStats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setValidTargetsVarargs(value: String*): Self = this.set("validTargets", js.Array(value :_*))
    
    @scala.inline
    def setValidTargets(value: js.Array[String]): Self = this.set("validTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidTargets: Self = this.set("validTargets", js.undefined)
  }
}
