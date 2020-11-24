package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.form
import typings.tabulatorTables.tabulatorTablesStrings.json
import typings.tabulatorTables.tabulatorTablesStrings.load
import typings.tabulatorTables.tabulatorTablesStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsData extends js.Object {
  
  /** The HTTP request type for Ajax requests or config object for the request     */
  var ajaxConfig: js.UndefOr[HttpMethod | AjaxConfig] = js.native
  
  /** When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers. * * The ajaxContentType option can take one of two values:
    "form" - send parameters as form data (default option)
    "json" - send parameters as JSON encoded string
    If you want to use a custom content type then you can pass a content type formatter object into the ajaxContentType option. this object must have two properties, the headers property should contain all headers that should be sent with the request and the body property should contain a function that returns the body content of the request
    */
  var ajaxContentType: js.UndefOr[form | json | AjaxContentType] = js.native
  
  /** The ajaxError callback is triggered there is an error response to an ajax request. */
  var ajaxError: js.UndefOr[
    js.Function3[/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any, Unit]
  ] = js.native
  
  /** Send filter config to server instead of processing locally     */
  var ajaxFiltering: js.UndefOr[Boolean] = js.native
  
  /** Show loader while data is loading, can also take a function that must return a boolean     */
  var ajaxLoader: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
  /** html for the loader element in the event of an error     */
  var ajaxLoaderError: js.UndefOr[String] = js.native
  
  /** html for loader element     */
  var ajaxLoaderLoading: js.UndefOr[String] = js.native
  
  /** Parameters to be passed to remote Ajax data loading request     */
  var ajaxParams: js.UndefOr[js.Object] = js.native
  
  /** If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
    To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reusues the functionality of the pagination module to sequentially load the data.
    With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
    There are two different progressive loading modes, to give you a choice of how data is loaded into the table.     */
  var ajaxProgressiveLoad: js.UndefOr[load | scroll] = js.native
  
  /** By default tabulator will make the requests to fill the table as quickly as possible. On some servers these repeates requests from the same client may trigger rate limiting or security systems. In this case you can use the ajaxProgressiveLoadDelay option to add a delay in milliseconds between each page request. */
  var ajaxProgressiveLoadDelay: js.UndefOr[Double] = js.native
  
  /** The ajaxProgressiveLoadScrollMargin property determines how close to the bottom of the table in pixels, the scroll bar must be before the next page worth of data is loaded, by default it is set to twice the height of the table. */
  var ajaxProgressiveLoadScrollMargin: js.UndefOr[Double] = js.native
  
  /** callback function to replace inbuilt ajax request functionality     */
  var ajaxRequestFunc: js.UndefOr[
    js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, js.Promise[_]]
  ] = js.native
  
  /** The ajaxRequesting callback is triggered when ever an ajax request is made. */
  var ajaxRequesting: js.UndefOr[js.Function2[/* url */ String, /* params */ js.Any, Boolean]] = js.native
  
  /** The ajaxResponse callback is triggered when a successful ajax request has been made. This callback can also be used to modify the received data before it is parsed by the table. If you use this callback it must return the data to be parsed by Tabulator, otherwise no data will be rendered */
  var ajaxResponse: js.UndefOr[js.Function3[/* url */ String, /* params */ js.Any, /* response */ js.Any, _]] = js.native
  
  /** Send sorter config to server instead of processing locally     */
  var ajaxSorting: js.UndefOr[Boolean] = js.native
  
  /** If you wish to retrieve your data from a remote source you can set the URL for the request in the ajaxURL option. */
  var ajaxURL: js.UndefOr[String] = js.native
  
  /** If you need more control over the url of the request that you can get from the ajaxURL and ajaxParams properties, the you can use the ajaxURLGenerator property to pass in a callback that will generate the URL for you.
    The callback should return a string representing the URL to be requested. */
  var ajaxURLGenerator: js.UndefOr[js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, String]] = js.native
  
  /** Array to hold data that should be loaded on table creation     */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /** A unique index value should be present for each row of data if you want to be able to programatically alter that data at a later point, this should be either numeric or a string. By default Tabulator will look for this value in the id field for the data. If you wish to use a different field as the index, set this using the index option parameter. */
  var index: js.UndefOr[Double | String] = js.native
}
object OptionsData {
  
  @scala.inline
  def apply(): OptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsData]
  }
  
  @scala.inline
  implicit class OptionsDataOps[Self <: OptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjaxConfig(value: HttpMethod | AjaxConfig): Self = this.set("ajaxConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxConfig: Self = this.set("ajaxConfig", js.undefined)
    
    @scala.inline
    def setAjaxContentType(value: form | json | AjaxContentType): Self = this.set("ajaxContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxContentType: Self = this.set("ajaxContentType", js.undefined)
    
    @scala.inline
    def setAjaxError(value: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Unit): Self = this.set("ajaxError", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAjaxError: Self = this.set("ajaxError", js.undefined)
    
    @scala.inline
    def setAjaxFiltering(value: Boolean): Self = this.set("ajaxFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxFiltering: Self = this.set("ajaxFiltering", js.undefined)
    
    @scala.inline
    def setAjaxLoaderFunction0(value: () => Boolean): Self = this.set("ajaxLoader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAjaxLoader(value: Boolean | js.Function0[Boolean]): Self = this.set("ajaxLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxLoader: Self = this.set("ajaxLoader", js.undefined)
    
    @scala.inline
    def setAjaxLoaderError(value: String): Self = this.set("ajaxLoaderError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxLoaderError: Self = this.set("ajaxLoaderError", js.undefined)
    
    @scala.inline
    def setAjaxLoaderLoading(value: String): Self = this.set("ajaxLoaderLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxLoaderLoading: Self = this.set("ajaxLoaderLoading", js.undefined)
    
    @scala.inline
    def setAjaxParams(value: js.Object): Self = this.set("ajaxParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxParams: Self = this.set("ajaxParams", js.undefined)
    
    @scala.inline
    def setAjaxProgressiveLoad(value: load | scroll): Self = this.set("ajaxProgressiveLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxProgressiveLoad: Self = this.set("ajaxProgressiveLoad", js.undefined)
    
    @scala.inline
    def setAjaxProgressiveLoadDelay(value: Double): Self = this.set("ajaxProgressiveLoadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxProgressiveLoadDelay: Self = this.set("ajaxProgressiveLoadDelay", js.undefined)
    
    @scala.inline
    def setAjaxProgressiveLoadScrollMargin(value: Double): Self = this.set("ajaxProgressiveLoadScrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxProgressiveLoadScrollMargin: Self = this.set("ajaxProgressiveLoadScrollMargin", js.undefined)
    
    @scala.inline
    def setAjaxRequestFunc(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_]): Self = this.set("ajaxRequestFunc", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAjaxRequestFunc: Self = this.set("ajaxRequestFunc", js.undefined)
    
    @scala.inline
    def setAjaxRequesting(value: (/* url */ String, /* params */ js.Any) => Boolean): Self = this.set("ajaxRequesting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAjaxRequesting: Self = this.set("ajaxRequesting", js.undefined)
    
    @scala.inline
    def setAjaxResponse(value: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => _): Self = this.set("ajaxResponse", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAjaxResponse: Self = this.set("ajaxResponse", js.undefined)
    
    @scala.inline
    def setAjaxSorting(value: Boolean): Self = this.set("ajaxSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxSorting: Self = this.set("ajaxSorting", js.undefined)
    
    @scala.inline
    def setAjaxURL(value: String): Self = this.set("ajaxURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxURL: Self = this.set("ajaxURL", js.undefined)
    
    @scala.inline
    def setAjaxURLGenerator(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => String): Self = this.set("ajaxURLGenerator", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAjaxURLGenerator: Self = this.set("ajaxURLGenerator", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIndex(value: Double | String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
