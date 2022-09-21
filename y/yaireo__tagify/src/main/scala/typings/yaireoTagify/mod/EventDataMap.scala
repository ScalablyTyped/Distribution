package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map between the events that are triggered by tagify and the data provided
  * for each event.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait EventDataMap[T /* <: BaseTagData */] extends StObject {
  
  /**
    * A tag has been added.
    */
  var add: AddEventData[T]
  
  /**
    * The component lost focus.
    */
  var blur: BlurEventData[T]
  
  /**
    * Any change to the value has occurred.
    */
  var change: ChangeEventData[T]
  
  /**
    * Clicking a tag.
    */
  var click: ClickEventData[T]
  
  /**
    * Double-clicking a tag.
    */
  var dblclick: DoubleClickEventData[T]
  
  /**
    * Suggestions dropdown has been removed from the DOM.
    */
  @JSName("dropdown:hide")
  var dropdownColonhide: DropDownHideEventData[T]
  
  /**
    * No whitelist suggestion item matched for the typed input. At this
    * point it is possible to manually set `suggestedListItems` to any
    * possible custom value, for example: `[{ value:"default" }]`.
    */
  @JSName("dropdown:noMatch")
  var dropdownColonnoMatch: DropDownNoMatchEventData[T]
  
  /**
    * The dropdown was scrolled by the user. Use `event.detail.percentage`
    * to get the percentage scrolled.
    */
  @JSName("dropdown:scroll")
  var dropdownColonscroll: DropDownScrollEventData[T]
  
  /**
    * A suggestions dropdown item got selected (by mouse / keyboard /
    * touch).
    */
  @JSName("dropdown:select")
  var dropdownColonselect: DropDownSelectEventData[T]
  
  /**
    * Suggestions dropdown is about to be rendered. The dropdown DOM node
    * is passed to the callback.
    */
  @JSName("dropdown:show")
  var dropdownColonshow: DropDownShowEventData[T]
  
  /**
    * When the dropdown menu is open and its items were recomputed via
    * `Tagify.refilter`.
    */
  @JSName("dropdown:updated")
  var dropdownColonupdated: DropDownUpdatedEventData[T]
  
  /**
    * Just before a tag has been updated, while still in "edit" mode.
    */
  @JSName("edit:beforeUpdate")
  var editColonbeforeUpdate: EditBeforeUpdateEventData[T]
  
  /**
    * Typing inside an edited tag.
    */
  @JSName("edit:input")
  var editColoninput: EditInputEventData[T]
  
  /**
    * Keydown event while an edited tag is in focus
    */
  @JSName("edit:keydown")
  var editColonkeydown: EditKeydownEventData[T]
  
  /**
    * A tag is now in "edit mode".
    */
  @JSName("edit:start")
  var editColonstart: EditStartEventData[T]
  
  /**
    * A tag has been updated (changed view editing or by directly calling
    * the `replaceTag` method).
    */
  @JSName("edit:updated")
  var editColonupdated: EditUpdatedEventData[T]
  
  /**
    * The component has received focus.
    */
  var focus: FocusEventData[T]
  
  /**
    * Input event, when a tag is being typed / edited.
    */
  var input: InputEventData[T]
  
  /**
    * A tag has been added but did not pass validation.
    */
  var invalid: InvalidTagEventData[T]
  
  /**
    * When the tagify input element (for adding new tags or editing
    * existing tags) has focus and a key was pressed.
    */
  var keydown: KeydownEventData[T]
  
  /**
    * A tag has been removed (use `removeTag` instead with jQuery).
    */
  var remove: RemoveEventData[T]
}
object EventDataMap {
  
  inline def apply[T /* <: BaseTagData */](
    add: AddEventData[T],
    blur: BlurEventData[T],
    change: ChangeEventData[T],
    click: ClickEventData[T],
    dblclick: DoubleClickEventData[T],
    dropdownColonhide: DropDownHideEventData[T],
    dropdownColonnoMatch: DropDownNoMatchEventData[T],
    dropdownColonscroll: DropDownScrollEventData[T],
    dropdownColonselect: DropDownSelectEventData[T],
    dropdownColonshow: DropDownShowEventData[T],
    dropdownColonupdated: DropDownUpdatedEventData[T],
    editColonbeforeUpdate: EditBeforeUpdateEventData[T],
    editColoninput: EditInputEventData[T],
    editColonkeydown: EditKeydownEventData[T],
    editColonstart: EditStartEventData[T],
    editColonupdated: EditUpdatedEventData[T],
    focus: FocusEventData[T],
    input: InputEventData[T],
    invalid: InvalidTagEventData[T],
    keydown: KeydownEventData[T],
    remove: RemoveEventData[T]
  ): EventDataMap[T] = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:hide")(dropdownColonhide.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:noMatch")(dropdownColonnoMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:scroll")(dropdownColonscroll.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:select")(dropdownColonselect.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:show")(dropdownColonshow.asInstanceOf[js.Any])
    __obj.updateDynamic("dropdown:updated")(dropdownColonupdated.asInstanceOf[js.Any])
    __obj.updateDynamic("edit:beforeUpdate")(editColonbeforeUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("edit:input")(editColoninput.asInstanceOf[js.Any])
    __obj.updateDynamic("edit:keydown")(editColonkeydown.asInstanceOf[js.Any])
    __obj.updateDynamic("edit:start")(editColonstart.asInstanceOf[js.Any])
    __obj.updateDynamic("edit:updated")(editColonupdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDataMap[T]]
  }
  
  extension [Self <: EventDataMap[?], T /* <: BaseTagData */](x: Self & EventDataMap[T]) {
    
    inline def setAdd(value: AddEventData[T]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: BlurEventData[T]): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setChange(value: ChangeEventData[T]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClick(value: ClickEventData[T]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setDblclick(value: DoubleClickEventData[T]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonhide(value: DropDownHideEventData[T]): Self = StObject.set(x, "dropdown:hide", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonnoMatch(value: DropDownNoMatchEventData[T]): Self = StObject.set(x, "dropdown:noMatch", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonscroll(value: DropDownScrollEventData[T]): Self = StObject.set(x, "dropdown:scroll", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonselect(value: DropDownSelectEventData[T]): Self = StObject.set(x, "dropdown:select", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonshow(value: DropDownShowEventData[T]): Self = StObject.set(x, "dropdown:show", value.asInstanceOf[js.Any])
    
    inline def setDropdownColonupdated(value: DropDownUpdatedEventData[T]): Self = StObject.set(x, "dropdown:updated", value.asInstanceOf[js.Any])
    
    inline def setEditColonbeforeUpdate(value: EditBeforeUpdateEventData[T]): Self = StObject.set(x, "edit:beforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setEditColoninput(value: EditInputEventData[T]): Self = StObject.set(x, "edit:input", value.asInstanceOf[js.Any])
    
    inline def setEditColonkeydown(value: EditKeydownEventData[T]): Self = StObject.set(x, "edit:keydown", value.asInstanceOf[js.Any])
    
    inline def setEditColonstart(value: EditStartEventData[T]): Self = StObject.set(x, "edit:start", value.asInstanceOf[js.Any])
    
    inline def setEditColonupdated(value: EditUpdatedEventData[T]): Self = StObject.set(x, "edit:updated", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: FocusEventData[T]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputEventData[T]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: InvalidTagEventData[T]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setKeydown(value: KeydownEventData[T]): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: RemoveEventData[T]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
  }
}
