package typings.vegaTypings.typesSpecScaleMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.symlog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymLogScale
  extends StObject
     with NumericScale
     with Scale {
  
  var constant: js.UndefOr[Double | SignalRef] = js.undefined
  
  @JSName("type")
  var type_SymLogScale: symlog
}
object SymLogScale {
  
  inline def apply(name: String): SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("symlog")
    __obj.asInstanceOf[SymLogScale]
  }
  
  extension [Self <: SymLogScale](x: Self) {
    
    inline def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
    
    inline def setType(value: symlog): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
