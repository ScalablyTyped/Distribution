package typings.uifabricReactHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBooleanMod {
  
  @JSImport("@uifabric/react-hooks/lib/useBoolean", "useBoolean")
  @js.native
  def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = js.native
  
  @js.native
  trait IUseBooleanCallbacks extends StObject {
    
    /** Set the value to false. Always has the same identity. */
    def setFalse(): Unit = js.native
    
    /** Set the value to true. Always has the same identity. */
    def setTrue(): Unit = js.native
    
    /** Toggle the value. Always has the same identity. */
    def toggle(): Unit = js.native
  }
  object IUseBooleanCallbacks {
    
    @scala.inline
    def apply(setFalse: () => Unit, setTrue: () => Unit, toggle: () => Unit): IUseBooleanCallbacks = {
      val __obj = js.Dynamic.literal(setFalse = js.Any.fromFunction0(setFalse), setTrue = js.Any.fromFunction0(setTrue), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IUseBooleanCallbacks]
    }
    
    @scala.inline
    implicit class IUseBooleanCallbacksMutableBuilder[Self <: IUseBooleanCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetFalse(value: () => Unit): Self = StObject.set(x, "setFalse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetTrue(value: () => Unit): Self = StObject.set(x, "setTrue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
