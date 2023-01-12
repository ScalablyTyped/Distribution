package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEditorParams
  extends StObject
     with SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  
  var clearable: js.UndefOr[Boolean] = js.undefined
  
  var emptyValue: js.UndefOr[Any] = js.undefined
  
  var filterDelay: js.UndefOr[Double] = js.undefined
  
  var filterFunc: js.UndefOr[
    js.Function4[/* term */ String, /* label */ String, /* value */ js.Array[String], /* item */ Any, Any]
  ] = js.undefined
  
  var filterRemote: js.UndefOr[Boolean] = js.undefined
  
  var freetext: js.UndefOr[Boolean] = js.undefined
  
  var itemFormatter: js.UndefOr[
    js.Function4[
      /* label */ String, 
      /* value */ String, 
      /* item */ Any, 
      /* element */ HTMLElement, 
      String
    ]
  ] = js.undefined
  
  var listOnEmpty: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[Boolean] = js.undefined
  
  var multiselect: js.UndefOr[Boolean] = js.undefined
  
  var placeholderEmpty: js.UndefOr[String] = js.undefined
  
  var placeholderLoading: js.UndefOr[String] = js.undefined
  
  var showListOnEmpty: js.UndefOr[Boolean] = js.undefined
  
  var sort: js.UndefOr[SortDirection] = js.undefined
  
  var values: js.UndefOr[`true` | (js.Array[Any | LabelValue | String]) | JSONRecord | String] = js.undefined
  
  var valuesLookup: js.UndefOr[RowRangeLookup] = js.undefined
  
  var valuesLookupField: js.UndefOr[String] = js.undefined
  
  var valuesURL: js.UndefOr[String] = js.undefined
  
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}
object ListEditorParams {
  
  inline def apply(): ListEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEditorParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEditorParams] (val x: Self) extends AnyVal {
    
    inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
    
    inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
    
    inline def setEmptyValue(value: Any): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    inline def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    inline def setFilterDelay(value: Double): Self = StObject.set(x, "filterDelay", value.asInstanceOf[js.Any])
    
    inline def setFilterDelayUndefined: Self = StObject.set(x, "filterDelay", js.undefined)
    
    inline def setFilterFunc(
      value: (/* term */ String, /* label */ String, /* value */ js.Array[String], /* item */ Any) => Any
    ): Self = StObject.set(x, "filterFunc", js.Any.fromFunction4(value))
    
    inline def setFilterFuncUndefined: Self = StObject.set(x, "filterFunc", js.undefined)
    
    inline def setFilterRemote(value: Boolean): Self = StObject.set(x, "filterRemote", value.asInstanceOf[js.Any])
    
    inline def setFilterRemoteUndefined: Self = StObject.set(x, "filterRemote", js.undefined)
    
    inline def setFreetext(value: Boolean): Self = StObject.set(x, "freetext", value.asInstanceOf[js.Any])
    
    inline def setFreetextUndefined: Self = StObject.set(x, "freetext", js.undefined)
    
    inline def setItemFormatter(
      value: (/* label */ String, /* value */ String, /* item */ Any, /* element */ HTMLElement) => String
    ): Self = StObject.set(x, "itemFormatter", js.Any.fromFunction4(value))
    
    inline def setItemFormatterUndefined: Self = StObject.set(x, "itemFormatter", js.undefined)
    
    inline def setListOnEmpty(value: Boolean): Self = StObject.set(x, "listOnEmpty", value.asInstanceOf[js.Any])
    
    inline def setListOnEmptyUndefined: Self = StObject.set(x, "listOnEmpty", js.undefined)
    
    inline def setMaxWidth(value: Boolean): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setPlaceholderEmpty(value: String): Self = StObject.set(x, "placeholderEmpty", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderEmptyUndefined: Self = StObject.set(x, "placeholderEmpty", js.undefined)
    
    inline def setPlaceholderLoading(value: String): Self = StObject.set(x, "placeholderLoading", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderLoadingUndefined: Self = StObject.set(x, "placeholderLoading", js.undefined)
    
    inline def setShowListOnEmpty(value: Boolean): Self = StObject.set(x, "showListOnEmpty", value.asInstanceOf[js.Any])
    
    inline def setShowListOnEmptyUndefined: Self = StObject.set(x, "showListOnEmpty", js.undefined)
    
    inline def setSort(value: SortDirection): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setValues(value: `true` | (js.Array[Any | LabelValue | String]) | JSONRecord | String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesLookup(value: RowRangeLookup): Self = StObject.set(x, "valuesLookup", value.asInstanceOf[js.Any])
    
    inline def setValuesLookupField(value: String): Self = StObject.set(x, "valuesLookupField", value.asInstanceOf[js.Any])
    
    inline def setValuesLookupFieldUndefined: Self = StObject.set(x, "valuesLookupField", js.undefined)
    
    inline def setValuesLookupUndefined: Self = StObject.set(x, "valuesLookup", js.undefined)
    
    inline def setValuesURL(value: String): Self = StObject.set(x, "valuesURL", value.asInstanceOf[js.Any])
    
    inline def setValuesURLUndefined: Self = StObject.set(x, "valuesURL", js.undefined)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Any | LabelValue | String)*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVerticalNavigation(value: editor | table | hybrid): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
    
    inline def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
  }
}
