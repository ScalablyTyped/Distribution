package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
			 */
trait PreviewContext
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The preview actions and preview action groups.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The height of the preview.
  				 */
  var contentHeight: scala.Double
  /**
  				 * The preview view.
  				 */
  var preview: titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def getContentHeight(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def getPreview(): titaniumLib.TitaniumNs.UINs.View
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def setContentHeight(contentHeight: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def setPreview(preview: js.Any): scala.Unit
}

object PreviewContext {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    contentHeight: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getActions: () => js.Array[PreviewAction],
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getContentHeight: () => scala.Double,
    getPreview: () => titaniumLib.TitaniumNs.UINs.View,
    preview: titaniumLib.TitaniumNs.UINs.View,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setActions: js.Array[PreviewAction] => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setContentHeight: scala.Double => scala.Unit,
    setPreview: js.Any => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PreviewContext = {
    val __obj = js.Dynamic.literal(actions = actions, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, contentHeight = contentHeight, fireEvent = js.Any.fromFunction2(fireEvent), getActions = js.Any.fromFunction0(getActions), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getContentHeight = js.Any.fromFunction0(getContentHeight), getPreview = js.Any.fromFunction0(getPreview), preview = preview, removeEventListener = js.Any.fromFunction2(removeEventListener), setActions = js.Any.fromFunction1(setActions), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setContentHeight = js.Any.fromFunction1(setContentHeight), setPreview = js.Any.fromFunction1(setPreview))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewContext]
  }
}

