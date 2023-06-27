package typings.velocityjs

import org.scalablytyped.runtime.StringDictionary
import typings.velocityjs.anon.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileConfig extends StObject {
  
  var customMethodHandlers: js.UndefOr[js.Array[Match]] = js.undefined
  
  var escape: js.UndefOr[Boolean] = js.undefined
  
  // escape variable
  var unescape: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  // unescape var config
  // @see https://github.com/shepherdwind/velocity.js/pull/105
  var valueMapper: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
}
object CompileConfig {
  
  inline def apply(): CompileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileConfig] (val x: Self) extends AnyVal {
    
    inline def setCustomMethodHandlers(value: js.Array[Match]): Self = StObject.set(x, "customMethodHandlers", value.asInstanceOf[js.Any])
    
    inline def setCustomMethodHandlersUndefined: Self = StObject.set(x, "customMethodHandlers", js.undefined)
    
    inline def setCustomMethodHandlersVarargs(value: Match*): Self = StObject.set(x, "customMethodHandlers", js.Array(value*))
    
    inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setUnescape(value: StringDictionary[Boolean]): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
    
    inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
    
    inline def setValueMapper(value: /* value */ Any => Any): Self = StObject.set(x, "valueMapper", js.Any.fromFunction1(value))
    
    inline def setValueMapperUndefined: Self = StObject.set(x, "valueMapper", js.undefined)
  }
}
