package typings.tabulatorTables.mod

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesStrings.array
import typings.tabulatorTables.tabulatorTablesStrings.form
import typings.tabulatorTables.tabulatorTablesStrings.json
import typings.tabulatorTables.tabulatorTablesStrings.load
import typings.tabulatorTables.tabulatorTablesStrings.scroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsData extends StObject {
  
  /** The HTTP request type for Ajax requests or config object for the request. */
  var ajaxConfig: js.UndefOr[HttpMethod | AjaxConfig] = js.undefined
  
  /**
    * When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers. * * The ajaxContentType option can take one of two values:
    * "form" - send parameters as form data (default option)
    * "json" - send parameters as JSON encoded string
    * If you want to use a custom content type then you can pass a content type formatter object into the ajaxContentType option. this object must have two properties, the headers property should contain all headers that should be sent with the request and the body property should contain a function that returns the body content of the request
    */
  var ajaxContentType: js.UndefOr[form | json | AjaxContentType] = js.undefined
  
  /** The ajaxError callback is triggered there is an error response to an ajax request. */
  var ajaxError: js.UndefOr[js.Function3[/* xhr */ Any, /* textStatus */ Any, /* errorThrown */ Any, Unit]] = js.undefined
  
  /** Send filter config to server instead of processing locally */
  var ajaxFiltering: js.UndefOr[Boolean] = js.undefined
  
  /** Show loader while data is loading, can also take a function that must return a boolean. */
  var ajaxLoader: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  
  /** html for the loader element in the event of an error. */
  var ajaxLoaderError: js.UndefOr[String] = js.undefined
  
  /** html for loader element. */
  var ajaxLoaderLoading: js.UndefOr[String] = js.undefined
  
  /** Parameters to be passed to remote Ajax data loading request. */
  var ajaxParams: js.UndefOr[js.Object] = js.undefined
  
  /** callback function to replace inbuilt ajax request functionality */
  var ajaxRequestFunc: js.UndefOr[
    js.Function3[/* url */ String, /* config */ Any, /* params */ Any, js.Promise[Any]]
  ] = js.undefined
  
  /** The ajaxRequesting callback is triggered when ever an ajax request is made. */
  var ajaxRequesting: js.UndefOr[js.Function2[/* url */ String, /* params */ Any, Boolean]] = js.undefined
  
  /** The ajaxResponse callback is triggered when a successful ajax request has been made. This callback can also be used to modify the received data before it is parsed by the table. If you use this callback it must return the data to be parsed by Tabulator, otherwise no data will be rendered. */
  var ajaxResponse: js.UndefOr[js.Function3[/* url */ String, /* params */ Any, /* response */ Any, Any]] = js.undefined
  
  /** Send sorter config to server instead of processing locally */
  var ajaxSorting: js.UndefOr[Boolean] = js.undefined
  
  /** If you wish to retrieve your data from a remote source you can set the URL for the request in the ajaxURL option. */
  var ajaxURL: js.UndefOr[String] = js.undefined
  
  /**
    * If you need more control over the url of the request that you can get from the ajaxURL and ajaxParams properties, the you can use the ajaxURLGenerator property to pass in a callback that will generate the URL for you.
    *
    * The callback should return a string representing the URL to be requested.
    */
  var ajaxURLGenerator: js.UndefOr[js.Function3[/* url */ String, /* config */ Any, /* params */ Any, String]] = js.undefined
  
  var autoTables: js.UndefOr[Boolean] = js.undefined
  
  /** Array to hold data that should be loaded on table creation. */
  var data: js.UndefOr[js.Array[Any]] = js.undefined
  
  var dataLoader: js.UndefOr[Boolean] = js.undefined
  
  var dataLoaderError: js.UndefOr[String] = js.undefined
  
  var dataLoaderErrorTimeout: js.UndefOr[Double] = js.undefined
  
  var dataLoaderLoading: js.UndefOr[String | HTMLElement] = js.undefined
  
  var filterMode: js.UndefOr[SortMode] = js.undefined
  
  var importFormat: js.UndefOr[array] = js.undefined
  
  /** A unique index value should be present for each row of data if you want to be able to programmatically alter that data at a later point, this should be either numeric or a string. By default Tabulator will look for this value in the id field for the data. If you wish to use a different field as the index, set this using the index option parameter. */
  var index: js.UndefOr[Double | String] = js.undefined
  
  /**
    * If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
    *
    * To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reuses the functionality of the pagination module to sequentially load the data.
    *
    * With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
    *
    * There are two different progressive loading modes, to give you a choice of how data is loaded into the table.
    */
  var progressiveLoad: js.UndefOr[load | scroll] = js.undefined
  
  /** By default tabulator will make the requests to fill the table as quickly as possible. On some servers these repeats requests from the same client may trigger rate limiting or security systems. In this case you can use the ajaxProgressiveLoadDelay option to add a delay in milliseconds between each page request. */
  var progressiveLoadDelay: js.UndefOr[Double] = js.undefined
  
  /** The ajaxProgressiveLoadScrollMargin property determines how close to the bottom of the table in pixels, the scroll bar must be before the next page worth of data is loaded, by default it is set to twice the height of the table. */
  var progressiveLoadScrollMargin: js.UndefOr[Double] = js.undefined
  
  var sortMode: js.UndefOr[SortMode] = js.undefined
}
object OptionsData {
  
  inline def apply(): OptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsData] (val x: Self) extends AnyVal {
    
    inline def setAjaxConfig(value: HttpMethod | AjaxConfig): Self = StObject.set(x, "ajaxConfig", value.asInstanceOf[js.Any])
    
    inline def setAjaxConfigUndefined: Self = StObject.set(x, "ajaxConfig", js.undefined)
    
    inline def setAjaxContentType(value: form | json | AjaxContentType): Self = StObject.set(x, "ajaxContentType", value.asInstanceOf[js.Any])
    
    inline def setAjaxContentTypeUndefined: Self = StObject.set(x, "ajaxContentType", js.undefined)
    
    inline def setAjaxError(value: (/* xhr */ Any, /* textStatus */ Any, /* errorThrown */ Any) => Unit): Self = StObject.set(x, "ajaxError", js.Any.fromFunction3(value))
    
    inline def setAjaxErrorUndefined: Self = StObject.set(x, "ajaxError", js.undefined)
    
    inline def setAjaxFiltering(value: Boolean): Self = StObject.set(x, "ajaxFiltering", value.asInstanceOf[js.Any])
    
    inline def setAjaxFilteringUndefined: Self = StObject.set(x, "ajaxFiltering", js.undefined)
    
    inline def setAjaxLoader(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "ajaxLoader", value.asInstanceOf[js.Any])
    
    inline def setAjaxLoaderError(value: String): Self = StObject.set(x, "ajaxLoaderError", value.asInstanceOf[js.Any])
    
    inline def setAjaxLoaderErrorUndefined: Self = StObject.set(x, "ajaxLoaderError", js.undefined)
    
    inline def setAjaxLoaderFunction0(value: () => Boolean): Self = StObject.set(x, "ajaxLoader", js.Any.fromFunction0(value))
    
    inline def setAjaxLoaderLoading(value: String): Self = StObject.set(x, "ajaxLoaderLoading", value.asInstanceOf[js.Any])
    
    inline def setAjaxLoaderLoadingUndefined: Self = StObject.set(x, "ajaxLoaderLoading", js.undefined)
    
    inline def setAjaxLoaderUndefined: Self = StObject.set(x, "ajaxLoader", js.undefined)
    
    inline def setAjaxParams(value: js.Object): Self = StObject.set(x, "ajaxParams", value.asInstanceOf[js.Any])
    
    inline def setAjaxParamsUndefined: Self = StObject.set(x, "ajaxParams", js.undefined)
    
    inline def setAjaxRequestFunc(value: (/* url */ String, /* config */ Any, /* params */ Any) => js.Promise[Any]): Self = StObject.set(x, "ajaxRequestFunc", js.Any.fromFunction3(value))
    
    inline def setAjaxRequestFuncUndefined: Self = StObject.set(x, "ajaxRequestFunc", js.undefined)
    
    inline def setAjaxRequesting(value: (/* url */ String, /* params */ Any) => Boolean): Self = StObject.set(x, "ajaxRequesting", js.Any.fromFunction2(value))
    
    inline def setAjaxRequestingUndefined: Self = StObject.set(x, "ajaxRequesting", js.undefined)
    
    inline def setAjaxResponse(value: (/* url */ String, /* params */ Any, /* response */ Any) => Any): Self = StObject.set(x, "ajaxResponse", js.Any.fromFunction3(value))
    
    inline def setAjaxResponseUndefined: Self = StObject.set(x, "ajaxResponse", js.undefined)
    
    inline def setAjaxSorting(value: Boolean): Self = StObject.set(x, "ajaxSorting", value.asInstanceOf[js.Any])
    
    inline def setAjaxSortingUndefined: Self = StObject.set(x, "ajaxSorting", js.undefined)
    
    inline def setAjaxURL(value: String): Self = StObject.set(x, "ajaxURL", value.asInstanceOf[js.Any])
    
    inline def setAjaxURLGenerator(value: (/* url */ String, /* config */ Any, /* params */ Any) => String): Self = StObject.set(x, "ajaxURLGenerator", js.Any.fromFunction3(value))
    
    inline def setAjaxURLGeneratorUndefined: Self = StObject.set(x, "ajaxURLGenerator", js.undefined)
    
    inline def setAjaxURLUndefined: Self = StObject.set(x, "ajaxURL", js.undefined)
    
    inline def setAutoTables(value: Boolean): Self = StObject.set(x, "autoTables", value.asInstanceOf[js.Any])
    
    inline def setAutoTablesUndefined: Self = StObject.set(x, "autoTables", js.undefined)
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataLoader(value: Boolean): Self = StObject.set(x, "dataLoader", value.asInstanceOf[js.Any])
    
    inline def setDataLoaderError(value: String): Self = StObject.set(x, "dataLoaderError", value.asInstanceOf[js.Any])
    
    inline def setDataLoaderErrorTimeout(value: Double): Self = StObject.set(x, "dataLoaderErrorTimeout", value.asInstanceOf[js.Any])
    
    inline def setDataLoaderErrorTimeoutUndefined: Self = StObject.set(x, "dataLoaderErrorTimeout", js.undefined)
    
    inline def setDataLoaderErrorUndefined: Self = StObject.set(x, "dataLoaderError", js.undefined)
    
    inline def setDataLoaderLoading(value: String | HTMLElement): Self = StObject.set(x, "dataLoaderLoading", value.asInstanceOf[js.Any])
    
    inline def setDataLoaderLoadingUndefined: Self = StObject.set(x, "dataLoaderLoading", js.undefined)
    
    inline def setDataLoaderUndefined: Self = StObject.set(x, "dataLoader", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFilterMode(value: SortMode): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    inline def setImportFormat(value: array): Self = StObject.set(x, "importFormat", value.asInstanceOf[js.Any])
    
    inline def setImportFormatUndefined: Self = StObject.set(x, "importFormat", js.undefined)
    
    inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setProgressiveLoad(value: load | scroll): Self = StObject.set(x, "progressiveLoad", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadDelay(value: Double): Self = StObject.set(x, "progressiveLoadDelay", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadDelayUndefined: Self = StObject.set(x, "progressiveLoadDelay", js.undefined)
    
    inline def setProgressiveLoadScrollMargin(value: Double): Self = StObject.set(x, "progressiveLoadScrollMargin", value.asInstanceOf[js.Any])
    
    inline def setProgressiveLoadScrollMarginUndefined: Self = StObject.set(x, "progressiveLoadScrollMargin", js.undefined)
    
    inline def setProgressiveLoadUndefined: Self = StObject.set(x, "progressiveLoad", js.undefined)
    
    inline def setSortMode(value: SortMode): Self = StObject.set(x, "sortMode", value.asInstanceOf[js.Any])
    
    inline def setSortModeUndefined: Self = StObject.set(x, "sortMode", js.undefined)
  }
}
