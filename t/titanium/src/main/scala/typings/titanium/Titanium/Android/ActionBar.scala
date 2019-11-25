package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.View
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An action bar is a window feature that identifies the application and user location,
		 * and provides user actions and navigation modes.
		 */
trait ActionBar extends Proxy {
  /**
  			 * The background image for the action bar, specified as a local file path or URL.
  			 */
  var backgroundImage: String
  /**
  			 * Sets a view to be used for a custom navigation mode.
  			 */
  var customView: View
  /**
  			 * Displays an "up" affordance on the "home" area of the action bar.
  			 */
  var displayHomeAsUp: Boolean
  /**
  			 * Enable or disable the "home" button in the corner of the action bar.
  			 */
  var homeButtonEnabled: Boolean
  /**
  			 * Sets the application icon displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var icon: String
  /**
  			 * Sets the application logo displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var logo: String
  /**
  			 * Controls the navigation mode.
  			 */
  var navigationMode: Double
  /**
  			 * Sets the subtitle of the action bar.
  			 */
  var subtitle: String
  /**
  			 * Sets the title of the action bar.
  			 */
  var title: String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def getCustomView(): View
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def getNavigationMode(): Double
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def getSubtitle(): String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def getTitle(): String
  /**
  			 * Hides the action bar if it is currently showing.
  			 */
  def hide(): Unit
  /**
  			 * Callback function called when the home icon is clicked.
  			 */
  def onHomeIconItemSelected(): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.backgroundImage> property.
  			 */
  def setBackgroundImage(backgroundImage: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def setCustomView(customView: js.Any): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.displayHomeAsUp> property.
  			 */
  def setDisplayHomeAsUp(displayHomeAsUp: Boolean): Unit
  /**
  			 * Shows or hides the action bar home icon
  			 */
  def setDisplayShowHomeEnabled(show: Boolean): Unit
  /**
  			 * Shows or hides the action bar title/subtitle
  			 */
  def setDisplayShowTitleEnabled(show: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.homeButtonEnabled> property.
  			 */
  def setHomeButtonEnabled(homeButtonEnabled: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.icon> property.
  			 */
  def setIcon(icon: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.logo> property.
  			 */
  def setLogo(logo: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def setNavigationMode(navigationMode: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.onHomeIconItemSelected> property.
  			 */
  def setOnHomeIconItemSelected(onHomeIconItemSelected: js.Function0[_]): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def setSubtitle(subtitle: String): Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def setTitle(title: String): Unit
  /**
  			 * Shows the action bar if it is currently hidden.
  			 */
  def show(): Unit
}

object ActionBar {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    backgroundImage: String,
    bubbleParent: Boolean,
    customView: View,
    displayHomeAsUp: Boolean,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getCustomView: () => View,
    getNavigationMode: () => Double,
    getSubtitle: () => String,
    getTitle: () => String,
    hide: () => Unit,
    homeButtonEnabled: Boolean,
    icon: String,
    logo: String,
    navigationMode: Double,
    onHomeIconItemSelected: () => js.Any,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    setBackgroundImage: String => Unit,
    setBubbleParent: Boolean => Unit,
    setCustomView: js.Any => Unit,
    setDisplayHomeAsUp: Boolean => Unit,
    setDisplayShowHomeEnabled: Boolean => Unit,
    setDisplayShowTitleEnabled: Boolean => Unit,
    setHomeButtonEnabled: Boolean => Unit,
    setIcon: String => Unit,
    setLogo: String => Unit,
    setNavigationMode: Double => Unit,
    setOnHomeIconItemSelected: js.Function0[_] => Unit,
    setSubtitle: String => Unit,
    setTitle: String => Unit,
    show: () => Unit,
    subtitle: String,
    title: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ActionBar = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName.asInstanceOf[js.Any], applyProperties = js.Any.fromFunction1(applyProperties), backgroundImage = backgroundImage.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], customView = customView.asInstanceOf[js.Any], displayHomeAsUp = displayHomeAsUp.asInstanceOf[js.Any], fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCustomView = js.Any.fromFunction0(getCustomView), getNavigationMode = js.Any.fromFunction0(getNavigationMode), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle), hide = js.Any.fromFunction0(hide), homeButtonEnabled = homeButtonEnabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], navigationMode = navigationMode.asInstanceOf[js.Any], onHomeIconItemSelected = js.Any.fromFunction0(onHomeIconItemSelected), removeEventListener = js.Any.fromFunction2(removeEventListener), setBackgroundImage = js.Any.fromFunction1(setBackgroundImage), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCustomView = js.Any.fromFunction1(setCustomView), setDisplayHomeAsUp = js.Any.fromFunction1(setDisplayHomeAsUp), setDisplayShowHomeEnabled = js.Any.fromFunction1(setDisplayShowHomeEnabled), setDisplayShowTitleEnabled = js.Any.fromFunction1(setDisplayShowTitleEnabled), setHomeButtonEnabled = js.Any.fromFunction1(setHomeButtonEnabled), setIcon = js.Any.fromFunction1(setIcon), setLogo = js.Any.fromFunction1(setLogo), setNavigationMode = js.Any.fromFunction1(setNavigationMode), setOnHomeIconItemSelected = js.Any.fromFunction1(setOnHomeIconItemSelected), setSubtitle = js.Any.fromFunction1(setSubtitle), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction0(show), subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBar]
  }
}

