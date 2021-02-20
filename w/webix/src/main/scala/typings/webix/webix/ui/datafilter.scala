package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datafilter {
  
  type columnGroup = textFilter
  
  type dateFilter = textFilter
  
  type dateRangeFilter = textFilter
  
  type datepickerFilter = textFilter
  
  type masterCheckbox = textFilter
  
  type multiComboFilter = textFilter
  
  type multiSelectFilter = textFilter
  
  type numberFilter = textFilter
  
  type selectFilter = textFilter
  
  type serverFilter = textFilter
  
  type serverMultiSelectFilter = textFilter
  
  type serverSelectFilter = textFilter
  
  type summColumn = textFilter
  
  @js.native
  trait textFilter extends WebixFilter {
    
    def getInputNode(node: HTMLElement): HTMLElement = js.native
  }
  object textFilter {
    
    @scala.inline
    def apply(
      getInputNode: HTMLElement => HTMLElement,
      getValue: HTMLElement => js.Any,
      refresh: (baseview, HTMLElement, js.Any) => Unit,
      render: (baseview, StringDictionary[js.Any]) => String,
      setValue: (HTMLElement, js.Any) => js.Any
    ): textFilter = {
      val __obj = js.Dynamic.literal(getInputNode = js.Any.fromFunction1(getInputNode), getValue = js.Any.fromFunction1(getValue), refresh = js.Any.fromFunction3(refresh), render = js.Any.fromFunction2(render), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[textFilter]
    }
    
    @scala.inline
    implicit class textFilterMutableBuilder[Self <: textFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInputNode(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getInputNode", js.Any.fromFunction1(value))
    }
  }
}
