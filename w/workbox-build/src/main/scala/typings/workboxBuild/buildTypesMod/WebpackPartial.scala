package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackPartial extends StObject {
  
  /**
    * One or more chunk names whose corresponding output files should be included
    * in the precache manifest.
    */
  var chunks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * One or more specifiers used to exclude assets from the precache manifest.
    * This is interpreted following
    * [the same rules](https://webpack.js.org/configuration/module/#condition)
    * as `webpack`'s standard `exclude` option.
    * If not provided, the default value is `[/\.map$/, /^manifest.*\.js$]`.
    */
  var exclude: js.UndefOr[js.Array[String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean])]] = js.undefined
  
  /**
    * One or more chunk names whose corresponding output files should be excluded
    * from the precache manifest.
    */
  var excludeChunks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * One or more specifiers used to include assets in the precache manifest.
    * This is interpreted following
    * [the same rules](https://webpack.js.org/configuration/module/#condition)
    * as `webpack`'s standard `include` option.
    */
  var include: js.UndefOr[js.Array[String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean])]] = js.undefined
  
  /**
    * If set to 'production', then an optimized service worker bundle that
    * excludes debugging info will be produced. If not explicitly configured
    * here, the `mode` value configured in the current `webpack` compilation
    * will be used.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
}
object WebpackPartial {
  
  inline def apply(): WebpackPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpackPartial] (val x: Self) extends AnyVal {
    
    inline def setChunks(value: js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setExclude(value: js.Array[String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean])]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
    
    inline def setExcludeChunksUndefined: Self = StObject.set(x, "excludeChunks", js.undefined)
    
    inline def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value*))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean]))*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean])]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (String | js.RegExp | (js.Function1[/* arg0 */ Any, Boolean]))*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
