package typings.victory.anon

import typings.victory.mod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XArray extends _CategoryPropType {
  
  var x: js.Array[String] = js.native
}
object XArray {
  
  @scala.inline
  def apply(x: js.Array[String]): XArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArray]
  }
  
  @scala.inline
  implicit class XArrayMutableBuilder[Self <: XArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value :_*))
  }
}
