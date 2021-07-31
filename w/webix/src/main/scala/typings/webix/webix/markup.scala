package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait markup extends StObject {
  
  var attribute: js.Any
  
  var dataTag: js.Any
  
  def init(node: String, target: String): baseview
  
  var namespace: js.Any
  
  def parse(data: js.Any, datatype: String): Unit
}
object markup {
  
  @scala.inline
  def apply(
    attribute: js.Any,
    dataTag: js.Any,
    init: (String, String) => baseview,
    namespace: js.Any,
    parse: (js.Any, String) => Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], dataTag = dataTag.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), namespace = namespace.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[markup]
  }
  
  @scala.inline
  implicit class markupMutableBuilder[Self <: markup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: js.Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTag(value: js.Any): Self = StObject.set(x, "dataTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: (String, String) => baseview): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNamespace(value: js.Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: (js.Any, String) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
