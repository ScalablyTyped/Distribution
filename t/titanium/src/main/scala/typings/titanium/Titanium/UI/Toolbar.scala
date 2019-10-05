package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
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
  var barColor: String = js.native
  /**
  			 * Returns the margin after the toolbar's content when there are action buttons.
  			 */
  var contentInsetEndWithActions: Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start when there is a navigation button.
  			 */
  var contentInsetStartWithNavigation: Double = js.native
  /**
  			 * If `true`, the background of the toolbar extends upwards.
  			 */
  var extendBackground: Boolean = js.native
  /**
  			 * An array of buttons (or other widgets) contained in the toolbar.
  			 */
  var items: js.Array[View] = js.native
  /**
  			 * Image to be used as a logo in the Toolbar.
  			 */
  var logo: String | Blob | File = js.native
  /**
  			 * Image to be used for a navigation icon.
  			 */
  var navigationIcon: String | Blob | File = js.native
  /**
  			 * Image to be used for the overflow menu.
  			 */
  var overflowIcon: String | Blob | File = js.native
  /**
  			 * Text of the subtitle.
  			 */
  var subtitle: String = js.native
  /**
  			 * Color for toolbar's subtitle
  			 */
  var subtitleTextColor: String = js.native
  /**
  			 * Text of the title.
  			 */
  var title: String = js.native
  /**
  			 * Color string with any Titanium supported format
  			 */
  var titleTextColor: String = js.native
  /**
  			 * If `true`, a translucent background color is used for the toolbar.
  			 */
  var translucent: Boolean = js.native
  /**
  			 * Collapses expanded ActionViews if there is any
  			 */
  def collapseActionViews(): Unit = js.native
  /**
  			 * Collapses expandend ActionViews and hides overflow menu
  			 */
  def dismissPopupMenus(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.barColor> property.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Returns the margin at the toolbar's content end.
  			 */
  def getContentInsetEnd(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
  			 */
  def getContentInsetEndWithActions(): Double = js.native
  /**
  			 * Returns the margin on the left of the toolbar's content.
  			 */
  def getContentInsetLeft(): Double = js.native
  /**
  			 * Returns the margin on the right of the toolbar's content.
  			 */
  def getContentInsetRight(): Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start.
  			 */
  def getContentInsetStart(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
  			 */
  def getContentInsetStartWithNavigation(): Double = js.native
  /**
  			 * Returns the margin at the toolbar's content end that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetEnd(): Double = js.native
  /**
  			 * Returns the margin on the left of the toolbar's content that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetLeft(): Double = js.native
  /**
  			 * Returns the margin on the right of the toolbar's content that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetRight(): Double = js.native
  /**
  			 * Returns the margin at the toolbar's content start that will be used with the current configuration of the toolbar.
  			 */
  def getCurrentContentInsetStart(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.items> property.
  			 */
  def getItems(): js.Array[View] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def getLogo(): String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def getNavigationIcon(): String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def getOverflowIcon(): String | Blob | File = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.subtitle> property.
  			 */
  def getSubtitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
  			 */
  def getSubtitleTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
  			 */
  def getTitleTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Toolbar.translucent> property.
  			 */
  def getTranslucent(): Boolean = js.native
  /**
  			 * Checks if the toolbar is currently hosting an expanded action view.
  			 */
  def hasExpandedActionView(): Boolean = js.native
  /**
  			 * Hides the overflow menu if there is one.
  			 */
  def hideOverflowMenu(): Unit = js.native
  /**
  			 * Checks if the toolbar is currently hosting an expanded action view.
  			 */
  def isOverflowMenuShowing(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.barColor> property.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.contentInsetEndWithActions> property.
  			 */
  def setContentInsetEndWithActions(contentInsetEndWithActions: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.contentInsetStartWithNavigation> property.
  			 */
  def setContentInsetStartWithNavigation(contentInsetStartWithNavigation: Double): Unit = js.native
  /**
  			 * Sets the content margins of the toolbar
  			 */
  def setContentInsetsAbsolute(insetLeft: Double, insetRight: Double): Unit = js.native
  /**
  			 * Sets the content margins relative to the layout direction
  			 */
  def setContentInsetsRelative(insetStart: Double, insetEnd: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.items> property.
  			 */
  def setItems(items: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.logo> property.
  			 */
  def setLogo(logo: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.navigationIcon> property.
  			 */
  def setNavigationIcon(navigationIcon: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.overflowIcon> property.
  			 */
  def setOverflowIcon(overflowIcon: File): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.subtitle> property.
  			 */
  def setSubtitle(subtitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.subtitleTextColor> property.
  			 */
  def setSubtitleTextColor(subtitleTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.titleTextColor> property.
  			 */
  def setTitleTextColor(titleTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Toolbar.translucent> property.
  			 */
  def setTranslucent(translucent: Boolean): Unit = js.native
  /**
  			 * Shows the overflow menu if there is one
  			 */
  def showOverflowMenu(): Unit = js.native
}

