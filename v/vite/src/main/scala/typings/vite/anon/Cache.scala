package typings.vite.anon

import typings.vite.mod.SplitVendorChunkCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  var cache: js.UndefOr[SplitVendorChunkCache] = js.undefined
}
object Cache {
  
  inline def apply(): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cache]
  }
  
  extension [Self <: Cache](x: Self) {
    
    inline def setCache(value: SplitVendorChunkCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
  }
}
