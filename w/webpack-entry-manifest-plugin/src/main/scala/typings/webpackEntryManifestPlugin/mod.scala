package typings.webpackEntryManifestPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin for generating an asset manifest with grouped entry chunks
    */
  @JSImport("webpack-entry-manifest-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WebpackEntryManifestPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var name: typings.webpackEntryManifestPlugin.webpackEntryManifestPluginStrings.WebpackEntryManifestPlugin = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Assets manifest filename
      * @default 'manifest.json'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * Assets path filter function
      * @default () => true
      */
    var filter: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, Boolean]] = js.undefined
    
    /**
      * Assets path map function
      * @default path => path
      */
    var map: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, String]] = js.undefined
    
    /**
      * Assets manifest serialize function
      * @default manifest => JSON.stringify(manifest)
      */
    var serialize: js.UndefOr[js.Function1[/* manifest */ Any, String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilter(value: (/* path */ String, /* chunk */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMap(value: (/* path */ String, /* chunk */ String) => String): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setSerialize(value: /* manifest */ Any => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  /**
    * Webpack plugin for generating an asset manifest with grouped entry chunks
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait WebpackEntryManifestPlugin extends StObject {
    
    var name: typings.webpackEntryManifestPlugin.webpackEntryManifestPluginStrings.WebpackEntryManifestPlugin
  }
  object WebpackEntryManifestPlugin {
    
    inline def apply(): WebpackEntryManifestPlugin = {
      val __obj = js.Dynamic.literal(name = "WebpackEntryManifestPlugin")
      __obj.asInstanceOf[WebpackEntryManifestPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackEntryManifestPlugin] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.webpackEntryManifestPlugin.webpackEntryManifestPluginStrings.WebpackEntryManifestPlugin
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
