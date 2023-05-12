package typings.yaireoTagify.mod

import typings.std.CustomEvent
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Parameters
import typings.std.Partial
import typings.std.Selection
import typings.yaireoTagify.anon.Hide
import typings.yaireoTagify.anon.Value
import typings.yaireoTagify.yaireoTagifyBooleans.`false`
import typings.yaireoTagify.yaireoTagifyBooleans.`true`
import typings.yaireoTagify.yaireoTagifyStrings.add
import typings.yaireoTagify.yaireoTagifyStrings.blur
import typings.yaireoTagify.yaireoTagifyStrings.change
import typings.yaireoTagify.yaireoTagifyStrings.click
import typings.yaireoTagify.yaireoTagifyStrings.dblclick
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonhide
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonnoMatch
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonscroll
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonselect
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonshow
import typings.yaireoTagify.yaireoTagifyStrings.dropdownColonupdated
import typings.yaireoTagify.yaireoTagifyStrings.dropdownItemNoMatch
import typings.yaireoTagify.yaireoTagifyStrings.editColonbeforeUpdate
import typings.yaireoTagify.yaireoTagifyStrings.editColoninput
import typings.yaireoTagify.yaireoTagifyStrings.editColonkeydown
import typings.yaireoTagify.yaireoTagifyStrings.editColonstart
import typings.yaireoTagify.yaireoTagifyStrings.editColonupdated
import typings.yaireoTagify.yaireoTagifyStrings.focus
import typings.yaireoTagify.yaireoTagifyStrings.input
import typings.yaireoTagify.yaireoTagifyStrings.invalid
import typings.yaireoTagify.yaireoTagifyStrings.keydown
import typings.yaireoTagify.yaireoTagifyStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tagify class. This is the main entry point for creating a new tagify editor.
  * @template T Type of the tag data used by the tagify instance. Must contain at
  * least a `value` property. Defaults to {@link Tagify.TagData}, which allows
  * arbitrary properties. To enjoy more type safety, extend from
  * {@link Tagify.BaseTagData}, specify the allowed properties and use that as
  * the type parameter.
  */
@js.native
trait Tagify[T /* <: BaseTagData */] extends StObject {
  
  /**
    * References to DOM elements used by this tagify instance.
    */
  var DOM: DomReference = js.native
  
  /**
    * Reference to messages for reasons if tag validation fails.
    */
  var TEXTS: InvalidTagsMessages = js.native
  
  /**
    * Create an empty tag (optionally with predefined data) and enters edit
    * mode directly.
    * @param initialData Optional initial data for the new tag.
    */
  def addEmptyTag(): Unit = js.native
  def addEmptyTag(initialData: Partial[T]): Unit = js.native
  
  /**
    * Bypasses the normalization process in `addTags`, forcefully adding tags
    * at the last caret location or at the end, if there's no last caret
    * location saved (at `tagify.state.selection`).
    * @param tags Tags to add. When a string, it can be either a single word or
    * multiple words separated with a delimiter.
    */
  def addMixTags(tags: String): Unit = js.native
  def addMixTags(tags: js.Array[String | T]): Unit = js.native
  
  /**
    * Parse and add tags.
    * @param tags Tags to add. When a string, it can be either a single word or
    * multiple words separated with a delimiter.
    * @param clearInput If `true`, the input's value gets cleared after
    * adding tags.
    * @param skipInvalid If `true`, do not add, mark & remove invalid tags
    * (defaults to the current tagify settings).
    * @return List of HTML elements representing the tags that were added.
    */
  def addTags(tags: String): js.Array[HTMLElement] = js.native
  def addTags(tags: String, clearInput: Boolean): js.Array[HTMLElement] = js.native
  def addTags(tags: String, clearInput: Boolean, skipInvalid: Boolean): js.Array[HTMLElement] = js.native
  def addTags(tags: String, clearInput: Unit, skipInvalid: Boolean): js.Array[HTMLElement] = js.native
  def addTags(tags: js.Array[String | T]): js.Array[HTMLElement] = js.native
  def addTags(tags: js.Array[String | T], clearInput: Boolean): js.Array[HTMLElement] = js.native
  def addTags(tags: js.Array[String | T], clearInput: Boolean, skipInvalid: Boolean): js.Array[HTMLElement] = js.native
  def addTags(tags: js.Array[String | T], clearInput: Unit, skipInvalid: Boolean): js.Array[HTMLElement] = js.native
  
  /**
    * Clears data for the specific instance by `key` parameter.
    * If the `key` parameter is omitted, clears all persisted data related to this instance (by its `id` which was set in the settings).
    * @param key `localStorage` key (under the tagify namespace).
    */
  def clearPersistedData(): Unit = js.native
  def clearPersistedData(key: String): Unit = js.native
  
  /**
    * Creates a new tag DOM element with the given data.
    * @param tagData Data to use for creating the tag.
    * @returns A new tag element from the supplied tag data.
    */
  def createTagElem(tagData: T): HTMLElement = js.native
  
  /**
    * Reverts the input element back as it was before Tagify was applied.
    */
  def destroy(): Unit = js.native
  
  /**
    * Dropdown specific methods.
    */
  var dropdown: Hide = js.native
  
  /**
    * Switches a tag into edit mode so that it can be edited by the user.
    * @param tagElm The tag element to edit. If none is given, use the last
    * tag.
    * @return This tagify instance for chaining methods.
    */
  def editTag(): this.type = js.native
  def editTag(tagElm: HTMLElement): this.type = js.native
  
  /**
    * @param tagData Tag for which to retrieve its HTML attributes.
    * @returns A string of HTML element attributes for the given tag.
    */
  def getAttributes(tagData: T): String = js.native
  
  /**
    * Get `value` (array of tag data) without properties that are only used internally.
    * @return A list of tag data without internal properties (that usually start with two underscores).
    */
  def getCleanValue(): js.Array[T] = js.native
  
  /**
    * Get `value` (array of tag data) as string. If in mixed mode, get the current value entered in the tagify
    * input field {@link getMixedTagsAsString}.
    * @return Stringified tag data.
    */
  def getInputValue(): String = js.native
  
  /**
    * Should only be used when in mixed mode.
    *
    * Creates a string representing the current value entered in the tagify
    * input field. In mixed mode, both tags and plain text content may be
    * entered. The string that is returned will have tags enclosed in the
    * delimiters as specified by `mixTagsInterpolator`. For example, when
    * `mixTagsInterpolator` was not changed from its default:
    *
    * ```text
    * [[{"id":101,"value":"cartman","title":"Eric Cartman"}]] does not know [[{"value":"homer simpson","readonly":true}]] because he's a relic.
    * ```
    *
    * @return When not in mixed mode: the empty string. When in mixed mode: a
    * string with the entire content currently entered in the tagify input
    * fields, with tags enclosed in the delimiters as specified by the
    * `mixTagsInterpolator` setting.
    */
  def getMixedTagsAsString(): String = js.native
  
  /**
    * Get data for the specific instance by `key` parameter from `localStorage`.
    * @param key `localStorage` key (under the tagify namespace).
    * @returns Data stored under `key` in `localStorage`.
    * Returns `undefined` if {@link TagifyConstructorSettings.id} has not been set or no entry exists for `key` in `localStorage`.
    */
  def getPersistedData(key: String): Any = js.native
  
  /**
    * Gets the tag data of the given tag element.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @return The data for the tag. `undefined` when no tag data was found or
    * the element is not an existing tag.
    */
  def getSetTagData(tagElm: HTMLElement): js.UndefOr[T] = js.native
  /**
    * Sets the data of the given tag element to the given value.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param data New data to set on the tag. Replaces the values for the given
    * properties. Properties not given remain unchanged.
    * @param override `undefined` or `false` to assign the given data to the
    * tag's data and keep other properties.
    * @return The new tag data for the tag, or the given data when the element
    * is not an existing tag.
    */
  def getSetTagData[P /* <: Partial[T] */](tagElm: HTMLElement, data: P): P | T = js.native
  @JSName("getSetTagData")
  def getSetTagData_false[P /* <: Partial[T] */](tagElm: HTMLElement, data: P, `override`: `false`): P | T = js.native
  /**
    * Sets the data of the given tag element to the given value.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param data New data to set on the tag. Replaces the values for the given
    * properties. Properties not given remain unchanged.
    * @param override `true` to replace all the entire tag data with the given
    * data.
    * @return The new tag data for the tag, or the given data when the element
    * is not an existing tag.
    */
  @JSName("getSetTagData")
  def getSetTagData_true(tagElm: HTMLElement, data: T, `override`: `true`): T = js.native
  
  /**
    * @param value Value to search for in the text content of the current tags.
    * @returns The DOM node for the first matching tag. `undefined` when no
    * matching tag was found.
    */
  def getTagElmByValue(value: String): js.UndefOr[HTMLElement] = js.native
  
  /**
    * @param classes - Filter by set of class names
    * @return A list of DOM nodes of all the tags, optionally filtered by the
    * given class names. Empty array when there are no tags.
    */
  def getTagElms(classes: String*): js.Array[HTMLElement] = js.native
  
  /**
    * @param value Value to search for in the text content of the current tags.
    * @returns The 0-based indices of the matching tags. Empty array when no
    * matching tag was found.
    */
  def getTagIndexByValue(value: String): js.Array[Double] = js.native
  
  /**
    * Get the HTML element which has the actual tag's content
    * (by default those with the `tagify__tag-text` class).
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @return The node which has the actual tag's content.
    */
  def getTagTextNode(tagElm: HTMLElement): HTMLElement = js.native
  
  /**
    * @param value Value to search for.
    * @param property Optional property whose value is used for the search.
    * Defaults to `value` when not given. The property will be converted to a
    * string and compared to the search value.
    * @param whitelist List of tag in which to search. When no given, uses the
    * current whitelist setting of this tagify instance.
    * @returns An array of found matching items (case-insensitive).
    */
  def getWhitelistItem(value: String): js.Array[T] = js.native
  def getWhitelistItem(value: String, property: /* keyof T */ String): js.Array[T] = js.native
  def getWhitelistItem(value: String, property: /* keyof T */ String, whitelist: js.Array[String | T]): js.Array[T] = js.native
  def getWhitelistItem(value: String, property: Unit, whitelist: js.Array[String | T]): js.Array[T] = js.native
  
  /**
    * Injects text or HTML node at last caret position,
    * which is saved on the "state" when "blur" event gets triggered.
    * @param injectedNode The text content or node to inject at the current
    * caret position.
    * @param range Optional range object, must have `anchorNode` and
    * `anchorOffset` set.
    * @return This tagify instance for chaining methods.
    */
  def injectAtCaret(injectedNode: String): this.type = js.native
  def injectAtCaret(injectedNode: String, range: Selection): this.type = js.native
  def injectAtCaret(injectedNode: HTMLElement): this.type = js.native
  def injectAtCaret(injectedNode: HTMLElement, range: Selection): this.type = js.native
  
  /**
    * Inserts text or a node after the given tag.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param newNode Text content or node to insert.
    * @return The newly inserted node. A new node is created when a string is
    * given.
    */
  def insertAfterTag(tagElm: HTMLElement, newNode: String): HTMLElement = js.native
  def insertAfterTag(tagElm: HTMLElement, newNode: HTMLElement): HTMLElement = js.native
  
  def isTagDuplicate(value: T): Double | `false` = js.native
  def isTagDuplicate(value: T, caseSensitive: Boolean): Double | `false` = js.native
  /**
    * @param value Value to search for in the `value` property` of the
    * existing tags.
    * @param caseSensitive Whether the search for tags should be
    * case-sensitive.
    * @returns When the `mode` is set to `select`, this returns `false`.
    * Otherwise, this returns how many tags with the given value already exist.
    */
  def isTagDuplicate(value: String): Double | `false` = js.native
  def isTagDuplicate(value: String, caseSensitive: Boolean): Double | `false` = js.native
  
  /**
    * Converts the given value into tags. This method gets called
    * automatically when instantiating Tagify. Also works for mixed tags.
    * @param value Value to convert to tags. When not given, the value of
    * the hidden INPUT or TEXTAREA element is used.
    */
  def loadOriginalValues(value: String): Unit = js.native
  def loadOriginalValues(value: js.Array[String]): Unit = js.native
  
  /**
    * Toggle loading state on/off (e.g. for AJAX whitelist pulling)
    * @param loading `true` to switch to the loading state, `false` to switch out of
    * the loading state.
    * @return This tagify instance for chaining methods.
    */
  def loading(loading: Boolean): this.type = js.native
  
  /**
    * Removes a listener previously added via `on`.
    * @template K Name of the event.
    * @param event Name of the event.
    * @param callback Callback listener to remove.
    * @returns This tagify instance for chaining method calls.
    */
  @JSName("off")
  def off_add(event: add, callback: js.Function1[/* event */ CustomEvent[AddEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_blur(event: blur, callback: js.Function1[/* event */ CustomEvent[BlurEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_change(event: change, callback: js.Function1[/* event */ CustomEvent[ChangeEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_click(event: click, callback: js.Function1[/* event */ CustomEvent[ClickEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_dblclick(event: dblclick, callback: js.Function1[/* event */ CustomEvent[DoubleClickEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_dropdownhide(
    event: dropdownColonhide,
    callback: js.Function1[/* event */ CustomEvent[DropDownHideEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropdownnoMatch(
    event: dropdownColonnoMatch,
    callback: js.Function1[/* event */ CustomEvent[DropDownNoMatchEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropdownscroll(
    event: dropdownColonscroll,
    callback: js.Function1[/* event */ CustomEvent[DropDownScrollEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropdownselect(
    event: dropdownColonselect,
    callback: js.Function1[/* event */ CustomEvent[DropDownSelectEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropdownshow(
    event: dropdownColonshow,
    callback: js.Function1[/* event */ CustomEvent[DropDownShowEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dropdownupdated(
    event: dropdownColonupdated,
    callback: js.Function1[/* event */ CustomEvent[DropDownUpdatedEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_editbeforeUpdate(
    event: editColonbeforeUpdate,
    callback: js.Function1[/* event */ CustomEvent[EditBeforeUpdateEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_editinput(
    event: editColoninput,
    callback: js.Function1[/* event */ CustomEvent[EditInputEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_editkeydown(
    event: editColonkeydown,
    callback: js.Function1[/* event */ CustomEvent[EditKeydownEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_editstart(
    event: editColonstart,
    callback: js.Function1[/* event */ CustomEvent[EditStartEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_editupdated(
    event: editColonupdated,
    callback: js.Function1[/* event */ CustomEvent[EditUpdatedEventData[T]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_focus(event: focus, callback: js.Function1[/* event */ CustomEvent[FocusEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_input(event: input, callback: js.Function1[/* event */ CustomEvent[InputEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_invalid(event: invalid, callback: js.Function1[/* event */ CustomEvent[InvalidTagEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_keydown(event: keydown, callback: js.Function1[/* event */ CustomEvent[KeydownEventData[T]], Unit]): this.type = js.native
  @JSName("off")
  def off_remove(event: remove, callback: js.Function1[/* event */ CustomEvent[RemoveEventData[T]], Unit]): this.type = js.native
  
  /**
    * Adds a listener for the given event to this tagify instance.
    * @template K Name of the event to which to listen.
    * @param event Name of the event to which to listen.
    * @param callback Callback listener invoked when the event occurs.
    * @returns This tagify instance for chaining method calls.
    */
  @JSName("on")
  def on_add(event: add, callback: js.Function1[/* event */ CustomEvent[AddEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_blur(event: blur, callback: js.Function1[/* event */ CustomEvent[BlurEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, callback: js.Function1[/* event */ CustomEvent[ChangeEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_click(event: click, callback: js.Function1[/* event */ CustomEvent[ClickEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_dblclick(event: dblclick, callback: js.Function1[/* event */ CustomEvent[DoubleClickEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_dropdownhide(
    event: dropdownColonhide,
    callback: js.Function1[/* event */ CustomEvent[DropDownHideEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropdownnoMatch(
    event: dropdownColonnoMatch,
    callback: js.Function1[/* event */ CustomEvent[DropDownNoMatchEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropdownscroll(
    event: dropdownColonscroll,
    callback: js.Function1[/* event */ CustomEvent[DropDownScrollEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropdownselect(
    event: dropdownColonselect,
    callback: js.Function1[/* event */ CustomEvent[DropDownSelectEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropdownshow(
    event: dropdownColonshow,
    callback: js.Function1[/* event */ CustomEvent[DropDownShowEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dropdownupdated(
    event: dropdownColonupdated,
    callback: js.Function1[/* event */ CustomEvent[DropDownUpdatedEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_editbeforeUpdate(
    event: editColonbeforeUpdate,
    callback: js.Function1[/* event */ CustomEvent[EditBeforeUpdateEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_editinput(
    event: editColoninput,
    callback: js.Function1[/* event */ CustomEvent[EditInputEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_editkeydown(
    event: editColonkeydown,
    callback: js.Function1[/* event */ CustomEvent[EditKeydownEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_editstart(
    event: editColonstart,
    callback: js.Function1[/* event */ CustomEvent[EditStartEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_editupdated(
    event: editColonupdated,
    callback: js.Function1[/* event */ CustomEvent[EditUpdatedEventData[T]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_focus(event: focus, callback: js.Function1[/* event */ CustomEvent[FocusEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_input(event: input, callback: js.Function1[/* event */ CustomEvent[InputEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_invalid(event: invalid, callback: js.Function1[/* event */ CustomEvent[InvalidTagEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_keydown(event: keydown, callback: js.Function1[/* event */ CustomEvent[KeydownEventData[T]], Unit]): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, callback: js.Function1[/* event */ CustomEvent[RemoveEventData[T]], Unit]): this.type = js.native
  
  /**
    * Converts a string argument (such as `[[foo]] and [[bar]] are...`) into
    * HTML with mixed tags & texts.
    * @param value A value with tags to parse.
    * @return The parsed HTML with mixed tags & texts.
    */
  def parseMixTags(value: String): String = js.native
  
  /**
    * Converts a template string into a DOM node.
    * @template Args Arguments passed to the template function.
    * @param template A template function which returns a string.
    * @param data Arguments passed to the template function.
    * @returns The rendered HTML string.
    */
  def parseTemplate[Args /* <: js.Array[Any] */](template: js.Function1[/* args */ Args, String], data: Args): HTMLElement = js.native
  /**
    * Converts a template string into a DOM node.
    * @template K The name of a template from `settings.templates`.
    * @param template The name of a template from `settings.templates`.
    * @param data Arguments passed to the template function.
    * @returns The rendered HTML string.
    */
  @JSName("parseTemplate")
  def parseTemplate_dropdownItemNoMatch(
    template: dropdownItemNoMatch,
    data: Parameters[
      Exclude[(js.ThisFunction1[/* this */ Tagify[T], /* data */ Value, String]) | Null, Null]
    ]
  ): HTMLElement = js.native
  
  /**
    * Places the caret after a given node.
    * @param node Node after which to place the caret.
    */
  def placeCaretAfterNode(node: HTMLElement): Unit = js.native
  
  /**
    * Removes all tags and resets the original input tag's value property.
    * @param opts Optional settings to affect whether events are triggered.
    */
  def removeAllTags(): Unit = js.native
  def removeAllTags(opts: RemoveAllTagsOptions): Unit = js.native
  
  /**
    * Remove single/multiple tags. When nothing is passed, removes the last
    * tag.
    * @param tagElms DOM element(s) or a String value
    * @param silent A flag, which when turned on, does not remove any value and
    * does not update the original input value but simply removes the tag from
    * tagify.
    * @param tranDuration - Delay for animation in milliseconds, after which
    * the tag will be removed from the DOM.
    */
  def removeTags(): Unit = js.native
  def removeTags(tagElms: String): Unit = js.native
  def removeTags(tagElms: String, silent: Boolean): Unit = js.native
  def removeTags(tagElms: String, silent: Boolean, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: String, silent: Unit, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: js.Array[HTMLElement]): Unit = js.native
  def removeTags(tagElms: js.Array[HTMLElement], silent: Boolean): Unit = js.native
  def removeTags(tagElms: js.Array[HTMLElement], silent: Boolean, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: js.Array[HTMLElement], silent: Unit, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: Unit, silent: Boolean): Unit = js.native
  def removeTags(tagElms: Unit, silent: Boolean, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: Unit, silent: Unit, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: HTMLElement): Unit = js.native
  def removeTags(tagElms: HTMLElement, silent: Boolean): Unit = js.native
  def removeTags(tagElms: HTMLElement, silent: Boolean, tranDuration: Double): Unit = js.native
  def removeTags(tagElms: HTMLElement, silent: Unit, tranDuration: Double): Unit = js.native
  
  /**
    * Replaces an existing tag with a new one. Used for updating a tag's data.
    * Also exits the tag's edit mode.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param tagData The new tag data for the tag.
    */
  def replaceTag(tagElm: HTMLElement, tagData: T): Unit = js.native
  
  /**
    * Toggles "disabled" mode on/off.
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  
  /**
    * Set data for the specific instance.
    * Must supply a second parameter which will be the key to save the data in the `localStorage`
    * (under the tagify namespace).
    * In order to use this method, {@link TagifyConstructorSettings.id} must be set.
    * @param data Data to store in `localStorage`.
    * @param key `localStorage` key (under the tagify namespace).
    */
  def setPersistedData(data: Any, key: String): Unit = js.native
  
  /**
    * Switches read-only mode on or off.
    * @param readonly `true` to switch the tagify instance to read-only mode,
    * `false` to switch off read-only mode.
    */
  def setReadonly(readonly: Boolean): Unit = js.native
  
  /**
    * Set the text of a tag (DOM only, does not affect the actual data).
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param html New text/html string.
    */
  def setTagTextNode(tagElm: HTMLElement, html: String): Unit = js.native
  
  /**
    * The current settings of this tagify instance.
    */
  var settings: TagifyRuntimeSettings[T] = js.native
  
  /**
    * List with the currently available options for the dropdown.
    */
  var suggestedListItems: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * Toggle specific tag loading state on or off.
    * @param tagElm A tag HTML element (by default those with the `tagify__tag`
    * class).
    * @param loading `true` to switch the tag to the loading state, `false` to
    * switch it out of the loading state.
    * @return This tagify instance for chaining methods.
    */
  def tagLoading(tagElm: HTMLElement, loading: Boolean): this.type = js.native
  
  /**
    * Toggles the given class on the main tagify container (`scope`).
    * @param className Name of the class to toggle.
    * @param force If not given, adds the class to the element if not present
    * and removes it when present. If `true`, adds the class to the element.
    * If `false`, removes the class from the element.
    */
  def toggleClass(className: String): Unit = js.native
  def toggleClass(className: String, force: Boolean): Unit = js.native
  
  /**
    * Update the value of the original (hidden) INPUT or TEXTAREA field so that
    * it reflects the currently selected tags.
    * @param opts Optional settings that affect how the update is performed.
    * Can be used to suppress the change event.
    */
  def update(): Unit = js.native
  def update(opts: UpdateOptions): Unit = js.native
  
  /**
    * Update `value` (array of tag data) by traversing all valid tags.
    *
    * Iterates all tag DOM nodes and rebuilds the `value` array. Call this if
    * tags get sorted manually.
    */
  def updateValueByDOMTags(): Unit = js.native
  
  /**
    * Array with tag data of the currently selected tags.
    */
  var value: js.Array[T] = js.native
  
  /**
    * Get or dynamically set whitelist.
    */
  var whitelist: js.Array[String | T] = js.native
}
