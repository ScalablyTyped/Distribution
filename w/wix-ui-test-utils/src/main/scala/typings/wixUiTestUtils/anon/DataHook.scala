package typings.wixUiTestUtils.anon

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHook extends StObject {
  
  var dataHook: String
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var eventTrigger: Any
  
  var wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]]
}
object DataHook {
  
  inline def apply(
    dataHook: String,
    eventTrigger: Any,
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]]
  ): DataHook = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHook]
  }
  
  extension [Self <: DataHook](x: Self) {
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEventTrigger(value: Any): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, Any]]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
