package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android `PendingIntent`.
		 */
@JSGlobal("Titanium.Android.PendingIntent")
@js.native
class PendingIntent () extends Proxy {
  /**
  			 * Flags used for creating the Pending Intent.
  			 */
  var flags: Double = js.native
  /**
  			 * The intent data to pass to the [Activity](Titanium.Android.Activity) launched by this `PendingIntent`.
  			 */
  var intent: Intent = js.native
  /**
  			 * If this property is true, flag <Titanium.Android.FLAG_UPDATE_CURRENT> will be
  			 * appended to `flags` automatically. Default value is true.
  			 */
  var updateCurrentIntent: Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 * @deprecated Access <Titanium.Android.PendingIntent.flags> instead.
  			 */
  def getFlags(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 * @deprecated Access <Titanium.Android.PendingIntent.intent> instead.
  			 */
  def getIntent(): Intent = js.native
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 * @deprecated Access <Titanium.Android.PendingIntent.updateCurrentIntent> instead.
  			 */
  def getUpdateCurrentIntent(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 * @deprecated Set the value using <Titanium.Android.PendingIntent.flags> instead.
  			 */
  def setFlags(flags: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 * @deprecated Set the value using <Titanium.Android.PendingIntent.intent> instead.
  			 */
  def setIntent(intent: Intent): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 * @deprecated Set the value using <Titanium.Android.PendingIntent.updateCurrentIntent> instead.
  			 */
  def setUpdateCurrentIntent(updateCurrentIntent: Boolean): Unit = js.native
}

