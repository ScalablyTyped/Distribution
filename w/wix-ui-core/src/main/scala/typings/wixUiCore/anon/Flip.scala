package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flip extends StObject {
  
  var fixed: Boolean
  
  var flip: Boolean
  
  var zIndex: Double
}
object Flip {
  
  @scala.inline
  def apply(fixed: Boolean, flip: Boolean, zIndex: Double): Flip = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flip]
  }
  
  @scala.inline
  implicit class FlipMutableBuilder[Self <: Flip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
