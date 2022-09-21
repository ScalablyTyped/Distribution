package typings.webpackEnv

import typings.webpackEnv.WebpackModuleApi.Hot
import typings.webpackEnv.WebpackModuleApi.RequireContext
import typings.webpackEnv.anon.ChunkName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportMeta extends StObject {
  
  /**
    * `import.meta.url` is the `file:` url of the current file (similar to `__filename` but as file url)
    */
  var url: String
  
  /**
    * `import.meta.webpack` is the webpack major version as number
    */
  var webpack: Double
  
  /**
    * `import.meta.webpackContext` as ESM alternative to `require.context`
    * Available: 5.70.0+
    */
  var webpackContext: js.UndefOr[
    js.Function2[/* request */ String, /* options */ js.UndefOr[ChunkName], RequireContext]
  ] = js.undefined
  
  /**
    * `import.meta.webpackHot` is an alias for` module.hot` which is also available in strict ESM
    */
  var webpackHot: js.UndefOr[Hot] = js.undefined
}
object ImportMeta {
  
  inline def apply(url: String, webpack: Double): ImportMeta = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], webpack = webpack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
  
  extension [Self <: ImportMeta](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebpack(value: Double): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
    
    inline def setWebpackContext(value: (/* request */ String, /* options */ js.UndefOr[ChunkName]) => RequireContext): Self = StObject.set(x, "webpackContext", js.Any.fromFunction2(value))
    
    inline def setWebpackContextUndefined: Self = StObject.set(x, "webpackContext", js.undefined)
    
    inline def setWebpackHot(value: Hot): Self = StObject.set(x, "webpackHot", value.asInstanceOf[js.Any])
    
    inline def setWebpackHotUndefined: Self = StObject.set(x, "webpackHot", js.undefined)
  }
}
