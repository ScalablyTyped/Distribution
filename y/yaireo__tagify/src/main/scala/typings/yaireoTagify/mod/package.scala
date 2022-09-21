package typings.yaireoTagify.mod

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A tag has been added.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type AddEventData[T /* <: BaseTagData */] = TagEventData[T]

/**
  * The component lost focus.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type BlurEventData[T /* <: BaseTagData */] = FocusChangeEventData[T]

/**
  * Any change to the value has occurred.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type ChangeEventData[T /* <: BaseTagData */] = SingleEventData[T, String]

/**
  * Double-clicking a tag.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type DoubleClickEventData[T /* <: BaseTagData */] = TagEventData[T]

/**
  * Suggestions dropdown has been removed from the DOM.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type DropDownHideEventData[T /* <: BaseTagData */] = DropDownEventData[T]

/**
  * No whitelist suggestion item matched for the typed input. At this point
  * it is possible to manually set `suggestedListItems` to any possible
  * custom value, for example: `[{ value:"default" }]`.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type DropDownNoMatchEventData[T /* <: BaseTagData */] = SingleEventData[T, String]

/**
  * Suggestions dropdown is to be rendered. The dropdown DOM node is
  * passed in the callback.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type DropDownShowEventData[T /* <: BaseTagData */] = DropDownEventData[T]

/**
  * When the dropdown menu is open and its items were recomputed via
  * `Tagify.refilter`.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type DropDownUpdatedEventData[T /* <: BaseTagData */] = DropDownEventData[T]

/**
  * Just before a tag has been updated, while still in "edit" mode.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type EditBeforeUpdateEventData[T /* <: BaseTagData */] = TagEventData[T]

/**
  * Keydown event while an edited tag is in focus
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type EditKeydownEventData[T /* <: BaseTagData */] = KeyboardEventData[T]

/**
  * A tag as been updated (changed view editing or by directly calling
  * the `replaceTag` method).
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type EditUpdatedEventData[T /* <: BaseTagData */] = TagEventData[T]

/**
  * The component has received focus.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type FocusEventData[T /* <: BaseTagData */] = FocusChangeEventData[T]

/**
  * Event data for keyboard related events.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type KeyboardEventData[T /* <: BaseTagData */] = DomEventData[T, KeyboardEvent]

/**
  * When tagify input has focus and a key was pressed.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type KeydownEventData[T /* <: BaseTagData */] = KeyboardEventData[T]

/**
  * A tag has been removed (use `removeTag` instead with jQuery).
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type RemoveEventData[T /* <: BaseTagData */] = TagEventData[T]

/**
  * Optional settings for creating a new tagify instance. These can be used
  * to modify how the tagify component behaves.
  * @deprecated Just use {@link TagifySettings}.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
type TagifyConstructorSettings[T /* <: BaseTagData */] = TagifySettings[T]
