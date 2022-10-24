package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateOnLoadBoolean extends StObject {
  
  var animateOnLoad: Boolean
}
object AnimateOnLoadBoolean {
  
  inline def apply(animateOnLoad: Boolean): AnimateOnLoadBoolean = {
    val __obj = js.Dynamic.literal(animateOnLoad = animateOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateOnLoadBoolean]
  }
  
  extension [Self <: AnimateOnLoadBoolean](x: Self) {
    
    inline def setAnimateOnLoad(value: Boolean): Self = StObject.set(x, "animateOnLoad", value.asInstanceOf[js.Any])
  }
}
