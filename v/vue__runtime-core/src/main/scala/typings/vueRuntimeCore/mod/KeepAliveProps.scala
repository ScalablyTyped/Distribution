package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepAliveProps extends StObject {
  
  var exclude: js.UndefOr[MatchPattern] = js.undefined
  
  var include: js.UndefOr[MatchPattern] = js.undefined
  
  var max: js.UndefOr[Double | String] = js.undefined
}
object KeepAliveProps {
  
  inline def apply(): KeepAliveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepAliveProps]
  }
  
  extension [Self <: KeepAliveProps](x: Self) {
    
    inline def setExclude(value: MatchPattern): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: MatchPattern): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
  }
}
