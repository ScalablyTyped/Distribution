package typings.wixUiTestUtils.anon

import typings.enzyme.mod.ReactWrapper
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHook extends StObject {
  
  var dataHook: String
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var eventTrigger: js.Any
  
  var wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]
}
object DataHook {
  
  @scala.inline
  def apply(
    dataHook: String,
    eventTrigger: js.Any,
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]
  ): DataHook = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHook]
  }
  
  @scala.inline
  implicit class DataHookMutableBuilder[Self <: DataHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEventTrigger(value: js.Any): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object, js.Any]]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
