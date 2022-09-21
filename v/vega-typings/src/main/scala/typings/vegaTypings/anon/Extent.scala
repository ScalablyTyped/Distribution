package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeScheme
import typings.vegaTypings.schemeMod.ColorScheme
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extent
  extends StObject
     with _RangeScheme {
  
  var count: js.UndefOr[Double | SignalRef] = js.undefined
  
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  
  var scheme: String | js.Array[String] | SignalRef | ColorScheme
}
object Extent {
  
  inline def apply(scheme: String | js.Array[String] | SignalRef | ColorScheme): Extent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extent]
  }
  
  extension [Self <: Extent](x: Self) {
    
    inline def setCount(value: Double | SignalRef): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setExtent(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setExtentVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setScheme(value: String | js.Array[String] | SignalRef | ColorScheme): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeVarargs(value: String*): Self = StObject.set(x, "scheme", js.Array(value*))
  }
}
