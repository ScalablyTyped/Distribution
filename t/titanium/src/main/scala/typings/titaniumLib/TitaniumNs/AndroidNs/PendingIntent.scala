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

object PendingIntent {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    flags: scala.Double,
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getFlags: js.Function0[scala.Double],
    getIntent: js.Function0[Intent],
    getUpdateCurrentIntent: js.Function0[scala.Boolean],
    intent: Intent,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setFlags: js.Function1[scala.Double, scala.Unit],
    setIntent: js.Function1[Intent, scala.Unit],
    setUpdateCurrentIntent: js.Function1[scala.Boolean, scala.Unit],
    updateCurrentIntent: scala.Boolean,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PendingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getFlags")(getFlags)
    __obj.updateDynamic("getIntent")(getIntent)
    __obj.updateDynamic("getUpdateCurrentIntent")(getUpdateCurrentIntent)
    __obj.updateDynamic("intent")(intent)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setFlags")(setFlags)
    __obj.updateDynamic("setIntent")(setIntent)
    __obj.updateDynamic("setUpdateCurrentIntent")(setUpdateCurrentIntent)
    __obj.updateDynamic("updateCurrentIntent")(updateCurrentIntent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PendingIntent]
  }
}

