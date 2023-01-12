package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionProps[TLength] extends StObject {
  
  val transition: js.UndefOr[ResponsiveValue[Transition[TLength]]] = js.undefined
}
object TransitionProps {
  
  inline def apply[TLength](): TransitionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProps[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionProps[?], TLength] (val x: Self & TransitionProps[TLength]) extends AnyVal {
    
    inline def setTransition(value: ResponsiveValue[Transition[TLength]]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setTransitionVarargs(value: Transition[TLength]*): Self = StObject.set(x, "transition", js.Array(value*))
  }
}
