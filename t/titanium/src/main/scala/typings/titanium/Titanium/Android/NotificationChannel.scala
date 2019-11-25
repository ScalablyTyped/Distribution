package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Module for notification channels.
		 */
trait NotificationChannel extends Proxy {
  /**
  			 * Whether or not notifications posted to this channel can interrupt the user.
  			 */
  var bypassDnd: Boolean
  /**
  			 * User visible description of this channel.
  			 */
  var description: String
  /**
  			 * Whether notifications posted to this channel should display notification lights
  			 */
  var enableLights: Boolean
  /**
  			 * Whether notification posted to this channel should vibrate.
  			 */
  var enableVibration: Boolean
  /**
  			 * Group id this channel belongs to.
  			 */
  var groupId: String
  /**
  			 * The channel id specified for the notification channel.
  			 */
  var id: String
  /**
  			 * The audio stream type to use when playing the sound.
  			 */
  var importance: Double
  /**
  			 * The notification light color for notifications posted to this channel.
  			 */
  var lightColor: Double
  /**
  			 * Whether or not notifications posted to this channel are shown on the lockscreen in full or redacted form.
  			 */
  var lockscreenVisibility: Double
  /**
  			 * Whether notifications posted to this channel can appear as application icon badges in a Launcher.
  			 */
  var showBadge: Boolean
  /**
  			 * A URL to the sound to play.
  			 */
  var sound: String
  /**
  			 * The vibration pattern for notifications posted to this channel.
  			 */
  var vibratePattern: js.Array[Double]
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def getBypassDnd(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def getDescription(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def getEnableLights(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def getEnableVibration(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def getGroupId(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def getId(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def getImportance(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def getLightColor(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def getLockscreenVisibility(): Double
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def getShowBadge(): Boolean
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def getSound(): String
  /**
  			 * Gets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def getVibratePattern(): js.Array[Double]
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.bypassDnd> property.
  			 */
  def setBypassDnd(bypassDnd: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.description> property.
  			 */
  def setDescription(description: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableLights> property.
  			 */
  def setEnableLights(enableLights: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.enableVibration> property.
  			 */
  def setEnableVibration(enableVibration: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.groupId> property.
  			 */
  def setGroupId(groupId: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.id> property.
  			 */
  def setId(id: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.importance> property.
  			 */
  def setImportance(importance: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lightColor> property.
  			 */
  def setLightColor(lightColor: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.lockscreenVisibility> property.
  			 */
  def setLockscreenVisibility(lockscreenVisibility: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.showBadge> property.
  			 */
  def setShowBadge(showBadge: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.sound> property.
  			 */
  def setSound(sound: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.NotificationChannel.vibratePattern> property.
  			 */
  def setVibratePattern(vibratePattern: js.Array[Double]): Unit
}

object NotificationChannel {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    bypassDnd: Boolean,
    description: String,
    enableLights: Boolean,
    enableVibration: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getBypassDnd: () => Boolean,
    getDescription: () => String,
    getEnableLights: () => Boolean,
    getEnableVibration: () => Boolean,
    getGroupId: () => String,
    getId: () => String,
    getImportance: () => Double,
    getLightColor: () => Double,
    getLockscreenVisibility: () => Double,
    getShowBadge: () => Boolean,
    getSound: () => String,
    getVibratePattern: () => js.Array[Double],
    groupId: String,
    id: String,
    importance: Double,
    lightColor: Double,
    lockscreenVisibility: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setBypassDnd: Boolean => Unit,
    setDescription: String => Unit,
    setEnableLights: Boolean => Unit,
    setEnableVibration: Boolean => Unit,
    setGroupId: String => Unit,
    setId: String => Unit,
    setImportance: Double => Unit,
    setLightColor: Double => Unit,
    setLockscreenVisibility: Double => Unit,
    setShowBadge: Boolean => Unit,
    setSound: String => Unit,
    setVibratePattern: js.Array[Double] => Unit,
    showBadge: Boolean,
    sound: String,
    vibratePattern: js.Array[Double],
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): NotificationChannel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], bypassDnd = bypassDnd.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enableLights = enableLights.asInstanceOf[js.Any], enableVibration = enableVibration.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getBypassDnd = js.Any.fromFunction0(getBypassDnd), getDescription = js.Any.fromFunction0(getDescription), getEnableLights = js.Any.fromFunction0(getEnableLights), getEnableVibration = js.Any.fromFunction0(getEnableVibration), getGroupId = js.Any.fromFunction0(getGroupId), getId = js.Any.fromFunction0(getId), getImportance = js.Any.fromFunction0(getImportance), getLightColor = js.Any.fromFunction0(getLightColor), getLockscreenVisibility = js.Any.fromFunction0(getLockscreenVisibility), getShowBadge = js.Any.fromFunction0(getShowBadge), getSound = js.Any.fromFunction0(getSound), getVibratePattern = js.Any.fromFunction0(getVibratePattern), groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], lockscreenVisibility = lockscreenVisibility.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setBypassDnd = js.Any.fromFunction1(setBypassDnd), setDescription = js.Any.fromFunction1(setDescription), setEnableLights = js.Any.fromFunction1(setEnableLights), setEnableVibration = js.Any.fromFunction1(setEnableVibration), setGroupId = js.Any.fromFunction1(setGroupId), setId = js.Any.fromFunction1(setId), setImportance = js.Any.fromFunction1(setImportance), setLightColor = js.Any.fromFunction1(setLightColor), setLockscreenVisibility = js.Any.fromFunction1(setLockscreenVisibility), setShowBadge = js.Any.fromFunction1(setShowBadge), setSound = js.Any.fromFunction1(setSound), setVibratePattern = js.Any.fromFunction1(setVibratePattern), showBadge = showBadge.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], vibratePattern = vibratePattern.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
}

