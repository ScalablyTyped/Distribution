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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    email: java.lang.String,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getEmail: js.Function0[java.lang.String],
    getIsOrganizer: js.Function0[scala.Boolean],
    getName: js.Function0[java.lang.String],
    getRole: js.Function0[scala.Double],
    getStatus: js.Function0[scala.Double],
    getType: js.Function0[scala.Double],
    isOrganizer: scala.Boolean,
    name: java.lang.String,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    role: scala.Double,
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setEmail: js.Function1[java.lang.String, scala.Unit],
    setIsOrganizer: js.Function1[scala.Boolean, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setRole: js.Function1[scala.Double, scala.Unit],
    setStatus: js.Function1[scala.Double, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit],
    status: scala.Double,
    `type`: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Attendee = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, email = email, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getEmail = getEmail, getIsOrganizer = getIsOrganizer, getName = getName, getRole = getRole, getStatus = getStatus, getType = getType, isOrganizer = isOrganizer, name = name, removeEventListener = removeEventListener, role = role, setBubbleParent = setBubbleParent, setEmail = setEmail, setIsOrganizer = setIsOrganizer, setName = setName, setRole = setRole, setStatus = setStatus, setType = setType, status = status)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Attendee]
  }
}

