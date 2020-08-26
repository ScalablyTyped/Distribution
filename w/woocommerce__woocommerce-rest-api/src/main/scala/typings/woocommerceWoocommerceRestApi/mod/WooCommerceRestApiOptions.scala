package typings.woocommerceWoocommerceRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WooCommerceRestApiOptions extends js.Object {
  /* Define the custom Axios config, also override this library options */
  var axiosConfig: js.UndefOr[js.Any] = js.native
  /* Your API consumer key */
  var consumerKey: String = js.native
  /* Your API consumer secret */
  var consumerSecret: String = js.native
  /* Encoding, default is 'utf-8' */
  var encoding: js.UndefOr[WooCommerceRestApiEncoding] = js.native
  /* Provide support for URLs with ports, eg: `8080` */
  var port: js.UndefOr[Double] = js.native
  /* When `true` and using under HTTPS force Basic Authentication as query string, default is `false` */
  var queryStringAuth: js.UndefOr[Boolean] = js.native
  /* Define the request timeout */
  var timeout: js.UndefOr[Double] = js.native
  /* Your Store URL, example: http://woo.dev/ */
  var url: String = js.native
  /* API version, default is `v3` */
  var version: js.UndefOr[WooCommerceRestApiVersion] = js.native
  /* Custom WP REST API URL prefix, used to support custom prefixes created with the `rest_url_prefix filter` */
  var wpAPIPrefix: js.UndefOr[String] = js.native
}

object WooCommerceRestApiOptions {
  @scala.inline
  def apply(consumerKey: String, consumerSecret: String, url: String): WooCommerceRestApiOptions = {
    val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WooCommerceRestApiOptions]
  }
  @scala.inline
  implicit class WooCommerceRestApiOptionsOps[Self <: WooCommerceRestApiOptions] (val x: Self) extends AnyVal {
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
    def setConsumerKey(value: String): Self = this.set("consumerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumerSecret(value: String): Self = this.set("consumerSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxiosConfig(value: js.Any): Self = this.set("axiosConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxiosConfig: Self = this.set("axiosConfig", js.undefined)
    @scala.inline
    def setEncoding(value: WooCommerceRestApiEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQueryStringAuth(value: Boolean): Self = this.set("queryStringAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStringAuth: Self = this.set("queryStringAuth", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setVersion(value: WooCommerceRestApiVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWpAPIPrefix(value: String): Self = this.set("wpAPIPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWpAPIPrefix: Self = this.set("wpAPIPrefix", js.undefined)
  }
  
}

