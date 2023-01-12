package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.columns
import typings.tabulatorTables.tabulatorTablesStrings.cookie
import typings.tabulatorTables.tabulatorTablesStrings.filter
import typings.tabulatorTables.tabulatorTablesStrings.group
import typings.tabulatorTables.tabulatorTablesStrings.local
import typings.tabulatorTables.tabulatorTablesStrings.page
import typings.tabulatorTables.tabulatorTablesStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsPersistentConfiguration extends StObject {
  
  /** By setting the persistence property to true the table will persist the sort, filter, group (groupBy, groupStartOpen, groupHeader), pagination (paginationSize), and column (title, width, visibility, order) configuration of the table. */
  var persistence: js.UndefOr[`true` | PersistenceOptions] = js.undefined
  
  /** ID tag used to identify persistent storage information. */
  var persistenceID: js.UndefOr[String] = js.undefined
  
  /**
    * Persistence information can either be stored in a cookie or in the localStorage object, you can use the persistenceMode to choose which. It can take three possible values:
    *
    *  local - (string) Store the persistence information in the localStorage object
    *  cookie - (string) Store the persistence information in a cookie
    *  true - (boolean) check if localStorage is available and store persistence information, otherwise store in cookie (Default option)
    */
  var persistenceMode: js.UndefOr[local | cookie | `true`] = js.undefined
  
  /** The persistenceReaderFunc function will receive two arguments, the persistance id of the table, and the type of data to be written. This function must synchronously return the data in the format in which it was passed to the persistenceWriterFunc function. It should return a value of false if no data was present. */
  var persistenceReaderFunc: js.UndefOr[
    js.Function2[/* id */ String, /* type */ sort | filter | group | page | columns, Any]
  ] = js.undefined
  
  /** The persistenceWriterFunc function will receive three arguments, the persistance id of the table, the type of data to be written and an object or array representing the data */
  var persistenceWriterFunc: js.UndefOr[
    js.Function3[
      /* id */ String, 
      /* type */ sort | filter | group | page | columns, 
      /* data */ Any, 
      Any
    ]
  ] = js.undefined
  
  /** You can ensure the data filtering is stored for the next page load by setting the persistentFilter option to true. */
  var persistentFilter: js.UndefOr[Boolean] = js.undefined
  
  /** Enable persistent storage of column layout information. */
  var persistentLayout: js.UndefOr[Boolean] = js.undefined
  
  /** You can ensure the data sorting is stored for the next page load by setting the persistentSort option to true. */
  var persistentSort: js.UndefOr[Boolean] = js.undefined
}
object OptionsPersistentConfiguration {
  
  inline def apply(): OptionsPersistentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPersistentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsPersistentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPersistence(value: `true` | PersistenceOptions): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceID(value: String): Self = StObject.set(x, "persistenceID", value.asInstanceOf[js.Any])
    
    inline def setPersistenceIDUndefined: Self = StObject.set(x, "persistenceID", js.undefined)
    
    inline def setPersistenceMode(value: local | cookie | `true`): Self = StObject.set(x, "persistenceMode", value.asInstanceOf[js.Any])
    
    inline def setPersistenceModeUndefined: Self = StObject.set(x, "persistenceMode", js.undefined)
    
    inline def setPersistenceReaderFunc(value: (/* id */ String, /* type */ sort | filter | group | page | columns) => Any): Self = StObject.set(x, "persistenceReaderFunc", js.Any.fromFunction2(value))
    
    inline def setPersistenceReaderFuncUndefined: Self = StObject.set(x, "persistenceReaderFunc", js.undefined)
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setPersistenceWriterFunc(value: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ Any) => Any): Self = StObject.set(x, "persistenceWriterFunc", js.Any.fromFunction3(value))
    
    inline def setPersistenceWriterFuncUndefined: Self = StObject.set(x, "persistenceWriterFunc", js.undefined)
    
    inline def setPersistentFilter(value: Boolean): Self = StObject.set(x, "persistentFilter", value.asInstanceOf[js.Any])
    
    inline def setPersistentFilterUndefined: Self = StObject.set(x, "persistentFilter", js.undefined)
    
    inline def setPersistentLayout(value: Boolean): Self = StObject.set(x, "persistentLayout", value.asInstanceOf[js.Any])
    
    inline def setPersistentLayoutUndefined: Self = StObject.set(x, "persistentLayout", js.undefined)
    
    inline def setPersistentSort(value: Boolean): Self = StObject.set(x, "persistentSort", value.asInstanceOf[js.Any])
    
    inline def setPersistentSortUndefined: Self = StObject.set(x, "persistentSort", js.undefined)
  }
}
