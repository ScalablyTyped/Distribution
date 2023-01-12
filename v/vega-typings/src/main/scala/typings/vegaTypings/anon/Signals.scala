package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signals extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var signals: js.UndefOr[Any] = js.undefined
}
object Signals {
  
  inline def apply(): Signals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signals] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSignals(value: Any): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
    
    inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
  }
}
