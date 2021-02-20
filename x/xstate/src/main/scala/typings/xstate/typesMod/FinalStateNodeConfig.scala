package typings.xstate.typesMod

import typings.xstate.xstateStrings.`final`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  
  @JSName("type")
  var type_FinalStateNodeConfig: `final` = js.native
}
object FinalStateNodeConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](`type`: `final`): FinalStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalStateNodeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class FinalStateNodeConfigMutableBuilder[Self <: FinalStateNodeConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (FinalStateNodeConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setType(value: `final`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
