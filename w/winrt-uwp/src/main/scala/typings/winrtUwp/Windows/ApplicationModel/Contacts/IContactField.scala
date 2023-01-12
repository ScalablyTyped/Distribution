package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an object that describes a piece of contact data. */
trait IContactField extends StObject {
  
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory
  
  /** Gets the name of the field. */
  var name: String
  
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType
  
  /** Gets the value of the contact data. */
  var value: String
}
object IContactField {
  
  inline def apply(category: ContactFieldCategory, name: String, `type`: ContactFieldType, value: String): IContactField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IContactField] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: ContactFieldCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContactFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
