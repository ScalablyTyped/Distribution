package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A toolbar, which can contain buttons and certain other controls.
		 */
@js.native
trait Toolbar extends View {
  /**
  			 * Background color for the toolbar, as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * Returns the margin after the toolbar's content when there are action buttons.
  			 */
  var contentInsetEndWithActions: scala.Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start when there is a navigation button.
  			 */
  var contentInsetStartWithNavigation: scala.Double = js.native
  /**
  			 * If `true`, the background of the toolbar extends upwards.
  			 */
  var extendBackground: scala.Boolean = js.native
  /**
  			 * An array of buttons (or other widgets) contained in the toolbar.
  			 */
  var items: js.Array[View] = js.native
  /**
  			 * Image to be used as a logo in the Toolbar.
  			 */
  var logo: java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Image to be used for a navigation icon.
  			 */
  var navigationIcon: java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Image to be used for the overflow menu.
  			 */
  var overflowIcon: java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Text of the subtitle.
  			 */
  var subtitle: java.lang.String = js.native
  /**
  			 * Color for toolbar's subtitle
  			 */
  var subtitleTextColor: java.lang.String = js.native
  /**
  			 * Text of the title.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Color string with any Titanium supported format
  			 */
  var titleTextColor: java.lang.String = js.native
  /**
  			 * If `true`, a translucent background color is used for the toolbar.
  			 */
  var translucent: scala.Boolean = js.native
  /**
  			 * Collapses expanded ActionViews if there is any
  			 */
  def collapseActionViews(): scala.Unit = js.native
  /**
  			 * Collapses expandend ActionViews and hides overflow menu
  			 */
  def dismissPopupMenus(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Returns the margin at the toolbar's content end.
  			 */
  def getContentInsetEnd(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
  			 */
  def getContentInsetEndWithActions(): scala.Double = js.native
  /**
  			 * Returns the margin on the left of the toolbar's content.
  			 */
  def getContentInsetLeft(): scala.Double = js.native
  /**
  			 * Returns the margin on the right of the toolbar's content.
  			 */
  def getContentInsetRight(): scala.Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start.
  			 */
  def getContentInsetStart(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
  			 */
  def getContentInsetStartWithNavigation(): scala.Double = js.native
  /**
  			 * Returns the margin at the toolbar's content end that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetEnd(): scala.Double = js.native
  /**
  			 * Returns the margin on the left of the toolbar's content that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetLeft(): scala.Double = js.native
  /**
  			 * Returns the margin on the right of the toolbar's content that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetRight(): scala.Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetStart(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.items> property.
  			 */
  def getItems(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def getLogo(): java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def getNavigationIcon(): java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def getOverflowIcon(): java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.subtitle> property.
  			 */
  def getSubtitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
  			 */
  def getSubtitleTextColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
  			 */
  def getTitleTextColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.translucent> property.
  			 */
  def getTranslucent(): scala.Boolean = js.native
  /**
  			 * Checks if the toolbar is currently hosting an expanded action view.
  			 */
  def hasExpandedActionView(): scala.Boolean = js.native
  /**
  			 * Hides the overflow menu if there is one.
  			 */
  def hideOverflowMenu(): scala.Unit = js.native
  /**
  			 * Checks if the toolbar is currently hosting an expanded action view.
  			 */
  def isOverflowMenuShowing(): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
  			 */
  def setContentInsetEndWithActions(contentInsetEndWithActions: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
  			 */
  def setContentInsetStartWithNavigation(contentInsetStartWithNavigation: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the content margins of the toolbar
  			 */
  def setContentInsetsAbsolute(insetLeft: scala.Double, insetRight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the content margins relative to the layout direction
  			 */
  def setContentInsetsRelative(insetStart: scala.Double, insetEnd: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.items> property.
  			 */
  def setItems(items: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: titaniumLib.TitaniumNs.FilesystemNs.File): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.subtitle> property.
  			 */
  def setSubtitle(subtitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
  			 */
  def setSubtitleTextColor(subtitleTextColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
  			 */
  def setTitleTextColor(titleTextColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.translucent> property.
  			 */
  def setTranslucent(translucent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Shows the overflow menu if there is one
  			 */
  def showOverflowMenu(): scala.Unit = js.native
}

