package typings.yaireoTagify.mod

import typings.std.HTMLElement
import typings.yaireoTagify.yaireoTagifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for the dropdown feature at runtime.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait DropDownRuntimeSettings[T /* <: BaseTagData */] extends StObject {
  
  /**
    * Enable searching for accented items in the whitelist without typing exact match.
    * @default true
    */
  var accentedSearch: Boolean
  
  /**
    * Target node to which the suggestions dropdown is appended (only when
    * rendered). When `null`, appends to `document.body`.
    * @default null
    */
  var appendTarget: HTMLElement | Null
  
  /**
    * If `true`, match exact item when a suggestion is selected (from the
    * dropdown) and also more strict matching for duplicate items.
    * Ensure `fuzzySearch` is `false` for this to work.
    * @default false
    */
  var caseSensitive: Boolean
  
  /**
    * Custom class name for the dropdown suggestions list.
    * @default Empty string.
    */
  var classname: String
  
  /**
    * If `false`, keep typed text after selecting a suggestion.
    * @default true
    */
  var clearOnSelect: Boolean
  
  /**
    * Close the dropdown after selecting an item, if `enabled: 0` is set
    * (which means always show dropdown on focus).
    * @default true
    */
  var closeOnSelect: Boolean
  
  /**
    * Minimum characters input for showing a suggestions list.
    * `false` will not render a suggestions list.
    * @default 2
    */
  var enabled: Double | `false`
  
  /**
    * Enables filtering dropdown items values by string _containing_ and not only _beginning_.
    * @default true
    */
  var fuzzySearch: Boolean
  
  /**
    * When a suggestions list is shown, highlight the first item,
    * and also suggest it in the input (The suggestion can be accepted with → key).
    * @default false
    */
  var highlightFirst: Boolean
  
  /**
    * If `true`, the suggestions list includes already-selected tags (after filtering).
    * @default false
    */
  var includeSelectedTags: Boolean
  
  /**
    * If whitelist is an array of tag objects, this setting controls which
    * data key will be printed in the dropdown.
    * @default undefined
    */
  var mapValueTo: js.UndefOr[String | (js.Function1[/* data */ T, String])] = js.undefined
  
  /**
    * Maximum items to show in the suggestions list.
    * @default 10
    */
  var maxItems: Double
  
  /**
    * If defined, will force the placement of the dropdown:
    * - `true` - always show the suggestions dropdown above the input field
    * - `false` - always show the suggestions dropdown below the input field
    *
    * By default, this setting it not defined and the placement of the
    * dropdown is automatically decided according to the space available,
    * where opening it below the input is preferred.
    * @default undefined
    */
  var placeAbove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls where the dropdown menu is positioned.
    * @default 'all'
    */
  var position: DropDownPosition
  
  /**
    * When a user types something and trying to match the whitelist items
    * for suggestions, this setting allows matching other keys of a
    * whitelist objects.
    * @default ['value', 'searchBy']
    */
  var searchKeys: js.Array[String]
}
object DropDownRuntimeSettings {
  
  inline def apply[T /* <: BaseTagData */](
    accentedSearch: Boolean,
    caseSensitive: Boolean,
    classname: String,
    clearOnSelect: Boolean,
    closeOnSelect: Boolean,
    enabled: Double | `false`,
    fuzzySearch: Boolean,
    highlightFirst: Boolean,
    includeSelectedTags: Boolean,
    maxItems: Double,
    position: DropDownPosition,
    searchKeys: js.Array[String]
  ): DropDownRuntimeSettings[T] = {
    val __obj = js.Dynamic.literal(accentedSearch = accentedSearch.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], classname = classname.asInstanceOf[js.Any], clearOnSelect = clearOnSelect.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fuzzySearch = fuzzySearch.asInstanceOf[js.Any], highlightFirst = highlightFirst.asInstanceOf[js.Any], includeSelectedTags = includeSelectedTags.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], searchKeys = searchKeys.asInstanceOf[js.Any], appendTarget = null)
    __obj.asInstanceOf[DropDownRuntimeSettings[T]]
  }
  
  extension [Self <: DropDownRuntimeSettings[?], T /* <: BaseTagData */](x: Self & DropDownRuntimeSettings[T]) {
    
    inline def setAccentedSearch(value: Boolean): Self = StObject.set(x, "accentedSearch", value.asInstanceOf[js.Any])
    
    inline def setAppendTarget(value: HTMLElement): Self = StObject.set(x, "appendTarget", value.asInstanceOf[js.Any])
    
    inline def setAppendTargetNull: Self = StObject.set(x, "appendTarget", null)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
    
    inline def setClearOnSelect(value: Boolean): Self = StObject.set(x, "clearOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Double | `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFuzzySearch(value: Boolean): Self = StObject.set(x, "fuzzySearch", value.asInstanceOf[js.Any])
    
    inline def setHighlightFirst(value: Boolean): Self = StObject.set(x, "highlightFirst", value.asInstanceOf[js.Any])
    
    inline def setIncludeSelectedTags(value: Boolean): Self = StObject.set(x, "includeSelectedTags", value.asInstanceOf[js.Any])
    
    inline def setMapValueTo(value: String | (js.Function1[/* data */ T, String])): Self = StObject.set(x, "mapValueTo", value.asInstanceOf[js.Any])
    
    inline def setMapValueToFunction1(value: /* data */ T => String): Self = StObject.set(x, "mapValueTo", js.Any.fromFunction1(value))
    
    inline def setMapValueToUndefined: Self = StObject.set(x, "mapValueTo", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setPlaceAbove(value: Boolean): Self = StObject.set(x, "placeAbove", value.asInstanceOf[js.Any])
    
    inline def setPlaceAboveUndefined: Self = StObject.set(x, "placeAbove", js.undefined)
    
    inline def setPosition(value: DropDownPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSearchKeys(value: js.Array[String]): Self = StObject.set(x, "searchKeys", value.asInstanceOf[js.Any])
    
    inline def setSearchKeysVarargs(value: String*): Self = StObject.set(x, "searchKeys", js.Array(value*))
  }
}
