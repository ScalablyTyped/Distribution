package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Module for notification channels.
		 */
@JSGlobal("Titanium.Android.NotificationChannel")
@js.native
class NotificationChannel () extends Proxy {
  /**
  			 * Whether or not notifications posted to this channel can interrupt the user.
  			 */
  var bypassDnd: Boolean = js.native
  /**
  			 * User visible description of this channel.
  			 */
  var description: String = js.native
  /**
  			 * Whether notifications posted to this channel should display notification lights
  			 */
  var enableLights: Boolean = js.native
  /**
  			 * Whether notification posted to this channel should vibrate.
  			 */
  var enableVibration: Boolean = js.native
  /**
  			 * Group id this channel belongs to.
  			 */
  var groupId: String = js.native
  /**
  			 * The channel id specified for the notification channel.
  			 */
  @JSName("id")
  var id_NotificationChannel: String = js.native
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var importance: Double = js.native
  /**
  			 * The notification light color for notifications posted to this channel.
  			 */
  var lightColor: Double = js.native
  /**
  			 * Whether or not notifications posted to this channel are shown on the lockscreen in full or redacted form.
  			 */
  var lockscreenVisibility: Double = js.native
  /**
  			 * Whether notifications posted to this channel can appear as application icon badges in a Launcher.
  			 */
  var showBadge: Boolean = js.native
  /**
  			 * A URL to the sound to play.
  			 */
  var sound: String = js.native
  /**
  			 * The vibration pattern for notifications posted to this channel.
  			 */
  var vibratePattern: js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.bypassDnd> instead.
  			 */
  def getBypassDnd(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.description> instead.
  			 */
  def getDescription(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.enableLights> instead.
  			 */
  def getEnableLights(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.enableVibration> instead.
  			 */
  def getEnableVibration(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.groupId> instead.
  			 */
  def getGroupId(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.id> instead.
  			 */
  def getId(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.importance> instead.
  			 */
  def getImportance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.lightColor> instead.
  			 */
  def getLightColor(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.lockscreenVisibility> instead.
  			 */
  def getLockscreenVisibility(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.showBadge> instead.
  			 */
  def getShowBadge(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.sound> instead.
  			 */
  def getSound(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 * @deprecated Access <Titanium.Android.NotificationChannel.vibratePattern> instead.
  			 */
  def getVibratePattern(): js.Array[Double] = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.bypassDnd> instead.
  			 */
  def setBypassDnd(bypassDnd: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.description> instead.
  			 */
  def setDescription(description: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.enableLights> instead.
  			 */
  def setEnableLights(enableLights: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.enableVibration> instead.
  			 */
  def setEnableVibration(enableVibration: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.groupId> instead.
  			 */
  def setGroupId(groupId: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.id> instead.
  			 */
  def setId(id: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.importance> instead.
  			 */
  def setImportance(importance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.lightColor> instead.
  			 */
  def setLightColor(lightColor: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.lockscreenVisibility> instead.
  			 */
  def setLockscreenVisibility(lockscreenVisibility: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.showBadge> instead.
  			 */
  def setShowBadge(showBadge: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.sound> instead.
  			 */
  def setSound(sound: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 * @deprecated Set the value using <Titanium.Android.NotificationChannel.vibratePattern> instead.
  			 */
  def setVibratePattern(vibratePattern: js.Array[Double]): Unit = js.native
}

