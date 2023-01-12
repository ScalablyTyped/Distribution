package typings.tablesorter

import typings.tablesorter.storageStorageTypeMod.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsSaveSortOptionsMod {
  
  trait SaveSortOptions extends StObject {
    
    /**
      * A value indicating whether the sorting should be saved locally.
      */
    var saveSort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A url to a table for grouping settings together.
      */
    var storage_fixedUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the data-attribute to obtain an id for the table which allows grouping multiple tables together.
      */
    var storage_group: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the data-attribute to obtain a table url which allows grouping tables together across pages.
      */
    var storage_page: js.UndefOr[String] = js.undefined
    
    /**
      * The storage-type to use.
      */
    var storage_storageType: js.UndefOr[StorageType] = js.undefined
    
    /**
      * The id of the `saveSort`-settings.
      */
    var storage_tableId: js.UndefOr[String] = js.undefined
  }
  object SaveSortOptions {
    
    inline def apply(): SaveSortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveSortOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SaveSortOptions] (val x: Self) extends AnyVal {
      
      inline def setSaveSort(value: Boolean): Self = StObject.set(x, "saveSort", value.asInstanceOf[js.Any])
      
      inline def setSaveSortUndefined: Self = StObject.set(x, "saveSort", js.undefined)
      
      inline def setStorage_fixedUrl(value: String): Self = StObject.set(x, "storage_fixedUrl", value.asInstanceOf[js.Any])
      
      inline def setStorage_fixedUrlUndefined: Self = StObject.set(x, "storage_fixedUrl", js.undefined)
      
      inline def setStorage_group(value: String): Self = StObject.set(x, "storage_group", value.asInstanceOf[js.Any])
      
      inline def setStorage_groupUndefined: Self = StObject.set(x, "storage_group", js.undefined)
      
      inline def setStorage_page(value: String): Self = StObject.set(x, "storage_page", value.asInstanceOf[js.Any])
      
      inline def setStorage_pageUndefined: Self = StObject.set(x, "storage_page", js.undefined)
      
      inline def setStorage_storageType(value: StorageType): Self = StObject.set(x, "storage_storageType", value.asInstanceOf[js.Any])
      
      inline def setStorage_storageTypeUndefined: Self = StObject.set(x, "storage_storageType", js.undefined)
      
      inline def setStorage_tableId(value: String): Self = StObject.set(x, "storage_tableId", value.asInstanceOf[js.Any])
      
      inline def setStorage_tableIdUndefined: Self = StObject.set(x, "storage_tableId", js.undefined)
    }
  }
}
