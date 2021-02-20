package typings.through

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoDestroy extends StObject {
    
    var autoDestroy: Boolean = js.native
  }
  object AutoDestroy {
    
    @scala.inline
    def apply(autoDestroy: Boolean): AutoDestroy = {
      val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDestroy]
    }
    
    @scala.inline
    implicit class AutoDestroyMutableBuilder[Self <: AutoDestroy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
    }
  }
}
