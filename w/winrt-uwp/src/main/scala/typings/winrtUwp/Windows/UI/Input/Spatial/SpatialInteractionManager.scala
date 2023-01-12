package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionManager extends StObject {
  
  /* unmapped type */
  var addEventListener: Any
  
  /* unmapped type */
  var getDetectedSourcesAtTimestamp: Any
  
  /* unmapped type */
  var oninteractiondetected: Any
  
  /* unmapped type */
  var onsourcedetected: Any
  
  /* unmapped type */
  var onsourcelost: Any
  
  /* unmapped type */
  var onsourcepressed: Any
  
  /* unmapped type */
  var onsourcereleased: Any
  
  /* unmapped type */
  var onsourceupdated: Any
  
  /* unmapped type */
  var removeEventListener: Any
}
object SpatialInteractionManager {
  
  inline def apply(
    addEventListener: Any,
    getDetectedSourcesAtTimestamp: Any,
    oninteractiondetected: Any,
    onsourcedetected: Any,
    onsourcelost: Any,
    onsourcepressed: Any,
    onsourcereleased: Any,
    onsourceupdated: Any,
    removeEventListener: Any
  ): SpatialInteractionManager = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getDetectedSourcesAtTimestamp = getDetectedSourcesAtTimestamp.asInstanceOf[js.Any], oninteractiondetected = oninteractiondetected.asInstanceOf[js.Any], onsourcedetected = onsourcedetected.asInstanceOf[js.Any], onsourcelost = onsourcelost.asInstanceOf[js.Any], onsourcepressed = onsourcepressed.asInstanceOf[js.Any], onsourcereleased = onsourcereleased.asInstanceOf[js.Any], onsourceupdated = onsourceupdated.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialInteractionManager] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setGetDetectedSourcesAtTimestamp(value: Any): Self = StObject.set(x, "getDetectedSourcesAtTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOninteractiondetected(value: Any): Self = StObject.set(x, "oninteractiondetected", value.asInstanceOf[js.Any])
    
    inline def setOnsourcedetected(value: Any): Self = StObject.set(x, "onsourcedetected", value.asInstanceOf[js.Any])
    
    inline def setOnsourcelost(value: Any): Self = StObject.set(x, "onsourcelost", value.asInstanceOf[js.Any])
    
    inline def setOnsourcepressed(value: Any): Self = StObject.set(x, "onsourcepressed", value.asInstanceOf[js.Any])
    
    inline def setOnsourcereleased(value: Any): Self = StObject.set(x, "onsourcereleased", value.asInstanceOf[js.Any])
    
    inline def setOnsourceupdated(value: Any): Self = StObject.set(x, "onsourceupdated", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
