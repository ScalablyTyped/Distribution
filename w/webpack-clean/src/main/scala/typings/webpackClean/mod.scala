package typings.webpackClean

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A webpack plugin to clean specified files after build
    */
  @JSImport("webpack-clean", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Plugin {
    /**
      * @param files  array of files or string for a single file relative to the basePath
      * or to the context of your config (if the basePath param is not specified)
      */
    def this(files: String) = this()
    def this(files: js.Array[String]) = this()
    def this(files: String, options: Options) = this()
    def this(files: js.Array[String], options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * directory to be resolved to
      * @default null;
      */
    var basePath: js.UndefOr[String | Null] = js.undefined
    
    /**
      * specify if the files should be force deleted in case of compile errors.
      * If forceDelete is not enabled, the compile errors will be logged to stdout but the deletion of the files will not take place
      * @default false
      */
    var forceDelete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * specify if the .map files should be automatically removed
      * @default false
      */
    var removeMaps: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathNull: Self = StObject.set(x, "basePath", null)
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
      
      inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
      
      inline def setRemoveMaps(value: Boolean): Self = StObject.set(x, "removeMaps", value.asInstanceOf[js.Any])
      
      inline def setRemoveMapsUndefined: Self = StObject.set(x, "removeMaps", js.undefined)
    }
  }
  
  /**
    * A webpack plugin to clean specified files after build
    */
  type WebpackCleanPlugin = Plugin
}
