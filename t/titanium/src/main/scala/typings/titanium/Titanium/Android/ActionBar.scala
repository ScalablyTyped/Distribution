package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action bar is a window feature that identifies the application and user location,
  * and provides user actions and navigation modes.
  */
@js.native
trait ActionBar extends Proxy {
  /**
    * The background image for the action bar, specified as a local file path or URL.
    */
  var backgroundImage: String = js.native
  /**
    * Sets a view to be used for a custom navigation mode.
    */
  var customView: View = js.native
  /**
    * Displays an "up" affordance on the "home" area of the action bar.
    */
  var displayHomeAsUp: Boolean = js.native
  /**
    * Enable or disable the "home" button in the corner of the action bar.
    */
  var homeButtonEnabled: Boolean = js.native
  /**
    * Sets the application icon displayed in the "home" area of the action bar, specified as a local file path or URL.
    */
  var icon: String = js.native
  /**
    * Sets the application logo displayed in the "home" area of the action bar, specified as a local file path or URL.
    */
  var logo: String = js.native
  /**
    * Controls the navigation mode.
    */
  var navigationMode: Double = js.native
  /**
    * Sets the subtitle of the action bar.
    */
  var subtitle: String = js.native
  /**
    * Sets the title of the action bar.
    */
  var title: String = js.native
  /**
    * Gets the value of the <Titanium.Android.ActionBar.customView> property.
    * @deprecated Access <Titanium.Android.ActionBar.customView> instead.
    */
  def getCustomView(): View = js.native
  /**
    * Gets the value of the <Titanium.Android.ActionBar.navigationMode> property.
    * @deprecated Access <Titanium.Android.ActionBar.navigationMode> instead.
    */
  def getNavigationMode(): Double = js.native
  /**
    * Gets the value of the <Titanium.Android.ActionBar.subtitle> property.
    * @deprecated Access <Titanium.Android.ActionBar.subtitle> instead.
    */
  def getSubtitle(): String = js.native
  /**
    * Gets the value of the <Titanium.Android.ActionBar.title> property.
    * @deprecated Access <Titanium.Android.ActionBar.title> instead.
    */
  def getTitle(): String = js.native
  /**
    * Hides the action bar if it is currently showing.
    */
  def hide(): Unit = js.native
  /**
    * Callback function called when the home icon is clicked.
    */
  def onHomeIconItemSelected(args: js.Any*): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.backgroundImage> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.backgroundImage> instead.
    */
  def setBackgroundImage(backgroundImage: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.customView> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.customView> instead.
    */
  def setCustomView(customView: View): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.displayHomeAsUp> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.displayHomeAsUp> instead.
    */
  def setDisplayHomeAsUp(displayHomeAsUp: Boolean): Unit = js.native
  /**
    * Shows or hides the action bar home icon
    */
  def setDisplayShowHomeEnabled(show: Boolean): Unit = js.native
  /**
    * Shows or hides the action bar title/subtitle
    */
  def setDisplayShowTitleEnabled(show: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.homeButtonEnabled> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.homeButtonEnabled> instead.
    */
  def setHomeButtonEnabled(homeButtonEnabled: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.icon> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.icon> instead.
    */
  def setIcon(icon: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.logo> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.logo> instead.
    */
  def setLogo(logo: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.navigationMode> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.navigationMode> instead.
    */
  def setNavigationMode(navigationMode: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.onHomeIconItemSelected> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.onHomeIconItemSelected> instead.
    */
  def setOnHomeIconItemSelected(onHomeIconItemSelected: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.subtitle> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.subtitle> instead.
    */
  def setSubtitle(subtitle: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.Android.ActionBar.title> property.
    * @deprecated Set the value using <Titanium.Android.ActionBar.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Shows the action bar if it is currently hidden.
    */
  def show(): Unit = js.native
}

