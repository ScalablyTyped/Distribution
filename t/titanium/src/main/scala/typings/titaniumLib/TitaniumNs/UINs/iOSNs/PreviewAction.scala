package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewAction provides options to configure actions used by the iOS 9 3D-Touch "Peek and Pop"
			 * feature.
			 */
trait PreviewAction
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The style of the action.
  				 */
  var style: scala.Double
  /**
  				 * The title of the action.
  				 */
  var title: java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 */
  def getStyle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.style> property.
  				 */
  def setStyle(style: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewAction.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit
}

object PreviewAction {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getStyle: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setStyle: js.Function1[scala.Double, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    style: scala.Double,
    title: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PreviewAction = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getStyle = getStyle, getTitle = getTitle, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setStyle = setStyle, setTitle = setTitle, style = style, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewAction]
  }
}

