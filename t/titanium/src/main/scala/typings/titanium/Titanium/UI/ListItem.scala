package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.Gradient
import typings.titanium.RowActionType
import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list item is an individual item in a list section.
  */
@js.native
trait ListItem extends Proxy {
  
  /**
    * Sets an accessory on the right side of an item.
    */
  var accessoryType: Double = js.native
  
  /**
    * Background color of the view, as a color name or hex triplet.
    */
  var backgroundColor: String | Color = js.native
  
  /**
    * Background gradient to render when the item is not selected.
    */
  var backgroundGradient: Gradient = js.native
  
  /**
    * Background image to render when the item is not selected.
    */
  var backgroundImage: String = js.native
  
  /**
    * Specifies if the item can be deleted by a user initiated action.
    */
  var canEdit: Boolean = js.native
  
  /**
    * Specifies if the item can be inserted by a user initiated action.
    */
  var canInsert: Boolean = js.native
  
  /**
    * Specifies if the item can be reordered within the list view by a user initiated action.
    */
  var canMove: Boolean = js.native
  
  /**
    * Default text color of the item when not selected, as a color name or hex triplet.
    */
  var color: String | Color = js.native
  
  /**
    * Specifies custom action items to be shown when when a list item is edited.
    */
  var editActions: js.Array[RowActionType] = js.native
  
  /**
    * Font to use for the item title.
    */
  var font: Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListItem.editActions> property.
    * @deprecated Access <Titanium.UI.ListItem.editActions> instead.
    */
  def getEditActions(): js.Array[RowActionType] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListItem.selectedColor> property.
    * @deprecated Access <Titanium.UI.ListItem.selectedColor> instead.
    */
  def getSelectedColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
    * @deprecated Access <Titanium.UI.ListItem.selectedSubtitleColor> instead.
    */
  def getSelectedSubtitleColor(): String | Color = js.native
  
  /**
    * Row height in platform-specific units.
    */
  var height: Double | String = js.native
  
  /**
    * Image to render in the image area of the item, specified as a local path or URL.
    */
  var image: String = js.native
  
  /**
    * A user defined string that gets passed to events.
    */
  var itemId: String = js.native
  
  /**
    * The text to match against when the [ListView](Titanium.UI.ListView) is performing a search.
    */
  var searchableText: String = js.native
  
  /**
    * Background color of the view, as a color name or hex triplet when item is selected.
    */
  var selectedBackgroundColor: String | Color = js.native
  
  /**
    * Background gradient to render when the item is selected.
    */
  var selectedBackgroundGradient: Gradient = js.native
  
  /**
    * Background image to render when the item is selected.
    */
  var selectedBackgroundImage: String = js.native
  
  /**
    * Color to use for the item title when the item is selected, as a color name or hex triplet.
    */
  var selectedColor: String | Color = js.native
  
  /**
    * Color to use for the item subtitle when the item is selected, as a color name or hex triplet.
    */
  var selectedSubtitleColor: String | Color = js.native
  
  /**
    * Selection style constant to control the selection color.
    */
  var selectionStyle: Double = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListItem.editActions> property.
    * @deprecated Set the value using <Titanium.UI.ListItem.editActions> instead.
    */
  def setEditActions(editActions: js.Array[RowActionType]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListItem.selectedColor> property.
    * @deprecated Set the value using <Titanium.UI.ListItem.selectedColor> instead.
    */
  def setSelectedColor(selectedColor: String): Unit = js.native
  def setSelectedColor(selectedColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ListItem.selectedSubtitleColor> property.
    * @deprecated Set the value using <Titanium.UI.ListItem.selectedSubtitleColor> instead.
    */
  def setSelectedSubtitleColor(selectedSubtitleColor: String): Unit = js.native
  def setSelectedSubtitleColor(selectedSubtitleColor: Color): Unit = js.native
  
  /**
    * Subtitle to set in the text area of the item.
    */
  var subtitle: String = js.native
  
  /**
    * Default text color of the subtitle, as a color name or hex triplet.
    */
  var subtitleColor: String | Color = js.native
  
  /**
    * Title to set in the text area of the item.
    */
  var title: String = js.native
}
