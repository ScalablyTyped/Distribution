package typings.victory.anon

import typings.victory.mod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XArrayYArray extends _CategoryPropType {
  
  var x: js.Array[String] = js.native
  
  var y: js.Array[String] = js.native
}
object XArrayYArray {
  
  @scala.inline
  def apply(x: js.Array[String], y: js.Array[String]): XArrayYArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArrayYArray]
  }
  
  @scala.inline
  implicit class XArrayYArrayMutableBuilder[Self <: XArrayYArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    @scala.inline
    def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
