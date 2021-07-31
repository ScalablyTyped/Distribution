package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  var fixed: Boolean
  
  var flip: Boolean
  
  def onClickOutside(): js.Object
  
  var zIndex: Double
}
object Fixed {
  
  @scala.inline
  def apply(fixed: Boolean, flip: Boolean, onClickOutside: () => js.Object, zIndex: Double): Fixed = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], onClickOutside = js.Any.fromFunction0(onClickOutside), zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixed]
  }
  
  @scala.inline
  implicit class FixedMutableBuilder[Self <: Fixed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickOutside(value: () => js.Object): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
