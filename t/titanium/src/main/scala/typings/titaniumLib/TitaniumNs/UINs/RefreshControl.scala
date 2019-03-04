package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The RefreshControl is a representation of the native iOS
		 * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
		 * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
		 */
trait RefreshControl
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The tint color for the refresh control, as a color name or hex triplet.
  			 */
  var tintColor: java.lang.String
  /**
  			 * The attributed title of the control.
  			 */
  var title: AttributedString
  /**
  			 * Tells the control that a refresh operation was started programmatically.
  			 */
  def beginRefreshing(): scala.Unit
  /**
  			 * Tells the control that a refresh operation has ended.
  			 */
  def endRefreshing(): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def getTintColor(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def getTitle(): AttributedString
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def setTintColor(tintColor: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def setTitle(title: AttributedString): scala.Unit
}

object RefreshControl {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    beginRefreshing: js.Function0[scala.Unit],
    bubbleParent: scala.Boolean,
    endRefreshing: js.Function0[scala.Unit],
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getTintColor: js.Function0[java.lang.String],
    getTitle: js.Function0[AttributedString],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setTintColor: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[AttributedString, scala.Unit],
    tintColor: java.lang.String,
    title: AttributedString,
    getLifecycleContainer: js.Function0[Window | TabGroup] = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): RefreshControl = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, beginRefreshing = beginRefreshing, bubbleParent = bubbleParent, endRefreshing = endRefreshing, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getTintColor = getTintColor, getTitle = getTitle, removeEventListener = removeEventListener, setBubbleParent = setBubbleParent, setTintColor = setTintColor, setTitle = setTitle, tintColor = tintColor, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[RefreshControl]
  }
}

