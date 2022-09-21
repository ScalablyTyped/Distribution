package typings.yaireoTagify.mod

import typings.std.HTMLElement
import typings.yaireoTagify.yaireoTagifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for the dropdown feature that can be configured via the
  * `dropdown` option of the settings that are passed to tagify.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.DropDownRuntimeSettings<T>> */
trait DropDownSettings[T /* <: BaseTagData */] extends StObject {
  
  var accentedSearch: js.UndefOr[Boolean] = js.undefined
  
  var appendTarget: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var classname: js.UndefOr[String] = js.undefined
  
  var clearOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var enabled: js.UndefOr[Double | `false`] = js.undefined
  
  var fuzzySearch: js.UndefOr[Boolean] = js.undefined
  
  var highlightFirst: js.UndefOr[Boolean] = js.undefined
  
  var includeSelectedTags: js.UndefOr[Boolean] = js.undefined
  
  var mapValueTo: js.UndefOr[String | (js.Function1[/* data */ T, String])] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var placeAbove: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[DropDownPosition] = js.undefined
  
  var searchKeys: js.UndefOr[js.Array[String]] = js.undefined
}
object DropDownSettings {
  
  inline def apply[T /* <: BaseTagData */](): DropDownSettings[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownSettings[T]]
  }
  
  extension [Self <: DropDownSettings[?], T /* <: BaseTagData */](x: Self & DropDownSettings[T]) {
    
    inline def setAccentedSearch(value: Boolean): Self = StObject.set(x, "accentedSearch", value.asInstanceOf[js.Any])
    
    inline def setAccentedSearchUndefined: Self = StObject.set(x, "accentedSearch", js.undefined)
    
    inline def setAppendTarget(value: HTMLElement): Self = StObject.set(x, "appendTarget", value.asInstanceOf[js.Any])
    
    inline def setAppendTargetNull: Self = StObject.set(x, "appendTarget", null)
    
    inline def setAppendTargetUndefined: Self = StObject.set(x, "appendTarget", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
    
    inline def setClassnameUndefined: Self = StObject.set(x, "classname", js.undefined)
    
    inline def setClearOnSelect(value: Boolean): Self = StObject.set(x, "clearOnSelect", value.asInstanceOf[js.Any])
    
    inline def setClearOnSelectUndefined: Self = StObject.set(x, "clearOnSelect", js.undefined)
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    inline def setEnabled(value: Double | `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFuzzySearch(value: Boolean): Self = StObject.set(x, "fuzzySearch", value.asInstanceOf[js.Any])
    
    inline def setFuzzySearchUndefined: Self = StObject.set(x, "fuzzySearch", js.undefined)
    
    inline def setHighlightFirst(value: Boolean): Self = StObject.set(x, "highlightFirst", value.asInstanceOf[js.Any])
    
    inline def setHighlightFirstUndefined: Self = StObject.set(x, "highlightFirst", js.undefined)
    
    inline def setIncludeSelectedTags(value: Boolean): Self = StObject.set(x, "includeSelectedTags", value.asInstanceOf[js.Any])
    
    inline def setIncludeSelectedTagsUndefined: Self = StObject.set(x, "includeSelectedTags", js.undefined)
    
    inline def setMapValueTo(value: String | (js.Function1[/* data */ T, String])): Self = StObject.set(x, "mapValueTo", value.asInstanceOf[js.Any])
    
    inline def setMapValueToFunction1(value: /* data */ T => String): Self = StObject.set(x, "mapValueTo", js.Any.fromFunction1(value))
    
    inline def setMapValueToUndefined: Self = StObject.set(x, "mapValueTo", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setPlaceAbove(value: Boolean): Self = StObject.set(x, "placeAbove", value.asInstanceOf[js.Any])
    
    inline def setPlaceAboveUndefined: Self = StObject.set(x, "placeAbove", js.undefined)
    
    inline def setPosition(value: DropDownPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSearchKeys(value: js.Array[String]): Self = StObject.set(x, "searchKeys", value.asInstanceOf[js.Any])
    
    inline def setSearchKeysUndefined: Self = StObject.set(x, "searchKeys", js.undefined)
    
    inline def setSearchKeysVarargs(value: String*): Self = StObject.set(x, "searchKeys", js.Array(value*))
  }
}
