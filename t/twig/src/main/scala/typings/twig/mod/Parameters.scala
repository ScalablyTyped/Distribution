package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var async: js.UndefOr[Any] = js.undefined
  
  var base: js.UndefOr[Any] = js.undefined
  
  var blocks: js.UndefOr[Any] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var href: js.UndefOr[Any] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var load: js.UndefOr[js.Function1[/* template */ Template, Unit]] = js.undefined
  
  var macros: js.UndefOr[Any] = js.undefined
  
  var method: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[Any] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[Any] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setAsync(value: Any): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setBlocks(value: Any): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHref(value: Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLoad(value: /* template */ Template => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setMacros(value: Any): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
    
    inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
    
    inline def setMethod(value: Any): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
