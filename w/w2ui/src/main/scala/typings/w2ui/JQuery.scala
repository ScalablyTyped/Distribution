package typings.w2ui

import typings.w2ui.W2UI.W2Form
import typings.w2ui.W2UI.W2Grid
import typings.w2ui.W2UI.W2Layout
import typings.w2ui.W2UI.W2Popup
import typings.w2ui.W2UI.W2Sidebar
import typings.w2ui.W2UI.W2Tabs
import typings.w2ui.W2UI.W2Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def w2form(options: js.Object): W2Form
  
  def w2grid(options: js.Object): W2Grid
  
  def w2layout(options: js.Object): W2Layout
  
  def w2popup(options: js.Object): W2Popup
  
  def w2sidebar(options: js.Object): W2Sidebar
  
  def w2tabs(options: js.Object): W2Tabs
  
  def w2toolbar(options: js.Object): W2Toolbar
}
object JQuery {
  
  inline def apply(
    w2form: js.Object => W2Form,
    w2grid: js.Object => W2Grid,
    w2layout: js.Object => W2Layout,
    w2popup: js.Object => W2Popup,
    w2sidebar: js.Object => W2Sidebar,
    w2tabs: js.Object => W2Tabs,
    w2toolbar: js.Object => W2Toolbar
  ): JQuery = {
    val __obj = js.Dynamic.literal(w2form = js.Any.fromFunction1(w2form), w2grid = js.Any.fromFunction1(w2grid), w2layout = js.Any.fromFunction1(w2layout), w2popup = js.Any.fromFunction1(w2popup), w2sidebar = js.Any.fromFunction1(w2sidebar), w2tabs = js.Any.fromFunction1(w2tabs), w2toolbar = js.Any.fromFunction1(w2toolbar))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setW2form(value: js.Object => W2Form): Self = StObject.set(x, "w2form", js.Any.fromFunction1(value))
    
    inline def setW2grid(value: js.Object => W2Grid): Self = StObject.set(x, "w2grid", js.Any.fromFunction1(value))
    
    inline def setW2layout(value: js.Object => W2Layout): Self = StObject.set(x, "w2layout", js.Any.fromFunction1(value))
    
    inline def setW2popup(value: js.Object => W2Popup): Self = StObject.set(x, "w2popup", js.Any.fromFunction1(value))
    
    inline def setW2sidebar(value: js.Object => W2Sidebar): Self = StObject.set(x, "w2sidebar", js.Any.fromFunction1(value))
    
    inline def setW2tabs(value: js.Object => W2Tabs): Self = StObject.set(x, "w2tabs", js.Any.fromFunction1(value))
    
    inline def setW2toolbar(value: js.Object => W2Toolbar): Self = StObject.set(x, "w2toolbar", js.Any.fromFunction1(value))
  }
}
