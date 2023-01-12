package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var fragment: String
  
  var ident: String
  
  var normal: js.UndefOr[js.Function] = js.undefined
  
  var normalExecuted: Boolean
  
  var options: js.UndefOr[String | js.Object] = js.undefined
  
  var path: String
  
  var pitch: js.UndefOr[js.Function] = js.undefined
  
  var pitchExecuted: Boolean
  
  var query: String
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var request: String
}
object Data {
  
  inline def apply(
    fragment: String,
    ident: String,
    normalExecuted: Boolean,
    path: String,
    pitchExecuted: Boolean,
    query: String,
    request: String
  ): Data = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], ident = ident.asInstanceOf[js.Any], normalExecuted = normalExecuted.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pitchExecuted = pitchExecuted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: js.Function): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalExecuted(value: Boolean): Self = StObject.set(x, "normalExecuted", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setOptions(value: String | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: js.Function): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchExecuted(value: Boolean): Self = StObject.set(x, "pitchExecuted", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
