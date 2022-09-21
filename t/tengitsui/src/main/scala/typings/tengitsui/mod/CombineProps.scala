package typings.tengitsui.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineProps extends StObject {
  
  var children: js.Array[Element]
  
  var select: selectFn
  
  var source: js.Array[Element]
}
object CombineProps {
  
  inline def apply(
    children: js.Array[Element],
    select: (/* itor */ js.Iterable[Element], /* slen */ Double, /* dlen */ Double) => js.Array[Element],
    source: js.Array[Element]
  ): CombineProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], select = js.Any.fromFunction3(select), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombineProps]
  }
  
  extension [Self <: CombineProps](x: Self) {
    
    inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setSelect(
      value: (/* itor */ js.Iterable[Element], /* slen */ Double, /* dlen */ Double) => js.Array[Element]
    ): Self = StObject.set(x, "select", js.Any.fromFunction3(value))
    
    inline def setSource(value: js.Array[Element]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: Element*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
