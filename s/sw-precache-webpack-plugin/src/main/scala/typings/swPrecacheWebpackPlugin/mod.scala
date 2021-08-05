package typings.swPrecacheWebpackPlugin

import typings.std.Plugin
import typings.std.RegExp
import typings.swPrecacheWebpackPlugin.anon.ChunkName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sw-precache-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Options
    extends StObject
       with _Options {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var filepath: js.UndefOr[String] = js.undefined
    
    // override sw-precache options
    @JSName("importScripts")
    var importScripts_Options: js.UndefOr[js.Array[String | ChunkName]] = js.undefined
    
    var mergeStaticsConfig: js.UndefOr[Boolean] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var staticFileGlobsIgnorePatterns: js.UndefOr[js.Array[RegExp]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setImportScripts(value: js.Array[String | ChunkName]): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      inline def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
      
      inline def setImportScriptsVarargs(value: (String | ChunkName)*): Self = StObject.set(x, "importScripts", js.Array(value :_*))
      
      inline def setMergeStaticsConfig(value: Boolean): Self = StObject.set(x, "mergeStaticsConfig", value.asInstanceOf[js.Any])
      
      inline def setMergeStaticsConfigUndefined: Self = StObject.set(x, "mergeStaticsConfig", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setStaticFileGlobsIgnorePatterns(value: js.Array[RegExp]): Self = StObject.set(x, "staticFileGlobsIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setStaticFileGlobsIgnorePatternsUndefined: Self = StObject.set(x, "staticFileGlobsIgnorePatterns", js.undefined)
      
      inline def setStaticFileGlobsIgnorePatternsVarargs(value: RegExp*): Self = StObject.set(x, "staticFileGlobsIgnorePatterns", js.Array(value :_*))
    }
  }
  
  type SWPrecacheWebpackPlugin = Plugin
  
  // workaround to override parent types
  trait _Options
    extends StObject
       with typings.swPrecache.mod.Options {
    
    @JSName("importScripts")
    var importScripts__Options: js.UndefOr[js.Any] = js.undefined
  }
  object _Options {
    
    inline def apply(): _Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Options]
    }
    
    extension [Self <: _Options](x: Self) {
      
      inline def setImportScripts(value: js.Any): Self = StObject.set(x, "importScripts", value.asInstanceOf[js.Any])
      
      inline def setImportScriptsUndefined: Self = StObject.set(x, "importScripts", js.undefined)
    }
  }
}
