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

