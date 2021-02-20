package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.ordinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdinalScale
  extends BaseScale
     with Scale {
  
  var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.native
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  
  var range: js.UndefOr[RangeScheme | ScaleData] = js.native
  
  @JSName("type")
  var type_OrdinalScale: ordinal = js.native
}
object OrdinalScale {
  
  @scala.inline
  def apply(name: String, `type`: ordinal): OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdinalScale]
  }
  
  @scala.inline
  implicit class OrdinalScaleMutableBuilder[Self <: OrdinalScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
    
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
    def setType(value: ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
