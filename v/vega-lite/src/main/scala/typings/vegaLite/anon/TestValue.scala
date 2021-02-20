package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestValue extends StObject {
  
  var field: js.UndefOr[scala.Nothing] = js.native
  
  var test: String = js.native
  
  var value: Double = js.native
}
object TestValue {
  
  @scala.inline
  def apply(test: String, value: Double): TestValue = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestValue]
  }
  
  @scala.inline
  implicit class TestValueMutableBuilder[Self <: TestValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
