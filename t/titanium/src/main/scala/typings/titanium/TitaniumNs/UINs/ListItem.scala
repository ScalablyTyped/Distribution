package typings.titanium.TitaniumNs.UINs

import typings.titanium.Font
import typings.titanium.Gradient
import typings.titanium.RowActionType
import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A list item is an individual item in a list section.
		 */
trait ListItem extends Proxy {
  /**
  			 * Sets an accessory on the right side of an item.
  			 */
  var accessoryType: Double
  /**
  			 * Background color of the view, as a color name or hex triplet.
  			 */
  var backgroundColor: String
  /**
  			 * Background gradient to render when the item is not selected.
  			 */
  var backgroundGradient: Gradient
  /**
  			 * Background image to render when the item is not selected.
  			 */
  var backgroundImage: String
  /**
  			 * Specifies if the item can be deleted by a user initiated action.
  			 */
  var canEdit: Boolean
  /**
  			 * Specifies if the item can be inserted by a user initiated action.
  			 */
  var canInsert: Boolean
  /**
  			 * Specifies if the item can be reordered within the list view by a user initiated action.
  			 */
  var canMove: Boolean
  /**
  			 * Default text color of the item when not selected, as a color name or hex triplet.
  			 */
  var color: String
  /**
  			 * Specifies custom action items to be shown when when a list item is edited.
  			 */
  var editActions: js.Array[RowActionType]
  /**
  			 * Font to use for the item title.
  			 */
  var font: Font
  /**
  			 * Row height in platform-specific units.
  			 */
  var height: Double | String
  /**
  			 * Image to render in the image area of the item, specified as a local path or URL.
  			 */
  var image: String
  /**
  			 * A user defined string that gets passed to events.
  			 */
  var itemId: String
  /**
  			 * The text to match against when the [ListView](Titanium.UI.ListView) is performing a search.
  			 */
  var searchableText: String
  /**
  			 * Background color of the view, as a color name or hex triplet when item is selected.
  			 */
  var selectedBackgroundColor: String
  /**
  			 * Background gradient to render when the item is selected.
  			 */
  var selectedBackgroundGradient: Gradient
  /**
  			 * Background image to render when the item is selected.
  			 */
  var selectedBackgroundImage: String
  /**
  			 * Color to use for the item title when the item is selected, as a color name or hex triplet.
  			 */
  var selectedColor: String
  /**
  			 * Color to use for the item subtitle when the item is selected, as a color name or hex triplet.
  			 */
  var selectedSubtitleColor: String
  /**
  			 * Selection style constant to control the selection color.
  			 */
  var selectionStyle: Double
  /**
  			 * Subtitle to set in the text area of the item.
  			 */
  var subtitle: String
  /**
  			 * Default text color of the subtitle, as a color name or hex triplet.
  			 */
  var subtitleColor: String
  /**
  			 * Title to set in the text area of the item.
  			 */
  var title: String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def getEditActions(): js.Array[RowActionType]
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def getSelectedColor(): String
  /**
  			 * Gets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def getSelectedSubtitleColor(): String
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.editActions> property.
  			 */
  def setEditActions(editActions: js.Array[RowActionType]): Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
  			 */
  def setSelectedSubtitleColor(selectedSubtitleColor: String): Unit
}

object ListItem {
  @scala.inline
  def apply(
    accessoryType: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    backgroundColor: String,
    backgroundGradient: Gradient,
    backgroundImage: String,
    bubbleParent: Boolean,
    canEdit: Boolean,
    canInsert: Boolean,
    canMove: Boolean,
    color: String,
    editActions: js.Array[RowActionType],
    fireEvent: (String, js.Any) => Unit,
    font: Font,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getEditActions: () => js.Array[RowActionType],
    getSelectedColor: () => String,
    getSelectedSubtitleColor: () => String,
    height: Double | String,
    image: String,
    itemId: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    searchableText: String,
    selectedBackgroundColor: String,
    selectedBackgroundGradient: Gradient,
    selectedBackgroundImage: String,
    selectedColor: String,
    selectedSubtitleColor: String,
    selectionStyle: Double,
    setBubbleParent: Boolean => Unit,
    setEditActions: js.Array[RowActionType] => Unit,
    setSelectedColor: String => Unit,
    setSelectedSubtitleColor: String => Unit,
    subtitle: String,
    subtitleColor: String,
    title: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): ListItem = {
    val __obj = js.Dynamic.literal(accessoryType = accessoryType, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), backgroundColor = backgroundColor, backgroundGradient = backgroundGradient, backgroundImage = backgroundImage, bubbleParent = bubbleParent, canEdit = canEdit, canInsert = canInsert, canMove = canMove, color = color, editActions = editActions, fireEvent = js.Any.fromFunction2(fireEvent), font = font, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEditActions = js.Any.fromFunction0(getEditActions), getSelectedColor = js.Any.fromFunction0(getSelectedColor), getSelectedSubtitleColor = js.Any.fromFunction0(getSelectedSubtitleColor), height = height.asInstanceOf[js.Any], image = image, itemId = itemId, removeEventListener = js.Any.fromFunction2(removeEventListener), searchableText = searchableText, selectedBackgroundColor = selectedBackgroundColor, selectedBackgroundGradient = selectedBackgroundGradient, selectedBackgroundImage = selectedBackgroundImage, selectedColor = selectedColor, selectedSubtitleColor = selectedSubtitleColor, selectionStyle = selectionStyle, setBubbleParent = js.Any.fromFunction1(setBubbleParent), setEditActions = js.Any.fromFunction1(setEditActions), setSelectedColor = js.Any.fromFunction1(setSelectedColor), setSelectedSubtitleColor = js.Any.fromFunction1(setSelectedSubtitleColor), subtitle = subtitle, subtitleColor = subtitleColor, title = title)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ListItem]
  }
}

