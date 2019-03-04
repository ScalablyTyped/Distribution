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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    backgroundImage: java.lang.String,
    bubbleParent: scala.Boolean,
    customView: titaniumLib.TitaniumNs.UINs.View,
    displayHomeAsUp: scala.Boolean,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getCustomView: js.Function0[titaniumLib.TitaniumNs.UINs.View],
    getNavigationMode: js.Function0[scala.Double],
    getSubtitle: js.Function0[java.lang.String],
    getTitle: js.Function0[java.lang.String],
    hide: js.Function0[scala.Unit],
    homeButtonEnabled: scala.Boolean,
    icon: java.lang.String,
    logo: java.lang.String,
    navigationMode: scala.Double,
    onHomeIconItemSelected: js.Function0[js.Any],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    setBackgroundImage: js.Function1[java.lang.String, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setCustomView: js.Function1[js.Any, scala.Unit],
    setDisplayHomeAsUp: js.Function1[scala.Boolean, scala.Unit],
    setDisplayShowHomeEnabled: js.Function1[scala.Boolean, scala.Unit],
    setDisplayShowTitleEnabled: js.Function1[scala.Boolean, scala.Unit],
    setHomeButtonEnabled: js.Function1[scala.Boolean, scala.Unit],
    setIcon: js.Function1[java.lang.String, scala.Unit],
    setLogo: js.Function1[java.lang.String, scala.Unit],
    setNavigationMode: js.Function1[scala.Double, scala.Unit],
    setOnHomeIconItemSelected: js.Function1[js.Function0[_], scala.Unit],
    setSubtitle: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    show: js.Function0[scala.Unit],
    subtitle: java.lang.String,
    title: java.lang.String,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ActionBar = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, backgroundImage = backgroundImage, bubbleParent = bubbleParent, customView = customView, displayHomeAsUp = displayHomeAsUp, fireEvent = fireEvent, getApiName = getApiName, getBubbleParent = getBubbleParent, getCustomView = getCustomView, getNavigationMode = getNavigationMode, getSubtitle = getSubtitle, getTitle = getTitle, hide = hide, homeButtonEnabled = homeButtonEnabled, icon = icon, logo = logo, navigationMode = navigationMode, onHomeIconItemSelected = onHomeIconItemSelected, removeEventListener = removeEventListener, setBackgroundImage = setBackgroundImage, setBubbleParent = setBubbleParent, setCustomView = setCustomView, setDisplayHomeAsUp = setDisplayHomeAsUp, setDisplayShowHomeEnabled = setDisplayShowHomeEnabled, setDisplayShowTitleEnabled = setDisplayShowTitleEnabled, setHomeButtonEnabled = setHomeButtonEnabled, setIcon = setIcon, setLogo = setLogo, setNavigationMode = setNavigationMode, setOnHomeIconItemSelected = setOnHomeIconItemSelected, setSubtitle = setSubtitle, setTitle = setTitle, show = show, subtitle = subtitle, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ActionBar]
  }
}

