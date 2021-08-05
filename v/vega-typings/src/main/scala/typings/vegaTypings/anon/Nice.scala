package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nice extends StObject {
  
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  
  var nice: js.UndefOr[Double | SignalRef] = js.undefined
}
object Nice {
  
  inline def apply(): Nice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nice]
  }
  
  extension [Self <: Nice](x: Self) {
    
    inline def setCount(value: Double | SignalRef): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setNice(value: Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
  }
}
