package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoneInvokeEvent[TData] extends EventObject {
  
  var data: TData = js.native
}
object DoneInvokeEvent {
  
  @scala.inline
  def apply[TData](data: TData, `type`: String): DoneInvokeEvent[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneInvokeEvent[TData]]
  }
  
  @scala.inline
  implicit class DoneInvokeEventMutableBuilder[Self <: DoneInvokeEvent[_], TData] (val x: Self with DoneInvokeEvent[TData]) extends AnyVal {
    
    @scala.inline
    def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
