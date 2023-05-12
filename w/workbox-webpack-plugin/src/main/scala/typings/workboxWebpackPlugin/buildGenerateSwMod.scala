package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.workboxBuild.buildTypesMod.ManifestEntry
import typings.workboxBuild.buildTypesMod.WebpackGenerateSWOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGenerateSwMod {
  
  /**
    * This class supports creating a new, ready-to-use service worker file as
    * part of the webpack compilation process.
    *
    * Use an instance of `GenerateSW` in the
    * [`plugins` array](https://webpack.js.org/concepts/plugins/#usage) of a
    * webpack config.
    *
    * ```
    * // The following lists some common options; see the rest of the documentation
    * // for the full set of options and defaults.
    * new GenerateSW({
    *   exclude: [/.../, '...'],
    *   maximumFileSizeToCacheInBytes: ...,
    *   navigateFallback: '...',
    *   runtimeCaching: [{
    *     // Routing via a matchCallback function:
    *     urlPattern: ({request, url}) => ...,
    *     handler: '...',
    *     options: {
    *       cacheName: '...',
    *       expiration: {
    *         maxEntries: ...,
    *       },
    *     },
    *   }, {
    *     // Routing via a RegExp:
    *     urlPattern: new RegExp('...'),
    *     handler: '...',
    *     options: {
    *       cacheName: '...',
    *       plugins: [..., ...],
    *     },
    *   }],
    *   skipWaiting: ...,
    * });
    * ```
    *
    * @memberof module:workbox-webpack-plugin
    */
  @JSImport("workbox-webpack-plugin/build/generate-sw", "GenerateSW")
  @js.native
  /**
    * Creates an instance of GenerateSW.
    */
  open class GenerateSW () extends StObject {
    def this(config: GenerateSWConfig) = this()
    
    /**
      * @param {Object} compilation The webpack compilation.
      *
      * @private
      */
    def addAssets(compilation: Compilation): js.Promise[Unit] = js.native
    
    /* private */ var alreadyCalled: Any = js.native
    
    /**
      * @param {Object} [compiler] default compiler object passed from webpack
      *
      * @private
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* protected */ var config: GenerateSWConfig = js.native
    
    /**
      * @param {Object} [compiler] default compiler object passed from webpack
      *
      * @private
      */
    def propagateWebpackConfig(compiler: Compiler): Unit = js.native
  }
  
  trait GenerateSWConfig
    extends StObject
       with WebpackGenerateSWOptions {
    
    var manifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.undefined
  }
  object GenerateSWConfig {
    
    inline def apply(): GenerateSWConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateSWConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateSWConfig] (val x: Self) extends AnyVal {
      
      inline def setManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifestEntries", value.asInstanceOf[js.Any])
      
      inline def setManifestEntriesUndefined: Self = StObject.set(x, "manifestEntries", js.undefined)
      
      inline def setManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifestEntries", js.Array(value*))
    }
  }
}
