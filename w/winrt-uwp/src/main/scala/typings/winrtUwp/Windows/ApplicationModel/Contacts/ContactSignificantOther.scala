package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a significant other for a contact. */
@js.native
trait ContactSignificantOther extends js.Object {
  
  /** Gets and sets the description of a significant other for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  
  /** Gets and sets the name of a significant other for a contact. The maximum string length for the name is 256 characters. */
  var name: String = js.native
  
  /** Gets or puts a value that indicates the nature of the relationship, such as spouse, partner, sibling, parent and so on. */
  var relationship: ContactRelationship = js.native
}
object ContactSignificantOther {
  
  @scala.inline
  def apply(description: String, name: String, relationship: ContactRelationship): ContactSignificantOther = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactSignificantOther]
  }
  
  @scala.inline
  implicit class ContactSignificantOtherOps[Self <: ContactSignificantOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationship(value: ContactRelationship): Self = this.set("relationship", value.asInstanceOf[js.Any])
  }
}
