package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.ordinal
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
  implicit class OrdinalScaleOps[Self <: OrdinalScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: ordinal): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainImplicit(value: Boolean | SignalRef): Self = this.set("domainImplicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainImplicit: Self = this.set("domainImplicit", js.undefined)
    
    @scala.inline
    def setInterpolate(value: ScaleInterpolate): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: RangeScheme | ScaleData): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
