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
    * The entity types to display.
    */
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The views to be available in the view picker.Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[String]] = js.undefined
}
object LookupOptions {
  
  inline def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  extension [Self <: LookupOptions](x: Self) {
    
    inline def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
    
    inline def setAllowMultiSelectUndefined: Self = StObject.set(x, "allowMultiSelect", js.undefined)
    
    inline def setDefaultEntityType(value: String): Self = StObject.set(x, "defaultEntityType", value.asInstanceOf[js.Any])
    
    inline def setDefaultEntityTypeUndefined: Self = StObject.set(x, "defaultEntityType", js.undefined)
    
    inline def setDefaultViewId(value: String): Self = StObject.set(x, "defaultViewId", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewIdUndefined: Self = StObject.set(x, "defaultViewId", js.undefined)
    
    inline def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setShowBarcodeScanner(value: Boolean): Self = StObject.set(x, "showBarcodeScanner", value.asInstanceOf[js.Any])
    
    inline def setShowBarcodeScannerUndefined: Self = StObject.set(x, "showBarcodeScanner", js.undefined)
    
    inline def setViewIds(value: js.Array[String]): Self = StObject.set(x, "viewIds", value.asInstanceOf[js.Any])
    
    inline def setViewIdsUndefined: Self = StObject.set(x, "viewIds", js.undefined)
    
    inline def setViewIdsVarargs(value: String*): Self = StObject.set(x, "viewIds", js.Array(value :_*))
  }
}
