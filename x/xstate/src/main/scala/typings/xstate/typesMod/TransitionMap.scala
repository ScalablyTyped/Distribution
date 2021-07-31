package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionMap extends StObject {
  
  var state: js.UndefOr[StateValue] = js.undefined
}
object TransitionMap {
  
  @scala.inline
  def apply(): TransitionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionMap]
  }
  
  @scala.inline
  implicit class TransitionMapMutableBuilder[Self <: TransitionMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: StateValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
