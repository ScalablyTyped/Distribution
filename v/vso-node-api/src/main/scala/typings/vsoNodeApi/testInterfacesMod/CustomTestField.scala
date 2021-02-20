package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTestField extends StObject {
  
  var fieldName: String = js.native
  
  var value: js.Any = js.native
}
object CustomTestField {
  
  @scala.inline
  def apply(fieldName: String, value: js.Any): CustomTestField = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestField]
  }
  
  @scala.inline
  implicit class CustomTestFieldMutableBuilder[Self <: CustomTestField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
