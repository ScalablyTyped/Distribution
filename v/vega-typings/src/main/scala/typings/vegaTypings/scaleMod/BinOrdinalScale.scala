package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinOrdinalScale
  extends BaseScale
     with Scale {
  
  var bins: js.UndefOr[ScaleBins] = js.native
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  
  var range: js.UndefOr[RangeScheme | ScaleData] = js.native
  
  @JSName("type")
  var type_BinOrdinalScale: `bin-ordinal` = js.native
}
object BinOrdinalScale {
  
  @scala.inline
  def apply(name: String, `type`: `bin-ordinal`): BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinOrdinalScale]
  }
  
  @scala.inline
  implicit class BinOrdinalScaleMutableBuilder[Self <: BinOrdinalScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setRange(value: RangeScheme | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `bin-ordinal`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
