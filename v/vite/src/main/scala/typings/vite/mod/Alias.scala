package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
    * Instructs the plugin to use an alternative resolving algorithm,
    * rather than the Rollup's resolver.
    * @default null
    */
  var customResolver: js.UndefOr[ResolverFunction | ResolverObject | Null] = js.undefined
  
  var find: String | js.RegExp
  
  var replacement: String
}
object Alias {
  
  inline def apply(find: String | js.RegExp, replacement: String): Alias = {
    val __obj = js.Dynamic.literal(find = find.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  extension [Self <: Alias](x: Self) {
    
    inline def setCustomResolver(value: ResolverFunction | ResolverObject): Self = StObject.set(x, "customResolver", value.asInstanceOf[js.Any])
    
    inline def setCustomResolverNull: Self = StObject.set(x, "customResolver", null)
    
    inline def setCustomResolverUndefined: Self = StObject.set(x, "customResolver", js.undefined)
    
    inline def setFind(value: String | js.RegExp): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
  }
}
