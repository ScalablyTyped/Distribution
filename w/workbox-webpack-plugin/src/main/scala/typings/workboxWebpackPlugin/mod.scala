package typings.workboxWebpackPlugin

import org.scalablytyped.runtime.Instantiable1
import typings.workboxBuild.buildTypesMod.WebpackInjectManifestOptions
import typings.workboxWebpackPlugin.buildGenerateSwMod.GenerateSWConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("workbox-webpack-plugin", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("workbox-webpack-plugin", "default.GenerateSW")
    @js.native
    def GenerateSW: Instantiable1[
        /* config */ js.UndefOr[GenerateSWConfig], 
        typings.workboxWebpackPlugin.buildGenerateSwMod.GenerateSW
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("workbox-webpack-plugin", "default.GenerateSW")
    @js.native
    /**
      * Creates an instance of GenerateSW.
      */
    open class GenerateSWCls ()
      extends typings.workboxWebpackPlugin.buildGenerateSwMod.GenerateSW {
      def this(config: GenerateSWConfig) = this()
    }
    
    inline def GenerateSW_=(
      x: Instantiable1[
          /* config */ js.UndefOr[GenerateSWConfig], 
          typings.workboxWebpackPlugin.buildGenerateSwMod.GenerateSW
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenerateSW")(x.asInstanceOf[js.Any])
    
    @JSImport("workbox-webpack-plugin", "default.InjectManifest")
    @js.native
    def InjectManifest: Instantiable1[
        /* config */ WebpackInjectManifestOptions, 
        typings.workboxWebpackPlugin.buildInjectManifestMod.InjectManifest
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("workbox-webpack-plugin", "default.InjectManifest")
    @js.native
    open class InjectManifestCls protected ()
      extends typings.workboxWebpackPlugin.buildInjectManifestMod.InjectManifest {
      /**
        * Creates an instance of InjectManifest.
        */
      def this(config: WebpackInjectManifestOptions) = this()
    }
    
    inline def InjectManifest_=(
      x: Instantiable1[
          /* config */ WebpackInjectManifestOptions, 
          typings.workboxWebpackPlugin.buildInjectManifestMod.InjectManifest
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InjectManifest")(x.asInstanceOf[js.Any])
  }
  
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
  @JSImport("workbox-webpack-plugin", "GenerateSW")
  @js.native
  /**
    * Creates an instance of GenerateSW.
    */
  open class GenerateSW ()
    extends typings.workboxWebpackPlugin.buildGenerateSwMod.GenerateSW {
    def this(config: GenerateSWConfig) = this()
  }
  
  /**
    * This class supports compiling a service worker file provided via `swSrc`,
    * and injecting into that service worker a list of URLs and revision
    * information for precaching based on the webpack asset pipeline.
    *
    * Use an instance of `InjectManifest` in the
    * [`plugins` array](https://webpack.js.org/concepts/plugins/#usage) of a
    * webpack config.
    *
    * In addition to injecting the manifest, this plugin will perform a compilation
    * of the `swSrc` file, using the options from the main webpack configuration.
    *
    * ```
    * // The following lists some common options; see the rest of the documentation
    * // for the full set of options and defaults.
    * new InjectManifest({
    *   exclude: [/.../, '...'],
    *   maximumFileSizeToCacheInBytes: ...,
    *   swSrc: '...',
    * });
    * ```
    *
    * @memberof module:workbox-webpack-plugin
    */
  @JSImport("workbox-webpack-plugin", "InjectManifest")
  @js.native
  open class InjectManifest protected ()
    extends typings.workboxWebpackPlugin.buildInjectManifestMod.InjectManifest {
    /**
      * Creates an instance of InjectManifest.
      */
    def this(config: WebpackInjectManifestOptions) = this()
  }
}
