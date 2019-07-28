package typings.titanium.TitaniumNs.UINs.iOSNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.View
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
			 */
trait PreviewContext extends Proxy {
  /**
  				 * The preview actions and preview action groups.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The height of the preview.
  				 */
  var contentHeight: Double
  /**
  				 * The preview view.
  				 */
  var preview: View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def getContentHeight(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def getPreview(): View
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def setContentHeight(contentHeight: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def setPreview(preview: js.Any): Unit
}

object PreviewContext {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    contentHeight: Double,
    fireEvent: (String, js.Any) => Unit,
    getActions: () => js.Array[PreviewAction],
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getContentHeight: () => Double,
    getPreview: () => View,
    preview: View,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setActions: js.Array[PreviewAction] => Unit,
    setBubbleParent: Boolean => Unit,
    setContentHeight: Double => Unit,
    setPreview: js.Any => Unit,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PreviewContext = {
    val __obj = js.Dynamic.literal(actions = actions, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, contentHeight = contentHeight, fireEvent = js.Any.fromFunction2(fireEvent), getActions = js.Any.fromFunction0(getActions), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getContentHeight = js.Any.fromFunction0(getContentHeight), getPreview = js.Any.fromFunction0(getPreview), preview = preview, removeEventListener = js.Any.fromFunction2(removeEventListener), setActions = js.Any.fromFunction1(setActions), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setContentHeight = js.Any.fromFunction1(setContentHeight), setPreview = js.Any.fromFunction1(setPreview))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewContext]
  }
}

