package typings.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxElement extends StObject {
  
  var children: js.Array[JsxChildren]
  
  var props: js.Object | Null
  
  var tag: js.Symbol | String | JsxComponent[Any]
}
object JsxElement {
  
  inline def apply(children: js.Array[JsxChildren], tag: js.Symbol | String | JsxComponent[Any]): JsxElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], props = null)
    __obj.asInstanceOf[JsxElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxElement] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[JsxChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: JsxChildren*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsNull: Self = StObject.set(x, "props", null)
    
    inline def setTag(value: js.Symbol | String | JsxComponent[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagFunction1(value: Any => js.UndefOr[JsxElement | Null]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
  }
}
