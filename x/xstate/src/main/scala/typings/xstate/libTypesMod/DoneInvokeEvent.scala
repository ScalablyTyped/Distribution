package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoneInvokeEvent[TData]
  extends StObject
     with EventObject {
  
  var data: TData
}
object DoneInvokeEvent {
  
  inline def apply[TData](data: TData, `type`: String): DoneInvokeEvent[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneInvokeEvent[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoneInvokeEvent[?], TData] (val x: Self & DoneInvokeEvent[TData]) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
