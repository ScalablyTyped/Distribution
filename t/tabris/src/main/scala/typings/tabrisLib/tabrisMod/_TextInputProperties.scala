package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TextInput
trait _TextInputProperties extends _WidgetProperties {
  /**
    * The horizontal alignment of the text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right
  /**
    * Control how text input is capitalized.
    * `none` - Do not change any text input
    * `sentence` - Capitalize the first word of a sentence
    * `word` - Capitalize every word
    * `all` - Capitalize every letter
    * The boolean value `false` maps to `none` whereas `true` is equal to `all`.
    */
  var autoCapitalize: tabrisLib.tabrisLibStrings.all | tabrisLib.tabrisLibNumbers.`false` | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.sentence | tabrisLib.tabrisLibNumbers.`true` | tabrisLib.tabrisLibStrings.word
  /**
    * Enables the spell checker and auto-correction feature.
    */
  var autoCorrect: scala.Boolean
  /**
    * The color of the border of the TextInput. On iOS this is a rectangular border around the TextInput,
    * on Android it is a single line below the TextInput.
    */
  var borderColor: tabrisLib.Color
  /**
    * The color of the cursor in the `TextInput`.
    */
  var cursorColor: tabrisLib.Color
  /**
    * Whether the text can be edited or not.
    */
  var editable: scala.Boolean
  /**
    * Label or icon to display on the keyboard 'confirmation' key. The key press can be captured via the
    * `accept` event. Setting an `enterKeyType` other than `default` will change the key behavior to not
    * close the keyboard automatically. The developer is able close the keyboard by removing the focus from
    * the `TextInput`.
    */
  var enterKeyType: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.done | tabrisLib.tabrisLibStrings.go | tabrisLib.tabrisLibStrings.next | tabrisLib.tabrisLibStrings.search | tabrisLib.tabrisLibStrings.send
  /**
    * The color of the background of the TextInput - applies only to iOS.
    */
  var fillColor: tabrisLib.Color
  /**
    * Reflects whether this widget has the keyboard focus. Setting this property to `true` will focus the
    * widget and open the virtual keyboard, setting it to `false` will remove the focus and hide the
    * virtual keyboard.
    */
  var focused: scala.Boolean
  /**
    * When `true` the `TextInput` will keep its focus, even when tapped outside of the widget bounds.
    */
  var keepFocus: scala.Boolean
  /**
    * Selects the keyboard type to use for editing this widget. Has no effect when `type` is set to
    * `multiline`.
    */
  var keyboard: tabrisLib.tabrisLibStrings.ascii | tabrisLib.tabrisLibStrings.decimal | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.email | tabrisLib.tabrisLibStrings.number | tabrisLib.tabrisLibStrings.numbersAndPunctuation | tabrisLib.tabrisLibStrings.phone | tabrisLib.tabrisLibStrings.url
  /**
    * A hint text that is displayed when the input field is empty. Does not apply on iOS when `type` is set
    * to `multiline`.
    */
  var message: java.lang.String
  /**
    * Makes the text visible when the `TextInput` has the type `password`.
    */
  var revealPassword: scala.Boolean
  /**
    * The `selection` is a two element number array representing the text selections start and end
    * position. The native platform usually shows selection handles so that the selection can be changed by
    * the user. A `selection` array where both numbers are the same represent a single cursor at the given
    * position. The selection start is the index of the first character where as the end is the index of
    * the last character + 1. E.g. to select the word "ok" the selection would be `[0, 2]`.
    * To make a selection visible the `TextInput` has to be in focus. Consequently the selection is
    * preserved when the focus is lost and regained. When the user gives the `TextInput` focus by tapping
    * on it, the selection is changed to represent his touch position.
    * Getting the `selection` upon user interaction (e.g. a button press) the focus would be lost and
    * possibly the `selection` altered due to user interaction. In such a scenario it is recommended to set
    * the [`keepFocus`](#keepFocus) property to `true`.
    */
  var selection: js.Array[scala.Double]
  /**
    * The text in the input field.
    */
  var text: java.lang.String
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color
  /**
    * The type of the text widget. Windows 10 currently interprets `search`  as `default`.
    * @static
    */
  var `type`: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.multiline | tabrisLib.tabrisLibStrings.password | tabrisLib.tabrisLibStrings.search
}

object _TextInputProperties {
  @scala.inline
  def apply(
    alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right,
    autoCapitalize: tabrisLib.tabrisLibStrings.all | tabrisLib.tabrisLibNumbers.`false` | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.sentence | tabrisLib.tabrisLibNumbers.`true` | tabrisLib.tabrisLibStrings.word,
    autoCorrect: scala.Boolean,
    background: tabrisLib.Color,
    backgroundImage: tabrisLib.Image,
    baseline: Widget | tabrisLib.Selector,
    borderColor: tabrisLib.Color,
    bottom: tabrisLib.margin,
    centerX: tabrisLib.offset,
    centerY: tabrisLib.offset,
    `class`: java.lang.String,
    classList: js.Array[java.lang.String],
    cornerRadius: scala.Double,
    cursorColor: tabrisLib.Color,
    editable: scala.Boolean,
    elevation: scala.Double,
    enabled: scala.Boolean,
    enterKeyType: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.done | tabrisLib.tabrisLibStrings.go | tabrisLib.tabrisLibStrings.next | tabrisLib.tabrisLibStrings.search | tabrisLib.tabrisLibStrings.send,
    fillColor: tabrisLib.Color,
    focused: scala.Boolean,
    height: tabrisLib.dimension,
    highlightOnTouch: scala.Boolean,
    id: java.lang.String,
    keepFocus: scala.Boolean,
    keyboard: tabrisLib.tabrisLibStrings.ascii | tabrisLib.tabrisLibStrings.decimal | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.email | tabrisLib.tabrisLibStrings.number | tabrisLib.tabrisLibStrings.numbersAndPunctuation | tabrisLib.tabrisLibStrings.phone | tabrisLib.tabrisLibStrings.url,
    layoutData: LayoutData,
    left: tabrisLib.margin,
    message: java.lang.String,
    opacity: scala.Double,
    revealPassword: scala.Boolean,
    right: tabrisLib.margin,
    selection: js.Array[scala.Double],
    text: java.lang.String,
    textColor: tabrisLib.Color,
    top: tabrisLib.margin,
    transform: Transformation,
    `type`: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.multiline | tabrisLib.tabrisLibStrings.password | tabrisLib.tabrisLibStrings.search,
    visible: scala.Boolean,
    width: tabrisLib.dimension,
    win_theme: tabrisLib.tabrisLibStrings.dark | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.light,
    font: tabrisLib.Font = null
  ): _TextInputProperties = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoCapitalize = autoCapitalize.asInstanceOf[js.Any], autoCorrect = autoCorrect, background = background, backgroundImage = backgroundImage.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], borderColor = borderColor, bottom = bottom, centerX = centerX, centerY = centerY, classList = classList, cornerRadius = cornerRadius, cursorColor = cursorColor, editable = editable, elevation = elevation, enabled = enabled, enterKeyType = enterKeyType.asInstanceOf[js.Any], fillColor = fillColor, focused = focused, height = height, highlightOnTouch = highlightOnTouch, id = id, keepFocus = keepFocus, keyboard = keyboard.asInstanceOf[js.Any], layoutData = layoutData, left = left, message = message, opacity = opacity, revealPassword = revealPassword, right = right, selection = selection, text = text, textColor = textColor, top = top, transform = transform, visible = visible, width = width, win_theme = win_theme.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[_TextInputProperties]
  }
}

