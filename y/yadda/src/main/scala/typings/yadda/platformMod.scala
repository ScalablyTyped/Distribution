package typings.yadda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  @JSImport("yadda/lib/Platform", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Platform {
    
    /* CompleteClass */
    override def get_container(): js.Any = js.native
    
    /* CompleteClass */
    override def is_browser(): Boolean = js.native
    
    /* CompleteClass */
    override def is_karma(): Boolean = js.native
    
    // Window | NodeJS.Global | Phantom
    /* CompleteClass */
    override def is_node(): Boolean = js.native
    
    /* CompleteClass */
    override def is_phantom(): Boolean = js.native
  }
  
  trait Platform extends StObject {
    
    def get_container(): js.Any
    
    def is_browser(): Boolean
    
    def is_karma(): Boolean
    
    // Window | NodeJS.Global | Phantom
    def is_node(): Boolean
    
    def is_phantom(): Boolean
  }
  object Platform {
    
    inline def apply(
      get_container: () => js.Any,
      is_browser: () => Boolean,
      is_karma: () => Boolean,
      is_node: () => Boolean,
      is_phantom: () => Boolean
    ): Platform = {
      val __obj = js.Dynamic.literal(get_container = js.Any.fromFunction0(get_container), is_browser = js.Any.fromFunction0(is_browser), is_karma = js.Any.fromFunction0(is_karma), is_node = js.Any.fromFunction0(is_node), is_phantom = js.Any.fromFunction0(is_phantom))
      __obj.asInstanceOf[Platform]
    }
    
    extension [Self <: Platform](x: Self) {
      
      inline def setGet_container(value: () => js.Any): Self = StObject.set(x, "get_container", js.Any.fromFunction0(value))
      
      inline def setIs_browser(value: () => Boolean): Self = StObject.set(x, "is_browser", js.Any.fromFunction0(value))
      
      inline def setIs_karma(value: () => Boolean): Self = StObject.set(x, "is_karma", js.Any.fromFunction0(value))
      
      inline def setIs_node(value: () => Boolean): Self = StObject.set(x, "is_node", js.Any.fromFunction0(value))
      
      inline def setIs_phantom(value: () => Boolean): Self = StObject.set(x, "is_phantom", js.Any.fromFunction0(value))
    }
  }
}
