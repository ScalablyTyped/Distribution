package typings.webpackAssetsManifest

import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.webpack.mod.Asset
import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.webpack.mod.LoaderContext
import typings.webpack.mod.Module
import typings.webpack.mod.Stats
import typings.webpack.mod.WebpackPluginInstance
import typings.webpackAssetsManifest.anon.AfterOptions
import typings.webpackAssetsManifest.webpackAssetsManifestBooleans.`false`
import typings.webpackAssetsManifest.webpackAssetsManifestStrings.auto
import typings.webpackAssetsManifest.webpackAssetsManifestStrings.customize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-assets-manifest", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WebpackAssetsManifest {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  type Assets = Record[String, Any]
  
  trait Entry extends StObject {
    
    var key: String
    
    var value: String
  }
  object Entry {
    
    inline def apply(key: String, value: String): Entry = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** https://github.com/webdeveric/webpack-assets-manifest#apply */
    @JSName("apply")
    var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, Unit]) | Null] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#assets */
    var assets: js.UndefOr[Assets] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#contextrelativekeys */
    var contextRelativeKeys: js.UndefOr[Boolean] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#customize */
    var customize: js.UndefOr[
        (js.Function4[
          /* entry */ Entry, 
          /* original */ Entry, 
          /* manifest */ WebpackAssetsManifest, 
          /* asset */ Asset | Null, 
          Entry | `false`
        ]) | Null
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#done */
    var done: js.UndefOr[
        (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ Stats, Unit]) | Null
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#enabled */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
    var entrypoints: js.UndefOr[Boolean] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
    var entrypointsKey: js.UndefOr[String | `false`] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#entrypointsuseassets */
    var entrypointsUseAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A place to put your arbitrary data
      * @default {}
      */
    var extra: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
    var fileExtRegex: js.UndefOr[js.RegExp | Null | `false`] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
    var integrity: js.UndefOr[Boolean] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
    var integrityHashes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
    var integrityPropertyName: js.UndefOr[String] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#merge */
    var merge: js.UndefOr[Boolean | customize] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#output */
    var output: js.UndefOr[String] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
    var publicPath: js.UndefOr[
        String | Boolean | Null | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
    var replacer: js.UndefOr[
        (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[String | Double]) | Null
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
    var sortManifest: js.UndefOr[
        Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#space */
    var space: js.UndefOr[Double | String] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#transform */
    var transform: js.UndefOr[
        (js.Function2[/* assets */ Assets, /* manifest */ WebpackAssetsManifest, Any]) | Null
      ] = js.undefined
    
    /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
    var writeToDisk: js.UndefOr[Boolean | auto] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApply(value: /* manifest */ WebpackAssetsManifest => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyNull: Self = StObject.set(x, "apply", null)
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setAssets(value: Assets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setContextRelativeKeys(value: Boolean): Self = StObject.set(x, "contextRelativeKeys", value.asInstanceOf[js.Any])
      
      inline def setContextRelativeKeysUndefined: Self = StObject.set(x, "contextRelativeKeys", js.undefined)
      
      inline def setCustomize(
        value: (/* entry */ Entry, /* original */ Entry, /* manifest */ WebpackAssetsManifest, /* asset */ Asset | Null) => Entry | `false`
      ): Self = StObject.set(x, "customize", js.Any.fromFunction4(value))
      
      inline def setCustomizeNull: Self = StObject.set(x, "customize", null)
      
      inline def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
      
      inline def setDone(value: (/* manifest */ WebpackAssetsManifest, /* stats */ Stats) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
      
      inline def setDoneNull: Self = StObject.set(x, "done", null)
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsKey(value: String | `false`): Self = StObject.set(x, "entrypointsKey", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsKeyUndefined: Self = StObject.set(x, "entrypointsKey", js.undefined)
      
      inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      inline def setEntrypointsUseAssets(value: Boolean): Self = StObject.set(x, "entrypointsUseAssets", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsUseAssetsUndefined: Self = StObject.set(x, "entrypointsUseAssets", js.undefined)
      
      inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFileExtRegex(value: js.RegExp | `false`): Self = StObject.set(x, "fileExtRegex", value.asInstanceOf[js.Any])
      
      inline def setFileExtRegexNull: Self = StObject.set(x, "fileExtRegex", null)
      
      inline def setFileExtRegexUndefined: Self = StObject.set(x, "fileExtRegex", js.undefined)
      
      inline def setIntegrity(value: Boolean): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityHashes(value: js.Array[String]): Self = StObject.set(x, "integrityHashes", value.asInstanceOf[js.Any])
      
      inline def setIntegrityHashesUndefined: Self = StObject.set(x, "integrityHashes", js.undefined)
      
      inline def setIntegrityHashesVarargs(value: String*): Self = StObject.set(x, "integrityHashes", js.Array(value*))
      
      inline def setIntegrityPropertyName(value: String): Self = StObject.set(x, "integrityPropertyName", value.asInstanceOf[js.Any])
      
      inline def setIntegrityPropertyNameUndefined: Self = StObject.set(x, "integrityPropertyName", js.undefined)
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setMerge(value: Boolean | customize): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPublicPath(
        value: String | Boolean | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
      ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathFunction2(value: (/* filename */ String, /* manifest */ WebpackAssetsManifest) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
      
      inline def setPublicPathNull: Self = StObject.set(x, "publicPath", null)
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setReplacer(
        value: (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | (js.Array[String | Double])
      ): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerNull: Self = StObject.set(x, "replacer", null)
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: (String | Double)*): Self = StObject.set(x, "replacer", js.Array(value*))
      
      inline def setSortManifest(
        value: Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
      ): Self = StObject.set(x, "sortManifest", value.asInstanceOf[js.Any])
      
      inline def setSortManifestUndefined: Self = StObject.set(x, "sortManifest", js.undefined)
      
      inline def setSpace(value: Double | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setTransform(value: (/* assets */ Assets, /* manifest */ WebpackAssetsManifest) => Any): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformNull: Self = StObject.set(x, "transform", null)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWriteToDisk(value: Boolean | auto): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      inline def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  @js.native
  trait WebpackAssetsManifest
    extends StObject
       with WebpackPluginInstance {
    
    /** original filename : hashed filename */
    var assetNames: Map[String, String] = js.native
    
    /** This is what gets JSON stringified */
    var assets: Assets = js.native
    
    def clear(): Unit = js.native
    
    /** The Webpack compiler instance */
    var compiler: Compiler | Null = js.native
    
    /** This is passed to the customize() hook */
    var currentAsset: Asset | Null = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
    def defaultOptions: Options = js.native
    
    /** Delete an item from the manifest */
    def delete(key: String): Boolean = js.native
    
    /** Emit the assets manifest */
    def emitAssetsManifest(compilation: Compilation): js.Promise[Unit] = js.native
    
    /** Replace backslash with forward slash */
    def fixKey(key: String): String = js.native
    
    /** Get an item from the manifest */
    def get(key: String): Any = js.native
    def get(key: String, defaultValue: Any): Any = js.native
    
    /** Get assets and hot module replacement files from a compilation object */
    def getCompilationAssets(compilation: Compilation): typings.webpackAssetsManifest.anon.Assets = js.native
    
    /** Get the file extension */
    def getExtension(filename: String): String = js.native
    
    /** Get the parsed output path. [hash] is supported. */
    def getManifestPath(compilation: Compilation, filename: String): String = js.native
    
    /** Get the file system path to the manifest */
    def getOutputPath(): String = js.native
    
    /**
      * Get a {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Proxy/handler|Proxy} for the manifest.
      * This allows you to use `[]` to manage entries.
      *
      * @param raw - Should the proxy use `setRaw` instead of `set`?
      */
    def getProxy(): Assets = js.native
    def getProxy(raw: Boolean): Assets = js.native
    
    /** Get the public path for the filename */
    def getPublicPath(filename: String): String = js.native
    
    /** Last chance to write the manifest to disk */
    def handleAfterEmit(compilation: Compilation): js.Promise[Unit] = js.native
    
    /** Hook into compilation objects */
    def handleCompilation(compilation: Compilation): Unit = js.native
    
    /** Record asset names */
    def handleNormalModuleLoader(compilation: Compilation, loaderContext: LoaderContext[Any], module: Module): Unit = js.native
    
    /** Record details of Asset Modules */
    def handleProcessAssetsAnalyse(compilation: Compilation): Unit = js.native
    
    /** Gather asset details */
    def handleProcessAssetsReport(compilation: Compilation): js.Promise[Unit] = js.native
    
    /** Hook into the compilation object */
    def handleThisCompilation(compilation: Compilation): Unit = js.native
    
    /** Cleanup before running Webpack */
    def handleWatchRun(): Unit = js.native
    
    /** Determine if an item exist in the manifest */
    def has(key: String): Boolean = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#hooks */
    var hooks: AfterOptions = js.native
    
    /**
      * Determine if webpack-dev-server is being used
      *
      * The WEBPACK_DEV_SERVER / WEBPACK_SERVE env vars cannot be relied upon.
      * See issue {@link https://github.com/webdeveric/webpack-assets-manifest/issues/125|#125}
      */
    def inDevServer(): Boolean = js.native
    
    /** Determine if the manifest data is currently being merged */
    def isMerging: Boolean = js.native
    
    /** Merge data if the output file already exists */
    def maybeMerge(): Unit = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
    var options: Options = js.native
    
    /** Process compilation assets */
    def processAssetsByChunkName(assets: Record[String, String | js.Array[String]]): /* import warning: importer.ImportType#apply Failed type conversion: this['assetNames'] */ js.Any = js.native
    def processAssetsByChunkName(assets: Record[String, String | js.Array[String]], hmrFiles: Set[String]): /* import warning: importer.ImportType#apply Failed type conversion: this['assetNames'] */ js.Any = js.native
    
    /**
      * When using webpack 5 persistent cache, loaderContext.emitFile sometimes doesn't
      * get called and so the asset names are not recorded. To work around this, lets
      * loops over the stats.assets and record the asset names.
      */
    def processStatsAssets(assets: js.Array[Asset]): Unit = js.native
    
    /** Add the SRI hash to the assetsInfo map */
    def recordSubresourceIntegrity(compilation: Compilation): Unit = js.native
    
    /** Add an item to the manifest */
    def set(key: String, value: Any): this.type = js.native
    
    /** Add item to assets without modifying the key or value */
    def setRaw(key: String, value: Any): this.type = js.native
    
    /** Determine if the manifest should be written to disk with fs */
    def shouldWriteToDisk(compilation: Compilation): Boolean = js.native
    
    /** Get the data for `JSON.stringify()` */
    def toJSON(): Any = js.native
    
    /** Write the asset manifest to the file system */
    def writeTo(destination: String): js.Promise[Unit] = js.native
  }
}
