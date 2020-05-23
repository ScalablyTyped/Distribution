package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a significant other for a contact. */
trait ContactSignificantOther extends js.Object {
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
}

