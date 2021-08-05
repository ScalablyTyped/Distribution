package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTest extends StObject {
  
  var field: Group
  
  var test: String
  
  var value: Unit
}
object FieldTest {
  
  inline def apply(field: Group, test: String, value: Unit): FieldTest = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTest]
  }
  
  extension [Self <: FieldTest](x: Self) {
    
    inline def setField(value: Group): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
