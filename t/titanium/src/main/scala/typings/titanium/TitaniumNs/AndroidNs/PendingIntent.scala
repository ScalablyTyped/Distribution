package typings.titanium.TitaniumNs.AndroidNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of an Android `PendingIntent`.
		 */
trait PendingIntent extends Proxy {
  /**
  			 * Flags used for creating the Pending Intent.
  			 */
  var flags: Double
  /**
  			 * The intent data to pass to the [Activity](Titanium.Android.Activity) launched by this `PendingIntent`.
  			 */
  var intent: Intent
  /**
  			 * If this property is true, flag <Titanium.Android.FLAG_UPDATE_CURRENT> will be
  			 * appended to `flags` automatically. Default value is true.
  			 */
  var updateCurrentIntent: Boolean
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def getFlags(): Double
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def getIntent(): Intent
  /**
  			 * Gets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def getUpdateCurrentIntent(): Boolean
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.flags> property.
  			 */
  def setFlags(flags: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.intent> property.
  			 */
  def setIntent(intent: Intent): Unit
  /**
  			 * Sets the value of the <Titanium.Android.PendingIntent.updateCurrentIntent> property.
  			 */
  def setUpdateCurrentIntent(updateCurrentIntent: Boolean): Unit
}

object PendingIntent {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    flags: Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getFlags: () => Double,
    getIntent: () => Intent,
    getUpdateCurrentIntent: () => Boolean,
    intent: Intent,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setFlags: Double => Unit,
    setIntent: Intent => Unit,
    setUpdateCurrentIntent: Boolean => Unit,
    updateCurrentIntent: Boolean,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PendingIntent = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), flags = flags, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getFlags = js.Any.fromFunction0(getFlags), getIntent = js.Any.fromFunction0(getIntent), getUpdateCurrentIntent = js.Any.fromFunction0(getUpdateCurrentIntent), intent = intent, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setFlags = js.Any.fromFunction1(setFlags), setIntent = js.Any.fromFunction1(setIntent), setUpdateCurrentIntent = js.Any.fromFunction1(setUpdateCurrentIntent), updateCurrentIntent = updateCurrentIntent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PendingIntent]
  }
}

