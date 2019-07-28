package typings.tabulatorDashTables.TabulatorNs

import typings.tabulatorDashTables.tabulatorDashTablesStrings.form
import typings.tabulatorDashTables.tabulatorDashTablesStrings.json
import typings.tabulatorDashTables.tabulatorDashTablesStrings.load
import typings.tabulatorDashTables.tabulatorDashTablesStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsData extends js.Object {
  /** The HTTP request type for Ajax requests or config object for the request	 */
  var ajaxConfig: js.UndefOr[HttpMethod | AjaxConfig] = js.undefined
  /** When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers. * * The ajaxContentType option can take one of two values:
    "form" - send parameters as form data (default option)
    "json" - send parameters as JSON encoded string
    If you want to use a custom content type then you can pass a content type formatter object into the ajaxContentType option. this object must have two properties, the headers property should contain all headers that should be sent with the request and the body property should contain a function that returns the body content of the request
    */
  var ajaxContentType: js.UndefOr[form | json | AjaxContentType] = js.undefined
  /** The ajaxError callback is triggered there is an error response to an ajax request. */
  var ajaxError: js.UndefOr[
    js.Function3[/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any, Unit]
  ] = js.undefined
  /** Send filter config to server instead of processing locally	 */
  var ajaxFiltering: js.UndefOr[Boolean] = js.undefined
  /** Show loader while data is loading, can also take a function that must return a boolean	 */
  var ajaxLoader: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  /** html for the loader element in the event of an error	 */
  var ajaxLoaderError: js.UndefOr[String] = js.undefined
  /** html for loader element	 */
  var ajaxLoaderLoading: js.UndefOr[String] = js.undefined
  /** Parameters to be passed to remote Ajax data loading request	 */
  var ajaxParams: js.UndefOr[js.Object] = js.undefined
  /** If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
    To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reusues the functionality of the pagination module to sequentially load the data.
    With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
    There are two different progressive loading modes, to give you a choice of how data is loaded into the table.	 */
  var ajaxProgressiveLoad: js.UndefOr[load | scroll] = js.undefined
  /** By default tabulator will make the requests to fill the table as quickly as possible. On some servers these repeates requests from the same client may trigger rate limiting or security systems. In this case you can use the ajaxProgressiveLoadDelay option to add a delay in milliseconds between each page request. */
  var ajaxProgressiveLoadDelay: js.UndefOr[Double] = js.undefined
  /** The ajaxProgressiveLoadScrollMargin property determines how close to the bottom of the table in pixels, the scroll bar must be before the next page worth of data is loaded, by default it is set to twice the height of the table. */
  var ajaxProgressiveLoadScrollMargin: js.UndefOr[Double] = js.undefined
  /** callback function to replace inbuilt ajax request functionality	 */
  var ajaxRequestFunc: js.UndefOr[
    js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, js.Promise[_]]
  ] = js.undefined
  /** The ajaxRequesting callback is triggered when ever an ajax request is made. */
  var ajaxRequesting: js.UndefOr[js.Function2[/* url */ String, /* params */ js.Any, Boolean]] = js.undefined
  /** The ajaxResponse callback is triggered when a successful ajax request has been made. This callback can also be used to modify the received data before it is parsed by the table. If you use this callback it must return the data to be parsed by Tabulator, otherwise no data will be rendered */
  var ajaxResponse: js.UndefOr[js.Function3[/* url */ String, /* params */ js.Any, /* response */ js.Any, _]] = js.undefined
  /** Send sorter config to server instead of processing locally	 */
  var ajaxSorting: js.UndefOr[Boolean] = js.undefined
  /** If you wish to retrieve your data from a remote source you can set the URL for the request in the ajaxURL option. */
  var ajaxURL: js.UndefOr[String] = js.undefined
  /** If you need more control over the url of the request that you can get from the ajaxURL and ajaxParams properties, the you can use the ajaxURLGenerator property to pass in a callback that will generate the URL for you.
    The callback should return a string representing the URL to be requested. */
  var ajaxURLGenerator: js.UndefOr[js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, String]] = js.undefined
  /** Array to hold data that should be loaded on table creation	 */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /** A unique index value should be present for each row of data if you want to be able to programatically alter that data at a later point, this should be either numeric or a string. By default Tabulator will look for this value in the id field for the data. If you wish to use a different field as the index, set this using the index option parameter. */
  var index: js.UndefOr[Double | String] = js.undefined
}

object OptionsData {
  @scala.inline
  def apply(
    ajaxConfig: HttpMethod | AjaxConfig = null,
    ajaxContentType: form | json | AjaxContentType = null,
    ajaxError: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Unit = null,
    ajaxFiltering: js.UndefOr[Boolean] = js.undefined,
    ajaxLoader: Boolean | js.Function0[Boolean] = null,
    ajaxLoaderError: String = null,
    ajaxLoaderLoading: String = null,
    ajaxParams: js.Object = null,
    ajaxProgressiveLoad: load | scroll = null,
    ajaxProgressiveLoadDelay: Int | Double = null,
    ajaxProgressiveLoadScrollMargin: Int | Double = null,
    ajaxRequestFunc: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_] = null,
    ajaxRequesting: (/* url */ String, /* params */ js.Any) => Boolean = null,
    ajaxResponse: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => _ = null,
    ajaxSorting: js.UndefOr[Boolean] = js.undefined,
    ajaxURL: String = null,
    ajaxURLGenerator: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => String = null,
    data: js.Array[_] = null,
    index: Double | String = null
  ): OptionsData = {
    val __obj = js.Dynamic.literal()
    if (ajaxConfig != null) __obj.updateDynamic("ajaxConfig")(ajaxConfig.asInstanceOf[js.Any])
    if (ajaxContentType != null) __obj.updateDynamic("ajaxContentType")(ajaxContentType.asInstanceOf[js.Any])
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction3(ajaxError))
    if (!js.isUndefined(ajaxFiltering)) __obj.updateDynamic("ajaxFiltering")(ajaxFiltering)
    if (ajaxLoader != null) __obj.updateDynamic("ajaxLoader")(ajaxLoader.asInstanceOf[js.Any])
    if (ajaxLoaderError != null) __obj.updateDynamic("ajaxLoaderError")(ajaxLoaderError)
    if (ajaxLoaderLoading != null) __obj.updateDynamic("ajaxLoaderLoading")(ajaxLoaderLoading)
    if (ajaxParams != null) __obj.updateDynamic("ajaxParams")(ajaxParams)
    if (ajaxProgressiveLoad != null) __obj.updateDynamic("ajaxProgressiveLoad")(ajaxProgressiveLoad.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadDelay != null) __obj.updateDynamic("ajaxProgressiveLoadDelay")(ajaxProgressiveLoadDelay.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadScrollMargin != null) __obj.updateDynamic("ajaxProgressiveLoadScrollMargin")(ajaxProgressiveLoadScrollMargin.asInstanceOf[js.Any])
    if (ajaxRequestFunc != null) __obj.updateDynamic("ajaxRequestFunc")(js.Any.fromFunction3(ajaxRequestFunc))
    if (ajaxRequesting != null) __obj.updateDynamic("ajaxRequesting")(js.Any.fromFunction2(ajaxRequesting))
    if (ajaxResponse != null) __obj.updateDynamic("ajaxResponse")(js.Any.fromFunction3(ajaxResponse))
    if (!js.isUndefined(ajaxSorting)) __obj.updateDynamic("ajaxSorting")(ajaxSorting)
    if (ajaxURL != null) __obj.updateDynamic("ajaxURL")(ajaxURL)
    if (ajaxURLGenerator != null) __obj.updateDynamic("ajaxURLGenerator")(js.Any.fromFunction3(ajaxURLGenerator))
    if (data != null) __obj.updateDynamic("data")(data)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsData]
  }
}

