package typings.webpack.anon

import typings.webpack.mod.EntryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string | undefined,   entryOptions :webpack.webpack.EntryOptions | undefined} & webpack.webpack.RawChunkGroupOptions */
trait namestringundefinedentryO extends StObject {
  
  var entryOptions: js.UndefOr[EntryOptions] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var prefetchOrder: js.UndefOr[Double] = js.undefined
  
  var preloadOrder: js.UndefOr[Double] = js.undefined
}
object namestringundefinedentryO {
  
  inline def apply(): namestringundefinedentryO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[namestringundefinedentryO]
  }
  
  extension [Self <: namestringundefinedentryO](x: Self) {
    
    inline def setEntryOptions(value: EntryOptions): Self = StObject.set(x, "entryOptions", value.asInstanceOf[js.Any])
    
    inline def setEntryOptionsUndefined: Self = StObject.set(x, "entryOptions", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrefetchOrder(value: Double): Self = StObject.set(x, "prefetchOrder", value.asInstanceOf[js.Any])
    
    inline def setPrefetchOrderUndefined: Self = StObject.set(x, "prefetchOrder", js.undefined)
    
    inline def setPreloadOrder(value: Double): Self = StObject.set(x, "preloadOrder", value.asInstanceOf[js.Any])
    
    inline def setPreloadOrderUndefined: Self = StObject.set(x, "preloadOrder", js.undefined)
  }
}
