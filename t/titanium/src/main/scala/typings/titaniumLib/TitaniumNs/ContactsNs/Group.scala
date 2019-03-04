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
    add: js.Function1[Person, scala.Unit],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getIdentifier: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getRecordId: js.Function0[scala.Double],
    identifier: java.lang.String,
    members: js.Function0[js.Array[Person]],
    name: java.lang.String,
    recordId: scala.Double,
    remove: js.Function1[Person, scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setRecordId: js.Function1[scala.Double, scala.Unit],
    sortedMembers: js.Function1[scala.Double, js.Array[Person]],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Group = {
    val __obj = js.Dynamic.literal(add = add, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getIdentifier = getIdentifier, getName = getName, getRecordId = getRecordId, identifier = identifier, members = members, name = name, recordId = recordId, remove = remove, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setName = setName, setRecordId = setRecordId, sortedMembers = sortedMembers)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Group]
  }
}

