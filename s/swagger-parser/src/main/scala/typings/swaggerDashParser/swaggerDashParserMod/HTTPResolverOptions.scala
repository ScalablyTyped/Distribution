package typings.swaggerDashParser.swaggerDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof swagger-parser.swagger-parser.ResolverOptions ]:? swagger-parser.swagger-parser.ResolverOptions[P]} */ trait HTTPResolverOptions extends js.Object {
  /**
    * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
    */
  var redirects: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object HTTPResolverOptions {
  @scala.inline
  def apply(
    headers: js.Object = null,
    redirects: Int | Double = null,
    timeout: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): HTTPResolverOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPResolverOptions]
  }
}

