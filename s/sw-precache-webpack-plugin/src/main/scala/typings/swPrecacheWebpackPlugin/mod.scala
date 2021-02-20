package typings.swPrecacheWebpackPlugin

import typings.std.Plugin
import typings.std.RegExp
import typings.swPrecacheWebpackPlugin.anon.ChunkName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sw-precache-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends _Options {
    
    var filename: js.UndefOr[String] = js.native
    
    var filepath: js.UndefOr[String] = js.native
    
    // override sw-precache options
    @JSName("importScripts")
    var importScripts_Options: js.UndefOr[js.Array[String | ChunkName]] = js.native
    
    var mergeStaticsConfig: js.UndefOr[Boolean] = js.native
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var staticFileGlobsIgnorePatterns: js.UndefOr[js.Array[RegExp]] = js.native
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
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      @scala.inline
      def setImportScripts(value: js.Array[String | ChunkName]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
      
      @scala.inline
      def setImportScriptsVarargs(value: (String | ChunkName)*): Self = StObject.set(x, "importScripts", js.Array(value :_*))
      
      @scala.inline
      def setMergeStaticsConfig(value: Boolean): Self = StObject.set(x, "mergeStaticsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeStaticsConfigUndefined: Self = StObject.set(x, "mergeStaticsConfig", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setStaticFileGlobsIgnorePatterns(value: js.Array[RegExp]): Self = StObject.set(x, "staticFileGlobsIgnorePatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticFileGlobsIgnorePatternsUndefined: Self = StObject.set(x, "staticFileGlobsIgnorePatterns", js.undefined)
      
      @scala.inline
      def setStaticFileGlobsIgnorePatternsVarargs(value: RegExp*): Self = StObject.set(x, "staticFileGlobsIgnorePatterns", js.Array(value :_*))
    }
  }
  
  type SWPrecacheWebpackPlugin = Plugin
  
  // workaround to override parent types
  @js.native
  trait _Options
    extends typings.swPrecache.mod.Options {
    
    @JSName("importScripts")
    var importScripts__Options: js.UndefOr[js.Any] = js.native
  }
  object _Options {
    
    @scala.inline
    def apply(): _Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Options]
    }
    
    @scala.inline
    implicit class _OptionsMutableBuilder[Self <: _Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImportScripts(value: js.Any): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
    }
  }
}
