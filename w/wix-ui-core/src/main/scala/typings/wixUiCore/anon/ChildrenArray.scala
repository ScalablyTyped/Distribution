package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenArray extends StObject {
  
  var children: js.Array[LabelString]
}
object ChildrenArray {
  
  @scala.inline
  def apply(children: js.Array[LabelString]): ChildrenArray = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenArray]
  }
  
  @scala.inline
  implicit class ChildrenArrayMutableBuilder[Self <: ChildrenArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[LabelString]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: LabelString*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
