package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenElement extends StObject {
  
  var children: typings.react.mod.global.JSX.Element
}
object ChildrenElement {
  
  @scala.inline
  def apply(children: typings.react.mod.global.JSX.Element): ChildrenElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenElement]
  }
  
  @scala.inline
  implicit class ChildrenElementMutableBuilder[Self <: ChildrenElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: typings.react.mod.global.JSX.Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
