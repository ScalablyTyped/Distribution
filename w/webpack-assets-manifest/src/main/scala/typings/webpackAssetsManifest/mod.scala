package typings.webpackAssetsManifest

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.Plugin
import typings.std.PropertyKey
import typings.std.ProxyHandler
import typings.std.RegExp
import typings.webpackAssetsManifest.anon.AfterOptions
import typings.webpackAssetsManifest.webpackAssetsManifestBooleans.`false`
import typings.webpackAssetsManifest.webpackAssetsManifestStrings.customize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-assets-manifest", JSImport.Namespace)
  @js.native
  class ^ () extends WebpackAssetsManifest {
    def this(options: Options) = this()
  }
  
  @js.native
  trait AnyObject
    extends Object
       with /* index */ StringDictionary[js.Any]
  object AnyObject {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): AnyObject = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[AnyObject]
    }
  }
  
  @js.native
  trait Entry extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(key: String, value: String): Entry = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** https://github.com/webdeveric/webpack-assets-manifest#apply */
    @JSName("apply")
    var apply: js.UndefOr[(js.Function1[/* manifest */ WebpackAssetsManifest, Unit]) | Null] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#assets */
    var assets: js.UndefOr[js.Object] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#customize */
    var customize: js.UndefOr[
        (js.Function4[
          /* entry */ Entry, 
          /* original */ AnyObject, 
          /* manifest */ WebpackAssetsManifest, 
          /* asset */ AnyObject, 
          Entry | `false`
        ]) | Null
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#done */
    var done: js.UndefOr[
        (js.Function2[/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject, Unit]) | Null
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#entrypoints */
    var entrypoints: js.UndefOr[Boolean] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#entrypointskey */
    var entrypointsKey: js.UndefOr[String | `false`] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#fileextregex */
    var fileExtRegex: js.UndefOr[RegExp | Null | `false`] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integrity */
    var integrity: js.UndefOr[Boolean] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integrityhashes */
    var integrityHashes: js.UndefOr[js.Array[String]] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#integritypropertyname */
    var integrityPropertyName: js.UndefOr[String] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#merge */
    var merge: js.UndefOr[Boolean | customize] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#output */
    var output: js.UndefOr[String] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#publicpath */
    var publicPath: js.UndefOr[
        String | Boolean | Null | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#replacer */
    var replacer: js.UndefOr[
        Null | js.Array[String] | (js.Function2[
          /* key */ String, 
          /* value */ String, 
          js.UndefOr[Double | String | Boolean | Null | js.Object]
        ])
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#sortmanifest */
    var sortManifest: js.UndefOr[
        Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#space */
    var space: js.UndefOr[Double] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#transform */
    var transform: js.UndefOr[
        (js.Function2[/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest, _]) | Null
      ] = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#writetodisk */
    var writeToDisk: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: /* manifest */ WebpackAssetsManifest => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyNull: Self = StObject.set(x, "apply", null)
      
      @scala.inline
      def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      @scala.inline
      def setAssets(value: js.Object): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      @scala.inline
      def setCustomize(
        value: (/* entry */ Entry, /* original */ AnyObject, /* manifest */ WebpackAssetsManifest, /* asset */ AnyObject) => Entry | `false`
      ): Self = StObject.set(x, "customize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCustomizeNull: Self = StObject.set(x, "customize", null)
      
      @scala.inline
      def setCustomizeUndefined: Self = StObject.set(x, "customize", js.undefined)
      
      @scala.inline
      def setDone(value: (/* manifest */ WebpackAssetsManifest, /* stats */ AnyObject) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoneNull: Self = StObject.set(x, "done", null)
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntrypointsKey(value: String | `false`): Self = StObject.set(x, "entrypointsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntrypointsKeyUndefined: Self = StObject.set(x, "entrypointsKey", js.undefined)
      
      @scala.inline
      def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      @scala.inline
      def setFileExtRegex(value: RegExp | `false`): Self = StObject.set(x, "fileExtRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileExtRegexNull: Self = StObject.set(x, "fileExtRegex", null)
      
      @scala.inline
      def setFileExtRegexUndefined: Self = StObject.set(x, "fileExtRegex", js.undefined)
      
      @scala.inline
      def setIntegrity(value: Boolean): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityHashes(value: js.Array[String]): Self = StObject.set(x, "integrityHashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityHashesUndefined: Self = StObject.set(x, "integrityHashes", js.undefined)
      
      @scala.inline
      def setIntegrityHashesVarargs(value: String*): Self = StObject.set(x, "integrityHashes", js.Array(value :_*))
      
      @scala.inline
      def setIntegrityPropertyName(value: String): Self = StObject.set(x, "integrityPropertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityPropertyNameUndefined: Self = StObject.set(x, "integrityPropertyName", js.undefined)
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setMerge(value: Boolean | customize): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPublicPath(
        value: String | Boolean | (js.Function2[/* filename */ String, /* manifest */ WebpackAssetsManifest, String])
      ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathFunction2(value: (/* filename */ String, /* manifest */ WebpackAssetsManifest) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPublicPathNull: Self = StObject.set(x, "publicPath", null)
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setReplacer(
        value: js.Array[String] | (js.Function2[
              /* key */ String, 
              /* value */ String, 
              js.UndefOr[Double | String | Boolean | Null | js.Object]
            ])
      ): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerFunction2(
        value: (/* key */ String, /* value */ String) => js.UndefOr[Double | String | Boolean | Null | js.Object]
      ): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerNull: Self = StObject.set(x, "replacer", null)
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setReplacerVarargs(value: String*): Self = StObject.set(x, "replacer", js.Array(value :_*))
      
      @scala.inline
      def setSortManifest(
        value: Boolean | (js.ThisFunction2[/* this */ WebpackAssetsManifest, /* a */ String, /* b */ String, Double])
      ): Self = StObject.set(x, "sortManifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortManifestUndefined: Self = StObject.set(x, "sortManifest", js.undefined)
      
      @scala.inline
      def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setTransform(value: (/* assets */ AnyObject, /* manifest */ WebpackAssetsManifest) => _): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformNull: Self = StObject.set(x, "transform", null)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  @js.native
  trait WebpackAssetsManifest extends Plugin {
    
    /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
    var defaultOptions: Options = js.native
    
    /** Delete an item from the manifest */
    def delete(key: String): Boolean = js.native
    
    /** Replace backslash with forward slash */
    def fixKey(key: String): String = js.native
    
    /** Get an item from the manifest */
    def get(key: String): js.Any = js.native
    def get(key: String, defaultValue: String): js.Any = js.native
    
    /** Get the file extension */
    def getExtension(filename: String): String = js.native
    
    /** Get the file system path to the manifest */
    def getOutputPath(): String = js.native
    
    /**
      * Get a [Proxy](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Proxy/handler) for the manifest
      *
      * @param raw - Use `setRaw` instead of `set`
      */
    def getProxy(): ProxyHandler[WebpackAssetsManifest] = js.native
    def getProxy(raw: Boolean): ProxyHandler[WebpackAssetsManifest] = js.native
    
    /** Get the public path for the filename */
    def getPublicPath(filename: String): String = js.native
    
    /** Determine if an item exist in the manifest */
    def has(key: String): Boolean = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#hooks */
    var hooks: AfterOptions = js.native
    
    /** Determine if the filename matches the HMR filename pattern */
    def isHMR(filename: String): Boolean = js.native
    
    /** Determine if the manifest data is currently being merged */
    var isMerging: Boolean = js.native
    
    /** https://github.com/webdeveric/webpack-assets-manifest#options-read-the-schema */
    var options: Options = js.native
    
    /** Add an item to the manifest */
    def set(key: String, value: String): this.type = js.native
    
    /** Add item to assets without modifying the key or value */
    def setRaw(key: String, value: String): this.type = js.native
  }
}
