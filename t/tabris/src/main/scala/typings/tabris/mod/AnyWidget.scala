package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyWidget extends StObject {
  
  var appendTo: js.Function
  
  var cid: String
  
  var data: Any
  
  var dispose: js.Function
  
  var id: String
  
  def isDisposed(): Boolean
  
  var jsxAttributes: Any
  
  var parent: js.Function
  
  var set: js.Function
}
object AnyWidget {
  
  inline def apply(
    appendTo: js.Function,
    cid: String,
    data: Any,
    dispose: js.Function,
    id: String,
    isDisposed: () => Boolean,
    jsxAttributes: Any,
    parent: js.Function,
    set: js.Function
  ): AnyWidget = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisposed = js.Any.fromFunction0(isDisposed), jsxAttributes = jsxAttributes.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyWidget]
  }
  
  extension [Self <: AnyWidget](x: Self) {
    
    inline def setAppendTo(value: js.Function): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: js.Function): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDisposed(value: () => Boolean): Self = StObject.set(x, "isDisposed", js.Any.fromFunction0(value))
    
    inline def setJsxAttributes(value: Any): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Function): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSet(value: js.Function): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
