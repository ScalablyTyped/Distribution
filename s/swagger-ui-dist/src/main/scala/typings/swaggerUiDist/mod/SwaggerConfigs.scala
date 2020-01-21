package typings.swaggerUiDist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.swaggerUiDist.swaggerUiDistStrings.full
import typings.swaggerUiDist.swaggerUiDistStrings.list
import typings.swaggerUiDist.swaggerUiDistStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerConfigs
  extends /* k */ StringDictionary[js.Any] {
  /**
    * URL to fetch external configuration document from.
    */
  var configUrl: js.UndefOr[String] = js.undefined
  /**
    * If set to true, enables deep linking for tags and operations. See the Deep Linking documentation for more information.
    */
  var deepLinking: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the default expansion setting for the operations and tags. It can be 'list' (expands only the tags), 'full' (expands the tags and operations) or 'none' (expands nothing).
    */
  var docExpansion: js.UndefOr[list | full | none] = js.undefined
  /**
    *  REQUIRED if dom_id is not provided. The HTML DOM element inside which SwaggerUI will put its user interface. Overrides dom_id.
    */
  var domNode: js.UndefOr[String | HTMLElement | Null] = js.undefined
  /**
    * REQUIRED if domNode is not provided. The ID of a DOM element inside which SwaggerUI will put its user interface.
    */
  var dom_id: js.UndefOr[String | Null] = js.undefined
  /**
    * The name of a component available via the plugin system to use as the top-level layout for Swagger UI.
    */
  var layout: js.UndefOr[String] = js.undefined
  /**
    * If set, limits the number of tagged operations displayed to at most this many. The default is to show all operations.
    */
  var maxDisplayedTags: js.UndefOr[Double] = js.undefined
  /**
    * Apply a sort to the operation list of each API.
    * It can be 'alpha' (sort by paths alphanumerically), 'method' (sort by HTTP method) or a function (see Array.prototype.sort() to know how sort function works).
    * Default is the order returned by the server unchanged.
    */
  var operationsSorter: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An array of plugin functions to use in Swagger UI.
    */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of presets to use in Swagger UI. Usually, you'll want to include ApisPreset if you use this option.
    */
  var presets: js.UndefOr[js.Array[_]] = js.undefined
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 requests.
    *  Accepts one argument requestInterceptor(request) and must return the modified request, or a Promise that resolves to the modified request.
    */
  var requestInterceptor: js.UndefOr[js.Function1[/* request */ SwaggerRequest, SwaggerRequest]] = js.undefined
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 responses.
    *  Accepts one argument responseInterceptor(response) and must return the modified response, or a Promise that resolves to the modified response.
    */
  var responseInterceptor: js.UndefOr[js.Function1[/* response */ SwaggerResponse, SwaggerResponse]] = js.undefined
  /**
    * A JavaScript object describing the OpenAPI definition. When used, the url parameter will not be parsed. This is useful for testing manually-generated definitions without hosting them.
    */
  var spec: js.UndefOr[Spec] = js.undefined
  /**
    * The URL pointing to API definition (normally swagger.json or swagger.yaml). Will be ignored if urls or spec is used.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * An array of API definition objects ([{url: "<url1>", name: "<name1>"},{url: "<url2>", name: "<name2>"}]) used by Topbar plugin. When used and Topbar plugin is enabled,
    * the url parameter will not be parsed. Names and URLs must be unique among all items in this array,
    * since they're used as identifiers.
    */
  var urls: js.UndefOr[js.Array[Url]] = js.undefined
}

object SwaggerConfigs {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    configUrl: String = null,
    deepLinking: js.UndefOr[Boolean] = js.undefined,
    docExpansion: list | full | none = null,
    domNode: String | HTMLElement = null,
    dom_id: String = null,
    layout: String = null,
    maxDisplayedTags: Int | Double = null,
    operationsSorter: () => Unit = null,
    plugins: js.Any = null,
    presets: js.Array[_] = null,
    requestInterceptor: /* request */ SwaggerRequest => SwaggerRequest = null,
    responseInterceptor: /* response */ SwaggerResponse => SwaggerResponse = null,
    spec: Spec = null,
    url: String = null,
    urls: js.Array[Url] = null
  ): SwaggerConfigs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (configUrl != null) __obj.updateDynamic("configUrl")(configUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(deepLinking)) __obj.updateDynamic("deepLinking")(deepLinking.asInstanceOf[js.Any])
    if (docExpansion != null) __obj.updateDynamic("docExpansion")(docExpansion.asInstanceOf[js.Any])
    if (domNode != null) __obj.updateDynamic("domNode")(domNode.asInstanceOf[js.Any])
    if (dom_id != null) __obj.updateDynamic("dom_id")(dom_id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxDisplayedTags != null) __obj.updateDynamic("maxDisplayedTags")(maxDisplayedTags.asInstanceOf[js.Any])
    if (operationsSorter != null) __obj.updateDynamic("operationsSorter")(js.Any.fromFunction0(operationsSorter))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (requestInterceptor != null) __obj.updateDynamic("requestInterceptor")(js.Any.fromFunction1(requestInterceptor))
    if (responseInterceptor != null) __obj.updateDynamic("responseInterceptor")(js.Any.fromFunction1(responseInterceptor))
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerConfigs]
  }
}

