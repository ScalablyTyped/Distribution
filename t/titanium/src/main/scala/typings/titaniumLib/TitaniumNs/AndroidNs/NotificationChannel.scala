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

object NotificationChannel {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    bypassDnd: scala.Boolean,
    description: java.lang.String,
    enableLights: scala.Boolean,
    enableVibration: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getBypassDnd: js.Function0[scala.Boolean],
    getDescription: js.Function0[java.lang.String],
    getEnableLights: js.Function0[scala.Boolean],
    getEnableVibration: js.Function0[scala.Boolean],
    getGroupId: js.Function0[java.lang.String],
    getId: js.Function0[java.lang.String],
    getImportance: js.Function0[scala.Double],
    getLightColor: js.Function0[scala.Double],
    getLockscreenVisibility: js.Function0[scala.Double],
    getShowBadge: js.Function0[scala.Boolean],
    getVibratePattern: js.Function0[js.Array[scala.Double]],
    groupId: java.lang.String,
    id: java.lang.String,
    importance: scala.Double,
    lightColor: scala.Double,
    lockscreenVisibility: scala.Double,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setBypassDnd: js.Function1[scala.Boolean, scala.Unit],
    setDescription: js.Function1[java.lang.String, scala.Unit],
    setEnableLights: js.Function1[scala.Boolean, scala.Unit],
    setEnableVibration: js.Function1[scala.Boolean, scala.Unit],
    setGroupId: js.Function1[java.lang.String, scala.Unit],
    setId: js.Function1[java.lang.String, scala.Unit],
    setImportance: js.Function1[scala.Double, scala.Unit],
    setLightColor: js.Function1[scala.Double, scala.Unit],
    setLockscreenVisibility: js.Function1[scala.Double, scala.Unit],
    setShowBadge: js.Function1[scala.Boolean, scala.Unit],
    setVibratePattern: js.Function1[js.Array[scala.Double], scala.Unit],
    showBadge: scala.Boolean,
    vibratePattern: js.Array[scala.Double],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): NotificationChannel = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, bypassDnd = bypassDnd, description = description, enableLights = enableLights, enableVibration = enableVibration, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getBypassDnd = getBypassDnd, getDescription = getDescription, getEnableLights = getEnableLights, getEnableVibration = getEnableVibration, getGroupId = getGroupId, getId = getId, getImportance = getImportance, getLightColor = getLightColor, getLockscreenVisibility = getLockscreenVisibility, getShowBadge = getShowBadge, getVibratePattern = getVibratePattern, groupId = groupId, id = id, importance = importance, lightColor = lightColor, lockscreenVisibility = lockscreenVisibility, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setBypassDnd = setBypassDnd, setDescription = setDescription, setEnableLights = setEnableLights, setEnableVibration = setEnableVibration, setGroupId = setGroupId, setId = setId, setImportance = setImportance, setLightColor = setLightColor, setLockscreenVisibility = setLockscreenVisibility, setShowBadge = setShowBadge, setVibratePattern = setVibratePattern, showBadge = showBadge, vibratePattern = vibratePattern)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[NotificationChannel]
  }
}

