package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcLegendMod.Legend
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendMixins extends StObject {
  
  /**
    * An object defining properties of the legend.
    * If `null`, the legend for the encoding channel will be removed.
    *
    * __Default value:__ If undefined, default [legend properties](https://vega.github.io/vega-lite/docs/legend.html) are applied.
    *
    * __See also:__ [`legend`](https://vega.github.io/vega-lite/docs/legend.html) documentation.
    */
  var legend: js.UndefOr[(Legend[ExprRef | SignalRef]) | Null] = js.undefined
}
object LegendMixins {
  
  inline def apply(): LegendMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendMixins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendMixins] (val x: Self) extends AnyVal {
    
    inline def setLegend(value: Legend[ExprRef | SignalRef]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendNull: Self = StObject.set(x, "legend", null)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
  }
}
