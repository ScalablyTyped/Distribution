package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitSortableOptions extends StObject {
  
  var animation: js.UndefOr[Double] = js.native
  
  var `cls-base`: js.UndefOr[String] = js.native
  
  var `cls-custom`: String = js.native
  
  var `cls-drag`: js.UndefOr[String] = js.native
  
  var `cls-drag-state`: js.UndefOr[String] = js.native
  
  var `cls-empty`: js.UndefOr[String] = js.native
  
  var `cls-item`: js.UndefOr[String] = js.native
  
  var `cls-no-drag`: js.UndefOr[String] = js.native
  
  var `cls-placeholder`: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object UIkitSortableOptions {
  
  @scala.inline
  def apply(`cls-custom`: String): UIkitSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cls-custom")(`cls-custom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSortableOptions]
  }
  
  @scala.inline
  implicit class UIkitSortableOptionsMutableBuilder[Self <: UIkitSortableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def `setCls-base`(value: String): Self = StObject.set(x, "cls-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-baseUndefined`: Self = StObject.set(x, "cls-base", js.undefined)
    
    @scala.inline
    def `setCls-custom`(value: String): Self = StObject.set(x, "cls-custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-drag`(value: String): Self = StObject.set(x, "cls-drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-drag-state`(value: String): Self = StObject.set(x, "cls-drag-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-drag-stateUndefined`: Self = StObject.set(x, "cls-drag-state", js.undefined)
    
    @scala.inline
    def `setCls-dragUndefined`: Self = StObject.set(x, "cls-drag", js.undefined)
    
    @scala.inline
    def `setCls-empty`(value: String): Self = StObject.set(x, "cls-empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-emptyUndefined`: Self = StObject.set(x, "cls-empty", js.undefined)
    
    @scala.inline
    def `setCls-item`(value: String): Self = StObject.set(x, "cls-item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-itemUndefined`: Self = StObject.set(x, "cls-item", js.undefined)
    
    @scala.inline
    def `setCls-no-drag`(value: String): Self = StObject.set(x, "cls-no-drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-no-dragUndefined`: Self = StObject.set(x, "cls-no-drag", js.undefined)
    
    @scala.inline
    def `setCls-placeholder`(value: String): Self = StObject.set(x, "cls-placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-placeholderUndefined`: Self = StObject.set(x, "cls-placeholder", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
