package typings.vite.mod

import typings.vite.viteBooleans.`false`
import typings.vite.viteStrings.html
import typings.vite.viteStrings.ssr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions
  extends StObject
     with CommonServerOptions {
  
  /**
    * Prepend this folder to http requests, for use when proxying vite as a subfolder
    * Should start and end with the `/` character
    */
  var base: js.UndefOr[String] = js.undefined
  
  /**
    * Force dep pre-optimization regardless of whether deps have changed.
    *
    * @deprecated Use optimizeDeps.force instead, this option may be removed
    * in a future minor version without following semver
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options for files served via '/\@fs/'.
    */
  var fs: js.UndefOr[FileSystemServeOptions] = js.undefined
  
  /**
    * Configure HMR-specific options (port, host, path & protocol)
    */
  var hmr: js.UndefOr[HmrOptions | Boolean] = js.undefined
  
  /**
    * Create Vite dev server to be used as a middleware in an existing server
    * @default false
    */
  var middlewareMode: js.UndefOr[Boolean | html | ssr] = js.undefined
  
  /**
    * Origin for the generated asset URLs.
    *
    * @example `http://127.0.0.1:8080`
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * Pre-transform known direct imports
    * @default true
    */
  var preTransformRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to ignore-list source files in the dev server sourcemap, used to populate
    * the [`x_google_ignoreList` source map extension](https://developer.chrome.com/blog/devtools-better-angular-debugging/#the-x_google_ignorelist-source-map-extension).
    *
    * By default, it excludes all paths containing `node_modules`. You can pass `false` to
    * disable this behavior, or, for full control, a function that takes the source path and
    * sourcemap path and returns whether to ignore the source path.
    */
  var sourcemapIgnoreList: js.UndefOr[
    `false` | (js.Function2[/* sourcePath */ String, /* sourcemapPath */ String, Boolean])
  ] = js.undefined
  
  /**
    * chokidar watch options
    * https://github.com/paulmillr/chokidar#api
    */
  var watch: js.UndefOr[WatchOptions] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setFs(value: FileSystemServeOptions): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setHmr(value: HmrOptions | Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
    
    inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
    
    inline def setMiddlewareMode(value: Boolean | html | ssr): Self = StObject.set(x, "middlewareMode", value.asInstanceOf[js.Any])
    
    inline def setMiddlewareModeUndefined: Self = StObject.set(x, "middlewareMode", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPreTransformRequests(value: Boolean): Self = StObject.set(x, "preTransformRequests", value.asInstanceOf[js.Any])
    
    inline def setPreTransformRequestsUndefined: Self = StObject.set(x, "preTransformRequests", js.undefined)
    
    inline def setSourcemapIgnoreList(value: `false` | (js.Function2[/* sourcePath */ String, /* sourcemapPath */ String, Boolean])): Self = StObject.set(x, "sourcemapIgnoreList", value.asInstanceOf[js.Any])
    
    inline def setSourcemapIgnoreListFunction2(value: (/* sourcePath */ String, /* sourcemapPath */ String) => Boolean): Self = StObject.set(x, "sourcemapIgnoreList", js.Any.fromFunction2(value))
    
    inline def setSourcemapIgnoreListUndefined: Self = StObject.set(x, "sourcemapIgnoreList", js.undefined)
    
    inline def setWatch(value: WatchOptions): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
