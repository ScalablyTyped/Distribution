package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that allows to enter text.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._TextInputProperties because var conflicts: background, backgroundImage, baseline, bottom, centerX, centerY, `class`, classList, cornerRadius, elevation, enabled, font, height, highlightOnTouch, id, layoutData, left, opacity, right, top, transform, visible, width, win_theme. Inlined alignment, autoCapitalize, autoCorrect, borderColor, cursorColor, editable, enterKeyType, fillColor, focused, keepFocus, keyboard, message, revealPassword, selection, text, textColor, `type` */ @JSImport("tabris", "TextInput")
@js.native
class TextInput () extends Widget {
  def this(properties: tabrisLib.Properties[TextInput, tabrisLib.TypeScriptPropertiesKey]) = this()
  /**
    * The horizontal alignment of the text.
    */
  var alignment: tabrisLib.tabrisLibStrings.center | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.right = js.native
  /**
    * Control how text input is capitalized.
    * `none` - Do not change any text input
    * `sentence` - Capitalize the first word of a sentence
    * `word` - Capitalize every word
    * `all` - Capitalize every letter
    * The boolean value `false` maps to `none` whereas `true` is equal to `all`.
    */
  var autoCapitalize: tabrisLib.tabrisLibStrings.all | tabrisLib.tabrisLibNumbers.`false` | tabrisLib.tabrisLibStrings.none | tabrisLib.tabrisLibStrings.sentence | tabrisLib.tabrisLibNumbers.`true` | tabrisLib.tabrisLibStrings.word = js.native
  /**
    * Enables the spell checker and auto-correction feature.
    */
  var autoCorrect: scala.Boolean = js.native
  /**
    * The color of the border of the TextInput. On iOS this is a rectangular border around the TextInput,
    * on Android it is a single line below the TextInput.
    */
  var borderColor: tabrisLib.Color = js.native
  /**
    * The color of the cursor in the `TextInput`.
    */
  var cursorColor: tabrisLib.Color = js.native
  /**
    * Whether the text can be edited or not.
    */
  var editable: scala.Boolean = js.native
  /**
    * Label or icon to display on the keyboard 'confirmation' key. The key press can be captured via the
    * `accept` event. Setting an `enterKeyType` other than `default` will change the key behavior to not
    * close the keyboard automatically. The developer is able close the keyboard by removing the focus from
    * the `TextInput`.
    */
  var enterKeyType: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.done | tabrisLib.tabrisLibStrings.go | tabrisLib.tabrisLibStrings.next | tabrisLib.tabrisLibStrings.search | tabrisLib.tabrisLibStrings.send = js.native
  /**
    * The color of the background of the TextInput - applies only to iOS.
    */
  var fillColor: tabrisLib.Color = js.native
  /**
    * Reflects whether this widget has the keyboard focus. Setting this property to `true` will focus the
    * widget and open the virtual keyboard, setting it to `false` will remove the focus and hide the
    * virtual keyboard.
    */
  var focused: scala.Boolean = js.native
  /**
    * When `true` the `TextInput` will keep its focus, even when tapped outside of the widget bounds.
    */
  var keepFocus: scala.Boolean = js.native
  /**
    * Selects the keyboard type to use for editing this widget. Has no effect when `type` is set to
    * `multiline`.
    */
  var keyboard: tabrisLib.tabrisLibStrings.ascii | tabrisLib.tabrisLibStrings.decimal | tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.email | tabrisLib.tabrisLibStrings.number | tabrisLib.tabrisLibStrings.numbersAndPunctuation | tabrisLib.tabrisLibStrings.phone | tabrisLib.tabrisLibStrings.url = js.native
  /**
    * A hint text that is displayed when the input field is empty. Does not apply on iOS when `type` is set
    * to `multiline`.
    */
  var message: java.lang.String = js.native
  /**
    * Makes the text visible when the `TextInput` has the type `password`.
    */
  var revealPassword: scala.Boolean = js.native
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
  var selection: js.Array[scala.Double] = js.native
  /**
    * The text in the input field.
    */
  var text: java.lang.String = js.native
  /**
    * The color of the text.
    */
  var textColor: tabrisLib.Color = js.native
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_TextInput: tabrisLib.TextInputProperties = js.native
  /**
    * The type of the text widget. Windows 10 currently interprets `search`  as `default`.
    * @static
    */
  var `type`: tabrisLib.tabrisLibStrings.default | tabrisLib.tabrisLibStrings.multiline | tabrisLib.tabrisLibStrings.password | tabrisLib.tabrisLibStrings.search = js.native
  /**
    * Removes all listeners in the given object from the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to deregister from these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def off(listeners: TextInputEvents): this.type = js.native
  /**
    * Registers all listeners in the given object for the event type indicated by their key.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def on(listeners: TextInputEvents): this.type = js.native
  /**
    * Same as `on`, but removes the listener after it has been invoked by an event.
    * @param listeners A key-value map where the keys are event types and the values are the listeners to register for these events, e.g. `{tap: onTap, scroll: onScroll}`.
    */
  def once(listeners: TextInputEvents): this.type = js.native
}

