package typings.workboxWebpackPlugin

import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.workboxBuild.buildTypesMod.WebpackInjectManifestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInjectManifestMod {
  
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
  @JSImport("workbox-webpack-plugin/build/inject-manifest", "InjectManifest")
  @js.native
  open class InjectManifest protected () extends StObject {
    /**
      * Creates an instance of InjectManifest.
      */
    def this(config: WebpackInjectManifestOptions) = this()
    
    /**
      * @param {Object} compilation The webpack compilation.
      *
      * @private
      */
    def addAssets(compilation: Compilation): js.Promise[Unit] = js.native
    
    /**
      * @param {Object} compilation The webpack compilation.
      * @param {Object} parentCompiler The webpack parent compiler.
      *
      * @private
      */
    def addSrcToAssets(compilation: Compilation, parentCompiler: Compiler): Unit = js.native
    
    /* private */ var alreadyCalled: Any = js.native
    
    /**
      * @param {Object} [compiler] default compiler object passed from webpack
      *
      * @private
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* protected */ var config: WebpackInjectManifestOptions = js.native
    
    /**
      * @param {Object} compilation The webpack compilation.
      * @param {Object} parentCompiler The webpack parent compiler.
      *
      * @private
      */
    def handleMake(compilation: Compilation, parentCompiler: Compiler): js.Promise[Unit] = js.native
    
    /**
      * @param {Object} compilation The webpack compilation.
      * @param {Object} parentCompiler The webpack parent compiler.
      *
      * @private
      */
    def performChildCompilation(compilation: Compilation, parentCompiler: Compiler): js.Promise[Unit] = js.native
    
    /**
      * @param {Object} [compiler] default compiler object passed from webpack
      *
      * @private
      */
    def propagateWebpackConfig(compiler: Compiler): Unit = js.native
  }
}
