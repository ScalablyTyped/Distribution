package typings.webpackPluginServe.mod

import typings.connectHistoryApiFallback.mod.Options
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerOptions
import typings.webpackPluginServe.anon.Address
import typings.webpackPluginServe.anon.App
import typings.webpackPluginServe.anon.Level
import typings.webpackPluginServe.webpackPluginServeStrings.`refresh-on-failure`
import typings.webpackPluginServe.webpackPluginServeStrings.minimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackPluginServeOptions extends js.Object {
  
  var client: js.UndefOr[Address] = js.native
  
  var compress: js.UndefOr[Boolean] = js.native
  
  var historyFallback: js.UndefOr[Boolean | Options] = js.native
  
  var hmr: js.UndefOr[Boolean | `refresh-on-failure`] = js.native
  
  var host: js.UndefOr[String | js.Promise[String]] = js.native
  
  var http2: js.UndefOr[Boolean | ServerOptions | SecureServerOptions] = js.native
  
  var https: js.UndefOr[typings.node.httpsMod.ServerOptions] = js.native
  
  var liveReload: js.UndefOr[Boolean] = js.native
  
  var log: js.UndefOr[Level] = js.native
  
  var middleware: js.UndefOr[
    js.Function2[/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins, Unit]
  ] = js.native
  
  var open: js.UndefOr[Boolean | App] = js.native
  
  var port: js.UndefOr[Double | js.Promise[Double]] = js.native
  
  var progress: js.UndefOr[Boolean | minimal] = js.native
  
  var static: js.UndefOr[String | js.Array[String] | StaticObject] = js.native
  
  var status: js.UndefOr[Boolean] = js.native
  
  var waitForBuild: js.UndefOr[Boolean] = js.native
}
object WebpackPluginServeOptions {
  
  @scala.inline
  def apply(): WebpackPluginServeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackPluginServeOptions]
  }
  
  @scala.inline
  implicit class WebpackPluginServeOptionsOps[Self <: WebpackPluginServeOptions] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Address): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setHistoryFallback(value: Boolean | Options): Self = this.set("historyFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryFallback: Self = this.set("historyFallback", js.undefined)
    
    @scala.inline
    def setHmr(value: Boolean | `refresh-on-failure`): Self = this.set("hmr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmr: Self = this.set("hmr", js.undefined)
    
    @scala.inline
    def setHost(value: String | js.Promise[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttp2(value: Boolean | ServerOptions | SecureServerOptions): Self = this.set("http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    
    @scala.inline
    def setHttps(value: typings.node.httpsMod.ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setLiveReload(value: Boolean): Self = this.set("liveReload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveReload: Self = this.set("liveReload", js.undefined)
    
    @scala.inline
    def setLog(value: Level): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMiddleware(value: (/* app */ ^[DefaultState, DefaultContext], /* builtins */ Builtins) => Unit): Self = this.set("middleware", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean | App): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPort(value: Double | js.Promise[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProgress(value: Boolean | minimal): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStaticVarargs(value: String*): Self = this.set("static", js.Array(value :_*))
    
    @scala.inline
    def setStatic(value: String | js.Array[String] | StaticObject): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWaitForBuild(value: Boolean): Self = this.set("waitForBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForBuild: Self = this.set("waitForBuild", js.undefined)
  }
}
