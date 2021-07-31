package typings.webpackHotClient

import typings.node.netMod.Server
import typings.webpackHotClient.mod.WebpackHotHost
import typings.webpackHotClient.webpackHotClientStrings.debug
import typings.webpackHotClient.webpackHotClientStrings.error
import typings.webpackHotClient.webpackHotClientStrings.info
import typings.webpackHotClient.webpackHotClientStrings.silent
import typings.webpackHotClient.webpackHotClientStrings.trace
import typings.webpackHotClient.webpackHotClientStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
  trait ReadonlyOptions extends StObject {
    
    val allEntries: js.UndefOr[Boolean] = js.undefined
    
    val autoConfigure: js.UndefOr[Boolean] = js.undefined
    
    val hmr: js.UndefOr[Boolean] = js.undefined
    
    val host: js.UndefOr[WebpackHotHost | String] = js.undefined
    
    val https: js.UndefOr[Boolean] = js.undefined
    
    val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
    
    val logTime: js.UndefOr[Boolean] = js.undefined
    
    val port: js.UndefOr[Double] = js.undefined
    
    val reload: js.UndefOr[Boolean] = js.undefined
    
    val server: js.UndefOr[Server] = js.undefined
    
    val stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ] = js.undefined
    
    val validTargets: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReadonlyOptions {
    
    @scala.inline
    def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsMutableBuilder[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllEntries(value: Boolean): Self = StObject.set(x, "allEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllEntriesUndefined: Self = StObject.set(x, "allEntries", js.undefined)
      
      @scala.inline
      def setAutoConfigure(value: Boolean): Self = StObject.set(x, "autoConfigure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConfigureUndefined: Self = StObject.set(x, "autoConfigure", js.undefined)
      
      @scala.inline
      def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      @scala.inline
      def setHost(value: WebpackHotHost | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setLogLevel(value: trace | debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setValidTargets(value: js.Array[String]): Self = StObject.set(x, "validTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidTargetsUndefined: Self = StObject.set(x, "validTargets", js.undefined)
      
      @scala.inline
      def setValidTargetsVarargs(value: String*): Self = StObject.set(x, "validTargets", js.Array(value :_*))
    }
  }
}
