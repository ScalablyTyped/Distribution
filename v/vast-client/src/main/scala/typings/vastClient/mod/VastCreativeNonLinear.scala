package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
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
  implicit class VastCreativeNonLinearMutableBuilder[Self <: VastCreativeNonLinear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariations(value: js.Array[VastNonLinearAd]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariationsVarargs(value: VastNonLinearAd*): Self = StObject.set(x, "variations", js.Array(value :_*))
  }
}
