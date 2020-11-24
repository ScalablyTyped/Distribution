package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCreativeCompanion extends VastCreative {
  
  var variations: js.Array[VastCompanionAd] = js.native
}
object VastCreativeCompanion {
  
  @scala.inline
  def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastCompanionAd]): VastCreativeCompanion = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeCompanion]
  }
  
  @scala.inline
  implicit class VastCreativeCompanionOps[Self <: VastCreativeCompanion] (val x: Self) extends AnyVal {
    
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
    def setVariationsVarargs(value: VastCompanionAd*): Self = this.set("variations", js.Array(value :_*))
    
    @scala.inline
    def setVariations(value: js.Array[VastCompanionAd]): Self = this.set("variations", value.asInstanceOf[js.Any])
  }
}
