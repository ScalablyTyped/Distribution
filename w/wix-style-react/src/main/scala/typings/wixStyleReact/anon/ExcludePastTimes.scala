package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludePastTimes extends StObject {
  
  var excludePastTimes: Any
  
  var filterTime: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object ExcludePastTimes {
  
  inline def apply(excludePastTimes: Any): ExcludePastTimes = {
    val __obj = js.Dynamic.literal(excludePastTimes = excludePastTimes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludePastTimes]
  }
  
  extension [Self <: ExcludePastTimes](x: Self) {
    
    inline def setExcludePastTimes(value: Any): Self = StObject.set(x, "excludePastTimes", value.asInstanceOf[js.Any])
    
    inline def setFilterTime(value: () => Boolean): Self = StObject.set(x, "filterTime", js.Any.fromFunction0(value))
    
    inline def setFilterTimeUndefined: Self = StObject.set(x, "filterTime", js.undefined)
  }
}
