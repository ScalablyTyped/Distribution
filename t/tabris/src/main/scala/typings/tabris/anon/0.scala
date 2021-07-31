package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var children: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])
}
object `0` {
  
  @scala.inline
  def apply(children: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])): `0` = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String | Double | Boolean | (js.Array[Null | String | Double | Boolean])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (Null | String | Double | Boolean)*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
