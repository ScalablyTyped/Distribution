package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCreativeNonLinear extends VastCreative {
  
  var variations: js.Array[VastNonLinearAd] = js.native
}
object VastCreativeNonLinear {
  
  @scala.inline
  def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastNonLinearAd]): VastCreativeNonLinear = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeNonLinear]
  }
  
  @scala.inline
  implicit class VastCreativeNonLinearOps[Self <: VastCreativeNonLinear] (val x: Self) extends AnyVal {
    
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
    def setVariationsVarargs(value: VastNonLinearAd*): Self = this.set("variations", js.Array(value :_*))
    
    @scala.inline
    def setVariations(value: js.Array[VastNonLinearAd]): Self = this.set("variations", value.asInstanceOf[js.Any])
  }
}
