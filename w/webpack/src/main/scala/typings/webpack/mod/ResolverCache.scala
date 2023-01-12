package typings.webpack.mod

import typings.std.Map
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverCache extends StObject {
  
  var direct: WeakMap[js.Object, ResolverWithOptions]
  
  var stringified: Map[String, ResolverWithOptions]
}
object ResolverCache {
  
  inline def apply(direct: WeakMap[js.Object, ResolverWithOptions], stringified: Map[String, ResolverWithOptions]): ResolverCache = {
    val __obj = js.Dynamic.literal(direct = direct.asInstanceOf[js.Any], stringified = stringified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolverCache] (val x: Self) extends AnyVal {
    
    inline def setDirect(value: WeakMap[js.Object, ResolverWithOptions]): Self = StObject.set(x, "direct", value.asInstanceOf[js.Any])
    
    inline def setStringified(value: Map[String, ResolverWithOptions]): Self = StObject.set(x, "stringified", value.asInstanceOf[js.Any])
  }
}
