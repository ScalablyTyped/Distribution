package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
			 * later devices.
			 */
trait FeedbackGenerator
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def getType(): scala.Double
  /**
  				 * Used to trigger a haptic feedback after an impact occurred.
  				 */
  def impactOccurred(): scala.Unit
  /**
  				 * Used to trigger a haptic feedback after a notification has been received.
  				 */
  def notificationOccurred(notificationType: scala.Double): scala.Unit
  /**
  				 * Used to prepare the haptic sensor for the upcoming interaction with it.
  				 */
  def prepare(): scala.Unit
  /**
  				 * Used to trigger a haptic feedback after a selection has been made.
  				 */
  def selectionChanged(): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
}

object FeedbackGenerator {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getType: js.Function0[scala.Double],
    impactOccurred: js.Function0[scala.Unit],
    notificationOccurred: js.Function1[scala.Double, scala.Unit],
    prepare: js.Function0[scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    selectionChanged: js.Function0[scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit],
    `type`: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): FeedbackGenerator = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getType = getType, impactOccurred = impactOccurred, notificationOccurred = notificationOccurred, prepare = prepare, removeEventListener = removeEventListener, selectionChanged = selectionChanged, setBubbleParent = setBubbleParent, setType = setType)
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[FeedbackGenerator]
  }
}

