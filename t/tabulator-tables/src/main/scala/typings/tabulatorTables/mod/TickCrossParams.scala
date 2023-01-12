package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickCrossParams
  extends StObject
     with _FormatterParams {
  
  // Tick Cross
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var allowTruthy: js.UndefOr[Boolean] = js.undefined
  
  var crossElement: js.UndefOr[Boolean | String] = js.undefined
  
  var tickElement: js.UndefOr[Boolean | String] = js.undefined
}
object TickCrossParams {
  
  inline def apply(): TickCrossParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickCrossParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TickCrossParams] (val x: Self) extends AnyVal {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setAllowTruthy(value: Boolean): Self = StObject.set(x, "allowTruthy", value.asInstanceOf[js.Any])
    
    inline def setAllowTruthyUndefined: Self = StObject.set(x, "allowTruthy", js.undefined)
    
    inline def setCrossElement(value: Boolean | String): Self = StObject.set(x, "crossElement", value.asInstanceOf[js.Any])
    
    inline def setCrossElementUndefined: Self = StObject.set(x, "crossElement", js.undefined)
    
    inline def setTickElement(value: Boolean | String): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
    
    inline def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
  }
}
