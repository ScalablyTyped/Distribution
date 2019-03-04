package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
			 * feature "Peek and Pop".
			 */
trait PreviewActionGroup
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The preview actions assigned to this preview action group.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The style of the action group.
  				 */
  var style: scala.Double
  /**
  				 * The title of the action group.
  				 */
  var title: java.lang.String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def getStyle(): scala.Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def getTitle(): java.lang.String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def setStyle(style: scala.Double): scala.Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def setTitle(title: java.lang.String): scala.Unit
}

object PreviewActionGroup {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getActions: js.Function0[js.Array[PreviewAction]],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getStyle: js.Function0[scala.Double],
    getTitle: js.Function0[java.lang.String],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setActions: js.Function1[js.Array[PreviewAction], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setStyle: js.Function1[scala.Double, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    style: scala.Double,
    title: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): PreviewActionGroup = {
    val __obj = js.Dynamic.literal(actions = actions, addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, fireEvent = fireEvent, getActions = getActions, getApiName = getApiName, getBubbleParent = getBubbleParent, getStyle = getStyle, getTitle = getTitle, removeEventListener = removeEventListener, setActions = setActions, setBubbleParent = setBubbleParent, setStyle = setStyle, setTitle = setTitle, style = style, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[PreviewActionGroup]
  }
}

