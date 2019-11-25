package typings.titanium.Titanium.Contacts

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object which represents a group in the system contacts address book.
		 */
trait Group extends Proxy {
  /**
  			 * Identifier of the group.
  			 */
  val identifier: String
  /**
  			 * Name of this group.
  			 */
  var name: String
  /**
  			 * Record identifier of the group. Single value. Deprecated for iOS 9 and later.
  			 */
  var recordId: Double
  /**
  			 * Adds a person to this group.
  			 */
  def add(person: Person): Unit
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.identifier> property.
  			 */
  def getIdentifier(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def getRecordId(): Double
  /**
  			 * Gets people that are members of this group.
  			 */
  def members(): js.Array[Person]
  /**
  			 * Removes a person from this group. For >= iOS9, it is not
  			 * required to call <Titanium.Contacts.save> after calling this method.
  			 */
  def remove(person: Person): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Contacts.Group.recordId> property.
  			 */
  def setRecordId(recordId: Double): Unit
  /**
  			 * Gets people that are members of this group, sorted in the specified order.
  			 */
  def sortedMembers(sortBy: Double): js.Array[Person]
}

object Group {
  @scala.inline
  def apply(
    add: Person => Unit,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getIdentifier: () => String,
    getName: () => String,
    getRecordId: () => Double,
    identifier: String,
    members: () => js.Array[Person],
    name: String,
    recordId: Double,
    remove: Person => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setName: String => Unit,
    setRecordId: Double => Unit,
    sortedMembers: Double => js.Array[Person],
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Group = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getIdentifier = js.Any.fromFunction0(getIdentifier), getName = js.Any.fromFunction0(getName), getRecordId = js.Any.fromFunction0(getRecordId), identifier = identifier.asInstanceOf[js.Any], members = js.Any.fromFunction0(members), name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setName = js.Any.fromFunction1(setName), setRecordId = js.Any.fromFunction1(setRecordId), sortedMembers = js.Any.fromFunction1(sortedMembers))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

