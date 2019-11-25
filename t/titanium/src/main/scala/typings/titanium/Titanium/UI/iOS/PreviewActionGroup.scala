package typings.titanium.Titanium.UI.iOS

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
			 * feature "Peek and Pop".
			 */
trait PreviewActionGroup extends Proxy {
  /**
  				 * The preview actions assigned to this preview action group.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The style of the action group.
  				 */
  var style: Double
  /**
  				 * The title of the action group.
  				 */
  var title: String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def getStyle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def setStyle(style: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def setTitle(title: String): Unit
}

object PreviewActionGroup {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getActions: () => js.Array[PreviewAction],
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getStyle: () => Double,
    getTitle: () => String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setActions: js.Array[PreviewAction] => Unit,
    setBubbleParent: Boolean => Unit,
    setStyle: Double => Unit,
    setTitle: String => Unit,
    style: Double,
    title: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PreviewActionGroup = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getActions = js.Any.fromFunction0(getActions), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getStyle = js.Any.fromFunction0(getStyle), getTitle = js.Any.fromFunction0(getTitle), removeEventListener = js.Any.fromFunction2(removeEventListener), setActions = js.Any.fromFunction1(setActions), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setStyle = js.Any.fromFunction1(setStyle), setTitle = js.Any.fromFunction1(setTitle), style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionGroup]
  }
}

