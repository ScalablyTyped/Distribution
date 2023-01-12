package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCreativeNonLinear
  extends StObject
     with VastCreative {
  
  var variations: js.Array[VastNonLinearAd]
}
object VastCreativeNonLinear {
  
  inline def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastNonLinearAd]): VastCreativeNonLinear = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any], adId = null, apiFramework = null, id = null, sequence = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeNonLinear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastCreativeNonLinear] (val x: Self) extends AnyVal {
    
    inline def setVariations(value: js.Array[VastNonLinearAd]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsVarargs(value: VastNonLinearAd*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
