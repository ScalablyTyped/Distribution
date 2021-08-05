package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.band
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandScale
  extends StObject
     with BaseBandScale
     with Scale {
  
  var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
  
  @JSName("type")
  var type_BandScale: band
}
object BandScale {
  
  inline def apply(name: String): BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("band")
    __obj.asInstanceOf[BandScale]
  }
  
  extension [Self <: BandScale](x: Self) {
    
    inline def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    inline def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    inline def setType(value: band): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
