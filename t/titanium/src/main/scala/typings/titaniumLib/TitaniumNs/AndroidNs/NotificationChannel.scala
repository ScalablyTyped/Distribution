package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Module for notification channels.
		 */
trait NotificationChannel
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Whether or not notifications posted to this channel can interrupt the user.
  			 */
  var bypassDnd: scala.Boolean
  /**
  			 * User visible description of this channel.
  			 */
  var description: java.lang.String
  /**
  			 * Whether notifications posted to this channel should display notification lights
  			 */
  var enableLights: scala.Boolean
  /**
  			 * Whether notification posted to this channel should vibrate.
  			 */
  var enableVibration: scala.Boolean
  /**
  			 * Group id this channel belongs to.
  			 */
  var groupId: java.lang.String
  /**
  			 * The channel id specified for the notification channel.
  			 */
  var id: java.lang.String
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var importance: scala.Double
  /**
  			 * The notification light color for notifications posted to this channel.
  			 */
  var lightColor: scala.Double
  /**
  			 * Whether or not notifications posted to this channel are shown on the lockscreen in full or redacted form.
  			 */
  var lockscreenVisibility: scala.Double
  /**
  			 * Whether notifications posted to this channel can appear as application icon badges in a Launcher.
  			 */
  var showBadge: scala.Boolean
  /**
  			 * The vibration pattern for notifications posted to this channel.
  			 */
  var vibratePattern: js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def getBypassDnd(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def getDescription(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def getEnableLights(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def getEnableVibration(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def getGroupId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def getId(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def getImportance(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def getLightColor(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def getLockscreenVisibility(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def getShowBadge(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def getVibratePattern(): js.Array[scala.Double]
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def setBypassDnd(bypassDnd: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def setDescription(description: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def setEnableLights(enableLights: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def setEnableVibration(enableVibration: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def setGroupId(groupId: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def setId(id: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def setImportance(importance: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def setLightColor(lightColor: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def setLockscreenVisibility(lockscreenVisibility: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def setShowBadge(showBadge: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def setVibratePattern(vibratePattern: js.Array[scala.Double]): scala.Unit
}

