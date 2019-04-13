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
  			 * A URL to the sound to play.
  			 */
  var sound: java.lang.String
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
  			 * Gets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def getSound(): java.lang.String
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
  			 * Sets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def setSound(sound: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def setVibratePattern(vibratePattern: js.Array[scala.Double]): scala.Unit
}

object NotificationChannel {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    bypassDnd: scala.Boolean,
    description: java.lang.String,
    enableLights: scala.Boolean,
    enableVibration: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getBypassDnd: () => scala.Boolean,
    getDescription: () => java.lang.String,
    getEnableLights: () => scala.Boolean,
    getEnableVibration: () => scala.Boolean,
    getGroupId: () => java.lang.String,
    getId: () => java.lang.String,
    getImportance: () => scala.Double,
    getLightColor: () => scala.Double,
    getLockscreenVisibility: () => scala.Double,
    getShowBadge: () => scala.Boolean,
    getSound: () => java.lang.String,
    getVibratePattern: () => js.Array[scala.Double],
    groupId: java.lang.String,
    id: java.lang.String,
    importance: scala.Double,
    lightColor: scala.Double,
    lockscreenVisibility: scala.Double,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setBypassDnd: scala.Boolean => scala.Unit,
    setDescription: java.lang.String => scala.Unit,
    setEnableLights: scala.Boolean => scala.Unit,
    setEnableVibration: scala.Boolean => scala.Unit,
    setGroupId: java.lang.String => scala.Unit,
    setId: java.lang.String => scala.Unit,
    setImportance: scala.Double => scala.Unit,
    setLightColor: scala.Double => scala.Unit,
    setLockscreenVisibility: scala.Double => scala.Unit,
    setShowBadge: scala.Boolean => scala.Unit,
    setSound: java.lang.String => scala.Unit,
    setVibratePattern: js.Array[scala.Double] => scala.Unit,
    showBadge: scala.Boolean,
    sound: java.lang.String,
    vibratePattern: js.Array[scala.Double],
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): NotificationChannel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, bypassDnd = bypassDnd, description = description, enableLights = enableLights, enableVibration = enableVibration, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getBypassDnd = js.Any.fromFunction0(getBypassDnd), getDescription = js.Any.fromFunction0(getDescription), getEnableLights = js.Any.fromFunction0(getEnableLights), getEnableVibration = js.Any.fromFunction0(getEnableVibration), getGroupId = js.Any.fromFunction0(getGroupId), getId = js.Any.fromFunction0(getId), getImportance = js.Any.fromFunction0(getImportance), getLightColor = js.Any.fromFunction0(getLightColor), getLockscreenVisibility = js.Any.fromFunction0(getLockscreenVisibility), getShowBadge = js.Any.fromFunction0(getShowBadge), getSound = js.Any.fromFunction0(getSound), getVibratePattern = js.Any.fromFunction0(getVibratePattern), groupId = groupId, id = id, importance = importance, lightColor = lightColor, lockscreenVisibility = lockscreenVisibility, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setBypassDnd = js.Any.fromFunction1(setBypassDnd), setDescription = js.Any.fromFunction1(setDescription), setEnableLights = js.Any.fromFunction1(setEnableLights), setEnableVibration = js.Any.fromFunction1(setEnableVibration), setGroupId = js.Any.fromFunction1(setGroupId), setId = js.Any.fromFunction1(setId), setImportance = js.Any.fromFunction1(setImportance), setLightColor = js.Any.fromFunction1(setLightColor), setLockscreenVisibility = js.Any.fromFunction1(setLockscreenVisibility), setShowBadge = js.Any.fromFunction1(setShowBadge), setSound = js.Any.fromFunction1(setSound), setVibratePattern = js.Any.fromFunction1(setVibratePattern), showBadge = showBadge, sound = sound, vibratePattern = vibratePattern)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[NotificationChannel]
  }
}

