package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An action bar is a window feature that identifies the application and user location,
		 * and provides user actions and navigation modes.
		 */
trait ActionBar
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * The background image for the action bar, specified as a local file path or URL.
  			 */
  var backgroundImage: java.lang.String
  /**
  			 * Sets a view to be used for a custom navigation mode.
  			 */
  var customView: titaniumLib.TitaniumNs.UINs.View
  /**
  			 * Displays an "up" affordance on the "home" area of the action bar.
  			 */
  var displayHomeAsUp: scala.Boolean
  /**
  			 * Enable or disable the "home" button in the corner of the action bar.
  			 */
  var homeButtonEnabled: scala.Boolean
  /**
  			 * Sets the application icon displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var icon: java.lang.String
  /**
  			 * Sets the application logo displayed in the "home" area of the action bar, specified as a local file path or URL.
  			 */
  var logo: java.lang.String
  /**
  			 * Controls the navigation mode.
  			 */
  var navigationMode: scala.Double
  /**
  			 * Sets the subtitle of the action bar.
  			 */
  var subtitle: java.lang.String
  /**
  			 * Sets the title of the action bar.
  			 */
  var title: java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def getCustomView(): titaniumLib.TitaniumNs.UINs.View
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def getNavigationMode(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def getSubtitle(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def getTitle(): java.lang.String
  /**
  			 * Hides the action bar if it is currently showing.
  			 */
  def hide(): scala.Unit
  /**
  			 * Callback function called when the home icon is clicked.
  			 */
  def onHomeIconItemSelected(): js.Any
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.backgroundImage> property.
  			 */
  def setBackgroundImage(backgroundImage: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.customView> property.
  			 */
  def setCustomView(customView: js.Any): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.displayHomeAsUp> property.
  			 */
  def setDisplayHomeAsUp(displayHomeAsUp: scala.Boolean): scala.Unit
  /**
  			 * Shows or hides the action bar home icon
  			 */
  def setDisplayShowHomeEnabled(show: scala.Boolean): scala.Unit
  /**
  			 * Shows or hides the action bar title/subtitle
  			 */
  def setDisplayShowTitleEnabled(show: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.homeButtonEnabled> property.
  			 */
  def setHomeButtonEnabled(homeButtonEnabled: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.icon> property.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.logo> property.
  			 */
  def setLogo(logo: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.navigationMode> property.
  			 */
  def setNavigationMode(navigationMode: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.onHomeIconItemSelected> property.
  			 */
  def setOnHomeIconItemSelected(onHomeIconItemSelected: js.Function0[_]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.subtitle> property.
  			 */
  def setSubtitle(subtitle: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Android.ActionBar.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit
  /**
  			 * Shows the action bar if it is currently hidden.
  			 */
  def show(): scala.Unit
}

object ActionBar {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    backgroundImage: java.lang.String,
    bubbleParent: scala.Boolean,
    customView: titaniumLib.TitaniumNs.UINs.View,
    displayHomeAsUp: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getCustomView: () => titaniumLib.TitaniumNs.UINs.View,
    getNavigationMode: () => scala.Double,
    getSubtitle: () => java.lang.String,
    getTitle: () => java.lang.String,
    hide: () => scala.Unit,
    homeButtonEnabled: scala.Boolean,
    icon: java.lang.String,
    logo: java.lang.String,
    navigationMode: scala.Double,
    onHomeIconItemSelected: () => js.Any,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBackgroundImage: java.lang.String => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setCustomView: js.Any => scala.Unit,
    setDisplayHomeAsUp: scala.Boolean => scala.Unit,
    setDisplayShowHomeEnabled: scala.Boolean => scala.Unit,
    setDisplayShowTitleEnabled: scala.Boolean => scala.Unit,
    setHomeButtonEnabled: scala.Boolean => scala.Unit,
    setIcon: java.lang.String => scala.Unit,
    setLogo: java.lang.String => scala.Unit,
    setNavigationMode: scala.Double => scala.Unit,
    setOnHomeIconItemSelected: js.Function0[_] => scala.Unit,
    setSubtitle: java.lang.String => scala.Unit,
    setTitle: java.lang.String => scala.Unit,
    show: () => scala.Unit,
    subtitle: java.lang.String,
    title: java.lang.String,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ActionBar = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), backgroundImage = backgroundImage, bubbleParent = bubbleParent, customView = customView, displayHomeAsUp = displayHomeAsUp, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCustomView = js.Any.fromFunction0(getCustomView), getNavigationMode = js.Any.fromFunction0(getNavigationMode), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle), hide = js.Any.fromFunction0(hide), homeButtonEnabled = homeButtonEnabled, icon = icon, logo = logo, navigationMode = navigationMode, onHomeIconItemSelected = js.Any.fromFunction0(onHomeIconItemSelected), removeEventListener = js.Any.fromFunction2(removeEventListener), setBackgroundImage = js.Any.fromFunction1(setBackgroundImage), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCustomView = js.Any.fromFunction1(setCustomView), setDisplayHomeAsUp = js.Any.fromFunction1(setDisplayHomeAsUp), setDisplayShowHomeEnabled = js.Any.fromFunction1(setDisplayShowHomeEnabled), setDisplayShowTitleEnabled = js.Any.fromFunction1(setDisplayShowTitleEnabled), setHomeButtonEnabled = js.Any.fromFunction1(setHomeButtonEnabled), setIcon = js.Any.fromFunction1(setIcon), setLogo = js.Any.fromFunction1(setLogo), setNavigationMode = js.Any.fromFunction1(setNavigationMode), setOnHomeIconItemSelected = js.Any.fromFunction1(setOnHomeIconItemSelected), setSubtitle = js.Any.fromFunction1(setSubtitle), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction0(show), subtitle = subtitle, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ActionBar]
  }
}

