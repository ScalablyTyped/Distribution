package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait markup extends StObject {
  
  var attribute: Any
  
  var dataTag: Any
  
  def init(node: String, target: String): baseview
  
  var namespace: Any
  
  def parse(data: Any, datatype: String): Unit
}
object markup {
  
  inline def apply(
    attribute: Any,
    dataTag: Any,
    init: (String, String) => baseview,
    namespace: Any,
    parse: (Any, String) => Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], dataTag = dataTag.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), namespace = namespace.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[markup]
  }
  
  extension [Self <: markup](x: Self) {
    
    inline def setAttribute(value: Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDataTag(value: Any): Self = StObject.set(x, "dataTag", value.asInstanceOf[js.Any])
    
    inline def setInit(value: (String, String) => baseview): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setNamespace(value: Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (Any, String) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
