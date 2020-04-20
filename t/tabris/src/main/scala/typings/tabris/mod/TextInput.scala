package typings.tabris.mod

import typings.tabris.AnonChildrenString
import typings.tabris.OmitTextInputset
import typings.tabris.tabrisBooleans.`false`
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.alignment
import typings.tabris.tabrisStrings.all
import typings.tabris.tabrisStrings.ascii
import typings.tabris.tabrisStrings.autoCapitalize
import typings.tabris.tabrisStrings.autoCorrect
import typings.tabris.tabrisStrings.borderColor
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.cursorColor
import typings.tabris.tabrisStrings.decimal
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.done
import typings.tabris.tabrisStrings.editable
import typings.tabris.tabrisStrings.email
import typings.tabris.tabrisStrings.enterKeyType
import typings.tabris.tabrisStrings.fill
import typings.tabris.tabrisStrings.floatMessage
import typings.tabris.tabrisStrings.focused
import typings.tabris.tabrisStrings.font
import typings.tabris.tabrisStrings.go
import typings.tabris.tabrisStrings.keepFocus
import typings.tabris.tabrisStrings.keyboard
import typings.tabris.tabrisStrings.keyboardAppearanceMode
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.maxChars
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.messageColor
import typings.tabris.tabrisStrings.multiline
import typings.tabris.tabrisStrings.never
import typings.tabris.tabrisStrings.next
import typings.tabris.tabrisStrings.none
import typings.tabris.tabrisStrings.number
import typings.tabris.tabrisStrings.numbersAndPunctuation
import typings.tabris.tabrisStrings.onfocus
import typings.tabris.tabrisStrings.ontouch
import typings.tabris.tabrisStrings.outline
import typings.tabris.tabrisStrings.password
import typings.tabris.tabrisStrings.phone
import typings.tabris.tabrisStrings.revealPassword
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.search
import typings.tabris.tabrisStrings.selection
import typings.tabris.tabrisStrings.send
import typings.tabris.tabrisStrings.sentence
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.text
import typings.tabris.tabrisStrings.textColor
import typings.tabris.tabrisStrings.underline
import typings.tabris.tabrisStrings.url
import typings.tabris.tabrisStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "TextInput")
@js.native
class TextInput () extends Widget {
  def this(properties: Properties[TextInput, OmitTextInputset]) = this()
  /**
    * The horizontal alignment of the text.
    */
  var alignment: centerX | left | right = js.native
  /**
    * Control how text input is capitalized.
    * * `none` - Do not change any text input
    * * `sentence` - Capitalize the first word of a sentence
    * * `word` - Capitalize every word
    * * `all` - Capitalize every letter
    * The boolean value `false` maps to `none` whereas `true` is equal to `all`.
    */
  var autoCapitalize: all | `false` | none | sentence | `true` | word = js.native
  /**
    * Enables the spell checker and auto-correction feature.
    */
  var autoCorrect: Boolean = js.native
  /**
    * The color of the border of the TextInput. On iOS this is a rectangular border around the TextInput,
    * on Android it is a single line below the TextInput.
    */
  var borderColor: ColorValue = js.native
  /**
    * The color of the cursor in the `TextInput`.
    */
  var cursorColor: ColorValue = js.native
  /**
    * Whether the text can be edited or not.
    */
  var editable: Boolean = js.native
  /**
    * Label or icon to display on the keyboard 'confirmation' key. The key press can be captured via the
    * `accept` event. Setting an `enterKeyType` other than `default` will change the key behavior to not
    * close the keyboard automatically. The developer is able close the keyboard by removing the focus from
    * the `TextInput`.
    */
  var enterKeyType: default | done | go | next | search | send = js.native
  /**
    * Should the hint message float above the TextInput when focus is gained.
    */
  var floatMessage: Boolean = js.native
  /**
    * Reflects whether this widget has the keyboard focus. Setting this property to `true` will focus the
    * widget and open the virtual keyboard, setting it to `false` will remove the focus and hide the
    * virtual keyboard.
    */
  var focused: Boolean = js.native
  /**
    * The font used for the text.
    */
  var font: FontValue = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_TextInput: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with AnonChildrenString = js.native
  /**
    * When `true` the `TextInput` will keep its focus, even when tapped outside of the widget bounds.
    */
  var keepFocus: Boolean = js.native
  /**
    * Selects the keyboard type to use for editing this widget. Has no effect when `type` is set to
    * `multiline`.
    */
  var keyboard: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url = js.native
  /**
    * Allows to control when to show the virtual keyboard.
    * - `'never'` - The keyboard is never shown when focus is gained.
    * - `'ontouch'` - The keyboard is not shown when the `focused` property is set to `true`
    * programmatically. Only the blinking cursor will be shown. Touching the `TextInput` will show the
    * keyboard.
    * - `'onfocus'` - The keyboard is always shown when the `TextInput` gains focus.
    */
  var keyboardAppearanceMode: never | ontouch | onfocus = js.native
  /**
    * The maximum number of characters that can be entered into a `TextInput`.
    */
  var maxChars: Double = js.native
  /**
    * A hint text that is displayed when the input field is empty. Does not apply on iOS when `type` is set
    * to `multiline`.
    */
  var message: String = js.native
  /**
    * Color of the `message` text.
    */
  var messageColor: ColorValue = js.native
  /**
    * Fired when a text input has been finished by pressing the keyboard's Enter key. The label of this key
    * may vary depending on the platform and locale.
    */
  var onAccept: Listeners[TextInputAcceptEvent[this.type]] = js.native
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    */
  var onAlignmentChanged: ChangeListeners[this.type, alignment] = js.native
  /**
    * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
    */
  var onAutoCapitalizeChanged: ChangeListeners[this.type, autoCapitalize] = js.native
  /**
    * Fired when the [*autoCorrect*](#autoCorrect) property has changed.
    */
  var onAutoCorrectChanged: ChangeListeners[this.type, autoCorrect] = js.native
  /**
    * Fired when the widget lost focus.
    */
  var onBlur: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*borderColor*](#borderColor) property has changed.
    */
  var onBorderColorChanged: ChangeListeners[this.type, borderColor] = js.native
  /**
    * Fired when the [*cursorColor*](#cursorColor) property has changed.
    */
  var onCursorColorChanged: ChangeListeners[this.type, cursorColor] = js.native
  /**
    * Fired when the [*editable*](#editable) property has changed.
    */
  var onEditableChanged: ChangeListeners[this.type, editable] = js.native
  /**
    * Fired when the [*enterKeyType*](#enterKeyType) property has changed.
    */
  var onEnterKeyTypeChanged: ChangeListeners[this.type, enterKeyType] = js.native
  /**
    * Fired when the [*floatMessage*](#floatMessage) property has changed.
    */
  var onFloatMessageChanged: ChangeListeners[this.type, floatMessage] = js.native
  /**
    * Fired when the widget gains focus.
    */
  var onFocus: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*focused*](#focused) property has changed.
    */
  var onFocusedChanged: ChangeListeners[this.type, focused] = js.native
  /**
    * Fired when the [*font*](#font) property has changed.
    */
  var onFontChanged: ChangeListeners[this.type, font] = js.native
  /**
    * Fired when the text was changed by the user.
    */
  var onInput: Listeners[TextInputInputEvent[this.type]] = js.native
  /**
    * Fired when the [*keepFocus*](#keepFocus) property has changed.
    */
  var onKeepFocusChanged: ChangeListeners[this.type, keepFocus] = js.native
  /**
    * Fired when the [*keyboardAppearanceMode*](#keyboardAppearanceMode) property has changed.
    */
  var onKeyboardAppearanceModeChanged: ChangeListeners[this.type, keyboardAppearanceMode] = js.native
  /**
    * Fired when the [*keyboard*](#keyboard) property has changed.
    */
  var onKeyboardChanged: ChangeListeners[this.type, keyboard] = js.native
  /**
    * Fired when the [*maxChars*](#maxChars) property has changed.
    */
  var onMaxCharsChanged: ChangeListeners[this.type, maxChars] = js.native
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  /**
    * Fired when the [*messageColor*](#messageColor) property has changed.
    */
  var onMessageColorChanged: ChangeListeners[this.type, messageColor] = js.native
  /**
    * Fired when the [*revealPassword*](#revealPassword) property has changed.
    */
  var onRevealPasswordChanged: ChangeListeners[this.type, revealPassword] = js.native
  /**
    * The `select` event is fired when the user alters the text [`selection`](#selection). Either by
    * dragging the selection handles of a text selection, by moving the cursor inside the text or by typing
    * which also advances the cursor.
    * The event also fires when the user taps inside a `TextInput` since this involves to set the cursor to
    * the tapped position.
    */
  var onSelect: Listeners[TextInputSelectEvent[this.type]] = js.native
  /**
    * Fired when the [*selection*](#selection) property has changed.
    */
  var onSelectionChanged: ChangeListeners[this.type, selection] = js.native
  /**
    * Fired when the [*text*](#text) property has changed.
    */
  var onTextChanged: ChangeListeners[this.type, text] = js.native
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    */
  var onTextColorChanged: ChangeListeners[this.type, textColor] = js.native
  /**
    * Makes the text visible when the `TextInput` has the type `password`.
    */
  var revealPassword: Boolean = js.native
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
    * the [`keepFocus`](#keepfocus) property to `true`.
    */
  var selection: js.Array[Double] = js.native
  /**
    * The visual appearance of the text widget.
    * With the `style` _outline_, _fill_ or _underline_ the message hint will float above the `TextInput`
    * on Android. This behavior can be controlled with the property `floatMessage`. The `style` _none_ will
    * remove any background visualization, allowing to create a custom background. 
    * @constant
    */
  var style: default | fill | none | outline | underline = js.native
  /**
    * The text in the input field.
    */
  var text: String = js.native
  /**
    * The color of the text.
    */
  var textColor: ColorValue = js.native
  /**
    * The type of the text widget.
    * @constant
    */
  var `type`: default | multiline | password | search = js.native
}

