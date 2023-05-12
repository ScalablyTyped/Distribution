package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchObject extends StObject {
  
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
  
  var include: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
  
  var test: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
}
object MatchObject {
  
  inline def apply(): MatchObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatchObject] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setTest(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "test", js.Array(value*))
  }
}
