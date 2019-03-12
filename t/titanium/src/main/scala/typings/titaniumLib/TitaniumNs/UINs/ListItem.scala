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

object ListItem {
  @scala.inline
  def apply(
    accessoryType: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    backgroundColor: java.lang.String,
    backgroundGradient: titaniumLib.Gradient,
    backgroundImage: java.lang.String,
    bubbleParent: scala.Boolean,
    canEdit: scala.Boolean,
    canInsert: scala.Boolean,
    canMove: scala.Boolean,
    color: java.lang.String,
    editActions: js.Array[titaniumLib.RowActionType],
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    font: titaniumLib.Font,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getEditActions: () => js.Array[titaniumLib.RowActionType],
    getSelectedColor: () => java.lang.String,
    getSelectedSubtitleColor: () => java.lang.String,
    height: scala.Double | java.lang.String,
    image: java.lang.String,
    itemId: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    searchableText: java.lang.String,
    selectedBackgroundColor: java.lang.String,
    selectedBackgroundGradient: titaniumLib.Gradient,
    selectedBackgroundImage: java.lang.String,
    selectedColor: java.lang.String,
    selectedSubtitleColor: java.lang.String,
    selectionStyle: scala.Double,
    setBubbleParent: scala.Boolean => scala.Unit,
    setEditActions: js.Array[titaniumLib.RowActionType] => scala.Unit,
    setSelectedColor: java.lang.String => scala.Unit,
    setSelectedSubtitleColor: java.lang.String => scala.Unit,
    subtitle: java.lang.String,
    subtitleColor: java.lang.String,
    title: java.lang.String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, scala.Unit]) = null
  ): ListItem = {
    val __obj = js.Dynamic.literal(accessoryType = accessoryType, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), backgroundColor = backgroundColor, backgroundGradient = backgroundGradient, backgroundImage = backgroundImage, bubbleParent = bubbleParent, canEdit = canEdit, canInsert = canInsert, canMove = canMove, color = color, editActions = editActions, fireEvent = js.Any.fromFunction2(fireEvent), font = font, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEditActions = js.Any.fromFunction0(getEditActions), getSelectedColor = js.Any.fromFunction0(getSelectedColor), getSelectedSubtitleColor = js.Any.fromFunction0(getSelectedSubtitleColor), height = height.asInstanceOf[js.Any], image = image, itemId = itemId, removeEventListener = js.Any.fromFunction2(removeEventListener), searchableText = searchableText, selectedBackgroundColor = selectedBackgroundColor, selectedBackgroundGradient = selectedBackgroundGradient, selectedBackgroundImage = selectedBackgroundImage, selectedColor = selectedColor, selectedSubtitleColor = selectedSubtitleColor, selectionStyle = selectionStyle, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEditActions = js.Any.fromFunction1(setEditActions), setSelectedColor = js.Any.fromFunction1(setSelectedColor), setSelectedSubtitleColor = js.Any.fromFunction1(setSelectedSubtitleColor), subtitle = subtitle, subtitleColor = subtitleColor, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ListItem]
  }
}

