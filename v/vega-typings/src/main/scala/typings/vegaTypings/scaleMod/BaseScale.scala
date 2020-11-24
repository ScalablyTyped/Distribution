package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseScale extends js.Object {
  
  var domain: js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef] = js.native
  
  var domainMax: js.UndefOr[Double | SignalRef] = js.native
  
  var domainMid: js.UndefOr[Double | SignalRef] = js.native
  
  var domainMin: js.UndefOr[Double | SignalRef] = js.native
  
  var domainRaw: js.UndefOr[Null | js.Array[_] | SignalRef] = js.native
  
  var name: String = js.native
  
  var reverse: js.UndefOr[Boolean | SignalRef] = js.native
  
  var round: js.UndefOr[Boolean | SignalRef] = js.native
  
  var `type`: js.UndefOr[ScaleType] = js.native
}
object BaseScale {
  
  @scala.inline
  def apply(name: String): BaseScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScale]
  }
  
  @scala.inline
  implicit class BaseScaleOps[Self <: BaseScale] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainVarargs(value: (Null | String | Double | Boolean | SignalRef)*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomainMax(value: Double | SignalRef): Self = this.set("domainMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMax: Self = this.set("domainMax", js.undefined)
    
    @scala.inline
    def setDomainMid(value: Double | SignalRef): Self = this.set("domainMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMid: Self = this.set("domainMid", js.undefined)
    
    @scala.inline
    def setDomainMin(value: Double | SignalRef): Self = this.set("domainMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMin: Self = this.set("domainMin", js.undefined)
    
    @scala.inline
    def setDomainRawVarargs(value: js.Any*): Self = this.set("domainRaw", js.Array(value :_*))
    
    @scala.inline
    def setDomainRaw(value: js.Array[_] | SignalRef): Self = this.set("domainRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainRaw: Self = this.set("domainRaw", js.undefined)
    
    @scala.inline
    def setDomainRawNull: Self = this.set("domainRaw", null)
    
    @scala.inline
    def setReverse(value: Boolean | SignalRef): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean | SignalRef): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setType(value: ScaleType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
