package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vue-router.vue-router._PathParserOptions, 'end' | 'sensitive' | 'strict'> */
trait PathParserOptions extends StObject {
  
  var end: js.UndefOr[Boolean] = js.undefined
  
  var sensitive: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object PathParserOptions {
  
  inline def apply(): PathParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathParserOptions]
  }
  
  extension [Self <: PathParserOptions](x: Self) {
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
