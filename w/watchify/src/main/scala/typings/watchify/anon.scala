package typings.watchify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cache extends StObject {
    
    var cache: js.Any
    
    var packageCache: js.Any
  }
  object Cache {
    
    inline def apply(cache: js.Any, packageCache: js.Any): Cache = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setPackageCache(value: js.Any): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
    }
  }
}
