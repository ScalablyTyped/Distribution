package typings.tabris.mod

import typings.tabris.AnonChildrenString
import typings.tabris.OmitToggleButtonset
import typings.tabris.tabrisStrings.alignment
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.checked
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.text
import typings.tabris.tabrisStrings.textColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ToggleButton")
@js.native
class ToggleButton () extends Widget {
  def this(properties: Properties[ToggleButton, OmitToggleButtonset]) = this()
  /**
    * The horizontal alignment of the button text.
    */
  var alignment: centerX | left | right = js.native
  /**
    * The checked state of the toggle button.
    */
  var checked: Boolean = js.native
  /**
    * The font used for the text.
    */
  var font: FontValue = js.native
  /**
    * An image to be displayed on the button.
    */
  var image: ImageValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_ToggleButton: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenString = js.native
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    */
  var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
  /**
    * Fired when the [*checked*](#checked) property has changed.
    */
  var onCheckedChanged: ChangeListeners[this.type, checked] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the [*image*](#image) property has changed.
    */
  var onImageChanged: ChangeListeners[this.type, image] = js.native
  /**
    * Fired when the toggle button is selected or deselected by the user.
    */
  var onSelect: Listeners[ToggleButtonSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * The button's label text.
    */
  var text: String = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
}

