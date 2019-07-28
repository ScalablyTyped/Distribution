package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewAction provides options to configure actions used by the iOS 9 3D-Touch "Peek and Pop"
			 * feature.
			 */
trait PreviewAction extends Proxy {
  /**
  				 * The style of the action.
  				 */
  var style: Double
  /**
  				 * The title of the action.
  				 */
  var title: String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 */
  def getStyle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 */
  def setStyle(style: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 */
  def setTitle(title: String): Unit
}

object PreviewAction {
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
    getTitle: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setStyle: Double => Unit,
    setTitle: String => Unit,
    style: Double,
    title: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PreviewAction = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getStyle = js.Any.fromFunction0(getStyle), getTitle = js.Any.fromFunction0(getTitle), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), style = style, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewAction]
  }
}

