package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a significant other for a contact. */
trait ContactSignificantOther extends StObject {
  
  /** Gets and sets the description of a significant other for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  
  /** Gets and sets the name of a significant other for a contact. The maximum string length for the name is 256 characters. */
  var name: String
  
  /** Gets or puts a value that indicates the nature of the relationship, such as spouse, partner, sibling, parent and so on. */
  var relationship: ContactRelationship
}
object ContactSignificantOther {
  
  @scala.inline
  def apply(description: String, name: String, relationship: ContactRelationship): ContactSignificantOther = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactSignificantOther]
  }
  
  @scala.inline
  implicit class ContactSignificantOtherMutableBuilder[Self <: ContactSignificantOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationship(value: ContactRelationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
  }
}
