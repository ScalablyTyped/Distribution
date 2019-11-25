package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * The feedback generator API is introduced in iOS 10 to handle the haptic feedback when using an iPhone 7 or
			 * later devices.
			 */
trait FeedbackGenerator extends Proxy {
  /**
  				 * The style of the feedback generator you want to create. This property is only required when using <Titanium.UI.iOS.FEEDBACK_GENERATOR_TYPE_IMPACT>.
  				 */
  var style: js.UndefOr[Double] = js.undefined
  /**
  				 * The type of feedback generator you want to create.
  				 */
  var `type`: Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def getStyle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def getType(): Double
  /**
  				 * Used to trigger a haptic feedback after an impact occurred.
  				 */
  def impactOccurred(): Unit
  /**
  				 * Used to trigger a haptic feedback after a notification has been received.
  				 */
  def notificationOccurred(notificationType: Double): Unit
  /**
  				 * Used to prepare the haptic sensor for the upcoming interaction with it.
  				 */
  def prepare(): Unit
  /**
  				 * Used to trigger a haptic feedback after a selection has been made.
  				 */
  def selectionChanged(): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.style> property.
  				 */
  def setStyle(style: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.FeedbackGenerator.type> property.
  				 */
  def setType(`type`: Double): Unit
}

object FeedbackGenerator {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getStyle: () => Double,
    getType: () => Double,
    impactOccurred: () => Unit,
    notificationOccurred: Double => Unit,
    prepare: () => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    selectionChanged: () => Unit,
    setBubbleParent: Boolean => Unit,
    setStyle: Double => Unit,
    setType: Double => Unit,
    `type`: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null,
    style: Int | Double = null
  ): FeedbackGenerator = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getStyle = js.Any.fromFunction0(getStyle), getType = js.Any.fromFunction0(getType), impactOccurred = js.Any.fromFunction0(impactOccurred), notificationOccurred = js.Any.fromFunction1(notificationOccurred), prepare = js.Any.fromFunction0(prepare), removeEventListener = js.Any.fromFunction2(removeEventListener), selectionChanged = js.Any.fromFunction0(selectionChanged), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setStyle = js.Any.fromFunction1(setStyle), setType = js.Any.fromFunction1(setType))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackGenerator]
  }
}

