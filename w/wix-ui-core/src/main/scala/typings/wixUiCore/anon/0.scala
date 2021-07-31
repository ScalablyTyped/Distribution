package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var children: js.Array[typings.react.mod.global.JSX.Element]
}
object `0` {
  
  @scala.inline
  def apply(children: js.Array[typings.react.mod.global.JSX.Element]): `0` = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[typings.react.mod.global.JSX.Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: typings.react.mod.global.JSX.Element*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
