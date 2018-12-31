package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android `PendingIntent`.
		 */
trait PendingIntent
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Flags used for creating the Pending Intent.
  			 */
  var flags: scala.Double
  /**
  			 * The intent data to pass to the [Activity](Titanium.Android.Activity) launched by this `PendingIntent`.
  			 */
  var intent: Intent
  /**
  			 * If this property is true, flag <Titanium.Android.FLAG_UPDATE_CURRENT> will be
  			 * appended to `flags` automatically. Default value is true.
  			 */
  var updateCurrentIntent: scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def getFlags(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def getUpdateCurrentIntent(): scala.Boolean
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def setFlags(flags: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def setIntent(intent: Intent): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def setUpdateCurrentIntent(updateCurrentIntent: scala.Boolean): scala.Unit
}

