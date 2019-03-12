package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that represents a single attendee of an event.
		 */
trait Attendee
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The attendee email.
  			 */
  var email: java.lang.String
  /**
  			 * Indicates whether this attendee is the event organizer.
  			 */
  var isOrganizer: scala.Boolean
  /**
  			 * The attendee name.
  			 */
  var name: java.lang.String
  /**
  			 * The role of the attendee.
  			 */
  var role: scala.Double
  /**
  			 * The status of the attendee.
  			 */
  var status: scala.Double
  /**
  			 * The type of the attendee.
  			 */
  var `type`: scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def getEmail(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def getIsOrganizer(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def getName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def getRole(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def getStatus(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def getType(): scala.Double
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.email> property.
  			 */
  def setEmail(email: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.isOrganizer> property.
  			 */
  def setIsOrganizer(isOrganizer: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.name> property.
  			 */
  def setName(name: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.role> property.
  			 */
  def setRole(role: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.status> property.
  			 */
  def setStatus(status: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Calendar.Attendee.type> property.
  			 */
  def setType(`type`: scala.Double): scala.Unit
}

object Attendee {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    email: java.lang.String,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getEmail: () => java.lang.String,
    getIsOrganizer: () => scala.Boolean,
    getName: () => java.lang.String,
    getRole: () => scala.Double,
    getStatus: () => scala.Double,
    getType: () => scala.Double,
    isOrganizer: scala.Boolean,
    name: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    role: scala.Double,
    setBubbleParent: scala.Boolean => scala.Unit,
    setEmail: java.lang.String => scala.Unit,
    setIsOrganizer: scala.Boolean => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setRole: scala.Double => scala.Unit,
    setStatus: scala.Double => scala.Unit,
    setType: scala.Double => scala.Unit,
    status: scala.Double,
    `type`: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Attendee = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, email = email, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEmail = js.Any.fromFunction0(getEmail), getIsOrganizer = js.Any.fromFunction0(getIsOrganizer), getName = js.Any.fromFunction0(getName), getRole = js.Any.fromFunction0(getRole), getStatus = js.Any.fromFunction0(getStatus), getType = js.Any.fromFunction0(getType), isOrganizer = isOrganizer, name = name, removeEventListener = js.Any.fromFunction2(removeEventListener), role = role, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEmail = js.Any.fromFunction1(setEmail), setIsOrganizer = js.Any.fromFunction1(setIsOrganizer), setName = js.Any.fromFunction1(setName), setRole = js.Any.fromFunction1(setRole), setStatus = js.Any.fromFunction1(setStatus), setType = js.Any.fromFunction1(setType), status = status)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attendee]
  }
}

