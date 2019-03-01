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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    contentHeight: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getActions: js.Function0[js.Array[PreviewAction]],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getContentHeight: js.Function0[scala.Double],
    getPreview: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    preview: titaniumLib.TitaniumNs.UINs.View,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setActions: js.Function1[js.Array[PreviewAction], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setContentHeight: js.Function1[scala.Double, scala.Unit],
    setPreview: js.Function1[js.Any, scala.Unit],
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PreviewContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("apiName")(apiName)
    __obj.updateDynamic("applyProperties")(applyProperties)
    __obj.updateDynamic("bubbleParent")(bubbleParent)
    __obj.updateDynamic("contentHeight")(contentHeight)
    __obj.updateDynamic("fireEvent")(fireEvent)
    __obj.updateDynamic("getActions")(getActions)
    __obj.updateDynamic("getApiName")(getApiName)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent)
    __obj.updateDynamic("getContentHeight")(getContentHeight)
    __obj.updateDynamic("getPreview")(getPreview)
    __obj.updateDynamic("preview")(preview)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setActions")(setActions)
    __obj.updateDynamic("setBubbleParent")(setBubbleParent)
    __obj.updateDynamic("setContentHeight")(setContentHeight)
    __obj.updateDynamic("setPreview")(setPreview)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewContext]
  }
}

