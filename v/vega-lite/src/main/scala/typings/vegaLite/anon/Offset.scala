package typings.vegaLite.anon

import typings.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var band: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
  
  var offset: js.UndefOr[Double | VgValueRef] = js.undefined
}
object Offset {
  
  inline def apply(): Offset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setBand(value: Double | Boolean | SignalRef): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    inline def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
