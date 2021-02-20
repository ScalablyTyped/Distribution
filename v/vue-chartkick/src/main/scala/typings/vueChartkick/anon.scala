package typings.vueChartkick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Adapter extends StObject {
    
    var adapter: js.Any = js.native
  }
  object Adapter {
    
    @scala.inline
    def apply(adapter: js.Any): Adapter = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit class AdapterMutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: js.Any): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    }
  }
}
