package typings.wixUiTestUtils.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var dataHook: String
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var eventTrigger: TypeofSimulate
  
  var wrapper: HTMLElement
}
object Element {
  
  @scala.inline
  def apply(dataHook: String, eventTrigger: TypeofSimulate, wrapper: HTMLElement): Element = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
