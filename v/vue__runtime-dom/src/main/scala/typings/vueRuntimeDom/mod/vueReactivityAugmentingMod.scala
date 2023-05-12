package typings.vueRuntimeDom.mod

import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object vueReactivityAugmentingMod {
  
  trait RefUnwrapBailTypes extends StObject {
    
    var runtimeDOMBailTypes: Node | Window
  }
  object RefUnwrapBailTypes {
    
    inline def apply(runtimeDOMBailTypes: Node | Window): RefUnwrapBailTypes = {
      val __obj = js.Dynamic.literal(runtimeDOMBailTypes = runtimeDOMBailTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefUnwrapBailTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RefUnwrapBailTypes] (val x: Self) extends AnyVal {
      
      inline def setRuntimeDOMBailTypes(value: Node | Window): Self = StObject.set(x, "runtimeDOMBailTypes", value.asInstanceOf[js.Any])
    }
  }
}
