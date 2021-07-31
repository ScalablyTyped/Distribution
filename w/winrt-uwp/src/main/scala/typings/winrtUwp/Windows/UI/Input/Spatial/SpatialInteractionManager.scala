package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionManager extends StObject {
  
  /* unmapped type */
  var addEventListener: js.Any
  
  /* unmapped type */
  var getDetectedSourcesAtTimestamp: js.Any
  
  /* unmapped type */
  var oninteractiondetected: js.Any
  
  /* unmapped type */
  var onsourcedetected: js.Any
  
  /* unmapped type */
  var onsourcelost: js.Any
  
  /* unmapped type */
  var onsourcepressed: js.Any
  
  /* unmapped type */
  var onsourcereleased: js.Any
  
  /* unmapped type */
  var onsourceupdated: js.Any
  
  /* unmapped type */
  var removeEventListener: js.Any
}
object SpatialInteractionManager {
  
  @scala.inline
  def apply(
    addEventListener: js.Any,
    getDetectedSourcesAtTimestamp: js.Any,
    oninteractiondetected: js.Any,
    onsourcedetected: js.Any,
    onsourcelost: js.Any,
    onsourcepressed: js.Any,
    onsourcereleased: js.Any,
    onsourceupdated: js.Any,
    removeEventListener: js.Any
  ): SpatialInteractionManager = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], getDetectedSourcesAtTimestamp = getDetectedSourcesAtTimestamp.asInstanceOf[js.Any], oninteractiondetected = oninteractiondetected.asInstanceOf[js.Any], onsourcedetected = onsourcedetected.asInstanceOf[js.Any], onsourcelost = onsourcelost.asInstanceOf[js.Any], onsourcepressed = onsourcepressed.asInstanceOf[js.Any], onsourcereleased = onsourcereleased.asInstanceOf[js.Any], onsourceupdated = onsourceupdated.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionManager]
  }
  
  @scala.inline
  implicit class SpatialInteractionManagerMutableBuilder[Self <: SpatialInteractionManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDetectedSourcesAtTimestamp(value: js.Any): Self = StObject.set(x, "getDetectedSourcesAtTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninteractiondetected(value: js.Any): Self = StObject.set(x, "oninteractiondetected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsourcedetected(value: js.Any): Self = StObject.set(x, "onsourcedetected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsourcelost(value: js.Any): Self = StObject.set(x, "onsourcelost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsourcepressed(value: js.Any): Self = StObject.set(x, "onsourcepressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsourcereleased(value: js.Any): Self = StObject.set(x, "onsourcereleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsourceupdated(value: js.Any): Self = StObject.set(x, "onsourceupdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
