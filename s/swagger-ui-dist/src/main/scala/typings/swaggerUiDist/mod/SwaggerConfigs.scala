package typings.swaggerUiDist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.swaggerUiDist.swaggerUiDistStrings.full
import typings.swaggerUiDist.swaggerUiDistStrings.list
import typings.swaggerUiDist.swaggerUiDistStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerConfigs
  extends /* k */ StringDictionary[js.Any] {
  /**
    * URL to fetch external configuration document from.
    */
  var configUrl: js.UndefOr[String] = js.native
  /**
    * If set to true, enables deep linking for tags and operations. See the Deep Linking documentation for more information.
    */
  var deepLinking: js.UndefOr[Boolean] = js.native
  /**
    * Controls the default expansion setting for the operations and tags. It can be 'list' (expands only the tags), 'full' (expands the tags and operations) or 'none' (expands nothing).
    */
  var docExpansion: js.UndefOr[list | full | none] = js.native
  /**
    *  REQUIRED if dom_id is not provided. The HTML DOM element inside which SwaggerUI will put its user interface. Overrides dom_id.
    */
  var domNode: js.UndefOr[String | HTMLElement | Null] = js.native
  /**
    * REQUIRED if domNode is not provided. The ID of a DOM element inside which SwaggerUI will put its user interface.
    */
  var dom_id: js.UndefOr[String | Null] = js.native
  /**
    * The name of a component available via the plugin system to use as the top-level layout for Swagger UI.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * If set, limits the number of tagged operations displayed to at most this many. The default is to show all operations.
    */
  var maxDisplayedTags: js.UndefOr[Double] = js.native
  /**
    * Apply a sort to the operation list of each API.
    * It can be 'alpha' (sort by paths alphanumerically), 'method' (sort by HTTP method) or a function (see Array.prototype.sort() to know how sort function works).
    * Default is the order returned by the server unchanged.
    */
  var operationsSorter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An array of plugin functions to use in Swagger UI.
    */
  var plugins: js.UndefOr[js.Any] = js.native
  /**
    * An array of presets to use in Swagger UI. Usually, you'll want to include ApisPreset if you use this option.
    */
  var presets: js.UndefOr[js.Array[_]] = js.native
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 requests.
    *  Accepts one argument requestInterceptor(request) and must return the modified request, or a Promise that resolves to the modified request.
    */
  var requestInterceptor: js.UndefOr[js.Function1[/* request */ SwaggerRequest, SwaggerRequest]] = js.native
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 responses.
    *  Accepts one argument responseInterceptor(response) and must return the modified response, or a Promise that resolves to the modified response.
    */
  var responseInterceptor: js.UndefOr[js.Function1[/* response */ SwaggerResponse, SwaggerResponse]] = js.native
  /**
    * A JavaScript object describing the OpenAPI definition. When used, the url parameter will not be parsed. This is useful for testing manually-generated definitions without hosting them.
    */
  var spec: js.UndefOr[Spec] = js.native
  /**
    * The URL pointing to API definition (normally swagger.json or swagger.yaml). Will be ignored if urls or spec is used.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * An array of API definition objects ([{url: "<url1>", name: "<name1>"},{url: "<url2>", name: "<name2>"}]) used by Topbar plugin. When used and Topbar plugin is enabled,
    * the url parameter will not be parsed. Names and URLs must be unique among all items in this array,
    * since they're used as identifiers.
    */
  var urls: js.UndefOr[js.Array[Url]] = js.native
}

object SwaggerConfigs {
  @scala.inline
  def apply(): SwaggerConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerConfigs]
  }
  @scala.inline
  implicit class SwaggerConfigsOps[Self <: SwaggerConfigs] (val x: Self) extends AnyVal {
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
    def setConfigUrl(value: String): Self = this.set("configUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigUrl: Self = this.set("configUrl", js.undefined)
    @scala.inline
    def setDeepLinking(value: Boolean): Self = this.set("deepLinking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLinking: Self = this.set("deepLinking", js.undefined)
    @scala.inline
    def setDocExpansion(value: list | full | none): Self = this.set("docExpansion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocExpansion: Self = this.set("docExpansion", js.undefined)
    @scala.inline
    def setDomNode(value: String | HTMLElement): Self = this.set("domNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomNode: Self = this.set("domNode", js.undefined)
    @scala.inline
    def setDomNodeNull: Self = this.set("domNode", null)
    @scala.inline
    def setDom_id(value: String): Self = this.set("dom_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDom_id: Self = this.set("dom_id", js.undefined)
    @scala.inline
    def setDom_idNull: Self = this.set("dom_id", null)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMaxDisplayedTags(value: Double): Self = this.set("maxDisplayedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDisplayedTags: Self = this.set("maxDisplayedTags", js.undefined)
    @scala.inline
    def setOperationsSorter(value: () => Unit): Self = this.set("operationsSorter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOperationsSorter: Self = this.set("operationsSorter", js.undefined)
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPresetsVarargs(value: js.Any*): Self = this.set("presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: js.Array[_]): Self = this.set("presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    @scala.inline
    def setRequestInterceptor(value: /* request */ SwaggerRequest => SwaggerRequest): Self = this.set("requestInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRequestInterceptor: Self = this.set("requestInterceptor", js.undefined)
    @scala.inline
    def setResponseInterceptor(value: /* response */ SwaggerResponse => SwaggerResponse): Self = this.set("responseInterceptor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResponseInterceptor: Self = this.set("responseInterceptor", js.undefined)
    @scala.inline
    def setSpec(value: Spec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[Url]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

