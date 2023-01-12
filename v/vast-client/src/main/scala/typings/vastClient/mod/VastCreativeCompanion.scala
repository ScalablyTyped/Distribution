package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCreativeCompanion
  extends StObject
     with VastCreative {
  
  var variations: js.Array[VastCompanionAd]
}
object VastCreativeCompanion {
  
  inline def apply(trackingEvents: VastTrackingEvents, `type`: String, variations: js.Array[VastCompanionAd]): VastCreativeCompanion = {
    val __obj = js.Dynamic.literal(trackingEvents = trackingEvents.asInstanceOf[js.Any], variations = variations.asInstanceOf[js.Any], adId = null, apiFramework = null, id = null, sequence = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeCompanion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastCreativeCompanion] (val x: Self) extends AnyVal {
    
    inline def setVariations(value: js.Array[VastCompanionAd]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsVarargs(value: VastCompanionAd*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
