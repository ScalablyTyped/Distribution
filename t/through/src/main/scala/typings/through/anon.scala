package typings.through

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoDestroy extends StObject {
    
    var autoDestroy: Boolean
  }
  object AutoDestroy {
    
    inline def apply(autoDestroy: Boolean): AutoDestroy = {
      val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDestroy]
    }
    
    extension [Self <: AutoDestroy](x: Self) {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
    }
  }
}
