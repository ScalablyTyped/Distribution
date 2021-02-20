package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value1 extends StObject {
  
  var value1: Double = js.native
  
  var value2: Double = js.native
}
object Value1 {
  
  @scala.inline
  def apply(value1: Double, value2: Double): Value1 = {
    val __obj = js.Dynamic.literal(value1 = value1.asInstanceOf[js.Any], value2 = value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value1]
  }
  
  @scala.inline
  implicit class Value1MutableBuilder[Self <: Value1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
  }
}
