package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSortableOptions extends StObject {
  
  var animation: js.UndefOr[Double] = js.undefined
  
  var `cls-base`: js.UndefOr[String] = js.undefined
  
  var `cls-custom`: String
  
  var `cls-drag`: js.UndefOr[String] = js.undefined
  
  var `cls-drag-state`: js.UndefOr[String] = js.undefined
  
  var `cls-empty`: js.UndefOr[String] = js.undefined
  
  var `cls-item`: js.UndefOr[String] = js.undefined
  
  var `cls-no-drag`: js.UndefOr[String] = js.undefined
  
  var `cls-placeholder`: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object UIkitSortableOptions {
  
  inline def apply(`cls-custom`: String): UIkitSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cls-custom")(`cls-custom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSortableOptions]
  }
  
  extension [Self <: UIkitSortableOptions](x: Self) {
    
    inline def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def `setCls-base`(value: String): Self = StObject.set(x, "cls-base", value.asInstanceOf[js.Any])
    
    inline def `setCls-baseUndefined`: Self = StObject.set(x, "cls-base", js.undefined)
    
    inline def `setCls-custom`(value: String): Self = StObject.set(x, "cls-custom", value.asInstanceOf[js.Any])
    
    inline def `setCls-drag`(value: String): Self = StObject.set(x, "cls-drag", value.asInstanceOf[js.Any])
    
    inline def `setCls-drag-state`(value: String): Self = StObject.set(x, "cls-drag-state", value.asInstanceOf[js.Any])
    
    inline def `setCls-drag-stateUndefined`: Self = StObject.set(x, "cls-drag-state", js.undefined)
    
    inline def `setCls-dragUndefined`: Self = StObject.set(x, "cls-drag", js.undefined)
    
    inline def `setCls-empty`(value: String): Self = StObject.set(x, "cls-empty", value.asInstanceOf[js.Any])
    
    inline def `setCls-emptyUndefined`: Self = StObject.set(x, "cls-empty", js.undefined)
    
    inline def `setCls-item`(value: String): Self = StObject.set(x, "cls-item", value.asInstanceOf[js.Any])
    
    inline def `setCls-itemUndefined`: Self = StObject.set(x, "cls-item", js.undefined)
    
    inline def `setCls-no-drag`(value: String): Self = StObject.set(x, "cls-no-drag", value.asInstanceOf[js.Any])
    
    inline def `setCls-no-dragUndefined`: Self = StObject.set(x, "cls-no-drag", js.undefined)
    
    inline def `setCls-placeholder`(value: String): Self = StObject.set(x, "cls-placeholder", value.asInstanceOf[js.Any])
    
    inline def `setCls-placeholderUndefined`: Self = StObject.set(x, "cls-placeholder", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
