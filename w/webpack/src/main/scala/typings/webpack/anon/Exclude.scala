package typings.webpack.anon

import typings.webpack.webpackStrings.`lazy-once`
import typings.webpack.webpackStrings.`lazy`
import typings.webpack.webpackStrings.eager
import typings.webpack.webpackStrings.sync
import typings.webpack.webpackStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude extends StObject {
  
  var chunkName: js.UndefOr[String] = js.undefined
  
  var exclude: js.UndefOr[js.RegExp] = js.undefined
  
  var exports: js.UndefOr[String | js.Array[js.Array[String]]] = js.undefined
  
  var include: js.UndefOr[js.RegExp] = js.undefined
  
  var mode: js.UndefOr[sync | eager | weak | `lazy` | `lazy-once`] = js.undefined
  
  var prefetch: js.UndefOr[Boolean | Double] = js.undefined
  
  var preload: js.UndefOr[Boolean | Double] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var regExp: js.UndefOr[js.RegExp] = js.undefined
}
object Exclude {
  
  inline def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  extension [Self <: Exclude](x: Self) {
    
    inline def setChunkName(value: String): Self = StObject.set(x, "chunkName", value.asInstanceOf[js.Any])
    
    inline def setChunkNameUndefined: Self = StObject.set(x, "chunkName", js.undefined)
    
    inline def setExclude(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExports(value: String | js.Array[js.Array[String]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: js.Array[String]*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setInclude(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setMode(value: sync | eager | weak | `lazy` | `lazy-once`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPrefetch(value: Boolean | Double): Self = StObject.set(x, "prefetch", value.asInstanceOf[js.Any])
    
    inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    
    inline def setPreload(value: Boolean | Double): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
  }
}
