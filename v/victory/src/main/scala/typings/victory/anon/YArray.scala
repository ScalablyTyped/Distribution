package typings.victory.anon

import typings.victory.mod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YArray extends _CategoryPropType {
  
  var y: js.Array[String] = js.native
}
object YArray {
  
  @scala.inline
  def apply(y: js.Array[String]): YArray = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[YArray]
  }
  
  @scala.inline
  implicit class YArrayMutableBuilder[Self <: YArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
