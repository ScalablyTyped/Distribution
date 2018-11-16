package typings
package titaniumLib.TitaniumNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object which represents a group in the system contacts address book.
		 */

trait Group
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Identifier of the group.
  			 */
  val identifier: java.lang.String
  /**
  			 * Name of this group.
  			 */
  var name: java.lang.String
  /**
  			 * Record identifier of the group. Single value. Deprecated for iOS 9 and later.
  			 */
  var recordId: scala.Double
  /**
  			 * Adds a person to this group.
  			 */
  def add(person: Person): scala.Unit
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.identifier> property.
  			 */
  def getIdentifier(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def getRecordId(): scala.Double
  /**
  			 * Gets people that are members of this group.
  			 */
  def members(): js.Array[Person]
  /**
  			 * Removes a person from this group. For >= iOS9, it is not
  			 * required to call <Titanium.Contacts.save> after calling this method.
  			 */
  def remove(person: Person): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def setName(name: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def setRecordId(recordId: scala.Double): scala.Unit
  /**
  			 * Gets people that are members of this group, sorted in the specified order.
  			 */
  def sortedMembers(sortBy: scala.Double): js.Array[Person]
}

