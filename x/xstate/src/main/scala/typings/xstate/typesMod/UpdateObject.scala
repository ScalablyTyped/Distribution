package typings.xstate.typesMod

import typings.xstate.anon.ContextAny
import typings.xstate.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateObject extends EventObject {
  
  var id: String | Double = js.native
  
  var state: State[_, _, _, ContextAny] = js.native
}
object UpdateObject {
  
  @scala.inline
  def apply(id: String | Double, state: State[_, _, _, ContextAny], `type`: String): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObject]
  }
  
  @scala.inline
  implicit class UpdateObjectMutableBuilder[Self <: UpdateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State[_, _, _, ContextAny]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
