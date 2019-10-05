package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The RefreshControl is a representation of the native iOS
		 * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
		 * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
		 */
trait RefreshControl extends Proxy {
  /**
  			 * The tint color for the refresh control, as a color name or hex triplet.
  			 */
  var tintColor: String
  /**
  			 * The attributed title of the control.
  			 */
  var title: AttributedString
  /**
  			 * Tells the control that a refresh operation was started programmatically.
  			 */
  def beginRefreshing(): Unit
  /**
  			 * Tells the control that a refresh operation has ended.
  			 */
  def endRefreshing(): Unit
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def getTintColor(): String
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def getTitle(): AttributedString
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def setTintColor(tintColor: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def setTitle(title: AttributedString): Unit
}

object RefreshControl {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    beginRefreshing: () => Unit,
    bubbleParent: Boolean,
    endRefreshing: () => Unit,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getTintColor: () => String,
    getTitle: () => AttributedString,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBubbleParent: Boolean => Unit,
    setTintColor: String => Unit,
    setTitle: AttributedString => Unit,
    tintColor: String,
    title: AttributedString,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RefreshControl = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), beginRefreshing = js.Any.fromFunction0(beginRefreshing), bubbleParent = bubbleParent, endRefreshing = js.Any.fromFunction0(endRefreshing), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getTintColor = js.Any.fromFunction0(getTintColor), getTitle = js.Any.fromFunction0(getTitle), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setTintColor = js.Any.fromFunction1(setTintColor), setTitle = js.Any.fromFunction1(setTitle), tintColor = tintColor, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[RefreshControl]
  }
}

