package typings.titanium.Titanium.Calendar

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single attendee of an event.
		 */
trait Attendee extends Proxy {
  /**
  			 * The attendee email.
  			 */
  var email: String
  /**
  			 * Indicates whether this attendee is the event organizer.
  			 */
  var isOrganizer: Boolean
  /**
  			 * The attendee name.
  			 */
  var name: String
  /**
  			 * The role of the attendee.
  			 */
  var role: Double
  /**
  			 * The status of the attendee.
  			 */
  var status: Double
  /**
  			 * The type of the attendee.
  			 */
  var `type`: Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def getEmail(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def getIsOrganizer(): Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def getRole(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def getStatus(): Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def getType(): Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def setEmail(email: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def setIsOrganizer(isOrganizer: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def setName(name: String): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def setRole(role: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def setStatus(status: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def setType(`type`: Double): Unit
}

object Attendee {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    email: String,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getEmail: () => String,
    getIsOrganizer: () => Boolean,
    getName: () => String,
    getRole: () => Double,
    getStatus: () => Double,
    getType: () => Double,
    isOrganizer: Boolean,
    name: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    role: Double,
    setBubbleParent: Boolean => Unit,
    setEmail: String => Unit,
    setIsOrganizer: Boolean => Unit,
    setName: String => Unit,
    setRole: Double => Unit,
    setStatus: Double => Unit,
    setType: Double => Unit,
    status: Double,
    `type`: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Attendee = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, email = email, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEmail = js.Any.fromFunction0(getEmail), getIsOrganizer = js.Any.fromFunction0(getIsOrganizer), getName = js.Any.fromFunction0(getName), getRole = js.Any.fromFunction0(getRole), getStatus = js.Any.fromFunction0(getStatus), getType = js.Any.fromFunction0(getType), isOrganizer = isOrganizer, name = name, removeEventListener = js.Any.fromFunction2(removeEventListener), role = role, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEmail = js.Any.fromFunction1(setEmail), setIsOrganizer = js.Any.fromFunction1(setIsOrganizer), setName = js.Any.fromFunction1(setName), setRole = js.Any.fromFunction1(setRole), setStatus = js.Any.fromFunction1(setStatus), setType = js.Any.fromFunction1(setType), status = status)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attendee]
  }
}

