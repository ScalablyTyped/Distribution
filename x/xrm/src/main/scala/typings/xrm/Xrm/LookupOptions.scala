package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for options used in Xrm.Utility.lookupObjects
  */
trait LookupOptions extends StObject {
  
  /**
    * Indicates whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default entity type to use.
    */
  var defaultEntityType: js.UndefOr[String] = js.undefined
  
  /**
    * The default view to use.
    */
  var defaultViewId: js.UndefOr[String] = js.undefined
  
  /**
    * Decides whether to display the most recently used(MRU) item.
    * @remarks Available only for Unified Interface.
    */
  var disableMru: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The entity types to display.
    */
  var entityTypes: js.Array[String]
  
  /**
    * Used to filter the results.
    */
  var filters: js.UndefOr[js.Array[LookupFilterOptions]] = js.undefined
  
  /**
    * Indicates the default search term for the lookup control.
    * This is supported only on Unified Interface.
    */
  var searchText: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The views to be available in the view picker. Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[String]] = js.undefined
}
object LookupOptions {
  
  inline def apply(entityTypes: js.Array[String]): LookupOptions = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiSelectUndefined: Self = StObject.set(x, "allowMultiSelect", js.undefined)
    
    inline def setDefaultEntityType(value: String): Self = StObject.set(x, "defaultEntityType", value.asInstanceOf[js.Any])
    
    inline def setDefaultEntityTypeUndefined: Self = StObject.set(x, "defaultEntityType", js.undefined)
    
    inline def setDefaultViewId(value: String): Self = StObject.set(x, "defaultViewId", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewIdUndefined: Self = StObject.set(x, "defaultViewId", js.undefined)
    
    inline def setDisableMru(value: Boolean): Self = StObject.set(x, "disableMru", value.asInstanceOf[js.Any])
    
    inline def setDisableMruUndefined: Self = StObject.set(x, "disableMru", js.undefined)
    
    inline def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value*))
    
    inline def setFilters(value: js.Array[LookupFilterOptions]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: LookupFilterOptions*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setShowBarcodeScanner(value: Boolean): Self = StObject.set(x, "showBarcodeScanner", value.asInstanceOf[js.Any])
    
    inline def setShowBarcodeScannerUndefined: Self = StObject.set(x, "showBarcodeScanner", js.undefined)
    
    inline def setViewIds(value: js.Array[String]): Self = StObject.set(x, "viewIds", value.asInstanceOf[js.Any])
    
    inline def setViewIdsUndefined: Self = StObject.set(x, "viewIds", js.undefined)
    
    inline def setViewIdsVarargs(value: String*): Self = StObject.set(x, "viewIds", js.Array(value*))
  }
}
