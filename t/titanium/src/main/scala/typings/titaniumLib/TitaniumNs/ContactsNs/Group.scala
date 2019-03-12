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

object Group {
  @scala.inline
  def apply(
    add: Person => scala.Unit,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getIdentifier: () => java.lang.String,
    getName: () => java.lang.String,
    getRecordId: () => scala.Double,
    identifier: java.lang.String,
    members: () => js.Array[Person],
    name: java.lang.String,
    recordId: scala.Double,
    remove: Person => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setRecordId: scala.Double => scala.Unit,
    sortedMembers: scala.Double => js.Array[Person],
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Group = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getIdentifier = js.Any.fromFunction0(getIdentifier), getName = js.Any.fromFunction0(getName), getRecordId = js.Any.fromFunction0(getRecordId), identifier = identifier, members = js.Any.fromFunction0(members), name = name, recordId = recordId, remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setName = js.Any.fromFunction1(setName), setRecordId = js.Any.fromFunction1(setRecordId), sortedMembers = js.Any.fromFunction1(sortedMembers))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Group]
  }
}

