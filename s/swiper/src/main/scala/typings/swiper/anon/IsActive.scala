package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActive extends StObject {
  
  var isActive: Boolean
  
  var isDuplicate: Boolean
  
  var isNext: Boolean
  
  var isPrev: Boolean
  
  var isVisible: Boolean
}
object IsActive {
  
  inline def apply(isActive: Boolean, isDuplicate: Boolean, isNext: Boolean, isPrev: Boolean, isVisible: Boolean): IsActive = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], isDuplicate = isDuplicate.asInstanceOf[js.Any], isNext = isNext.asInstanceOf[js.Any], isPrev = isPrev.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsActive] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsDuplicate(value: Boolean): Self = StObject.set(x, "isDuplicate", value.asInstanceOf[js.Any])
    
    inline def setIsNext(value: Boolean): Self = StObject.set(x, "isNext", value.asInstanceOf[js.Any])
    
    inline def setIsPrev(value: Boolean): Self = StObject.set(x, "isPrev", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
  }
}
