package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDimensions extends StObject {
  
  var offset: Double
  
  var scroll: Double
}
object IDimensions {
  
  inline def apply(offset: Double, scroll: Double): IDimensions = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDimensions] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
