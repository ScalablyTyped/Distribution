package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClickOutside extends StObject {
  
  var appendTo: js.Array[LabelStringValue | Label]
  
  var children: js.Array[ValueArray]
  
  def onClickOutside(): Unit
  
  var placement: js.Array[String]
}
object OnClickOutside {
  
  inline def apply(
    appendTo: js.Array[LabelStringValue | Label],
    children: js.Array[ValueArray],
    onClickOutside: () => Unit,
    placement: js.Array[String]
  ): OnClickOutside = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], onClickOutside = js.Any.fromFunction0(onClickOutside), placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickOutside]
  }
  
  extension [Self <: OnClickOutside](x: Self) {
    
    inline def setAppendTo(value: js.Array[LabelStringValue | Label]): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToVarargs(value: (LabelStringValue | Label)*): Self = StObject.set(x, "appendTo", js.Array(value :_*))
    
    inline def setChildren(value: js.Array[ValueArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ValueArray*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
    
    inline def setPlacement(value: js.Array[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementVarargs(value: String*): Self = StObject.set(x, "placement", js.Array(value :_*))
  }
}
