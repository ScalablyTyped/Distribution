package typings.surmaRollupPluginOffMainThread

import typings.rollup.mod.Plugin
import typings.rollup.mod.RenderedChunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Use Rollup with workers and ES6 modules _today_.
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(opts: OffMainThreadOptions): Plugin = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("@surma/rollup-plugin-off-main-thread", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OffMainThreadOptions extends StObject {
    
    /**
      * Function name to use instead of AMD’s `define`.
      * @default 'define'
      */
    var amdFunctionName: js.UndefOr[String] = js.undefined
    
    /**
      * A string containing the EJS template for the amd loader.
      * If `undefined`, OMT will use `loader.ejs`.
      */
    var loader: js.UndefOr[String] = js.undefined
    
    /**
      * A function that determines whether the loader code should be prepended to a
      * certain chunk. Should return true if the load is supposed to be prepended.
      */
    var prependLoader: js.UndefOr[
        js.Function2[/* chunk */ RenderedChunk, /* workerFiles */ js.Array[String], Boolean]
      ] = js.undefined
    
    /**
      * Silence the warning about ESM being badly supported in workers.
      * @default false
      */
    var silenceESMWorkerWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The scheme used when importing workers as a URL.
      * @default 'omt'
      */
    var urlLoaderScheme: js.UndefOr[String] = js.undefined
    
    /**
      * Use `fetch()` + `eval()` to load dependencies instead of `<script>` tags
      * and `importScripts()`. _This is not CSP compliant, but is required if you
      * want to use dynamic imports in ServiceWorker_.
      * @default false
      */
    var useEval: js.UndefOr[Boolean] = js.undefined
  }
  object OffMainThreadOptions {
    
    inline def apply(): OffMainThreadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffMainThreadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OffMainThreadOptions] (val x: Self) extends AnyVal {
      
      inline def setAmdFunctionName(value: String): Self = StObject.set(x, "amdFunctionName", value.asInstanceOf[js.Any])
      
      inline def setAmdFunctionNameUndefined: Self = StObject.set(x, "amdFunctionName", js.undefined)
      
      inline def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setPrependLoader(value: (/* chunk */ RenderedChunk, /* workerFiles */ js.Array[String]) => Boolean): Self = StObject.set(x, "prependLoader", js.Any.fromFunction2(value))
      
      inline def setPrependLoaderUndefined: Self = StObject.set(x, "prependLoader", js.undefined)
      
      inline def setSilenceESMWorkerWarning(value: Boolean): Self = StObject.set(x, "silenceESMWorkerWarning", value.asInstanceOf[js.Any])
      
      inline def setSilenceESMWorkerWarningUndefined: Self = StObject.set(x, "silenceESMWorkerWarning", js.undefined)
      
      inline def setUrlLoaderScheme(value: String): Self = StObject.set(x, "urlLoaderScheme", value.asInstanceOf[js.Any])
      
      inline def setUrlLoaderSchemeUndefined: Self = StObject.set(x, "urlLoaderScheme", js.undefined)
      
      inline def setUseEval(value: Boolean): Self = StObject.set(x, "useEval", value.asInstanceOf[js.Any])
      
      inline def setUseEvalUndefined: Self = StObject.set(x, "useEval", js.undefined)
    }
  }
}
