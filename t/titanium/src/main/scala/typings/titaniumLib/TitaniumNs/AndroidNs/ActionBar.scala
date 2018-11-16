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

