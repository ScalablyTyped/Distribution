package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackInjectManifestPartial extends StObject {
  
  /**
    * When `true` (the default), the `swSrc` file will be compiled by webpack.
    * When `false`, compilation will not occur (and `webpackCompilationPlugins`
    * can't be used.) Set to `false` if you want to inject the manifest into,
    * e.g., a JSON file.
    * @default true
    */
  var compileSrc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The asset name of the service worker file that will be created by this
    * plugin. If omitted, the name will be based on the `swSrc` name.
    */
  var swDest: js.UndefOr[String] = js.undefined
  
  /**
    * Optional `webpack` plugins that will be used when compiling the `swSrc`
    * input file. Only valid if `compileSrc` is `true`.
    */
  var webpackCompilationPlugins: js.UndefOr[js.Array[Any]] = js.undefined
}
object WebpackInjectManifestPartial {
  
  inline def apply(): WebpackInjectManifestPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackInjectManifestPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpackInjectManifestPartial] (val x: Self) extends AnyVal {
    
    inline def setCompileSrc(value: Boolean): Self = StObject.set(x, "compileSrc", value.asInstanceOf[js.Any])
    
    inline def setCompileSrcUndefined: Self = StObject.set(x, "compileSrc", js.undefined)
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
    
    inline def setSwDestUndefined: Self = StObject.set(x, "swDest", js.undefined)
    
    inline def setWebpackCompilationPlugins(value: js.Array[Any]): Self = StObject.set(x, "webpackCompilationPlugins", value.asInstanceOf[js.Any])
    
    inline def setWebpackCompilationPluginsUndefined: Self = StObject.set(x, "webpackCompilationPlugins", js.undefined)
    
    inline def setWebpackCompilationPluginsVarargs(value: Any*): Self = StObject.set(x, "webpackCompilationPlugins", js.Array(value*))
  }
}
