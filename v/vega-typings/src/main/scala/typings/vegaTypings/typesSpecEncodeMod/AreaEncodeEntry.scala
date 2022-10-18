package typings.vegaTypings.typesSpecEncodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaEncodeEntry
  extends StObject
     with LineEncodeEntry {
  
  var orient: js.UndefOr[ProductionRule[ScaledValueRef[Orientation]]] = js.undefined
}
object AreaEncodeEntry {
  
  inline def apply(): AreaEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaEncodeEntry]
  }
  
  extension [Self <: AreaEncodeEntry](x: Self) {
    
    inline def setOrient(value: ProductionRule[ScaledValueRef[Orientation]]): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setOrientVarargs(value: (Test & ScaledValueRef[Orientation])*): Self = StObject.set(x, "orient", js.Array(value*))
  }
}
