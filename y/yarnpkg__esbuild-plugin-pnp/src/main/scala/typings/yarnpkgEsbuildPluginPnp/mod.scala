package typings.yarnpkgEsbuildPluginPnp

import typings.esbuild.mod.OnLoadArgs
import typings.esbuild.mod.OnLoadResult
import typings.esbuild.mod.OnResolveArgs
import typings.esbuild.mod.OnResolveResult
import typings.esbuild.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@yarnpkg/esbuild-plugin-pnp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pnpPlugin(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pnpPlugin")().asInstanceOf[Plugin]
  inline def pnpPlugin(param0: PluginOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("pnpPlugin")(param0.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait OnResolveParams extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var resolvedPath: String | Null
    
    var watchFiles: js.Array[String]
  }
  object OnResolveParams {
    
    inline def apply(watchFiles: js.Array[String]): OnResolveParams = {
      val __obj = js.Dynamic.literal(watchFiles = watchFiles.asInstanceOf[js.Any], resolvedPath = null)
      __obj.asInstanceOf[OnResolveParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnResolveParams] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResolvedPath(value: String): Self = StObject.set(x, "resolvedPath", value.asInstanceOf[js.Any])
      
      inline def setResolvedPathNull: Self = StObject.set(x, "resolvedPath", null)
      
      inline def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
      
      inline def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value*))
    }
  }
  
  trait PluginOptions extends StObject {
    
    var baseDir: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[js.RegExp] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* args */ OnLoadArgs, js.Promise[OnLoadResult]]] = js.undefined
    
    var onResolve: js.UndefOr[
        js.Function2[
          /* args */ OnResolveArgs, 
          /* params */ OnResolveParams, 
          js.Promise[OnResolveResult | Null]
        ]
      ] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnLoad(value: /* args */ OnLoadArgs => js.Promise[OnLoadResult]): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnResolve(
        value: (/* args */ OnResolveArgs, /* params */ OnResolveParams) => js.Promise[OnResolveResult | Null]
      ): Self = StObject.set(x, "onResolve", js.Any.fromFunction2(value))
      
      inline def setOnResolveUndefined: Self = StObject.set(x, "onResolve", js.undefined)
    }
  }
}
