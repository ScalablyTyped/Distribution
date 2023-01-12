package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseBooleanMod {
  
  @JSImport("@uifabric/react-hooks/lib/useBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, IUseBooleanCallbacks]]
  
  trait IUseBooleanCallbacks extends StObject {
    
    /** Set the value to false. Always has the same identity. */
    def setFalse(): Unit
    
    /** Set the value to true. Always has the same identity. */
    def setTrue(): Unit
    
    /** Toggle the value. Always has the same identity. */
    def toggle(): Unit
  }
  object IUseBooleanCallbacks {
    
    inline def apply(setFalse: () => Unit, setTrue: () => Unit, toggle: () => Unit): IUseBooleanCallbacks = {
      val __obj = js.Dynamic.literal(setFalse = js.Any.fromFunction0(setFalse), setTrue = js.Any.fromFunction0(setTrue), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IUseBooleanCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUseBooleanCallbacks] (val x: Self) extends AnyVal {
      
      inline def setSetFalse(value: () => Unit): Self = StObject.set(x, "setFalse", js.Any.fromFunction0(value))
      
      inline def setSetTrue(value: () => Unit): Self = StObject.set(x, "setTrue", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
