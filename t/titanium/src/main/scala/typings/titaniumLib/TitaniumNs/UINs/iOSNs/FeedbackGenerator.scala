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
  				 * The style of the feedback generator you want to create. This property is only required when using <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  				 */
  var style: js.UndefOr[scala.Double] = js.undefined
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def getStyle(): scala.Double
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
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def setStyle(style: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def setType(`type`: scala.Double): scala.Unit
}

object FeedbackGenerator {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getStyle: () => scala.Double,
    getType: () => scala.Double,
    impactOccurred: () => scala.Unit,
    notificationOccurred: scala.Double => scala.Unit,
    prepare: () => scala.Unit,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    selectionChanged: () => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setStyle: scala.Double => scala.Unit,
    setType: scala.Double => scala.Unit,
    `type`: scala.Double,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null,
    style: scala.Int | scala.Double = null
  ): FeedbackGenerator = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getStyle = js.Any.fromFunction0(getStyle), getType = js.Any.fromFunction0(getType), impactOccurred = js.Any.fromFunction0(impactOccurred), notificationOccurred = js.Any.fromFunction1(notificationOccurred), prepare = js.Any.fromFunction0(prepare), removeEventListener = js.Any.fromFunction2(removeEventListener), selectionChanged = js.Any.fromFunction0(selectionChanged), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setStyle = js.Any.fromFunction1(setStyle), setType = js.Any.fromFunction1(setType))
    __obj.updateDynamic("type")(`type`)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackGenerator]
  }
}

