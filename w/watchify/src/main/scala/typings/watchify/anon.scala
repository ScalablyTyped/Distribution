package typings.watchify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cache extends StObject {
    
    var cache: js.Any = js.native
    
    var packageCache: js.Any = js.native
  }
  object Cache {
    
    @scala.inline
    def apply(cache: js.Any, packageCache: js.Any): Cache = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], packageCache = packageCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackageCache(value: js.Any): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
    }
  }
}
