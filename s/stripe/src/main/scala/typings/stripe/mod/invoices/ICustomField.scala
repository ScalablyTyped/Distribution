package typings.stripe.mod.invoices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomField extends StObject {
  
  /**
    * The name of the custom field.
    */
  var name: String = js.native
  
  /**
    * The value of the custom field.
    */
  var value: String = js.native
}
object ICustomField {
  
  @scala.inline
  def apply(name: String, value: String): ICustomField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomField]
  }
  
  @scala.inline
  implicit class ICustomFieldMutableBuilder[Self <: ICustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
