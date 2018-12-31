package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list item is an individual item in a list section.
		 */
trait ListItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Sets an accessory on the right side of an item.
  			 */
  var accessoryType: scala.Double
  /**
  			 * Background color of the view, as a color name or hex triplet.
  			 */
  var backgroundColor: java.lang.String
  /**
  			 * Background gradient to render when the item is not selected.
  			 */
  var backgroundGradient: titaniumLib.Gradient
  /**
  			 * Background image to render when the item is not selected.
  			 */
  var backgroundImage: java.lang.String
  /**
  			 * Specifies if the item can be deleted by a user initiated action.
  			 */
  var canEdit: scala.Boolean
  /**
  			 * Specifies if the item can be inserted by a user initiated action.
  			 */
  var canInsert: scala.Boolean
  /**
  			 * Specifies if the item can be reordered within the list view by a user initiated action.
  			 */
  var canMove: scala.Boolean
  /**
  			 * Default text color of the item when not selected, as a color name or hex triplet.
  			 */
  var color: java.lang.String
  /**
  			 * Specifies custom action items to be shown when when a list item is edited.
  			 */
  var editActions: js.Array[titaniumLib.RowActionType]
  /**
  			 * Font to use for the item title.
  			 */
  var font: titaniumLib.Font
  /**
  			 * Row height in platform-specific units.
  			 */
  var height: scala.Double | java.lang.String
  /**
  			 * Image to render in the image area of the item, specified as a local path or URL.
  			 */
  var image: java.lang.String
  /**
  			 * A user defined string that gets passed to events.
  			 */
  var itemId: java.lang.String
  /**
  			 * The text to match against when the [ListView](Titanium.UI.ListView) is performing a search.
  			 */
  var searchableText: java.lang.String
  /**
  			 * Background color of the view, as a color name or hex triplet when item is selected.
  			 */
  var selectedBackgroundColor: java.lang.String
  /**
  			 * Background gradient to render when the item is selected.
  			 */
  var selectedBackgroundGradient: titaniumLib.Gradient
  /**
  			 * Background image to render when the item is selected.
  			 */
  var selectedBackgroundImage: java.lang.String
  /**
  			 * Color to use for the item title when the item is selected, as a color name or hex triplet.
  			 */
  var selectedColor: java.lang.String
  /**
  			 * Color to use for the item subtitle when the item is selected, as a color name or hex triplet.
  			 */
  var selectedSubtitleColor: java.lang.String
  /**
  			 * Selection style constant to control the selection color.
  			 */
  var selectionStyle: scala.Double
  /**
  			 * Subtitle to set in the text area of the item.
  			 */
  var subtitle: java.lang.String
  /**
  			 * Default text color of the subtitle, as a color name or hex triplet.
  			 */
  var subtitleColor: java.lang.String
  /**
  			 * Title to set in the text area of the item.
  			 */
  var title: java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def getEditActions(): js.Array[titaniumLib.RowActionType]
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def getSelectedColor(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def getSelectedSubtitleColor(): java.lang.String
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def setEditActions(editActions: js.Array[titaniumLib.RowActionType]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def setSelectedSubtitleColor(selectedSubtitleColor: java.lang.String): scala.Unit
}

